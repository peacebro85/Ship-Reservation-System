package com.srs.dao;
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;

import com.srs.bean.ProfileBean;    
    
public class ProfileDao {    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public int save(ProfileBean p){    
    String sql="insert into srs_tbl_user_profile1 (firstName,lastName,Gender,Street,Location,City,State,Pincode,mobileNo,emailID,Password,dateOfBirth) values('"+p.getFirstName()+"','"+p.getLastName()+"','"+p.getGender()+"','"+p.getStreet()+"','"+p.getLocation()+"','"+p.getCity()+"','"+p.getState()+"','"+p.getPincode()+"','"+p.getMobileNo()+"','"+p.getEmailID()+"','"+p.getPassword()+"','"+p.getDateOfBirth()+"')";
    return template.update(sql);    
}  
public int update(ProfileBean p){    
    String sql="update srs_tbl_user_profile1 set FirstName="+p.getFirstName()+",LastName="+p.getLastName()+",Gender="+p.getGender()+",Street="+p.getStreet()+",Location="+p.getLocation()+",City="+p.getCity()+",State="+p.getState()+",Pincode="+p.getPincode()+",MobileNo="+p.getMobileNo()+",EmailID="+p.getEmailID()+",Password="+p.getPassword()+",DateOfBirth="+p.getDateOfBirth()+" where UserId="+p.getUserID()+"";    
    return template.update(sql);    
}
public int delete(int UserID){    
    String sql="delete from srs_tbl_user_profile1 where UserId="+UserID+"";    
    return template.update(sql);    
}    
public ProfileBean getProfileByUserId(int UserID){    
    String sql="select * from srs_tbl_user_profile1 where UserId=?";    
    return template.queryForObject(sql, new Object[]{UserID},new BeanPropertyRowMapper<ProfileBean>(ProfileBean.class));    
}    
public List<ProfileBean> getOrder(){    
    return template.query("select * from srs_tbl_user_profile1",new RowMapper<ProfileBean>(){    
        public ProfileBean mapRow(ResultSet rs, int row) throws SQLException {    
            ProfileBean e=new ProfileBean();    
            e.setUserID(rs.getString(1));    
            e.setFirstName(rs.getString(2));    
            e.setLastName(rs.getString(3));    
            e.setGender(rs.getString(4));
            e.setStreet(rs.getString(5));
            e.setLocation(rs.getString(6));
            e.setCity(rs.getString(7));
            e.setState(rs.getString(8));
            e.setPincode(rs.getString(9));
            e.setMobileNo(rs.getString(10));
            e.setEmailID(rs.getString(11));
            e.setPassword(rs.getString(12));
            return e;    
        }    
    });    
}    
}