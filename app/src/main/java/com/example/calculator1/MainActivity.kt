package com.example.calculator1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnPlus.setOnClickListener {
            val input1 = binding.etInput1.text.toString().toInt()
            val input2 = binding.etInput2.text.toString().toInt()

            binding.tvResult.text = (input1 + input2).toString()
        }
        binding.btnMinus.setOnClickListener {
            val input1 = binding.etInput1.text.toString().toInt()
            val input2 = binding.etInput2.text.toString().toInt()

            binding.tvResult.text = (input1 - input2).toString()
        }
        binding.btnMultiply.setOnClickListener {
            val input1 = binding.etInput1.text.toString().toInt()
            val input2 = binding.etInput2.text.toString().toInt()

            binding.tvResult.text = (input1 * input2).toString()
        }
        binding.btnDiv.setOnClickListener {
            val input1 = binding.etInput1.text.toString().toInt()
            val input2 = binding.etInput2.text.toString().toInt()

            binding.tvResult.text = (input1 / input2).toString()
        }

    }
}