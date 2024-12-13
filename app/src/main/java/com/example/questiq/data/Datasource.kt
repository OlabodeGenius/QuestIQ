package com.example.questiq.data

import com.example.questiq.R
import com.example.questiq.model.QuizModel

class Datasource {
    fun loadDetails(): List<QuizModel> {
        return listOf<QuizModel>(
            QuizModel(1, R.drawable.sports, R.string.categoryName1, ),
            QuizModel(2, R.drawable.sports, R.string.categoryName1),
            QuizModel(3, R.drawable.sports, R.string.categoryName1),
            QuizModel(4, R.drawable.sports, R.string.categoryName1),
            QuizModel(5, R.drawable.sports, R.string.categoryName1),
        )
    }
}
