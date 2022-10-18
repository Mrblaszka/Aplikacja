package com.example.aplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 = findViewById<EditText>(R.id.txt1).text
        val addtxt = findViewById<Button>(R.id.add);
        val txtrename = findViewById<Button>(R.id.rename);

        val textview2 = findViewById<TextView>(R.id.surname);

        textview2.text = "Mateusz Blacha";
        addtxt.setOnClickListener { textview2.text = textview2.text.toString() + text1 }

        txtrename.setOnClickListener {textview2.text = "Mateusz Blacha"}
    }
}