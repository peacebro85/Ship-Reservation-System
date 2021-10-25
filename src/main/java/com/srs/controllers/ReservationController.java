package com.srs.controllers;	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.srs.bean.Reservation;
	import com.srs.dao.ReservationDao;

	@Controller
	public class ReservationController {
		
		 @Autowired  
		 ReservationDao dao;
		 
		 
		 @RequestMapping("/Reservationform")    
		    public String showform(Model m){    
		        m.addAttribute("command", new Reservation());  
		        return "Reservationform";   
		    }    
		      
		    @RequestMapping(value="/added",method = RequestMethod.POST)    
		    public String save(@ModelAttribute("reservation") Reservation reservation){    
		        dao.save(reservation);    
		        return "redirect:/viewReservation2";    
		    }    
		    
		    @RequestMapping("/viewReservation")    
		    public String viewReservation(Model m){    
		        List<Reservation> list=dao.getReservation();    
		        m.addAttribute("list",list);  
		        return "viewReservation";    
		    }   
		    
		    @RequestMapping("/viewReservation2")    
		    public String viewReservation2(Model m){    
		        List<Reservation> list=dao.getReservation();    
		        m.addAttribute("list",list);  
		        return "viewReservation2";    
		    }   
		      
		    @RequestMapping(value="/editReservation/{ReservationId}")    
		    public String edit(@PathVariable int ReservationId, Model m){    
		       Reservation route=dao.getReservationById(ReservationId);    
		        m.addAttribute("command",route);  
		        return "Reservationeditform";    
		    }    
		      
		    
		    @RequestMapping(value="/esave",method = RequestMethod.POST)    
		    public String editsave(@ModelAttribute("reservation") Reservation reservation){    
		        dao.update(reservation);    
		        return "redirect:/viewReservation2";    
		    }    
		    
		    @RequestMapping(value="/deleteReservation/{ReservationId}",method = RequestMethod.GET)    
		    public String delete(@PathVariable int ReservationId){    
		        dao.delete(ReservationId);    
		        return "redirect:/viewReservation2";    
		    }     

	}







