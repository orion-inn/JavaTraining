package src.com.javatraining.tasks.week06.task_100010.exercises;

import static java.lang.System.out;
import static java.util.Comparator.comparingDouble;

import java.util.Comparator;
import java.util.function.Predicate;
import src.com.javatraining.tasks.week06.task_100010.dao.InMemoryWorldDao;
import src.com.javatraining.tasks.week06.task_100010.dao.WorldDao;
import src.com.javatraining.tasks.week06.task_100010.domain.Country;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise9 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();
	
	private static final Comparator<Country> populationDensityComparator = comparingDouble(country -> country.getPopulation() / country.getSurfaceArea());
	private static final Predicate<Country> livesNobody = country -> country.getPopulation() == 0L;
	
	public static void main(String[] args) {
		// Sort the countries by their population densities in descending order ignoring
		// zero population countries

//		var countriesSortedByPopulationDensityDescOrder = //	your code here
//
//		countriesSortedByPopulationDensityDescOrder.forEach(out::println);
	}

}
