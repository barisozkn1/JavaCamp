package com.baris.oop1;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product();
		
		product1.setName("ABC Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setDiscount(7);
		product1.setImageUrl("mboris.jpg");
		
		Product product2=new Product();
		
		product2.setName("QXZ Kahve Makinesi");
		product2.setUnitPrice(0);
		product2.setUnitInStock(6);
		product2.setDiscount(5);
		product2.setImageUrl("qzx.jpg");
		
		Product product3=new Product();
		
		product3.setName("KARACA Kahve Makinesi");
		product3.setUnitPrice(9800);
		product3.setUnitInStock(2);
		product3.setDiscount(8);
		product3.setImageUrl("karacakahve.jpg");		
		
		Product[] products= {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
	}

}
