package waa.lab3.repository;

import org.springframework.stereotype.Repository;

import waa.lab3.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository  {

	@Override
	public boolean authenticete(User user) {
		if("admin".equals(user.getUsername()) && "test123".equals(user.getPassword())){
			return true;
		}else{
			return false;
		}
	}

}
