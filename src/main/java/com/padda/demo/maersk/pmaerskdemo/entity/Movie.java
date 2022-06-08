package com.padda.demo.maersk.pmaerskdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movieId;
    private String name;
    private String releaseYear;
    private Float rating;
    private String originalLanguage;
    private Integer duration; // in minutes
    private String thumbnailUrl;
    
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	public String getOriginalLanguage() {
		return originalLanguage;
	}
	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}    
}
