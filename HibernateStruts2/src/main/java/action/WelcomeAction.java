package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import model.Product;

public class WelcomeAction extends ActionSupport {
	
List<Product> products;
	
	public void initializeProducts()
	{
		products = ProductManagementDAO.getAllProducts(); 
		System.out.println("action"+products);
	}
	
	public String execute() {
		System.out.println("WELCOME execute() method called");
		initializeProducts();
		return "success";
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
