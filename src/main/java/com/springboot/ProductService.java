package com.springboot;

import java.util.List;

public interface ProductService {

	public void save(Product p);

	public void update(Product p);

	public void delete(int product_id);

	public Product getById(int product_id);

	public List<Product> getAll();

	public List<Product> getByPage(int page, int data, String field);
}
