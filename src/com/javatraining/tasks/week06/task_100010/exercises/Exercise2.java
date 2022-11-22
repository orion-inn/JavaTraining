package src.com.javatraining.tasks.week06.task_100010.exercises;

import src.com.javatraining.tasks.week06.task_100010.dao.CountryDao;
import src.com.javatraining.tasks.week06.task_100010.dao.InMemoryWorldDao;

import java.util.stream.Collectors;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise2 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the most populated city of each continent

		var highPopulatedCityOfEachContinent = countryDao.findAllCountries().stream()
				.flatMap(country -> country.getCities().stream())
				.map(city -> new ContinentCityPair(countryDao.findCountryByCode(city.getCountryCode()).getContinent(), city))
				.collect(Collectors.groupingBy(ContinentCityPair::getContinent, Collectors.maxBy(ContinentCityPair::compareTo)));

		highPopulatedCityOfEachContinent.forEach(ContinentCityPair::printEntry);
	}

}