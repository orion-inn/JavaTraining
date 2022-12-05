package com.javatraining.tasks.dao;

import com.javatraining.tasks.entity.City;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public interface CityDao {
	City addCity(City city);
	City removeCity(City city);
	City updateCity(City city);
	City findCityById(int id);
}
