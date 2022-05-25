package com.example.evaluacion_tecnica.data.repository

import com.example.evaluacion_tecnica.data.remote.ApiService
import javax.inject.Inject

class SearchRepository @Inject constructor(private val api: ApiService){
    fun getMovieSearch()= SearchMovieDatSource(api)
}