package com.neuedu.demo;

import java.util.Scanner;

public class User {
	//��ʼ������
	public User() {
		usernames = new String[] {"hello"};
		psw = new String[] {"123456"};
	}
	
	String username;
	
	String password;
	//ģ���ŵ�����
	String[] usernames;
	
	String[] psw;
	//����û����������Ƿ���ȷ
	public boolean checkUser(String username,String password)
	{
		for(int i=0;i<usernames.length;i++)
		{
		//	System.out.print(usernames[i] == username && psw[i] == password);
			//�ж������û����Ƿ���������û���
			if(usernames[i].equals(username) && psw[i].equals(password))
			{
				return true;
			}
		}
		return false;
	}
}
