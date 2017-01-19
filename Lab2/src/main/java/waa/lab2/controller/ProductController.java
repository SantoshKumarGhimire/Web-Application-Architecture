package waa.lab2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import waa.lab2.model.Product;
import waa.lab2.repository.ProductRepository;

@Controller
public class ProductController {
	
		@Autowired
		ProductRepository productRepository;
			// TODO Auto-generated constructor stub
		
		@RequestMapping(value="/products",method = RequestMethod.GET)
		public String getAllProducts(Model model){
	
		List<Product> products = productRepository.getAllProducts();
		model.addAttribute("products", products);
		return "products";
		}
		
		@RequestMapping(value="/product/{productId}", method = RequestMethod.GET) 
		public String getProducedById(@PathVariable String productId, Model model) {
			model.addAttribute("product", productRepository.getProductById(productId));
			
			return "product";
		}


}
