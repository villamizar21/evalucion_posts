package com.example.evaluacion_tecnica.data.repository

import com.example.evaluacion_tecnica.data.remote.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CommentsRepository @Inject constructor(private val api: ApiService) {

    fun getComments(idPost: Long) = flow {
        emit(api.getComments(idPost))
    }.flowOn(Dispatchers.IO)
}