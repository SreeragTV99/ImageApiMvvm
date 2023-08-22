package com.example.imageapimvvm.viewModel

import android.widget.ImageView
import com.squareup.picasso.Picasso

// Using Extension Function
fun ImageView.loadImage(url:String){
    Picasso.get()
        .load(url)
        .into(this)
}