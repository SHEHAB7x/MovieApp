package com.example.moviesapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.moviesapp.data.models.MovieModel;
import com.example.moviesapp.databinding.ItemMovieBinding;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.Holder> {

    List<MovieModel.ResultsBean> movies;
    OnItemClick listener;

    public MovieAdapter(List<MovieModel.ResultsBean> movies, OnItemClick listener) {
        this.movies = movies;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(ItemMovieBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bind(movies.get(position),listener);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        ItemMovieBinding binding;
        public Holder(ItemMovieBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(MovieModel.ResultsBean movieModel, OnItemClick listener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.OnItemClicked(movieModel);
                }
            });
            binding.title.setText(movieModel.getTitle());
            Glide.with(binding.getRoot().getContext())
                        .load("https://image.tmdb.org/t/p/w500"+ movieModel.getPoster_path())
                    .into(binding.image);
        }
    }

    public interface OnItemClick{
        void OnItemClicked(MovieModel.ResultsBean movieModel);
    }
}