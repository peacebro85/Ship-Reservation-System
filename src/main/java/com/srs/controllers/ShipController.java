package com.srs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srs.bean.Ship;
import com.srs.dao.ShipDao;

@Controller
public class ShipController {
	
	 @Autowired  
	ShipDao dao;
	 
	 
	 @RequestMapping("/Shipform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Ship());  
	        return "Shipform";   
	    }    
	      
	    @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("ship") Ship ship){    
	        dao.save(ship);    
	        return "redirect:/viewShip";    
	    }    
	    /* It provides list of employees in model object */    
	    @RequestMapping("/viewShip")    
	    public String viewShip(Model m){    
	        List<Ship> list=dao.getShip();    
	        m.addAttribute("list",list);  
	        return "viewShip";    
	    }    
	      
	    @RequestMapping(value="/editShip/{ShipId}")    
	    public String edit(@PathVariable int ShipId, Model m){    
	        Ship ship=dao.getShipById(ShipId);    
	        m.addAttribute("command",ship);  
	        return "Shipeditform";    
	    }    
	      
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("ship") Ship ship){    
	        dao.update(ship);    
	        return "redirect:/viewShip";    
	    }    
	    
	    @RequestMapping(value="/deleteShip/{ShipId}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int ShipId){    
	        dao.delete(ShipId);    
	        return "redirect:/viewShip";    
	    }     

}




