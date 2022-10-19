package com.kuluruvineeth.composedictionary.feature_dictionary.presentation

import androidx.lifecycle.ViewModel
import com.kuluruvineeth.composedictionary.feature_dictionary.domain.use_case.GetWordInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WordInfoViewModel @Inject constructor(
    private val getWordInfo: GetWordInfo
): ViewModel(){

}