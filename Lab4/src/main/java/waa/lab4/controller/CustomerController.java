package waa.lab4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import waa.lab4.model.Customer;

@Controller
public class CustomerController {
	@RequestMapping(value = "/customerEntry", method = RequestMethod.GET)
	public String loadCustomer(Model model, Customer newCustomer) {
		model.addAttribute("newCustomer", newCustomer);
		return "customerEntry";
	}

	@RequestMapping(value = "/customerEntry", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("newCustomer") @Valid Customer newCustomer, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "customerEntry";
		}
		model.addAttribute("customer", newCustomer);
		System.out.println("This is address of the customer" + newCustomer.getAddress());
		return "displayCustomer";

	}

}
