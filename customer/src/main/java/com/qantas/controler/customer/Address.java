package com.qantas.controler.customer;


public class Address {

	private String type;
	private String street;
	private String unit;
	private String city;
	private String state;
	private String postcode;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Address [type=" + type + ", street=" + street + ", unit=" + unit + ", city=" + city + ", state=" + state
				+ ", postcode=" + postcode + "]";
	}
}
