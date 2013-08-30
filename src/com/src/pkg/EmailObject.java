package com.src.pkg;

public class EmailObject {
	
	private String emailAddress;
	private boolean state;
	private String dateTime;
	
	
	private String getEmailAddress() {
		return emailAddress;
	}
	private void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	private boolean isState() {
		return state;
	}
	private void setState(boolean state) {
		this.state = state;
	}
	private String getDateTime() {
		return dateTime;
	}
	private void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
