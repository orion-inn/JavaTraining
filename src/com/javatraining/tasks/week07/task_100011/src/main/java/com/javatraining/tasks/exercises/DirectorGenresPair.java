package com.javatraining.tasks.exercises;

import java.util.List;
import com.javatraining.tasks.domain.Director;
import com.javatraining.tasks.domain.Genre;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class DirectorGenresPair {
  private Director director;
  private List<Genre> genres;

  public DirectorGenresPair(Director director, List<Genre> genres) {
    this.director = director;
    this.genres = genres;
  }

  public Director getDirector() {
    return director;
  }

  public List<Genre> getGenres() {
    return genres;
  }
}
