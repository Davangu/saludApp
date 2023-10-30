package com.pdm.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello:AppCompatButton = findViewById(R.id.btnHello)
        val etName:AppCompatEditText = findViewById(R.id.etName)

        // PRUEBA 1
//        btnHello.setOnClickListener {
//            Log.i("Test", "Botón pulsado")
//        }

        // PRUEBA 2
//        btnHello.setOnClickListener {
//            val name = etName.text.toString()
//
//            if (name.isNotEmpty()) {
//                Log.i("Test", "Botón pulsado: $name")
//            }
//        }

        // Toast (https://developer.android.com/guide/topics/ui/notifiers/toasts?hl=es-419)
//        btnHello.setOnClickListener {
//            val name = etName.text.toString()
//
//            if (name.isNotEmpty()) {
//                Toast.makeText(this,"Hola $name!", Toast.LENGTH_LONG).show()
//            }
//        }

        // Snackbar (https://m2.material.io/components/snackbars#anatomy)
//        btnHello.setOnClickListener {
//            val name = etName.text.toString()
//
//            if (name.isNotEmpty()) {
//                Snackbar.make(btnHello, "Hola $name!", Snackbar.LENGTH_SHORT)
//                    .setAnchorView(btnHello)
//                    .setAction("CLOSE") {
//                        finishAffinity()
//                    }
//                    .show()
//            }
//        }

        btnHello.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this, GreetingActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

    }
}