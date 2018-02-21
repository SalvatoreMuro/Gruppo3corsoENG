package it.eng.projectwork.gruppo03.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String city;
	private String country;
	private String postCode;
	private String address;
	
	public Address() {
		
	}

	public Address(String city, String country, String postCode, String address) {
		this.city = city;
		this.country = country;
		this.postCode = postCode;
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	

}
