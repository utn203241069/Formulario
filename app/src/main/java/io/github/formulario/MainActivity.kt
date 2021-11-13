package io.github.formulario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.E

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1=findViewById<EditText>(R.id.txt_n1)
        val n2=findViewById<EditText>(R.id.txt_n2)
        val r=findViewById<TextView>(R.id.txt_r)
        val btn_sumar=findViewById<Button>(R.id.btn_sumar)

        btn_sumar.setOnClickListener {
            r.setText(
            "El resultado es: " + (n1.text.toString().toInt() + n2.text.toString()
                .toInt())
            )
        }
    }
}