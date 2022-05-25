package com.example.evaluacion_tecnica.data.remote

import com.example.evaluacion_tecnica.data.model.Comments
import com.example.evaluacion_tecnica.data.model.Photos
import com.example.evaluacion_tecnica.data.model.Users
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/posts")
    suspend fun getUsers(): Users

    @GET("/posts/{id_post}/comments")
    suspend fun getComments(
        @Path("id_post") idPost: Long
    ): Comments

    @GET("/posts/{id_post}/photos")
    suspend fun getPhotos(
        @Path("id_post") idPost: Long
    ): Photos


}