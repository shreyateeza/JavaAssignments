package com.manipal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Movie;
import com.manipal.repository.IMovieRepository;
@Service
public class MovieService implements IMovieService {
	@Autowired
	private IMovieRepository repository;
	
	@Override
	public void addMovie(Movie movie) {
		repository.save(movie);
	}

}
