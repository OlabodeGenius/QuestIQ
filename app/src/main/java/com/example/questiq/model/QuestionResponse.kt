package com.example.questiq.model

data class QuestionResponse(
    val responseCode: Int,
    val results: List<Question>
)

data class Question(
    val type : String,
    val difficulty : String,
    val category: String,
    val question: String,
    val correctAnswer: String,
    val incorrectAnswers: List<String>
)