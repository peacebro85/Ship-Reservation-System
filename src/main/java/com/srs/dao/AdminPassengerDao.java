package com.srs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.srs.bean.Passenger;

public class AdminPassengerDao {

JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}   
	public List<Passenger> getPassenger(){    
	    return template.query("select * from srs_tbl_passenger",new RowMapper<Passenger>(){    
	        public Passenger mapRow(ResultSet rs, int row) throws SQLException {    
	        	Passenger e=new Passenger();    
	            e.setReservationId(rs.getInt(1));    
	            e.setScheduleId(rs.getInt(2));    
	            e.setName(rs.getString(3)); 
	            e.setAge(rs.getInt(4)); 
	            e.setGender(rs.getString(5));
	            e.setPassengerId(rs.getInt(6));    
	            return e;    
	        }    
	    });    
	}    
}
