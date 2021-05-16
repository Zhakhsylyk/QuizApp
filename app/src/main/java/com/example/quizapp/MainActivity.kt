package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var mQuestions : Questions
    var currentQuestion: Int = 0
    var questionsLength : Int = 0
    var questionsList : ArrayList<Item> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mQuestions = Questions()
        questionsLength = mQuestions.mQuestions.size

        questionsList = ArrayList<Item>()

        for(i in 0..questionsLength){
            questionsList.add(Item(mQuestions.getQuestion(i),mQuestions.getAnswer(i)))
        }

        questionsList.shuffle()

        setQuestion(currentQuestion)

        true_button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (checkQuestion(currentQuestion)) {
                    currentQuestion++;
                    if (currentQuestion < questionsLength)
                        setQuestion(currentQuestion)

                }
            }
        })

        false_button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (!checkQuestion(currentQuestion)) {
                    currentQuestion++;
                    if (currentQuestion < questionsLength)
                        setQuestion(currentQuestion)

                }

            }
        })

    }


    private fun setQuestion(number: Int) {
        question_text.setText(questionsList.get(number).getQuestion())    }
    private fun checkQuestion(number : Int ) : Boolean{
        var answer = questionsList.get(number).getAnswer()
        return answer.equals("true")
    }
  
}

private fun TextView.setText(item: Item) {

}
