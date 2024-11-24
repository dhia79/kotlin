package com.example.bookshelf.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class BooksData(
    @SerializedName("totalItems") val totalItems : Int? = null,
    @SerializedName("items") val items: ArrayList<Item> = arrayListOf()
    )

@Serializable
data class Item(
    @SerializedName("id") val id : String? = null,
    @SerializedName("volumeInfo") var volumeInfo : VolumeInfo? = VolumeInfo(),
)

@Serializable
data class VolumeInfo(
    @SerializedName("title") val title: String? = null,
    @SerializedName("imageLinks") val imageLinks: ImageLinks? = ImageLinks(),
    @SerializedName("previewLink") val previewLink: String? = null,
)


@Serializable
data class ImageLinks(
    @SerializedName("thumbnail") val thumbnail: String? = null,

)









