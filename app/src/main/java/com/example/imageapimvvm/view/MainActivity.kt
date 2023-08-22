package com.example.imageapimvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imageapimvvm.R
import com.example.imageapimvvm.viewModel.MyAdapter
import com.example.imageapimvvm.viewModel.ViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewmodel = ViewModelProvider(this).get(ViewModel::class.java)

        var recycler = findViewById<RecyclerView>(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        recycler.layoutManager = layoutManager //recycler view layout setpup

        viewmodel.getData() // call get data method from view modal

// observing for live data changing
        viewmodel.response.observe(this) { result ->

//add adapter call here
            var adapter = MyAdapter(result)
            recycler.adapter = adapter
        }

        //observing for data
    }
}