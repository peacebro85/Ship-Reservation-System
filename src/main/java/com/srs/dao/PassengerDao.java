package com.srs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.srs.bean.Passenger;
import com.srs.bean.Reservation;
import com.srs.bean.Route;

public class PassengerDao {
JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(Passenger p){    
	    String sql="insert into srs_tbl_passenger(ReservationId,ScheduleId,Name,Age,Gender) values('"+p.getReservationId()+"','"+p.getScheduleId()+"','"+p.getName()+"','"+p.getAge()+"','"+p.getGender()+"')";    
	    return template.update(sql);    
	}    
	public int update(Passenger p){    
	    String sql="update srs_tbl_passenger set Name='"+p.getName()+"', Age='"+p.getAge()+"',Gender='"+p.getGender()+"' where PassengerId="+p.getPassengerId()+"";    
	    return template.update(sql);    
	}    
	public int delete(int PassengerId){    
	    String sql="delete from srs_tbl_passenger where PassengerId="+PassengerId+"";    
	    return template.update(sql);    
	}    
	public Passenger getPassengerById(int PassengerId){    
	    String sql="select * from srs_tbl_passenger where PassengerId=?";    
	    return template.queryForObject(sql, new Object[]{PassengerId},new BeanPropertyRowMapper<Passenger>(Passenger.class));    
	} 
	public List<Passenger> getPassengerbyid(int x){    
	    return template.query("select * from srs_tbl_passenger where PassengerId="+x,new RowMapper<Passenger>(){    
	    	
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
