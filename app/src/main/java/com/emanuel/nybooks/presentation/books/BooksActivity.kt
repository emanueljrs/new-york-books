package com.emanuel.nybooks.presentation.books

import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.emanuel.nybooks.R
import com.emanuel.nybooks.data.repository.BooksApiDataSource
import com.emanuel.nybooks.presentation.base.BaseActivity
import com.emanuel.nybooks.presentation.details.BooksDetailsActivity
import kotlinx.android.synthetic.main.activity_books.*
import kotlinx.android.synthetic.main.include_toolbar.*

class BooksActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        setupToolBar(toolbarMain, R.string.book_title)

        //val viewModel: BooksViewModel = BooksViewModel.ViewModelFactory(BooksApiDataSource()).create(BooksViewModel::class.java)
        val viewModel: BooksViewModel by viewModels{
            BooksViewModel.ViewModelFactory(BooksApiDataSource())
        } //Factory de ViewModel

        //Activity está observando qualquer alteração no booksLiveData
        viewModel.booksLiveData.observe(this, {
            it?.let { books ->
                with(recyclerBooks) {
                    layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
                    adapter = BooksAdapter(books) { book ->
                        val intent = BooksDetailsActivity.getStartIntent(this@BooksActivity, book.title, book.description)
                        this@BooksActivity.startActivity(intent)
                    }
                }
            }
        })

        viewModel.viewFlipperLiveData.observe(this) {
            it?.let { viewFlipper ->
                viewFlipperBooks.displayedChild = viewFlipper.first

                viewFlipper.second?.let { errorMessageResId ->
                    textViewError.text = getString(errorMessageResId)
                }
            }
        }

        viewModel.getBooks()
    }

}