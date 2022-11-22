package src.com.javatraining.tasks.week06.task_100010.exercises;

import src.com.javatraining.tasks.week06.task_100010.dao.CityDao;
import src.com.javatraining.tasks.week06.task_100010.dao.CountryDao;
import src.com.javatraining.tasks.week06.task_100010.dao.InMemoryWorldDao;
import src.com.javatraining.tasks.week06.task_100010.domain.City;
import src.com.javatraining.tasks.week06.task_100010.domain.Country;

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
