package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class Questions : AppCompatActivity() {
    val mQuestions = arrayListOf<String>(*resources.getStringArray(R.array.Questions))

    val mAnswers = arrayListOf<String>(*resources.getStringArray(R.array.Answers))

    fun getQuestion(number : Int): String {
        return mQuestions[number]
    }

    fun getAnswer(number : Int): String{
        return mAnswers[number]
    }
}