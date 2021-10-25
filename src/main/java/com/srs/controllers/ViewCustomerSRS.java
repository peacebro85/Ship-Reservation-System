package com.srs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srs.bean.Route;
import com.srs.bean.Schedule;
import com.srs.bean.Ship;
import com.srs.dao.RouteDao;
import com.srs.dao.ScheduleDao;
import com.srs.dao.ShipDao;

@Controller
public class ViewCustomerSRS {
	
	 @Autowired  
		ShipDao dao;
	 @Autowired 
	 	ScheduleDao dao1;
	 @Autowired  
		RouteDao dao2;
	
	 @RequestMapping("/viewShipCust")    
	    public String viewShip(Model m){    
	        List<Ship> list=dao.getShip();    
	        m.addAttribute("list",list);  
	        return "viewShipCust";    
	    }    
	 
	 
	 @RequestMapping("/viewScheduleCust")    
	    public String viewSchedule(Model m){    
	        List<Schedule> list=dao1.getSchedule();    
	        m.addAttribute("list",list);  
	        return "viewScheduleCust";    
	    }    

	 
	 @RequestMapping("/viewRouteCust")    
	    public String viewRoutes(Model m){    
	        List<Route> list=dao2.getRoute();    
	        m.addAttribute("list",list);  
	        return "viewRouteCust";    
	    }    
	 
	 
}
