package com.emanuel.nybooks.presentation.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.emanuel.nybooks.R
import kotlinx.android.synthetic.main.activity_books_details.*

class BooksDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_details)

        book_detail_title.text = intent.getStringExtra(EXTRA_TITLE)
        book_detail_descrption.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }

    companion object {

        private const val EXTRA_TITLE = "EXTRA_TITLE"
        private const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"

        fun getStartIntent(context: Context, title: String, description: String): Intent {
            return Intent(context, BooksDetailsActivity::class.java).apply {
                putExtra(EXTRA_TITLE, title)
                putExtra(EXTRA_DESCRIPTION, description)
            }
        }
    }

}