package com.example.testapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.databinding.ItemTodosBinding
import com.example.testapp.remote.Todos

class ListTodosAdapter(private val listTodo: List<Todos>, private val context: Context) : RecyclerView.Adapter<ListTodosAdapter.ViewHolder>() {
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view)

    private lateinit var binding: ItemTodosBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemTodosBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val todos = listTodo[position]
        with(binding){
            tvItemName.text = todos.getTitle()
            completed.text = todos.getCompleted().toString()
        }
    }

    override fun getItemCount(): Int = listTodo.size
}