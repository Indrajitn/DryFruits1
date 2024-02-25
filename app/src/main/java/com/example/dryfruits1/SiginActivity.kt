package com.example.dryfruits1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dryfruits1.databinding.ActivityLoginBinding
import com.example.dryfruits1.databinding.ActivitySiginBinding

class SiginActivity : AppCompatActivity() {
    private val binding : ActivitySiginBinding by lazy {
        ActivitySiginBinding.inflate (layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (binding.root)
        binding.alreadyhavebutton.setOnClickListener {
            val intent = Intent( this, LoginActivity::class.java)
            startActivity (intent)
    }
}}