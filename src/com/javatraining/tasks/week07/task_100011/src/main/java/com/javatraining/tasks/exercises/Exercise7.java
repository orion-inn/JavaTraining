package com.javatraining.tasks.exercises;

import java.util.List;
import com.javatraining.tasks.service.InMemoryMovieService;
import com.javatraining.tasks.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise7 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the list of movies having the genres "Drama" and "Comedy" only

		var moviesInDramaAndComedyOnly = movieService.findAllMovies().stream()
				.filter(movie -> movie.getGenres().size() == 2)
				.filter(movie -> movie.getGenres().stream().anyMatch(genre -> genre.getName().equals("Drama")))
				.filter(movie -> movie.getGenres().stream().anyMatch(genre -> genre.getName().equals("Comedy")))
				.toList();

		moviesInDramaAndComedyOnly.forEach(movie -> System.out.printf("%s %s\n",movie,movie.getGenres()));
	}

}
