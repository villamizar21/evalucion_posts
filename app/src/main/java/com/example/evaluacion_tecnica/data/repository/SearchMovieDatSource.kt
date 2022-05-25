package com.example.evaluacion_tecnica.data.repository

import androidx.paging.PagingSource
import com.example.evaluacion_tecnica.data.model.Users
import com.example.evaluacion_tecnica.data.remote.ApiService

class SearchMovieDatSource constructor(
    private val api: ApiService,
) :
    PagingSource<Int, Users>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Users> {
        return try {
            val response = api.getUsers()
            val responseData = mutableListOf<Users>()
            responseData.addAll(listOf(response))

            LoadResult.Page(
                data = responseData,
                prevKey = 1,
                nextKey = 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }


}

