package com.example.webviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.webviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val htmlData =
        "<p>\$\$\\\\frac{-b \\\\pm \\\\sqrt{b^2 - 4ac}}{2a}\$\$</p>\\n<p></p>\\n<p>If you can see this equation beautifully, then the Math Equation has been installed</p>"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    private fun onInit() {

    }

}