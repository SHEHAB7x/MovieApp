package com.example.moviesapp.mvvm;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesapp.adapters.MovieAdapter;
import com.example.moviesapp.data.local.MyDatabase;
import com.example.moviesapp.data.models.MovieModel;
import com.example.moviesapp.data.remot.RetroConnection;
import com.example.moviesapp.databinding.ActivityMainBinding;

import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class Repo {

    // First Solution:
    /*MutableLiveData<List<MovieModel.ResultsBean>> liveData = new MutableLiveData<>();
    public void getMovieRemote(){
        RetroConnection
                .getInstance()
                .getMovies("889cb6672ff82cbf04872a6f0ddf9872")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<MovieModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(MovieModel movieModel) {
                        liveData.setValue(movieModel.getResults());
                        cacheMovies(movieModel.getResults());
                    }

                    @Override
                    public void onError(Throwable e) {
                        getMovieLocal();
                    }
                });
    }

    private void getMovieLocal(){
        MyDatabase.getMyDatabase()
                .getDao()
                .getMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<MovieModel.ResultsBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<MovieModel.ResultsBean> list) {
                        liveData.setValue(list);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }

    private void cacheMovies(List<MovieModel.ResultsBean> list){
               MyDatabase.getMyDatabase()
                .getDao()
                .insert(list)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();
    }*/


    // Second Solution:

    private IRepo iRepo;
    public Repo(IRepo iRepo){
        this.iRepo = iRepo;

    }
    public void getMovieRemote(){
        RetroConnection
                .getInstance()
                .getMovies("889cb6672ff82cbf04872a6f0ddf9872")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<MovieModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(MovieModel movieModel) {
                        iRepo.onMovieReceived(movieModel.getResults());
                        cacheMovies(movieModel.getResults());
                    }

                    @Override
                    public void onError(Throwable e) {
                        getMovieLocal();
                    }
                });
    }

    private void getMovieLocal(){
        MyDatabase.getMyDatabase()
                .getDao()
                .getMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<MovieModel.ResultsBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<MovieModel.ResultsBean> list) {
                        iRepo.onMovieReceived(list);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }

    private void cacheMovies(List<MovieModel.ResultsBean> list){
        MyDatabase.getMyDatabase()
                .getDao()
                .insert(list)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();
    }
}
