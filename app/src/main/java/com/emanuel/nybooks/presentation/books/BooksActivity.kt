package com.emanuel.nybooks.presentation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.emanuel.nybooks.R
import com.emanuel.nybooks.data.model.Book
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = getString(R.string.book_title)
        setSupportActionBar(toolbarMain)

        with(recyclerBooks) {
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            adapter = BooksAdapter(getBooks())
        }
    }

    fun getBooks(): List<Book> {
        return listOf(
            Book("Title 1", "Author 1"),
            Book("Title 2", "Author 2"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
        )
    }
}