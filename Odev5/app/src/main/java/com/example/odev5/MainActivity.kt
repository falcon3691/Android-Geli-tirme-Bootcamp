package com.example.odev5

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bSonuc: Button? = findViewById<Button>(R.id.buttonSonuc)
        var bTemizle: Button?  = findViewById<Button>(R.id.buttonTemizle)
        var bTopla: Button?  = findViewById<Button>(R.id.buttonTopla)
        val numberButtons = listOf(
            R.id.button0, R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6, R.id.button7,
            R.id.button8, R.id.button9
        )

        var tvSonuc = findViewById<TextView>(R.id.textViewSonuc)
        var tvHatirlanan = findViewById<TextView>(R.id.textViewHistory)
        var sayi1: Int? = 0
        var sayi2: Int? = 0

        for (id in numberButtons) {
            findViewById<Button>(id)?.setOnClickListener { view ->
                val button = view as Button
                tvSonuc.text = tvSonuc.text.toString() + button.text.toString()
            }
        }

        bTopla?.setOnClickListener {
            if(tvSonuc.text.toString().isNotEmpty()){
                sayi1 = tvSonuc.text.toString().toInt()
                tvHatirlanan.setText(sayi1.toString() + " +")
                tvSonuc.text = ""
            }
            else
                Snackbar.make(it, "Bir sayı seçmelisiniz.", Snackbar.LENGTH_SHORT).show()
        }
        bSonuc?.setOnClickListener {
            if(tvHatirlanan.text.isNotEmpty()) {
                if (sayi1!! >= 0) {
                    if(tvSonuc.text.isNotEmpty()){
                        sayi2 = tvSonuc.text.toString().toInt()
                        tvSonuc.setText((sayi1!! + sayi2!!).toString())
                    }
                    else
                        Snackbar.make(it, "Bir sayı seçmelisiniz.", Snackbar.LENGTH_SHORT).show()
                }
            }
            else
                Snackbar.make(it, "Toplama işlemi yapmalısınız.", Snackbar.LENGTH_SHORT).show()
        }
        bTemizle?.setOnClickListener {
            tvSonuc.text = ""
            tvHatirlanan.text = ""
            sayi1 = 0
            sayi2 = 0
        }

    }
}