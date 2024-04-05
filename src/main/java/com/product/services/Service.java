package com.product.services;

import java.util.ArrayList;
import java.util.List;

import com.product.dao.Dao;
import com.product.dao.DaoAdapter;
import com.product.entities.Product;



public class Service {

	static Dao dao = new DaoAdapter();
	static int id;
	static Boolean isDeleted = false;
	static Boolean isUpdate = false;

	public static int saveProduct(Product product) {
		try {
			id = dao.create(product);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	public static List<Product> getProductList(){
		List<Product> list = new ArrayList<Product>();
		list = dao.getProductList();
		return list;
	}
	
	public static Boolean deleteAProduct(Product product) {
		isDeleted = false;
		dao.deleteAProduct(product);
		return isDeleted;
	}
	
	public static Product getProduct(int id) {
		Product product = dao.getProduct(id);
		return product;
	}
	
	public static Boolean updateAProduct(Product product) {
		isUpdate = false;
		dao.update(product);
		isUpdate = true;
		return isUpdate;
	}
}
