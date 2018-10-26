package com.qa.business.service;

public interface MovieService {
	
	String getAllMovies();

	String addMovie(String movie);

	String deleteMovie(Long id);

	String getAMovie(Long id);
	
	String updateAMovie(String UpdatedMovie,String UpdatedGenre,String UpdatedRating, Long id);

}
