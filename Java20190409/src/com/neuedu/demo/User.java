package com.neuedu.demo;

import java.util.Scanner;

public class User {
	//初始化数据
	public User() {
		usernames = new String[] {"hello"};
		psw = new String[] {"123456"};
	}
	
	String username;
	
	String password;
	//模拟存放的数据
	String[] usernames;
	
	String[] psw;
	//检查用户名和密码是否正确
	public boolean checkUser(String username,String password)
	{
		for(int i=0;i<usernames.length;i++)
		{
		//	System.out.print(usernames[i] == username && psw[i] == password);
			//判断数组用户名是否有输入的用户名
			if(usernames[i].equals(username) && psw[i].equals(password))
			{
				return true;
			}
		}
		return false;
	}
}
