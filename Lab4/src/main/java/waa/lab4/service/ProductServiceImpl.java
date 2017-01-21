package waa.lab4.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import waa.lab4.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	public List<Product> productList = new ArrayList<>();

	@Override
	public void addProduct(Product product) {
		productList.add(product);

	}

	@Override
	public List getProductList() {
		// TODO Auto-generated method stub
		return productList;
	}

	@Override
	public Product getProductById(String productId) {
		// Product products= productList.get
		return productList.stream().filter(x -> productId.equals(x.getProductId())).findFirst().get();
	}

	@Override
	public String updateProduct(Product product) {
		String productId = product.getProductId();
		Product products = getProductById(productId);
		int index = productList.indexOf(products);
		productList.set(index, product);
		return product.getProductId();

	}

	@Override
	public String deleteProduct(String productId) {
		Product products = getProductById(productId);
		productList.remove(products);
		
		return null;
	}

}
