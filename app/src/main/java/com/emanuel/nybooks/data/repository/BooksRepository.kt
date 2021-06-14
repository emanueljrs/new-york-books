package com.emanuel.nybooks.data.repository

import com.emanuel.nybooks.data.BooksResult

interface BooksRepository {
    fun getBooks(booksResultCallback: (result: BooksResult) -> Unit)
}