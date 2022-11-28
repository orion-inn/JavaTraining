package com.javatraining.tasks.exercises;

import com.javatraining.tasks.dao.CityDao;
import com.javatraining.tasks.dao.CountryDao;
import com.javatraining.tasks.dao.InMemoryWorldDao;
import com.javatraining.tasks.domain.City;
import com.javatraining.tasks.domain.Country;

import java.util.Comparator;
import java.util.Objects;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise4 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
	private static final CityDao cityDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the highest populated capital city

		var highPopulatedCapitalCity = countryDao.findAllCountries().stream()
				.map(Country::getCapital)
				.map(cityDao::findCityById)
				.filter(Objects::nonNull)
				.max(Comparator.comparing(City::getPopulation));

		highPopulatedCapitalCity.ifPresent(System.out::println);
	}

}
