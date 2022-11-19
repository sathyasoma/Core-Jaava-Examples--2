package com.cg.eis.exception;

import java.util.HashMap;
import java.util.Map;

/*Let’s create a City class that contains the list of the city with its zip code. 
We’ll maintain zip code as a key and city name as a value in a hash map data structure.
It contains findCityByZipCode(int zipCode) method. If it doesn’t find city name, then it’ll throw the exception “City not found”.*/


import java.util.Scanner;

class CityNotFoundException extends Exception {

	public CityNotFoundException(String messageForUser) {

		super(messageForUser);
	}
}
class City {
	Map<Integer, String> list;

	City() {
		list = new HashMap<Integer, String>();
		list.put(400019, "Mumbai");
		list.put(700002, "Kolkata");
		list.put(100025, "Delhi");
		list.put(500004, "Hyderabad");

	}

	// find city by zip code. If no city found throw
	// a user defined exception
	public String findCityByZipCode(int zipCode) throws CityNotFoundException {

		if (list.containsKey(zipCode)) {

			String value = list.get(zipCode);

			return value;
		} else {
			throw new CityNotFoundException("City not found");

		}

	}
}
public class UserDefinedZipCodeTestEx {
	public static void main(String[] args) throws CityNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter zip code:");
		int zipCode = sc.nextInt();

		// Find city by Zip code
		City c = new City();
		String city = c.findCityByZipCode(zipCode);
		System.out.println(city);
	}
}
