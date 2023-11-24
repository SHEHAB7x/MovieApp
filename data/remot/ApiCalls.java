package com.example.moviesapp.data.remot;

import com.example.moviesapp.data.models.MovieModel;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiCalls {
    @GET("discover/movie")
    Single<MovieModel> getMovies(@Query("api_key")String apiKey);
}
