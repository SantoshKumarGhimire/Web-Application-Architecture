package waa.labwork.service;

import waa.labwork.model.User;

public class Service {
	User user = new User();
	public boolean check(String username, String password){
		user.setUsername("admin");
		user.setPassword("test123");
		
		if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
			return true;
		}
		return false;
		
	}
	

}
