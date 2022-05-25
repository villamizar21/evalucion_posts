package com.example.evaluacion_tecnica.data.repository

import com.example.evaluacion_tecnica.data.remote.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PhotosRepository @Inject constructor(private val api: ApiService) {

    fun getPhotos(idPhoto: Long) = flow {
        emit(api.getPhotos(idPhoto))
    }.flowOn(Dispatchers.IO)
}