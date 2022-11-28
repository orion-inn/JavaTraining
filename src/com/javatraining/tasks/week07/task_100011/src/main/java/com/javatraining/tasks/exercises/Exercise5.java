package com.javatraining.tasks.exercises;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.javatraining.tasks.dao.CityDao;
import com.javatraining.tasks.dao.CountryDao;
import com.javatraining.tasks.dao.InMemoryWorldDao;
import com.javatraining.tasks.domain.City;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise5 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
	private static final CityDao cityDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the highest populated capital city of each continent

		var highPopulatedCapitalCityOfEachContinent = countryDao.findAllCountries().stream()
				.map(country -> new ContinentCityPair(country.getContinent(), cityDao.findCityById(country.getCapital())))
				.filter(continentCityPair -> Objects.nonNull(continentCityPair.getCity()))
				.collect(Collectors.groupingBy(ContinentCityPair::getContinent, Collectors.maxBy(ContinentCityPair::compareTo)));

		highPopulatedCapitalCityOfEachContinent.forEach((continent,pair) -> System.out.printf("%s: %s\n",continent,pair.get().getCity()));
	}

}