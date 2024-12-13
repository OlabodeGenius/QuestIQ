package com.example.questiq.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//mock data
data class QuizModel(
    val id: Int,
    @DrawableRes val categoryImage: Int,
    @StringRes val categoryName: Int,
//    val questionList : List<QuestionModel>
)

data class QuestionModel(
    val question: String,
    val options: List<String>,
    val correctOption: String
)