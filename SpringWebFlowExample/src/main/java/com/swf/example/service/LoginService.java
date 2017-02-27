package com.swf.example.service;

import org.springframework.stereotype.Service;

import com.swf.example.bean.LoginBean;

@Service
public class LoginService
{
		public String validateUser(LoginBean loginBean)
		{
				String userName = loginBean.getUserName();
				String password = loginBean.getPassword();
				if(userName.equals("sudheer") && password.equals("password"))
				{
						return "SUCCESS";
				}
				else
				{
						return "FAILURE";
				}
		}
		
}
