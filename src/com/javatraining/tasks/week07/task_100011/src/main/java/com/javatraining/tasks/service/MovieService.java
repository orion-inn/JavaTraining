package com.javatraining.tasks.service;

import com.javatraining.tasks.domain.Genre;
import com.javatraining.tasks.domain.Movie;
import java.util.Collection;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public interface MovieService {

	Collection<Movie> findAllMovies();

	Genre findGenreByName(String genre);

}
