package com.srs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.srs.bean.Passenger;
import com.srs.bean.Reservation;
import com.srs.bean.Route;
import com.srs.dao.PassengerDao;
import com.srs.dao.RouteDao;

@Controller
public class PassengerController {

	
	@Autowired  
	 PassengerDao dao;
		 
		 
		 @RequestMapping("/Continueform")    
		    public String showform(Model m){    
		        m.addAttribute("command", new Passenger());  
		        return "Continueform";   
		    }    
		      
		    @RequestMapping(value="/addss",method = RequestMethod.POST)    
		    public String save(@ModelAttribute("passenger") Passenger passenger){    
		        dao.save(passenger);    
		        return "redirect:/viewContinue";    
		    }    
		    /* It provides list of employees in model object */    
		    @RequestMapping("/viewContinue")    
		    public String viewPassengers(Model m){    
		        List<Passenger> list=dao.getPassenger();    
		        m.addAttribute("list",list);  
		        return "viewContinue";    
		    }    
		      
		    @RequestMapping(value="/editPassenger/{PassengerId}")    
		    public String edit(@PathVariable int PassengerId, Model m){    
		    	Passenger passenger=dao.getPassengerById(PassengerId);    
		        m.addAttribute("command",passenger);  
		        return "Continueeditform";    
		    }    
		      
		    @RequestMapping(value="/edttsave",method = RequestMethod.POST)    
		    public String editsave(@ModelAttribute("passenger") Passenger passenger){    
		        dao.update(passenger);    
		        return "redirect:/viewContinue";    
		    }    
		    
		    @RequestMapping(value="/deletePassenger/{PassengerId}",method = RequestMethod.GET)    
		    public String delete(@PathVariable int PassengerId){    
		        dao.delete(PassengerId);    
		        return "redirect:/viewContinue";    
		    }  
		    @RequestMapping(value = "/print")
			public String view(@RequestParam("ReservationId") String ReservationId, Model m) {
				int cno = Integer.parseInt(ReservationId);
				List<Passenger> list1 = dao.getPassengerbyid(cno);
				m.addAttribute("list1", list1);
				System.out.println("hello");
				return "print";

			}
}
