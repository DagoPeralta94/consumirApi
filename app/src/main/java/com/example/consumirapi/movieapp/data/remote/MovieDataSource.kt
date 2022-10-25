package com.example.consumirapi.movieapp.data.remote

import com.example.consumirapi.movieapp.application.AppConstants
import com.example.consumirapi.movieapp.data.model.MovieList
import com.example.consumirapi.movieapp.domain.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(AppConstants.API_KEY)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstants.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstants.API_KEY)

}