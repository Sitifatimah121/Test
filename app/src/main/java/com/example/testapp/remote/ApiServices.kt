package com.example.testapp.remote

import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {
    @GET("todos")
    suspend fun getTodos(
    ): Response <List<Todos>>
}