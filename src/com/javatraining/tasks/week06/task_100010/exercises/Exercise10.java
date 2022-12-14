package src.com.javatraining.tasks.week06.task_100010.exercises;

import java.util.Optional;
import java.util.function.BiConsumer;
import src.com.javatraining.tasks.week06.task_100010.dao.InMemoryWorldDao;
import src.com.javatraining.tasks.week06.task_100010.dao.WorldDao;
import src.com.javatraining.tasks.week06.task_100010.domain.Country;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise10 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();
	private static final BiConsumer<String, Optional<Country>> printEntry = (continent,country) -> System.out.printf("%s: %s\n",continent,country.get());
	public static void main(String[] args) {
		// Find the richest country of each continent with respect to their GNP (Gross National Product) values.

//        var richestCountryByContinent = //	your code here
//
//        richestCountryByContinent.forEach(printEntry);
	}

}
