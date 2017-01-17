package waa.labwork.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import waa.labwork.model.User;
import waa.labwork.service.Service;

@Controller
public class LoginController {
	@RequestMapping(value = {"/","/login"} ,  method = RequestMethod.GET)
	public String index(ModelMap model) {
		//model.addAttribute("message", "Spring 4 MVC Hello World Example Built with Maven");
		return "Login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcome(HttpSession session,@RequestParam("username") String username,@RequestParam("password") String password, ModelMap model){
		
		Service service= new Service();
		
		
		
		boolean check= service.check(username, password);
		
		if(check){
			
			return "redirect:/welcome";
		}
		else{
		model.addAttribute("message", "wrong username or password");
		return "Login";
		}
	
		
	}
	@RequestMapping(value="/welcome" ,  method = RequestMethod.GET)
	public String welcomepage(ModelMap model, HttpSession session) {
		User user = new User();
		session.setAttribute("username", "admin");
		return "Welcome";
	}
	
}
