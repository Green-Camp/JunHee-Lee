package com.example.greencamp2.main.ui.common

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.greencamp2.main.GlideApp

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty()) {
        GlideApp.with(view)
            .load(imageUrl)
            .into(view)
    }
}