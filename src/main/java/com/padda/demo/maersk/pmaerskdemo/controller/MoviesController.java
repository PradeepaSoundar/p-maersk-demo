package com.padda.demo.maersk.pmaerskdemo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.padda.demo.maersk.pmaerskdemo.entity.Movie;
import com.padda.demo.maersk.pmaerskdemo.service.MovieService;

@RestController
public class MoviesController {
	
	@Autowired 
	private MovieService movieService;
	
    @PostMapping("/movie")
    public Movie saveMovie(@RequestBody Movie movie)
    {
        return movieService.saveMovie(movie);
    }
    
    @GetMapping("/movies")
    public List<Movie> fetchMovies(@RequestParam Map<String, String> params)
    {
    	String qYear = params.get("year");
    	String qRating = params.get("rating");
    	
    	if (qYear != null || qRating != null) {
    		return movieService.fetchMoviesByCriteria(qYear, qRating);
    	}
    	
        return movieService.fetchAllMovies();
    }
 
    // Update operation
    @PutMapping("/movie/{id}")
    public Movie updateMovie(@RequestBody Movie movie, @PathVariable("id") Long movieId)
    {
        return movieService.updateMovie(movie, movieId);
    }
}
