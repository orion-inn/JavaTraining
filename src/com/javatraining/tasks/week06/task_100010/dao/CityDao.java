package src.com.javatraining.tasks.week06.task_100010.dao;

import src.com.javatraining.tasks.week06.task_100010.domain.City;
import java.util.List;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public interface CityDao {
	City findCityById(int id);

	City removeCity(City city);

	City addCity(City city);

	City updateCity(City city);

}
