package com.srs.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.srs.bean.CredentialsBean;
import com.srs.dao.CredentialsDao;

public class LoginService 
{
	@Autowired
	public CredentialsDao dao;

	public void setDao(CredentialsDao dao) 
	{
		this.dao = dao;
	}

	public boolean vlog(CredentialsBean c) 
	{
		try 
		{
			CredentialsBean cb = dao.getOrderById(c.getUserID());
			if (cb.getPassword().equals(c.getPassword())) 
			{
				if (cb.getUserType().equals("A")) 
				{
					return true;
				}
			}

			return false;

		} 
		catch (Exception e) 
		{
			System.out.println(e);
			return false;
		}
	}
}
