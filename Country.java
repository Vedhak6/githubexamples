package com.xworkz.sorting;

public class Country implements Comparable<Country>{
	private int noOfStates;
	private String name;
	private int countryCode;
	
	public Country(int noOfStates, String name, int countryCode) {
		super();
		this.noOfStates = noOfStates;
		this.name = name;
		this.countryCode = countryCode;
	}
	
	public int getNoOfStates() {
		return noOfStates;
	}
	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	@Override
	public String toString() {
		return "Country [noOfStates=" + noOfStates + ", name=" + name + ", countryCode=" + countryCode + "]";
	}

	@Override
	public int compareTo(Country o) {
		int result=this.noOfStates-o.noOfStates;
		return result;
	}
	

}
