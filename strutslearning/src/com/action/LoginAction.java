package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	// 定义封装请求参数的username和password成员变量
		private String username;
		private String password;
		public String getUsername()
		{
			return username;
		}
		public void setUsername(String username)
		{
			this.username = username;
		}
		public String getPassword()
		{
			return password;
		}
		public void setPassword(String password)
		{
			this.password = password;
		}
		// 定义处理用户请求的execute方法
		public String execute() throws Exception
		{
			// 当username为crazyit.org，password为leegang时即登录成功
			if (getUsername().equals("monty")
				&& getPassword().equals("19970817") )
			{
				ActionContext.getContext().getSession()
					.put("user" , getUsername());
				return SUCCESS;
			}
			return ERROR;
		}
}
