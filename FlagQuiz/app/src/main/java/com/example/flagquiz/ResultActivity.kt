package com.example.flagquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvname: TextView = findViewById(R.id.tv_Name)
        val tvscore: TextView = findViewById(R.id.tv_score)
        val finishbtn : Button = findViewById(R.id.finishBtn)

        tvname.text = intent.getStringExtra(Constants.USER_NAME)


        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvscore.text = "Your Score Is $correctAnswers Out Of $totalQuestion"

        finishbtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}