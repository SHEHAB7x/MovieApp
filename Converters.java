package com.example.moviesapp;

import androidx.room.TypeConverter;

import com.google.gson.Gson;

import java.util.List;

public class Converters {
    @TypeConverter
    public String fromListToString(List<Integer> list){
        return new Gson().toJson(list);
    }

    @TypeConverter
    public List fromStringToList(String stringList){
        return new Gson().fromJson(stringList,List.class);
    }
}
