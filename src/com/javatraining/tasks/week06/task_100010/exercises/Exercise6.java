package src.com.javatraining.tasks.week06.task_100010.exercises;


import src.com.javatraining.tasks.week06.task_100010.dao.CountryDao;
import src.com.javatraining.tasks.week06.task_100010.dao.InMemoryWorldDao;

import java.util.Comparator;

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
