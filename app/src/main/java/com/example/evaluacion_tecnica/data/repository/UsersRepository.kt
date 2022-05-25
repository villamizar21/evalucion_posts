package com.example.evaluacion_tecnica.data.repository

import com.example.evaluacion_tecnica.data.remote.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class UsersRepository @Inject constructor(private val api: ApiService) {

    fun getUsers() = flow {
        emit(api.getUsers())
    }.flowOn(Dispatchers.IO)
}