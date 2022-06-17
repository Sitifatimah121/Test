package com.example.testapp

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapp.databinding.ActivityMainBinding
import com.example.testapp.remote.Todos

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewModel()
    }

    private fun setupViewModel() {
        mainViewModel = ViewModelProvider(
            this,
            ViewModelFactory()
        )[MainViewModel::class.java]

        mainViewModel.todo.observe(this){
            showRecylerList(it.response)
        }
    }


    private fun showRecylerList(listTodos: List<Todos>) {
        val listTodosAdapter = ListTodosAdapter(listTodos, this)

        binding.rvTodos.apply {
            setHasFixedSize(true)
            layoutManager =
                if (applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
                    GridLayoutManager(this@MainActivity, 2)
                else LinearLayoutManager(this@MainActivity)
            adapter = listTodosAdapter
        }
    }

    companion object{
        const val EXTRA_MOVIE = "extra"
    }
}