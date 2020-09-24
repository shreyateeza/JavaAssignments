package com.manipal.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="movie_id")
	private int movieId;
	
	private String title;
	
	@Column(name = "lead_role")
	private String leadRole; // lead_role
	
	private double budget;
	
	@Column(name = "release_date")	
	private LocalDate releaseDate;
	
	public Movie() {}
	
	public Movie(int movieId, String title, String leadRole, double budget, LocalDate releaseDate) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.leadRole = leadRole;
		this.budget = budget;
		this.releaseDate = releaseDate;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLeadRole() {
		return leadRole;
	}
	public void setLeadRole(String leadRole) {
		this.leadRole = leadRole;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", leadRole=" + leadRole + ", budget=" + budget
				+ ", releaseDate=" + releaseDate + "]";
	}
	
	
	
	

}
