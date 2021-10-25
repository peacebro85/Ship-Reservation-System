package com.srs.controllers;



import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.srs.bean.CreditCard;
import com.srs.bean.Passenger;
import com.srs.bean.Reservation;
import com.srs.bean.Route;
import com.srs.dao.CreditCardDao;
import com.srs.dao.PassengerDao;

@Controller
public class CreditCardController {

	
	@Autowired  
CreditCardDao dao;
	
	@RequestMapping("/pay")    
    public String shows(Model m){    
        m.addAttribute("command", new CreditCard());  
        return "pay";   
    }
	@RequestMapping("/paymentwindow")    
    public String showform(Model m){    
		List<Passenger> list=dao.getPassenger();  
        m.addAttribute("list",list);  
        return "viewContinue";  
    }    
	
	@RequestMapping(value="/payview")  
	 public String view(@RequestParam("CreditCardNumber") int CreditCardNumber,@RequestParam("route") int route,@RequestParam("uid") int uid,Model m){ 
		Route ro=new Route();
		CreditCard cc=new CreditCard();
		Reservation rr=new Reservation();
		cc.setBalance(CreditCardNumber);
		ro.setRouteId(route);
		rr.setUserId(uid);
		System.out.println("dfdsf");
		dao.updateps(route,CreditCardNumber,uid);
	  System.out.println("hello");
	  return "finalpage";
	      
	 }
   
	@RequestMapping("/payt/{creditCardNumber}")    
    public String viewReservation(@RequestParam("route") String route,@PathVariable String creditCardNumber,Model m){ 
		//System.out.println("dfdsf");
		//int k=Integer.parseInt(creditCardNumber);
		//int l=Integer.parseInt(route);
		//CreditCard ba = dao.ba(l);
		//dao.ro(ba,k);
		List<Passenger> list2=dao.getPassenger();    
        m.addAttribute("list2",list2);  
        return "printing";    
    }
	
	
	
}

