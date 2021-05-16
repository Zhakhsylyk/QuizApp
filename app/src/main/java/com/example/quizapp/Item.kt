package com.example.quizapp

class Item{
    private var question: String?

    private var answer: String?


    constructor( question: String?,answer: String?) {
        this.answer = answer
        this.question = question
    }

    fun getQuestion(): String? {
        return question
    }
    fun getAnswer(): String? {
        return answer
    }


}