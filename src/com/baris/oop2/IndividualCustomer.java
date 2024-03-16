package com.baris.oop2;

public class IndividualCustomer extends Customer{
	private String name;
	private String surname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "IndividualCustomer [name=" + name + ", surname=" + surname + ", getId()=" + getId()
				+ ", getCustomerNumber()=" + getCustomerNumber() + ", getPhone()=" + getPhone() + "]";
	}
	
	
	
}
