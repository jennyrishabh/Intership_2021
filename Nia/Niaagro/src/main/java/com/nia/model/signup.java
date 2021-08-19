package com.nia.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.nia.customValid.pwdmatcher;


public class signup {
	
	@Override
	public String toString() {
		return "signup [name=" + name + ", comp_name=" + comp_name + ", buyer_type=" + buyer_type + ", state=" + state
				+ ", city=" + city + ", office_landline=" + office_landline + ", phne=" + phne + ", emailid=" + emailid
				+ ", products_manufactured=" + products_manufactured + ", pwd1=" + pwd1 + ", pwd2=" + pwd2
				+ ", website=" + website + ", Gst_number=" + Gst_number + ", address=" + address + ", checkbox="
				+ checkbox + "]";
	}
	
	
	public signup(){
		
	}
	
	@Pattern(regexp="([a-zA-Z]+)",message="Enter only alphabets")
	private String name;
	@Pattern(regexp="([a-zA-Z]+)",message="Enter only alphabets")
	private String comp_name;
	private String buyer_type;
	private String state;
	private String city;
	@Pattern(regexp="(0)?[1-9]{3}[0-9]{6}",message="invalid phoneNumber ,write in this format : (0){ur number} , eg : 0124989898")
	@NotNull(message="cannot be null")
	private String office_landline;
	@Pattern(regexp="(0|91)?[6-9][0-9]{9}",message="invalid phoneNumber ,first number must be from 6 to 9 , write in this format : (0/91){ur number} , eg : 919876543210")
	@NotNull(message="cannot be null")
	private String phne;
	@Pattern(regexp="[0-9a-zA-Z][a-zA-Z]+@[a-zA-Z]+([.][a-z]+)+",message="invalid email id : write in this form , eg : text@yahoo.org.co.in")
	@NotNull(message="cannot be null")
	private String emailid;
	private String products_manufactured;
	
	@Size(min=6,message="min 6 ch should be there")
	@NotNull(message="cannot be null")
	@pwdmatcher(value="password")
	@Pattern(regexp="[A-Z]([a-zA-Z0-9_@.,]+)+",message="First letter must be in caps..and password can have an '@' , '_' , ' . ' ")
	private String pwd1;
	
	@pwdmatcher(value="password" ,message="enter the same password as above")
	private String pwd2;
	
	@Pattern(regexp="www[.][a-zA-Z0-9]+([.][a-zA-Z]+)+",message="enter in www.test.com format")
	private String website;
	private String Gst_number;
	private String address;
	private String checkbox;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComp_name() {
		return comp_name;
	}
	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	public String getBuyer_type() {
		return buyer_type;
	}
	public void setBuyer_type(String buyer_type) {
		this.buyer_type = buyer_type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getOffice_landline() {
		return office_landline;
	}
	public void setOffice_landline(String office_landline) {
		this.office_landline = office_landline;
	}
	public String getPhne() {
		return phne;
	}
	public void setPhne(String phne) {
		this.phne = phne;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getProducts_manufactured() {
		return products_manufactured;
	}
	public void setProducts_manufactured(String products_manufactured) {
		this.products_manufactured = products_manufactured;
	}
	public String getPwd1() {
		return pwd1;
	}
	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}
	public String getPwd2() {
		return pwd2;
	}
	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getGst_number() {
		return Gst_number;
	}
	public void setGst_number(String gst_number) {
		Gst_number = gst_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
		

}
