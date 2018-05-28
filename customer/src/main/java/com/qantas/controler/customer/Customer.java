package com.qantas.controler.customer;



public class Customer {

	private String id;
	private String firstname;
	private String lastname;
	private String dob;
	private Contact customerContact;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Contact getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(Contact customerContact) {
		this.customerContact = customerContact;
	}
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", customerContact="
				+ customerContact + "]";
	}
}
