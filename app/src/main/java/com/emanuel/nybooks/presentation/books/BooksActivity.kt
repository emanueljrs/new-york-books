package com.emanuel.nybooks.presentation.books

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.emanuel.nybooks.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = getString(R.string.book_title)
        setSupportActionBar(toolbarMain)

        val viewModel: BooksViewModel by viewModels() //Factory de ViewModel
        //Activity está observando qualquer alteração no booksLiveData
        viewModel.booksLiveData.observe(this, {
            it?.let { books ->
                with(recyclerBooks) {
                    layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
                    adapter = BooksAdapter(books)
                }
            }
        })

        viewModel.getBooks()
    }

}