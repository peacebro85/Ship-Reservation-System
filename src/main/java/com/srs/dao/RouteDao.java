package com.srs.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.srs.bean.Route;

public class RouteDao {
	
	JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(Route p)
	{    
		if(p.getSource().equals(p.getDestination()))
		{
			System.out.println("Sourece and Destination should be different");
			return 0;
		}
		else
		{
			String sql="insert into srs_tbl_route(Source,Destination,TravelDuration,Faree) values('"+p.getSource()+"','"+p.getDestination()+"','"+p.getTravelDuration()+"','"+p.getFaree()+"')";    
		    return template.update(sql); 
		}   
	}    
	public int update(Route p){    
	    String sql="update srs_tbl_route set Source='"+p.getSource()+"', Destination='"+p.getDestination()+"',TravelDuration='"+p.getTravelDuration()+"',Faree='"+p.getFaree()+"' where RouteId="+p.getRouteId()+"";    
	    return template.update(sql);    
	}    
	public int delete(int RouteId){    
	    String sql="delete from srs_tbl_route where RouteId="+RouteId+"";    
	    return template.update(sql);    
	}    
	public Route getRouteById(int RouteId){    
	    String sql="select * from srs_tbl_route where RouteId=?";    
	    return template.queryForObject(sql, new Object[]{RouteId},new BeanPropertyRowMapper<Route>(Route.class));    
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



