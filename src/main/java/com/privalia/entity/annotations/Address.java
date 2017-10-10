package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Address")
public class Address {
	String street;
	String city;
	String town;

	public String getStreet() {
		return street;
	}
	
	@Autowired
	@Value("Industria")
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	@Autowired
	@Value("Alicante")
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}
	
	@Autowired
	@Value("Valencia")
	public void setTown(String town) {
		this.town = town;
	}
}
