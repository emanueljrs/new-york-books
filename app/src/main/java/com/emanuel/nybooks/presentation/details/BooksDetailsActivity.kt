package com.emanuel.nybooks.presentation.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.emanuel.nybooks.R
import com.emanuel.nybooks.presentation.base.BaseActivity
import kotlinx.android.synthetic.main.activity_books_details.*
import kotlinx.android.synthetic.main.include_toolbar.*

class BooksDetailsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_details)

        setupToolBar(toolbarMain, R.string.book_detail_title, showBackButton = true)

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