package com.niit.shopping.dao;

import java.util.List;

import com.niit.shopping.model.Category;

public interface CategoryDAO {


	public List<Category> list();

	public Category get(String id);
	
	public Category getByName(String name);

	public void saveOrUpdate(Category category);

	public void delete(String id);


}
