package com.example.bookshelf.data

import com.example.bookshelf.network.BooksApiService

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface BooksContainer {
    val booksRepository : BooksRepository
}

class DefaultAppContainer : BooksContainer {
    private val BASE_URL = "https://www.googleapis.com/books/v1/"


    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: BooksApiService by lazy {
        retrofit.create(BooksApiService::class.java)
    }

    override val booksRepository: BooksRepository by lazy {
        DefaultBooksRepository(retrofitService)
    }
}