package com.srs.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import com.srs.bean.CredentialsBean;   
    
public class CredentialsDao 
{    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}
public int saveProfile(String password) {
	String sql = "insert into srs_tbl_user_credentials (password,usertype,loginstatus) values('"+password+"','customer',1)";
	return template.update(sql);
}
public int save(CredentialsBean p){    
    String sql="insert into srs_tbl_user_credentials values('"+p.getUserID()+"','"+p.getPassword()+"','"+p.getUserType()+"',"+p.getLoginStatus()+")";
    return template.update(sql);    
}  
public int delete(int UserID){    
    String sql="delete from srs_tbl_user_credentials where id="+UserID+"";    
    return template.update(sql);    
}    
public int update(CredentialsBean p){    
    String sql="update srs_tbl_user_credentials set UserID="+p.getUserID()+",Password="+p.getPassword()+",Usertype="+p.getUserType()+",Loginstatus="+p.getLoginStatus()+" where UserID = "+p.getUserID()+"";    
    return template.update(sql);    
}
public CredentialsBean getOrderById(String UserID){    
    String sql="select * from srs_tbl_user_credentials where UserId=?";    
    return template.queryForObject(sql, new Object[]{UserID},new BeanPropertyRowMapper<CredentialsBean>(CredentialsBean.class));    
}    
public List<CredentialsBean> getOrder(){    
    return template.query("select * from srs_tbl_user_credentials",new RowMapper<CredentialsBean>(){    
        public CredentialsBean mapRow(ResultSet rs, int row) throws SQLException {    
            CredentialsBean e=new CredentialsBean();    
            e.setUserID(rs.getString(1));    
            e.setPassword(rs.getString(2));    
            e.setUserType(rs.getString(3));    
            e.setLoginStatus(rs.getInt(4));
            return e;    
        }    
    });    
}

public int chp(String z,String y) {
	
	String sql="update SRS_TBL_user_credentials set password='"+z+"' where userid='"+y+"'";
	  return template.update(sql);
	
	
}
}