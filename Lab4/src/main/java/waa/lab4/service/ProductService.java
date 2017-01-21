package waa.lab4.service;

import java.util.List;

import waa.lab4.model.Product;


public interface ProductService {
	public void addProduct(Product product);
	public List getProductList();
	Product getProductById(String productId);
	String updateProduct(Product product);
	String deleteProduct(String productId);
		
	
}
