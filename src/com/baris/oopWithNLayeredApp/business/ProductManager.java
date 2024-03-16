package com.baris.oopWithNLayeredApp.business;

import java.util.List;

import com.baris.oopWithNLayeredApp.core.logging.Logger;
import com.baris.oopWithNLayeredApp.dataAccess.ProductDao;
import com.baris.oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private List<Logger> loggers; //arraylist yardımıyla tum logger yontemlerini kullanmayı saglarız
	
	public ProductManager(ProductDao productDao, List<Logger> loggers) { //Bu constructor sayesinde ProductManager artık hangi yöntem ile veritabanına eklenecek muhabbetine karısmaz.
		this.productDao = productDao;	//bu constructor direkt eklettirir, hangi yöntemin olacagına Main classındaki 12. kod satırı ile karar verilir.(jdbc or hibiernate)
		this.loggers=loggers;
	}



	public void Add(Product product) throws Exception {
		//iş kuralları
		if (product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyati 10 dan küçük olamaz."); //hata fırlatma
		}
		//ProductDao interface sayesinde hem Jdbc yi hem de Hibernate tutabiliniyor.
		//ProductDao productDao= new HibernateProductDao(); //veritabanına eklenme, new den sonra ister jdbc ister hibernate yap
		
		productDao.Add(product); //yukarıdaki(11. satırdaki kod blogu) constructor sayesinde 23. satırdaki kod satırına gerek kalmadı.
	
		for (Logger logger : loggers) { //filelogger, database logger, mail logger üçünde de çalışır.
			logger.log(product.getName());
		}
	}
}
