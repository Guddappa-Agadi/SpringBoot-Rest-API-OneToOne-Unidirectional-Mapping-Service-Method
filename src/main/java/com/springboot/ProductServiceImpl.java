package com.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository cr;

	@Override
	public void save(Product c) {
		cr.save(c);
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Product c) {
		cr.save(c);
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int product_id) {
		cr.deleteById(product_id);
		// TODO Auto-generated method stub

	}

	@Override
	public Product getById(int product_id) {
		Optional<Product> o = cr.findById(product_id);
		if (o.isPresent()) {
			return o.get();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		Iterable<Product> irt = cr.findAll();
		List<Product> lst = new ArrayList<Product>();
		irt.forEach(e -> lst.add(e));
		// TODO Auto-generated method stub
		return lst;
	}

	@Override
	public List<Product> getByPage(int page, int data, String field) {
		Pageable p = PageRequest.of(page, data, Direction.ASC, field);
		// TODO Auto-generated method stub
		return cr.findAll(p).toList();
	}

}
