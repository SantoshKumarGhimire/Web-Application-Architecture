package waa.lab2.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import waa.lab2.model.Product;

@Repository
public class InMemoryProductRepository implements ProductRepository {

	private  List<Product> listOfProduct;

	public InMemoryProductRepository() {
	listOfProduct = new ArrayList<>();
	Product product1 = new Product();
	Product product2 = new Product();
	product1.setName("iPhone6S");
	product1.setProductId("p123");
	product1.setDiscontinued(false);
	product1.setCondition("Brand New");
	product1.setDescription("this is description of i phone 6 s");
	product1.setCategory("Mobile Phone");
	product1.setManufacturer("Apple");
	product1.setUnitPrice(600.98);
	product1.setUnitsInOrder(1);
	product1.setUnitsInStock(100);
	listOfProduct.add(product1);
	
	product2.setName("iPhone7S");
	product2.setProductId("p345");
	product2.setDiscontinued(false);
	product2.setCondition("Used");
	product2.setDescription("this is description of i phone 7 s");
	product2.setCategory("Mobile Phone");
	product2.setManufacturer("Apple");
	product2.setUnitPrice(600.98);
	product2.setUnitsInOrder(10);
	product2.setUnitsInStock(80);
	
	listOfProduct.add(product2);
	
	}

	@Override
	public List<Product> getAllProducts() {
		return listOfProduct;
	}
	
	@Override
	public Product getProductById(String productId){
		return listOfProduct.stream().filter(x -> productId.equals(x.getProductId())).findFirst().get();
	}

}
