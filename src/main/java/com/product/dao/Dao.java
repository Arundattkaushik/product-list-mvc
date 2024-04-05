package com.product.dao;

import java.util.List;

import com.product.entities.Product;

public interface Dao {
	public int create(Product product);
	public Boolean update(Product product);
	public Product getProduct(int id);
	public List<Product> getProductList();
	public Boolean deleteAProduct(Product product);
}
