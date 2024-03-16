package com.baris.oopWithNLayeredApp;

import java.util.ArrayList;
import java.util.List;

import com.baris.oopWithNLayeredApp.business.ProductManager;
import com.baris.oopWithNLayeredApp.core.logging.DatabaseLogger;
import com.baris.oopWithNLayeredApp.core.logging.FileLogger;
import com.baris.oopWithNLayeredApp.core.logging.Logger;
import com.baris.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import com.baris.oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Samsung Galaxy A30", 9300);
		
		/*
		 * productManager interface aracılıgıyla hangi veritabanı yöntemi ile ekleme olacagı ile ilgili ugrasmadı
		 * bunu interface classı kullanılarak oluşturulan constructor yardımı ile 
		 * Main sınıfının insiyatifine bıraktı.
		 */
		
		//26. satırda list.of içine hangisi eklerip çıkarırsan onu yapar
		List<Logger> loggers= new ArrayList<Logger>(List.of(new DatabaseLogger(), new FileLogger(), new DatabaseLogger())); 
		
		ProductManager productManager= new ProductManager(new HibernateProductDao(), loggers); 
		productManager.Add(product1);

	}

}
