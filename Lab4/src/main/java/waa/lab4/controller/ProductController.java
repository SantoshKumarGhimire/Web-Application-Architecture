package waa.lab4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import waa.lab4.model.Product;
import waa.lab4.service.ProductService;

@Controller
//@SessionAttributes("product")
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String start() {
		return "welcome";
	}

	@RequestMapping(value = "/products/add", method = RequestMethod.GET)
	public String getAddNewProductForm(Model model) {
		Product newProduct = new Product();
		model.addAttribute("newProduct", newProduct);
		return "addProduct";
	}

	@RequestMapping(value = "/products/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
		productService.addProduct(newProduct);
		return "redirect:/products/add";
	}

	@RequestMapping(value = "/productlist", method = RequestMethod.GET)
	public String productList(Model model) {
		model.addAttribute("productList", productService.getProductList());
		return "productList";
	}

	@RequestMapping(value = "/productDescription/{productId}", method = RequestMethod.GET)
	public String getProducedById(@PathVariable String productId, Model model) {
		model.addAttribute("product", productService.getProductById(productId));
		return "productDescription";
	}
	// product update
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product newProduct) {
		System.out.println(newProduct.getProductId());
		String productId=productService.updateProduct(newProduct);
		return "redirect:/productDescription/"+productId;
	}
	// end of product update
	
	//delete product 
	@RequestMapping(value = "/deleteProduct/{productId}", method = RequestMethod.GET)
	public String deleteProducedById(@PathVariable String productId) {
		 productService.deleteProduct(productId);
		return "redirect://productlist";
	}
	//end of delete product

}
