package com.srs.util;
import org.springframework.beans.factory.annotation.Autowired;

import com.srs.bean.*;
import com.srs.dao.*;

public class Authentication 
{
	@Autowired
	private CredentialsDao dao;

	public void setDao(CredentialsDao dao) 
	{
		this.dao = dao;
	}
	public void authorize(CredentialsBean cb) 
	{
		dao.update(cb);
		
	}
	public boolean vlog(CredentialsBean c) 
	{
		try 
		{
			CredentialsBean cb = dao.getOrderById(c.getUserID());
			if(cb.getPassword().equals(c.getPassword())) 
			{
				cb.setLoginStatus(1);
				authorize(cb);
				if(cb.getUserType().equals("admin")) 
				{
					return true;
				}
			}
			return false;
		}
		 catch(Exception e)
		{
			 System.out.println(e);
			 return false;	
		}	
	}
}
