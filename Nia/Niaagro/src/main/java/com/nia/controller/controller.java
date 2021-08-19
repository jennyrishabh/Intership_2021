package com.nia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nia.dao.dataClass;
import com.nia.model.login;
import com.nia.model.signup;
import com.nia.pwdEncrypt.pwd;

@Controller
public class controller {
	
	@Autowired
	private dataClass obj;
	
	@RequestMapping("/signup")
	public String signup(Model m) {
		m.addAttribute("model",new signup());
		return "signup";
	}
	
	
	@RequestMapping("/signupProcessing")
	public String signupProcessing(@Valid @ModelAttribute("model") signup mr , BindingResult results , Model m) {
		
		System.out.println("in signup  funtion...id :"+mr.getEmailid()+" pass1 : "+mr.getPwd1());
		
		System.out.println(mr.toString());
		
		if(results.hasErrors()) {
			System.out.println("has some error");
		return "signup";
	     }
		
		else {
			System.out.println("hasn't some error");
			// insert imto DB : 
			String temp[] = mr.getPwd1().split(",");
			
			pwd PWD = new pwd();
			String originalString = temp[0];			 
			    String encryptedString = PWD.encrypt(originalString);
			
	   if(obj.insertUser(mr , encryptedString) == 1) {System.out.println("successfully inserted the datat in DB ");}else {System.out.println("failed to inster in DB ");}
				
			
		m.addAttribute("signup", mr);	
		return "sucess";
		}
		
	}
	
	
	
	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("modeltwo",new login());
		return "login";
		}
	
	@RequestMapping("/loginProcessing")
	public String loginProcessing(@ModelAttribute("modeltwo") login lg, Model m) {
		boolean result = false;
		login temp = new login();
		try {
		temp = obj.getUser(lg.getEmailid());
		}
		catch(Exception e) {result = true ;}
		
		if(result) {m.addAttribute("msg1", "email doesn't exist in the DB !! ");return "login";}
		else {
			
				String newtemp = temp.getPwd();
				pwd PWD = new pwd();
				    String decryptedString = PWD.decrypt(newtemp);
			
			if(decryptedString.equals(lg.getPwd()))
			 {
				m.addAttribute("signup", lg);
				return "sucess";
			 }
			
			else {
				m.addAttribute("msg2", "passWord doesn't match..");
				return "login";
			}
		
		}
		
	}
	

}