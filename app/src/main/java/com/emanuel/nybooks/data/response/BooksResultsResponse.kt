package com.emanuel.nybooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BooksResultsResponse(
    @Json(name = "books_details")
    val booksDetails: List<BooksDetailsResponse>
)
