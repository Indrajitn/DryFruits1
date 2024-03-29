package com.example.dryfruits1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dryfruits1.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.loginbutton.setOnClickListener {
            val intent= Intent(this, SiginActivity::class.java)
            startActivity (intent)
        }
        binding.donthavebutton.setOnClickListener {
            val intent=Intent(  this, SiginActivity::class.java)
            startActivity (intent)
        }
    }
}