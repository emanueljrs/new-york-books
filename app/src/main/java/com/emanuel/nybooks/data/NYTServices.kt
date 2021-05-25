package com.emanuel.nybooks.data

import com.emanuel.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//Interface que mapeia os endpoints do API
interface NYTServices {
    //Endpoint mapeado da API com o método para fazer a consulta
    @GET("lists.json")
    fun getBooks(
        //Parametros requeridos pelo endpoints
        @Query("api-key") apiKey: String = "dl1nIP87mt0LX157NG66GbQToQJdA5p9",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}