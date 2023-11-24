package com.example.moviesapp.mvvm;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviesapp.data.models.MovieModel;

import java.util.List;

public class MainViewModel extends ViewModel implements IRepo{


    //First Solution:
    /*public MutableLiveData<List<MovieModel.ResultsBean>> movieLiveData;
    private Repo repo = new Repo();

    public MainViewModel(){
        movieLiveData = repo.liveData;
    }

    public void getMovie(){
        repo.getMovieRemote();
    }*/


    //Second solution:

    public MutableLiveData<List<MovieModel.ResultsBean>> movieLiveData = new MutableLiveData<>();
    private Repo repo = new Repo(this);
    IRepo iRepo;
    public void getMovie(){
        repo.getMovieRemote();;
    }

    @Override
    public void onMovieReceived(List<MovieModel.ResultsBean> list) {
        movieLiveData.setValue(list);
    }
}
