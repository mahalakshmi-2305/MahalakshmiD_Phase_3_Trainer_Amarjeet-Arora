package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	 @Id
	 String name;
	 String email;
	 String password;
	 String adress;
	 String pincode;
	 String state;
	 String country;
	 
	 public Users() {
		 
		 
	 }
	 
	public Users(String name, String email, String password, String adress, String pincode, String state, String country) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.adress = adress;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	



public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", email=" + email + ", password=" + password + ", adress=" + adress
				+ ", pincode=" + pincode + ", State=" + state + ", Country=" + country + "]";
	}

}
