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
        val botao: Button = findViewById(R.id.button)
        val textbox: TextView = findViewById(R.id.textView4)
        botao.setOnClickListener {
            textbox.setText("Trocando texto...")
            val toast = Toast.makeText(this, "Botão clicado", Toast.LENGTH_SHORT)
            toast.show()

        }

        // Enables Always-on
//        setAmbientEnabled()
    }
}