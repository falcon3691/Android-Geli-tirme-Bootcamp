package com.example.ders4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // R (Kotlin sınıfları içinde)= res klasörü, kaynaklar
        // @ (XML Dosyalar içinde) = res klasörü, kaynaklar
    }
}