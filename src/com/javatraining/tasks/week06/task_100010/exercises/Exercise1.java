package src.com.javatraining.tasks.week06.task_100010.exercises;

import src.com.javatraining.tasks.week06.task_100010.domain.Director;
import src.com.javatraining.tasks.week06.task_100010.service.InMemoryMovieService;
import src.com.javatraining.tasks.week06.task_100010.service.MovieService;

import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise1 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the number of movies of each director

        Map<String,Long> dirMovCounts = movieService.findAllMovies().stream()
				.flatMap(movie -> movie.getDirectors().stream())
				.collect(Collectors.groupingBy(Director::getName, Collectors.counting()));

        dirMovCounts.forEach(
        		(name,count) -> System.out.printf("%20s: %3d\n",name,count));
	}

}
