package com.juniorsrr.web;
line1
line2
line3
line4
line7
line8
line9
line10
public class Login {
	private String username;
	private String password;
	
	public Login(){
		this.username = "Default name";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompleteName(){
		return username + " " + password;
	}	
}
