package com.example.testapp

import com.example.testapp.remote.Todos
import com.google.gson.annotations.SerializedName

data class TodosResponse(
	@field:SerializedName("Response")
	val page: Long,
	val response: List<Todos>
)

data class ResponseItem(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("completed")
	val completed: Boolean,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("userId")
	val userId: Int
)
