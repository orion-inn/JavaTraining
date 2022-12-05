package src.com.javatraining.tasks.week06.task_100010.exercises;

import java.util.stream.Collectors;
import src.com.javatraining.tasks.week06.task_100010.domain.Movie;
import src.com.javatraining.tasks.week06.task_100010.service.InMemoryMovieService;
import src.com.javatraining.tasks.week06.task_100010.service.MovieService;

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
