package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import model.Product;

public class DeleteAction extends ActionSupport{

	String productId ;
	
	public String execute() {
		
		System.out.println("Delete execute() method called");
		
		System.out.println("action "+productId);
		
		ProductManagementDAO.deleteProduct(productId);
		
		return "success";
		
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	

	

	

	

	
	


}
