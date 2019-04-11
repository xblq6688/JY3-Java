package com.neuedu.test;

public class Test {
	//显示声明构造方法
	public Test() {
		System.out.println("构建对象");
	}
	
	//成员变量
	int age;
	
	String str;
	
	double price;
	
	public static void main(String[] args) {
		//构造器|构造方法
		Test test = new Test();
		System.out.println(test.age);
		
	}
}
