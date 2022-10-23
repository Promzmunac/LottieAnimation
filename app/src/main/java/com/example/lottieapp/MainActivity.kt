package com.example.lottieapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lottieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView (binding.root)
        binding.playBtn.visibility = View.GONE

        binding.playBtn.setOnClickListener {
            binding.lottieAnimation.playAnimation()
            binding.playBtn.visibility = View.GONE
        }

        binding.lottieAnimation.setOnClickListener{
            binding.lottieAnimation.pauseAnimation()
            binding.playBtn.visibility = View.VISIBLE
        }

        binding.continuebtn.setOnClickListener {
           val intent = Intent(this, FirstPageActivity::class.java)
           startActivity(intent)
        }
    }
}