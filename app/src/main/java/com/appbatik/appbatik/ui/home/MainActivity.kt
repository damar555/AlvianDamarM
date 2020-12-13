package com.appbatik.appbatik.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appbatik.appbatik.R
import com.appbatik.appbatik.databinding.ActivityAuthBinding
import com.appbatik.appbatik.databinding.ActivityMainBinding
import com.appbatik.appbatik.ui.auth.AppbatikAuth
import com.appbatik.appbatik.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            AppbatikAuth.logout(this){
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}