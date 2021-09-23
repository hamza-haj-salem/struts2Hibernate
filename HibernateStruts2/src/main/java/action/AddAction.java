package action;

import com.opensymphony.xwork2.ActionSupport; 

import dao.LoginDAO;
import dao.ProductManagementDAO;
import model.Product;


public class AddAction extends ActionSupport{

	String productId;
	String productName;
	String productCategory;
	Integer productPrice;
	
	public String execute() {
		String statusCode = "";
		
		System.out.println("execute() method called");
		Product product = new Product(productId, productName, productCategory, productPrice);
		
		System.out.println(product);
		ProductManagementDAO.addProduct(product);
		
		statusCode = "success";
		
		return statusCode;
	}

	

	



	public String getProductId() {
		return productId;
	}







	public void setProductId(String productId) {
		this.productId = productId;
	}







	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	
}
