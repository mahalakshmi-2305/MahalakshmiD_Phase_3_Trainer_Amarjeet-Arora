package com.service;

import org.springframework.stereotype.Service;

@Service
public class AdminLoginService {
	
	
	
public boolean loginValid(String name,String pass) {
		
		if(name.equals("admin") && pass.equals("1234")){
			
			return true;
		}
		return false;
		
	}


}
