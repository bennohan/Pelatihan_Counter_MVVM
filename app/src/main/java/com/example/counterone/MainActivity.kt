package com.example.counterone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.counterone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var counter = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun increaseCounter() {
        counter += 1
        binding.tvCount.text = "$counter"
    }

    private fun decreaseCounter() {
        counter -= 1
        binding.tvCount.text = "$counter"
    }

    fun onClick(p0: View?){
        when (p0){
            binding.btnPlus -> increaseCounter()
            binding.btnMinus -> decreaseCounter()
        }
    }


}