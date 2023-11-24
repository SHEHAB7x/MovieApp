package com.example.moviesapp.data.local;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.example.moviesapp.Converters;
import com.example.moviesapp.data.models.MovieModel;

@Database(entities = {MovieModel.ResultsBean.class},version = 1)
@TypeConverters(Converters.class)
public abstract class MyDatabase extends RoomDatabase{
    public abstract MyDao getDao();
    private static MyDatabase myDatabase;
    public static void init (Context context){
        if(myDatabase == null){
            myDatabase = Room.databaseBuilder(context, MyDatabase.class, "movie_dp")
                    .fallbackToDestructiveMigrationOnDowngrade().build();
        }
    }

    public static MyDatabase getMyDatabase(){
        return myDatabase;
    }
}
