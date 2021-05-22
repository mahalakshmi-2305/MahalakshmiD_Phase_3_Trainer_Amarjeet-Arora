package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.Users;


@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
public boolean loginValid(String name,String pass) {
		
		if(name.equals("maha") && pass.equals("1234")){
			
			return true;
		}
		return false;
		
	}

public void addUser(String name, String email, String password, String adress, String pincode, String state, String country) {
	

	userDao.save(new Users(name ,email,password,adress,pincode,state, country));
	
}


	

}
