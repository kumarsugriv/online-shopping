package info.sugriv.onlineshopping.dao;

import java.util.List;

import info.sugriv.onlineshopping.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
