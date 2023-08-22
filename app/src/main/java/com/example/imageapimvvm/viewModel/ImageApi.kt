package com.example.imageapimvvm.viewModel

import com.example.imageapimvvm.model.ImageList
import retrofit2.Response
import retrofit2.http.GET

interface ImageApi {
    @GET("/v1/sample-data/photos")
    suspend fun getImages() : Response<ImageList>
}