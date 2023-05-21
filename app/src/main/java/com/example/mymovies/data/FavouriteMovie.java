package com.example.mymovies.data;

import androidx.room.Entity;
import androidx.room.Ignore;

@Entity(tableName = "favourite_movies")
public class FavouriteMovie extends Movie{
    public FavouriteMovie(int uniqId,int id, int voteCount, String title, String originalTitle, String overview, String posterPath, String backdropPath, double voteAverage, String releaseDate, String bigPosterPath) {
        super(uniqId,id, voteCount, title, originalTitle, overview, posterPath, backdropPath, voteAverage, releaseDate, bigPosterPath);
    }
    @Ignore
    public FavouriteMovie(Movie movie) {
        super(movie.getUniqId(),movie.getId(),movie.getVoteCount(), movie.getTitle(), movie.getOriginalTitle(),movie.getOverview(),movie.getPosterPath(),movie.getBackdropPath(),movie.getVoteAverage(),movie.getReleaseDate(),movie.getBigPosterPath())  ;
    }
}
