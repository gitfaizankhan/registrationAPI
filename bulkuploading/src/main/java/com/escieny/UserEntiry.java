package com.escieny;

import javax.persistence.Entity;

@Entity
public class UserEntiry {

	
	private long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String Address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public UserEntiry() {
		super();
	}
	
	
	public UserEntiry(long id, String firstName, String lastName, String userName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		Address = address;
	}
	
	@Override
	public String toString() {
		return "UserEntiry [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", Address=" + Address + "]";
	}
	
	
}
