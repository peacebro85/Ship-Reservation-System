package com.srs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.srs.bean.Ship;

public class ShipDao {
	
	JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(Ship p){    
	    String sql="insert into srs_tbl_ship(ShipName,SeatingCapacity,ReservationCapacity) values('"+p.getShipName()+"',"+p.getSeatingCapacity()+",'"+p.getReservationCapacity()+"')";    
	    return template.update(sql);    
	}    
	public int update(Ship p){    
	    String sql="update srs_tbl_ship set ShipName='"+p.getShipName()+"', SeatingCapacity="+p.getSeatingCapacity()+",ReservationCapacity='"+p.getReservationCapacity()+"' where ShipId="+p.getShipId()+"";    
	    return template.update(sql);    
	}    
	public int delete(int ShipId){    
	    String sql="delete from srs_tbl_ship where ShipId="+ShipId+"";    
	    return template.update(sql);    
	}    
	public Ship getShipById(int ShipId){    
	    String sql="select * from srs_tbl_ship where ShipId=?";    
	    return template.queryForObject(sql, new Object[]{ShipId},new BeanPropertyRowMapper<Ship>(Ship.class));    
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
	}   



