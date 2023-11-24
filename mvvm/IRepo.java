package com.example.moviesapp.mvvm;

import com.example.moviesapp.data.models.MovieModel;

import java.util.List;

public interface IRepo {

    void onMovieReceived(List<MovieModel.ResultsBean> list);
}
