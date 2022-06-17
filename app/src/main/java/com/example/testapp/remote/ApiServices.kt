package com.example.testapp.remote

import com.example.testapp.TodosResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    @GET("todos")
    suspend fun getTodos(
        @Query("page") page: Int = 1,
    ): Response<TodosResponse>
}