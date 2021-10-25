package com.srs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.srs.bean.Route;
import com.srs.bean.Schedule;
import com.srs.bean.Ship;

public class ViewCustomerSRSDao {
	
	
JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	

	public List<Ship> getShip(){    
	    return template.query("select * from srs_tbl_ship",new RowMapper<Ship>(){    
	        public Ship mapRow(ResultSet rs, int row) throws SQLException {    
	            Ship e=new Ship();    
	            e.setShipId(rs.getInt(1));    
	            e.setShipName(rs.getString(2));    
	            e.setSeatingCapacity(rs.getInt(3));    
	            e.setReservationCapacity(rs.getInt(4));    
	            return e;    
	        }    
	    });    
	}    
	
	
	public List<Schedule> getSchedule(){    
	    return template.query("select * from srs_tbl_schedule",new RowMapper<Schedule>(){    
	        public Schedule mapRow(ResultSet rs, int row) throws SQLException {    
	        	Schedule e=new Schedule(); 
	        	e.setScheduleId(rs.getInt(1));
	            e.setShipId(rs.getInt(2));        
	            e.setRouteId(rs.getInt(3));    
	            e.setStartDate(rs.getDate(4));    
	            return e;    
	        }    
	    });    
	}    

	
	public List<Route> getRoute(){    
	    return template.query("select * from srs_tbl_route",new RowMapper<Route>(){    
	        public Route mapRow(ResultSet rs, int row) throws SQLException {    
	            Route e=new Route();    
	            e.setRouteId(rs.getInt(1));    
	            e.setSource(rs.getString(2));    
	            e.setDestination(rs.getString(3)); 
	            e.setTravelDuration(rs.getString(4)); 
	            e.setFaree(rs.getInt(5));    
	            return e;    
	        }    
	    });    
	}    
}
