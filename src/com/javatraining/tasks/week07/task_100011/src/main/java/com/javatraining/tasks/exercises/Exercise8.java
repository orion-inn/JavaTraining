package com.javatraining.tasks.exercises;

import java.util.stream.Collectors;
import com.javatraining.tasks.domain.Movie;
import com.javatraining.tasks.service.InMemoryMovieService;
import com.javatraining.tasks.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise8 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Group the movies by the year and list them

		var moviesByYear = movieService.findAllMovies().stream()
				.collect(Collectors.groupingBy(Movie::getYear));

		moviesByYear.forEach((year,movies) -> System.out.printf("%d: %s\n",year,movies));
	}

}
