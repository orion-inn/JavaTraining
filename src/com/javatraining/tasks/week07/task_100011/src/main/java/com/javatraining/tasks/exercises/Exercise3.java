package com.javatraining.tasks.exercises;

import java.util.Collection;
import java.util.stream.Collectors;
import com.javatraining.tasks.service.InMemoryMovieService;
import com.javatraining.tasks.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise3 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the number of genres of each director's movies

		var directorGenreNumbers = movieService.findAllMovies().stream()
				.flatMap(movie -> movie.getDirectors().stream()
						.map(director -> new DirectorGenresPair(director, movie.getGenres())))
				.flatMap(directorGenresPair -> directorGenresPair.getGenres().stream()
						.map(genre -> new DirectorGenrePair(directorGenresPair.getDirector(), genre)))
				.collect(Collectors.groupingBy(DirectorGenrePair::getDirector,
						Collectors.groupingBy(DirectorGenrePair::getGenre, Collectors.counting())));

		directorGenreNumbers.forEach((director,genreCounts)->{
			System.out.printf("%s\n",director.getName());
			genreCounts.forEach( (genre,count) -> System.out.printf("\t%s: %s\n",genre.getName(),count));
		});
		
	}

}