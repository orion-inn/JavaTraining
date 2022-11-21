package src.com.javatraining.tasks.week06.task_100010.exercises;

import src.com.javatraining.tasks.week06.task_100010.domain.Director;
import src.com.javatraining.tasks.week06.task_100010.domain.Genre;

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
