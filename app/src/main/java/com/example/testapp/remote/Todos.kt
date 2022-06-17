package com.example.testapp.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Todos : java.io.Serializable {
    @SerializedName("id")
    @Expose
    private var id: Int? = null

    @SerializedName("completed")
    @Expose
    private var completed: Boolean? = null

    @SerializedName("title")
    @Expose
    private var title: String? = null

    @SerializedName("userId")
    @Expose
    private var userId: Int? = null

    fun getId(): Int? {
        return id
    }

    fun getCompleted(): Boolean? {
        return completed
    }

    fun getTitle(): String? {
        return title
    }

    fun getUserid(): Int? {
        return userId
    }
}