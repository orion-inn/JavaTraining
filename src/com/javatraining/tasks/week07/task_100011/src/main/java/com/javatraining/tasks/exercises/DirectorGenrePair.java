package com.javatraining.tasks.exercises;

import com.javatraining.tasks.domain.Director;
import com.javatraining.tasks.domain.Genre;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class DirectorGenrePair {
  private Director director;
  private Genre genre;

  public DirectorGenrePair(Director director, Genre genre) {
    this.director = director;
    this.genre = genre;
  }

  public Director getDirector() {
    return director;
  }

  public Genre getGenre() {
    return genre;
  }
}
