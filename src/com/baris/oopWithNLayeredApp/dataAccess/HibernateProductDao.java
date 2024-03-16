package com.baris.oopWithNLayeredApp.dataAccess;

import com.baris.oopWithNLayeredApp.entities.Product;

//Simülasyon gibi düşünüyoruz şuanlık
public class HibernateProductDao implements ProductDao{
	@Override
	public void Add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır. SQL
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
