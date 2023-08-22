package com.example.imageapimvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.imageapimvvm.model.Images
import kotlinx.coroutines.launch

class ViewModel : ViewModel() {

    var response = MutableLiveData<List<Images>>() //live data

    // configure api interface to view modal

    var api = RetrofitHelper().getInstance().create(ImageApi::class.java)

//    api call to get data

    fun getData() {
        try {
            viewModelScope.launch {
                var res = api.getImages()
                response.value = res.body()?.photos
            }
        } catch (e: Exception) {
            println(e.message)
        }
    }


//set data as live data

}