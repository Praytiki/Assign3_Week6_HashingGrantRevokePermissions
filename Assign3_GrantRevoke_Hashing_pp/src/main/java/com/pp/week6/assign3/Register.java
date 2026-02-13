package com.pp.week6.assign3;

public class Register {
	/**
	 * 
	 * @Pratik Patel
	 * @Tuesday, February 17, 2026
	 * 
	 * 
	 * Description - Here are the getter and setter for each of the variables
	 * 				that are passed on to the doa file to enter into the database to help
	 * 				stop SQL injection. This code supports parameterization of the input.
	 * 
	 * 
	 */
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String user_id;
	private String password;
	private String mobile;
	private String email;
	

}






















