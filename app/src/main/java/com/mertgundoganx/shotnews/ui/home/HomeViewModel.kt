package com.mertgundoganx.shotnews.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mertgundoganx.shotnews.data.model.BaseNews
import com.mertgundoganx.shotnews.data.repository.BaseNewsResponseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val baseNewsResponseRepository: BaseNewsResponseRepository
) :
    ViewModel() {

    val baseNews = MutableLiveData<BaseNews>()

    init {
        getBaseNews()
    }

    private fun getBaseNews() = viewModelScope.launch {
        val response = baseNewsResponseRepository.getBaseNews()
        if (response.isSuccessful) {
            response.body()?.let {
                baseNews.postValue(it)
            }
        }
    }

}