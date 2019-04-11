package com.neuedu.demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//创建一个用户的对象
		User user = new User();
		//创建一个接收键盘输入的对象
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入用户名");
		String username = scanner.next();
		System.out.print("请输入密码");
		String psw = scanner.next();
		//调用检查用户的方法
		boolean checkUser = user.checkUser(username,psw);
		System.out.println(checkUser == true ? "登录成功":"登录失败");
		//关闭水流
		scanner.close();
	}

}
