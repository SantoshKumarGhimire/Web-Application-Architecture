package waa.lab2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import waa.lab2.repository.ProductRepository;
import waa.lab2.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	@Autowired
	ProductRepository productRepository;

	@RequestMapping(value = "/order/{productId}/{count}")
	public String processOrder(@PathVariable String productId, @PathVariable("count") int quantity) {
		orderService.processOrder(productId, quantity);
		return "redirect:/products";
	}
	
	
	@RequestMapping(value="/orderProduct", method = RequestMethod.GET)
	public String processOrderProduct(HttpServletRequest request,HttpServletResponse response,Model model) {
		String productId= request.getParameter("productId");
		int quantity=Integer.parseInt(request.getParameter("order"));
		
		System.out.println("productId----------"+quantity);
		orderService.processOrder(productId, quantity);
		model.addAttribute("product", productRepository.getProductById(productId));
		return "/product";
	}
}