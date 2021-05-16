package com.emanuel.nybooks.presentation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.emanuel.nybooks.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = "Books"
        setSupportActionBar(toolbarMain)
    }
}