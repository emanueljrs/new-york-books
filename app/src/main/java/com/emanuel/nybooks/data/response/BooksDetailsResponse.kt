package com.emanuel.nybooks.data.response

import com.emanuel.nybooks.data.model.Book
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BooksDetailsResponse(

    @Json(name = "title")
    val title: String,

    @Json(name = "author")
    val author: String,

    @Json(name = "description")
    val description: String
) {
    fun getBooksModel() = Book(
        title = this.title,
        author = this.author,
        description = this.description
    )
}
