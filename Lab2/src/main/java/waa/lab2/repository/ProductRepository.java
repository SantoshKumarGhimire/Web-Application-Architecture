package waa.lab2.repository;

import java.util.List;

import waa.lab2.model.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	Product getProductById(String productId);
}
