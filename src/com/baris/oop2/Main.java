package com.baris.oop2;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer cus1=new IndividualCustomer();
		
		cus1.setId(221038);
		cus1.setPhone("543831938");
		cus1.setCustomerNumber("123456");
		cus1.setName("Baris");
		cus1.setSurname("Ozkan");
		
		System.out.println(cus1);
		
		System.out.println();
		
		CorporateCustomer corCust= new CorporateCustomer();
		
		corCust.setId(2);
		corCust.setCompanyName("misterboris.io");
		corCust.setPhone("1234685");
		corCust.setTaxNumber("1111111");
		corCust.setCustomerNumber("54321");
		
		System.out.println(corCust);
	}

}
