package com.product.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;
import com.product.entities.Product;
import com.product.utilities.Utils;

public class DaoAdapter implements Dao {
	int id;
	Boolean isUpdated = false;

	@Override
	public int create(Product product) {
		Utils.getSession().getTransaction();
		id = (int) Utils.getSession().save(product);
		Utils.getSession().getTransaction().begin();
		Utils.getSession().getTransaction().commit();
		return id;
	}

	@Override
	public Boolean update(Product product) {
		isUpdated = false;
		Utils.getSession().clear();
		Utils.getSession().update(product);
		Utils.getSession().getTransaction().begin();
		Utils.getSession().getTransaction().commit();
		isUpdated = true;
		return isUpdated;
	}

	@Override
	public Product getProduct(int id) {
		Product product = Utils.getSession().get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> getProductList() {
		List<Product> productsList = new ArrayList<Product>();
		String q = "from Product";
		Query<Product> query = Utils.getSession().createQuery(q);
		productsList = query.list();
		return productsList;
	}

	@Override
	public Boolean deleteAProduct(Product product) {
		isUpdated = false;
		Utils.getSession().delete(product);
		Utils.getSession().getTransaction().begin();
		Utils.getSession().getTransaction().commit();
		isUpdated = true;
		return isUpdated;
	}


}
