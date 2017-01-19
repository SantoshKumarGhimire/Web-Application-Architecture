package waa.lab2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waa.lab2.model.Product;
import waa.lab2.repository.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public void processOrder(String productId, int quantity) {
		Product product = productRepository.getProductById(productId);
		if (product != null){
			product.setUnitsInStock(product.getUnitsInStock() - quantity);
		} else {
			throw new IllegalArgumentException("Soemthing goes wrong");
		}
		
	}

}
