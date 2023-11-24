package com.example.moviesapp.data.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.moviesapp.data.models.MovieModel;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
@Dao
public interface MyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insert(List<MovieModel.ResultsBean> list);

    @Query("select * from ResultsBean")
    Single<List<MovieModel.ResultsBean>> getMovies();

    @Query("delete from ResultsBean")
    Completable deleteAll();
}
