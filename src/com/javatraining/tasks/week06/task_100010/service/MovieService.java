package src.com.javatraining.tasks.week06.task_100010.service;

import src.com.javatraining.tasks.week06.task_100010.domain.Genre;
import src.com.javatraining.tasks.week06.task_100010.domain.Movie;
import java.util.Collection;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public interface MovieService {

	Collection<Movie> findAllMovies();

	Genre findGenreByName(String genre);

}
