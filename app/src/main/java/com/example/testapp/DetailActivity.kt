package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ActivityDetailBinding
import com.example.testapp.remote.Todos

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val todos = intent.getSerializableExtra("MOVIE_KEY") as Todos
            textView.text = todos.getTitle()
        }
    }
}