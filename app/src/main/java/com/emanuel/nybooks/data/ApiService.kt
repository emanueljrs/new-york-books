package com.emanuel.nybooks.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiService {

    //Método para instaciar o Retrofit
    private fun initRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    //Obtém uma instância do Retrofit com a classe dos endpoints mapeados
    val service: NYTServices = initRetrofit().create(NYTServices::class.java)
}