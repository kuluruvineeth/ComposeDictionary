package com.kuluruvineeth.composedictionary.feature_dictionary.domain.model

import com.kuluruvineeth.composedictionary.feature_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)
