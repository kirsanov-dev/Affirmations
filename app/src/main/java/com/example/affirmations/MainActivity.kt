package com.example.affirmations

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.databinding.ActivityMainBinding
import com.example.affirmations.datasource.Datasource

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configure()
    }

    private fun configure() {
        val myDataset = Datasource().loadAffirmations()
        binding.apply {
            recyclerView.adapter = ItemAdapter(this@MainActivity, myDataset)
            recyclerView.setHasFixedSize(true)
        }
    }
}