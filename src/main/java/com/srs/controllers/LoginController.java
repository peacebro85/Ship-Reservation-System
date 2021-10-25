package com.srs.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srs.bean.CredentialsBean;
import com.srs.bean.CreditCard;
import com.srs.bean.ProfileBean;
import com.srs.bean.Reservation;
import com.srs.bean.Route;
import com.srs.dao.CredentialsDao;
import com.srs.dao.CreditCardDao;
import com.srs.util.*;

@Controller
public class LoginController {
	@Autowired
	private DbUtil db;
	@Autowired  
	CredentialsDao dao;
	
	
	@RequestMapping("/login")
	public String login(HttpServletRequest req,Model m) 
	{
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		CredentialsBean cb = new CredentialsBean();
		cb.setUserID(username);
		cb.setPassword(password);
		m.addAttribute("username", username);
		User v = new User();
		String retValue =  v.login(cb, db);
		if(retValue.equals("A")) {
			return "Admin";
		}
		else if(retValue.equals("C"))
		{
			return "Customer";
		}
		else 
		{
			return "index";
		}
	}
	
	@RequestMapping("/Contactus")
	public String contactus() {
		return "Contactus";
	}
	@RequestMapping("/chpass")
	public String chpass() {
		return "change";
	}
	@RequestMapping(value="/paw")  
	 public String chp(@RequestParam("uid") String uid,@RequestParam("password") String password,Model m){ 
		CredentialsBean ob=new CredentialsBean();
		ob.setPassword(password);
		ob.setUserID(uid);
		dao.chp(password, uid);
	  System.out.println("password changed");
	  return "index";
	      
	 }
	
	@RequestMapping("/Aboutus")
	public String aboutus() {
		return "Aboutus";
	}
	
	//New User Signup
	@RequestMapping("/NewUserSignup")
	public String signup() {
		return "NewUserSignup";
	}
	
	//Getting Details From the New User
	@RequestMapping("/saved")
	public String savedetails(HttpServletRequest req) {
		String fname,lname,gender,street,loc,city,state,mail,pss,dob;
		String pin,mob;
		fname = req.getParameter("Firstname");
		lname = req.getParameter("Lastname");
		gender = req.getParameter("gender");
		street = req.getParameter("street");
		loc = req.getParameter("location");
		city = req.getParameter("city");
		state = req.getParameter("state");
		mail = req.getParameter("mail");
		pss = req.getParameter("password");
		dob = req.getParameter("dob");
		pin = (req.getParameter("pin"));
		mob = (req.getParameter("mob"));
		ProfileBean p = new ProfileBean();
		p.setFirstName(fname);
		p.setLastName(lname);
		p.setGender(gender);
		p.setStreet(street);
		p.setLocation(loc);
		p.setCity(city);
		p.setState(state);
		p.setPincode(pin);
		p.setMobileNo(mob);
		p.setEmailID(mail);
		p.setPassword(pss);
		p.setDateOfBirth(dob);
		User user = new User();
		user.register(p,db);
		System.out.println("Registration successfull");
		return "redirect:/index.jsp";
	}
}
