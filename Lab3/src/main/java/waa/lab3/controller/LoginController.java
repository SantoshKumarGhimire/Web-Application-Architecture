package waa.lab3.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import waa.lab3.model.User;
import waa.lab3.repository.UserRepository;


@Controller
@SessionAttributes("userInfo")
public class LoginController {
	@Autowired
	UserRepository userService;

	@RequestMapping(value={"/","/login"}, method= RequestMethod.GET)
	public String getLoginForm() {
	return "/login";
	}
	@RequestMapping(value={"/welcome"}, method=RequestMethod.GET)
	public String getWelcomeForm(){
			return "welcome";
	}

	@RequestMapping(value="/welcome", method= RequestMethod.POST)
	public String authenticate(@ModelAttribute User user, boolean remember, @CookieValue(value="userName", defaultValue="") 
	String userName, Model model,
		HttpSession session, HttpServletResponse response, RedirectAttributes redirectAttributes) {
	if(userService.authenticete(user)){
		if(remember && userName.isEmpty()){
			Cookie cookie = new Cookie("userName", user.getUsername());
			cookie.setMaxAge(30*24*60*60);
			response.addCookie(cookie);
		}
		else if(!remember){
			Cookie cookie = new Cookie("userName",null);
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		session.setAttribute("user", user);
		redirectAttributes.addFlashAttribute("message", "Refresh and i will be gone");
		return "welcome";
	}else{
		System.out.println(user.getUsername());
		System.out.println(remember);
		model.addAttribute("err_msg","invalid username or password");
		return "login";
	}
	}
	@RequestMapping (value="/logout")
	public String logout(SessionStatus status,HttpSession session ){
		session.invalidate();
		return "login";
	}
	
	

}
