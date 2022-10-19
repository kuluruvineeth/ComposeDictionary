package com.kuluruvineeth.composedictionary.feature_dictionary.domain.model

import com.kuluruvineeth.composedictionary.feature_dictionary.data.remote.dto.LicenseDto
import com.kuluruvineeth.composedictionary.feature_dictionary.data.remote.dto.MeaningDto
import com.kuluruvineeth.composedictionary.feature_dictionary.data.remote.dto.PhoneticDto

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
)
