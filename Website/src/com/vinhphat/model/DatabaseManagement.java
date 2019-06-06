package com.vinhphat.model;

public class DatabaseManagement {
	
	public boolean checkUser(String username, String password) {	
		
		if(username.equals("vvphat") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
		
	}
}
