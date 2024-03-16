package com.baris.oopWithNLayeredApp.dataAccess;

import com.baris.oopWithNLayeredApp.entities.Product;
//Simülasyon gibi düşünüyoruz şuanlık
//Dao --> Data Access Object

public class JdbcProductDao implements ProductDao{
	@Override
	public void Add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır. SQL
		System.out.println("JDBC ile veritabanına eklendi.");
		
	}

}

