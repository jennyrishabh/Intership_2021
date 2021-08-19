package com.nia.model;

public class login {
	
	public login() {}
	
	private String emailid;
	private String pwd;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	@Override
	public String toString() {
		return "login [emailid=" + emailid + ", pwd=" + pwd + "]";
	}
	
	private String name = "default";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}