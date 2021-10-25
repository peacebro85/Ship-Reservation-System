package com.srs.dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.srs.bean.CreditCard;
import com.srs.bean.Passenger;
import com.srs.bean.ProfileBean;
import com.srs.bean.Reservation;
import com.srs.bean.Passenger;


public class CreditCardDao {

	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}
	public int save(CreditCard p){    
	    String sql="insert into srs_tbl_creditcard(CreditCardNumber,ValidFrom,ValidTo,UserId) values('"+p.getCreditCardNumber()+"','"+p.getValidFrom()+"','"+p.getValidTo()+"','"+p.getUserId()+"')";    
	    return template.update(sql);    
	}
	public CreditCard getCredByNum(int CreditCardNumber){  
	    String sql="select * from  srs_tbl_creditcard where  CreditCardNumber=?";  
	    return template.queryForObject(sql, new Object[]{CreditCardNumber},new BeanPropertyRowMapper<CreditCard>(CreditCard.class));  
	}  
	
	
	public int delete(int CreditCardNumber)
	{
		String sql="delete from  srs_tbl_creditcard where  CreditCardNumber="+CreditCardNumber+"";
		return template.update(sql);

}
	public List<CreditCard> getCard(int x){    
	    return template.query("select * from srs_tbl_creditcard where CreditCardNumber="+x+"",new RowMapper<CreditCard>(){    
	        public CreditCard mapRow(ResultSet rs, int row) throws SQLException { 
	        	
	            CreditCard e=new CreditCard();    
	            e.setCreditCardNumber(rs.getInt(1));
	            System.out.println(e.getCreditCardNumber());
	            e.setValidFrom(rs.getString(2));
	            System.out.println(e.getValidFrom());
	            e.setValidTo(rs.getString(3));
	            System.out.println(e.getValidTo());
	            e.setUserId(rs.getString(4));
	            System.out.println(e.getUserId());
	            e.setBalance(rs.getInt(5));
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
	public CreditCard ba(int r)
	{
		String sql="select faree from srs_tbl_route where routeid=?";
		 return template.queryForObject(sql, new Object[]{r},new BeanPropertyRowMapper<CreditCard>(CreditCard.class));
	}
	public int ro(CreditCard i,int cr)
	{
		String sql="update srs_tbl_creditcard set balance=balance-"+i+" where creditcardnumber="+cr+"";
		return template.update(sql);

}
	public int updateps(int route,int y,int z) {
		String tf = (String) this.template.queryForObject(
		        "select faree from srs_tbl_route where routeid = ?", 
		        new Object[]{route}, String.class);
		String bal=(String) this.template.queryForObject(
		        "select balance from srs_tbl_CREDITCARD where creditcardnumber = ?", 
		        new Object[]{y}, String.class);
		//String res=(String) this.template.queryForObject(
		        //"select bookingstatus from srs_tbl_reservataion where userid = ?", 
		        //new Object[]{z}, String.class);
		System.out.println(tf);
		System.out.println(bal);
		double newbl=Double.parseDouble(bal)-Double.parseDouble(tf);
		System.out.println(newbl);
		String sql="update SRS_TBL_reservation set bookingstatus='Success' where userid='"+z+"'";
		String sql2="update SRS_tbl_creditcard set balance="+newbl+" where creditcardnumber='"+y+"'";
		int i=template.update(sql2);
		  return template.update(sql);
		
		
	}
	
	
	
	
	
	
}
