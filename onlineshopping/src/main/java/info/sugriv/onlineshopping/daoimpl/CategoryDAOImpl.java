package info.sugriv.onlineshopping.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import info.sugriv.onlineshopping.dao.CategoryDAO;
import info.sugriv.onlineshopping.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList<Category>();
	
	static {
		Category category=new Category();
		category.setId(1);
		category.setName("Telivision");
		category.setDescription("Details of Telivision");
		
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Details of Mobile");
		categories.add(category);
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Details of Laptop");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category:categories) {
			if(category.getId()==id) return category;
		}
		return null;
	}

}
