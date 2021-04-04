package com.example.calculator

//import android.support.wearable.activity.WearableActivity
import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.os.Bundle as OsBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.text.String

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: OsBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("Iniciando...")
    }

    val flag: MutableList<String> = arrayListOf()

        fun handleNumber(view:View){
            if(this.flag.isEmpty()){
                println("Checando flag: "+this.flag.isEmpty())
                principal.setText("")
            }
            val button = view as Button
            val text = button.text

            principal.setText(buildString {
                append(principal.getText())
                append(text)
            })
            println("Modificando flag")
            this.flag.add("new")
        }

        fun handleClear(view:View){
            principal.setText("")
            secundario.setText("")
        }

        fun backSpace(view:View){
            principal.setText(principal.getText().toString().dropLast(1))
        }

        fun operationHandler(view: View){
            println("Entrou em operationHandler")
            //Recebendo A
            val button = view as Button
            val a:Int = principal.getText().toString().toInt()
            println("Settou A")
            //Checando B
            println("Checando B...")
            if(!secundario.getText().isBlank()){
                println("Há operações a serem feitas")
                val operation = secundario.getText().last()
                println("Operation settado: "+operation)

                    val result: Int = when {
                        operation.equals('+') -> secundario.getText().toString().dropLast(1).toInt().plus(a)
                        operation.equals('-') -> secundario.getText().toString().dropLast(1).toInt().minus(a)
                        operation.equals('X') -> secundario.getText().toString().dropLast(1).toInt().times(a)
                        operation.equals('/') -> secundario.getText().toString().dropLast(1).toInt().div(a)
                        else -> secundario.getText().toString().dropLast(1).toInt()
                    }
                println("Retornando resultado: "+result)
                principal.setText(result.toString())
//                secundario.setText(buildString {
//                    append(secundario.getText().toString())
//                    append(a)
//                })
                secundario.setText("")
            }else{
                println("ainda não existem operações a serem feitas")
                println("settando op")
                val op = button.getText().toString()

                println("settando secundario")
                secundario.setText(buildString {
                    append(a)
                    append(op)
                })
                println("Secundario settado")
            }
            this.flag.clear()
        }
}

//            val duration = Toast.LENGTH_SHORT
//
//            val toast = Toast.makeText(applicationContext, text, duration)
//            toast.show()