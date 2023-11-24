package com.example.moviesapp.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.moviesapp.Const;
import com.example.moviesapp.adapters.MovieAdapter;
import com.example.moviesapp.data.models.MovieModel;
import com.example.moviesapp.data.remot.RetroConnection;
import com.example.moviesapp.databinding.ActivityMainBinding;

import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MainViewModel viewModel ;
    MovieAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       viewModel = new ViewModelProvider(this).get(MainViewModel.class);
       viewModel.getMovie();

       viewModel.movieLiveData.observe(this, new Observer<List<MovieModel.ResultsBean>>() {
           @Override
           public void onChanged(List<MovieModel.ResultsBean> list) {
               Intent intent = new Intent(MainActivity.this,MovieDescription.class);
               adapter = new MovieAdapter(list, new MovieAdapter.OnItemClick() {
                   @Override
                   public void OnItemClicked(MovieModel.ResultsBean movieModel) {
                       String voteAverage = String.valueOf(movieModel.getVote_average());
                       String voteCount = String.valueOf(movieModel.getVote_count());
                       String overview = movieModel.getOverview();

                       intent.putExtra(Const.POSTER,movieModel.getPoster_path());
                       intent.putExtra(Const.TITLE,movieModel.getTitle());
                       intent.putExtra(Const.VOTE,voteAverage);
                       intent.putExtra(Const.Count,voteCount);
                       intent.putExtra(Const.OVERVIWE,overview);
                       intent.putExtra(Const.LANG,movieModel.getOriginal_language());

                       startActivity(intent);
                   }
               });
               binding.recyclerMovies.setAdapter(adapter);
           }
       });


    }
}