package com.emanuel.nybooks.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emanuel.nybooks.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        booksLiveData.value = createFakeBooks()
    }

    private fun createFakeBooks(): List<Book> {
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
            Book("Title 3", "Author 3"),
            Book("Title 3", "Author 3"),
        )
    }

}