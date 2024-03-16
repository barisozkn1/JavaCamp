package com.baris.oop1;

public class Product {
	private String name;
	private double unitPrice; //birim fiyatı
	private double discount; //indirim oranı
	private String imageUrl;
	private int unitInStock;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	public int getUnitInStock() {
		return unitInStock;
	}



	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}



	@Override
	public String toString() {
		return "Product [name=" + name + ", unitPrice=" + unitPrice + ", discount=" + discount + ", imageUrl="
				+ imageUrl + ", unitInStock=" + unitInStock + "]";
	}
	
	
	
}
