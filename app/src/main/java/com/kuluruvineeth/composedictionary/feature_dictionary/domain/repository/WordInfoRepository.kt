package com.kuluruvineeth.composedictionary.feature_dictionary.domain.repository

import com.kuluruvineeth.composedictionary.core.util.Resource
import com.kuluruvineeth.composedictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}