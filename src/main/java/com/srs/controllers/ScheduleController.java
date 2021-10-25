package com.srs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srs.bean.Schedule;
import com.srs.dao.ScheduleDao;

@Controller
public class ScheduleController {
	
	 @Autowired  
	ScheduleDao dao;
	 
	 
	 @RequestMapping("/Scheduleform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Schedule());  
	        return "Scheduleform";   
	    }    
	      
	    @RequestMapping(value="/adds",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("schedule") Schedule schedule){    
	        dao.save(schedule);    
	        return "redirect:/viewSchedule";    
	    }    
	    /* It provides list of employees in model object */    
	    @RequestMapping("/viewSchedule")    
	    public String viewSchedule(Model m){    
	        List<Schedule> list=dao.getSchedule();    
	        m.addAttribute("list",list);  
	        return "viewSchedule";    
	    }    
	      
	    @RequestMapping(value="/editSchedule/{ScheduleId}")    
	    public String edit(@PathVariable int ScheduleId, Model m){    
	        Schedule schedule=dao.getScheduleById(ScheduleId);    
	        m.addAttribute("command",schedule);  
	        return "Scheduleeditform";    
	    }    
	      
	    @RequestMapping(value="/edsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("schedule") Schedule schedule){    
	        dao.update(schedule);    
	        return "redirect:/viewSchedule";    
	    }    
	    
	    @RequestMapping(value="/deleteSchedule/{ScheduleId}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int ScheduleId){    
	        dao.delete(ScheduleId);    
	        return "redirect:/viewSchedule";    
	    }     

}





