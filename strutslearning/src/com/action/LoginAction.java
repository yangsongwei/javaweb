package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	// �����װ���������username��password��Ա����
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
		// ���崦���û������execute����
		public String execute() throws Exception
		{
			// ��usernameΪcrazyit.org��passwordΪleegangʱ����¼�ɹ�
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
