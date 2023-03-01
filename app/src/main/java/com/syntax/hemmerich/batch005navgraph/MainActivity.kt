package com.syntax.hemmerich.batch005navgraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.syntax.hemmerich.batch005navgraph.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }


}