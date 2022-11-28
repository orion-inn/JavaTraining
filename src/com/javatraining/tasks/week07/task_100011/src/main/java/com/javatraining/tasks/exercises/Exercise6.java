package com.javatraining.tasks.exercises;


import java.util.Comparator;
import java.util.function.Function;
import com.javatraining.tasks.dao.CountryDao;
import com.javatraining.tasks.dao.InMemoryWorldDao;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise6 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Sort the countries by number of their cities in descending order

		var countriesWithCityCountInDescOrder = countryDao.findAllCountries().stream()
				.map(country -> new CountryCityCountPair(country, country.getCities().size()))
				.sorted(Comparator.comparing(CountryCityCountPair::getCount).reversed())
				.toList();

		countriesWithCityCountInDescOrder.forEach(System.out::println);
	}

}
