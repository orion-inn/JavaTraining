package com.javatraining.tasks.exercises;

import com.javatraining.tasks.domain.Country;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class CountryCityCountPair {
  private Country country;
  private int count;

  public CountryCityCountPair(Country country, int count) {
    this.country = country;
    this.count = count;
  }

  public Country getCountry() {
    return country;
  }

  public int getCount() {
    return count;
  }
}
