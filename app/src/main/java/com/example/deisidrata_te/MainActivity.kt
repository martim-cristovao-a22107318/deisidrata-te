package com.example.deisidrata_te

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deisidrata_te.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding1: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding1 = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding1.root)

        binding1.buttonRegistar.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}