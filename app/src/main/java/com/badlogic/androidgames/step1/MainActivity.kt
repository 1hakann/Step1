package com.badlogic.androidgames.step1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.btnRoll)
        btnRoll.setOnClickListener {
            rolldice()
        }
        val btnCount : Button = findViewById(R.id.btnCount)
        btnCount.setOnClickListener {
            countNumber()
        }

        val btnReset : Button = findViewById(R.id.btnREset)
        btnReset.setOnClickListener {
            reset()
        }

    }

    private fun reset() {
        val resultText : TextView = findViewById(R.id.tvText)
        resultText.text = "" //or "0"
    }

    private fun countNumber() {
        Toast.makeText(this,"Sayı Artırıldı",Toast.LENGTH_SHORT).show()
        val resultText : TextView = findViewById(R.id.tvText)
        var countNumber = resultText.text.toString().toInt()
        countNumber++
        resultText.text = countNumber.toString()
    }

    private fun rolldice() {
        Toast.makeText(this, "Rastgele Sayı Oluşturuldu",Toast.LENGTH_SHORT).show()
        val resultText : TextView = findViewById(R.id.tvText)
        var randomInt = (1..100).random()
        resultText.text = randomInt.toString()
    }
}