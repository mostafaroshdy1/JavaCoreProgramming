package day6.classes;

import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;
import java.util.HashMap;



public class Analyzer{
  public static void topPopulatedCityOfEachCountry(Map<String, Country> allCountries,Map<Integer, City> allCities){
    allCountries.values().forEach(country->{
		    allCities.values().stream().filter(
		      city->city.getCountryCode()==country.getCode()
		    ).max(Comparator.comparingInt(City::getPopulation))
		     .ifPresent(maxCity -> {
		        System.out.println("Country: " + country.getName() + ", Max Populated City: " + maxCity.getName());
		    });
		  });
  }
  
  public static void topPopulatedCityOfEachContinent(Map<String, Country> allCountries, Map<Integer, City> allCities) {
      List<String> continentList = allCountries.values().stream()
              .map(Country::getContinent)
              .distinct()
              .collect(Collectors.toList());

      continentList.forEach(continent -> {
          List<City> citiesInContinent = allCities.values().stream()
                  .filter(city -> allCountries.get(city.getCountryCode()).getContinent().equals(continent))
                  .collect(Collectors.toList());

          citiesInContinent.stream()
                  .max(Comparator.comparingInt(City::getPopulation))
                  .ifPresent(maxCity -> {
                      System.out.println("Continent: " + continent + ", Max Populated City: " + maxCity.getName());
                  });
      });
  }
  public static void topPopulatedCapital(Map<String, Country> allCountries, Map<Integer, City> allCities) {
      List<City> cityList = allCities.values().stream()
              .filter(city -> allCountries.values().stream()
              .anyMatch(country -> country.getCapital() == city.getId()))
              .collect(Collectors.toList());

      System.out.println(cityList.stream().max(Comparator.comparingInt(City::getPopulation)).map(City::getName).orElse("No capital cities found"));
  }   
}



