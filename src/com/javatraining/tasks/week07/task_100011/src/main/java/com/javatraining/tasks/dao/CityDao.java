package com.javatraining.tasks.dao;

import com.javatraining.tasks.domain.City;
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
