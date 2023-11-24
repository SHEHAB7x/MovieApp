package com.example.moviesapp.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.moviesapp.Const;
import com.example.moviesapp.R;
import com.example.moviesapp.databinding.ActivityMovieDesctiptionBinding;
import com.example.moviesapp.databinding.ItemMovieBinding;

public class MovieDescription extends AppCompatActivity {
    ActivityMovieDesctiptionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMovieDesctiptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String image = getIntent().getStringExtra(Const.POSTER);
        String title = getIntent().getStringExtra(Const.TITLE);
        String rate = getIntent().getStringExtra(Const.VOTE);
        String count = getIntent().getStringExtra(Const.Count);
        String overview = getIntent().getStringExtra(Const.OVERVIWE);
        String lang = getIntent().getStringExtra(Const.LANG);
        Glide.with(this).load("https://image.tmdb.org/t/p/w500"+image).into(binding.image);
        binding.rate.setText(rate);
        binding.overview.setText(overview);
        binding.title.setText(title);
        binding.voteCount.setText(count);
        binding.lang.setText(lang);
    }
}