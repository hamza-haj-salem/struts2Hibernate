package action;

import com.opensymphony.xwork2.ActionSupport; 

import dao.LoginDAO;
import dao.ProductManagementDAO;
import model.Product;


public class UpdateDataAction extends ActionSupport{

	Product product;
	
	public String execute() {
		System.out.println("execute() method called");
		ProductManagementDAO.updateProduct(product);
		
		return "success";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	
	
}
