package com.javatraining.tasks.exercises;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import com.javatraining.tasks.dao.InMemoryWorldDao;
import com.javatraining.tasks.dao.WorldDao;
import com.javatraining.tasks.domain.Country;

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

		var richestCountryByContinent = worldDao.findAllCountries().stream()
				.collect(Collectors.groupingBy(Country::getContinent, Collectors.maxBy(Comparator.comparing(Country::getGnp))));

        richestCountryByContinent.forEach(printEntry);
	}

}
