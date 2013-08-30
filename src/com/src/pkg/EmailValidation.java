package com.src.pkg;

public class EmailValidation {
	public static String validate(String email) {
		if(email == null || email.isEmpty()) {
			return "You have to fill in the email.";
		} else if(email.contains("@")) {
			return "Email is valid: " + email;			
		} else {
			return "Email is invalid: " + email;
		}
	}
	
	public static String something(){
		return "hello, who are you?";
	}
}
