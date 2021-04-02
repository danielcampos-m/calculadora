package com.example.calculator

//import android.support.wearable.activity.WearableActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.os.Bundle as OsBundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: OsBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Change view text
        //val botao: Button = findViewById(R.id.button)


        // Enables Always-on
//        setAmbientEnabled()
    }
}