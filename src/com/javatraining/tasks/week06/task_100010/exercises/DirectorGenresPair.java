package src.com.javatraining.tasks.week06.task_100010.exercises;

import java.util.List;
import src.com.javatraining.tasks.week06.task_100010.domain.Director;
import src.com.javatraining.tasks.week06.task_100010.domain.Genre;

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
