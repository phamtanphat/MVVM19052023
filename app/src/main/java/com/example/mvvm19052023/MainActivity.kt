package com.example.mvvm19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var edtInput: EditText
    private lateinit var tvInput: TextView
    private lateinit var btnPrintInput: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtInput = findViewById(R.id.edit_text_input)
        tvInput = findViewById(R.id.text_view_input)
        btnPrintInput = findViewById(R.id.button_print_input)

        btnPrintInput.setOnClickListener {
            tvInput.text = edtInput.text.toString()
        }
    }
}