package com.example.kotlin_1

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var mango : RadioButton
    lateinit var banana : RadioButton
    lateinit var orange : RadioButton
    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        mango=findViewById(R.id.mangoRadio)
        orange=findViewById(R.id.orangeRadio)
        banana=findViewById(R.id.bananaRadio)
        image=findViewById(R.id.imageViewRadio)

        mango.setOnClickListener{
            image.setImageResource(R.drawable.mango)
        }
        banana.setOnClickListener{
            image.setImageResource(R.drawable.bananas)
        }
        orange.setOnClickListener{
            image.setImageResource(R.drawable.orange)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}