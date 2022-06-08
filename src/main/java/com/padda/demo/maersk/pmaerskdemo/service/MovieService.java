package com.padda.demo.maersk.pmaerskdemo.service;

import java.util.List;

import com.padda.demo.maersk.pmaerskdemo.entity.Movie;

public interface MovieService {
    Movie saveMovie(Movie movie);
    List<Movie> fetchAllMovies();
    List<Movie> fetchMoviesByCriteria(String year, String rating);
    Movie updateMovie(Movie movie, Long movieId);
}
