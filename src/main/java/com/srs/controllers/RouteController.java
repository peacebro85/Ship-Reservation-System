package com.srs.controllers;	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.srs.bean.Route;
	import com.srs.dao.RouteDao;

	@Controller
	public class RouteController {
		
		 @Autowired  
		RouteDao dao;
		 
		 
		 @RequestMapping("/Routeform")    
		    public String showform(Model m){    
		        m.addAttribute("command", new Route());  
		        return "Routeform";   
		    }    
		      
		    @RequestMapping(value="/add",method = RequestMethod.POST)    
		    public String save(@ModelAttribute("route") Route route){    
		        dao.save(route);    
		        return "redirect:/viewRoute";    
		    }    
		    /* It provides list of employees in model object */    
		    @RequestMapping("/viewRoute")    
		    public String viewRoutes(Model m){    
		        List<Route> list=dao.getRoute();    
		        m.addAttribute("list",list);  
		        return "viewRoute";    
		    }    
		      
		    @RequestMapping(value="/editRoute/{RouteId}")    
		    public String edit(@PathVariable int RouteId, Model m){    
		       Route route=dao.getRouteById(RouteId);    
		        m.addAttribute("command",route);  
		        return "Routeeditform";    
		    }    
		      
		    @RequestMapping(value="/edtsave",method = RequestMethod.POST)    
		    public String editsave(@ModelAttribute("route") Route route){    
		        dao.update(route);    
		        return "redirect:/viewRoute";    
		    }    
		    
		    @RequestMapping(value="/deleteRoute/{RouteId}",method = RequestMethod.GET)    
		    public String delete(@PathVariable int RouteId){    
		        dao.delete(RouteId);    
		        return "redirect:/viewRoute";    
		    }     

	}







