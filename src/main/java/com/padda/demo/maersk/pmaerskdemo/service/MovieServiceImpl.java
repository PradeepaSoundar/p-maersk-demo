package com.padda.demo.maersk.pmaerskdemo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.padda.demo.maersk.pmaerskdemo.entity.Movie;
import com.padda.demo.maersk.pmaerskdemo.exception.NoSuchMovieException;
import com.padda.demo.maersk.pmaerskdemo.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movieRepo;

	@Override
	public Movie saveMovie(Movie movie) {
		return movieRepo.save(movie);
	}

	@Override
	public List<Movie> fetchAllMovies() {
		return (List<Movie>) movieRepo.findAll();
	}
	
	@Override
	public List<Movie> fetchMoviesByCriteria(String year, String rating) {
		Movie mov = new Movie();
		if (year != null) {
			mov.setReleaseYear(year);
		}
		if (rating != null) {
			mov.setRating(Float.parseFloat(rating));
		}
		return (List<Movie>) movieRepo.findAll(Example.of(mov));
	}

	@Override
	public Movie updateMovie(Movie movie, Long movieId) {
		Movie movieToUpdate = movieRepo.findById(movieId).orElse(null);
		
		if (movieToUpdate == null) {
            throw new NoSuchMovieException("No Movie found with this id: " + movieId + ", Please enter valid Movie ID");
		} else {
			if (Objects.nonNull(movieToUpdate.getName()) && !"".equalsIgnoreCase(movie.getName())) {
				movieToUpdate.setName(movie.getName());
			}
			if (Objects.nonNull(movieToUpdate.getReleaseYear()) && !"".equalsIgnoreCase(movie.getReleaseYear())) {
				movieToUpdate.setReleaseYear(movie.getReleaseYear());
			}
			if (Objects.nonNull(movieToUpdate.getRating()) && movie.getRating() > 0) {
				movieToUpdate.setRating(movie.getRating());
			}
			if (Objects.nonNull(movieToUpdate.getOriginalLanguage()) && !"".equalsIgnoreCase(movie.getOriginalLanguage())) {
				movieToUpdate.setOriginalLanguage(movie.getOriginalLanguage());
			}
			if (Objects.nonNull(movieToUpdate.getThumbnailUrl()) && !"".equalsIgnoreCase(movie.getThumbnailUrl())) {
				movieToUpdate.setThumbnailUrl(movie.getThumbnailUrl());
			}
			if (Objects.nonNull(movieToUpdate.getDuration()) && movie.getDuration() > 0) {
				movieToUpdate.setDuration(movie.getDuration());
			}
			return movieRepo.save(movieToUpdate);
		}
	}

}
