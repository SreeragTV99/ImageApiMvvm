package com.example.imageapimvvm.model

data class ImageList(val success: String,
                     val total_photos: Int,
                     val message: String,
                     val offset: Int,
                     val limit: Int,
                     val photos: List<Images>)
