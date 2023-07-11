package com.example.affirmations.datasource

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation_1, R.drawable.image1),
            Affirmation(R.string.affirmation_2, R.drawable.image2),
            Affirmation(R.string.affirmation_3, R.drawable.image3),
            Affirmation(R.string.affirmation_4, R.drawable.image4),
            Affirmation(R.string.affirmation_5, R.drawable.image5),
            Affirmation(R.string.affirmation_6, R.drawable.image6),
            Affirmation(R.string.affirmation_7, R.drawable.image7),
            Affirmation(R.string.affirmation_8, R.drawable.image8),
            Affirmation(R.string.affirmation_9, R.drawable.image9),
            Affirmation(R.string.affirmation_10, R.drawable.image10)
        )
    }
}