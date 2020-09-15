package com.manipal.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Movie;
import com.manipal.service.IMovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private IMovieService movieService;
	
	//@RequestMapping(value="addmovie", method=RequestMethod.POST)
	@PostMapping("/addmovie")
	public String addMovieDetails(@RequestBody Movie movie) {
		System.out.println(movie);		
		movieService.addMovie(movie);
		return "Movie added successfully";
	}
	
	@GetMapping("{movieId}")
	public Movie getMovieById(@PathVariable int movieId) {		
		return new Movie(222, "Atkan Chatkan", "Unknown", 20, LocalDate.now());
	}
	
}
