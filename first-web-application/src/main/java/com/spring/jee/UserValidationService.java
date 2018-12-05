package com.spring.jee;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		if (user.equals("test") && password.equals("test")) {
			return true;
		}
		return false;
	}
}
