package com.neuedu.test;

public class Monkey {
	
	//无参构造器
	public Monkey() {
		mName = "悟空";
		type = "通灵石猴";
	}
	//两个构造方法，有参数的构造方法
	public Monkey(String name,String type1)
	{
		mName = name;
		type = type1;
	}
	String mName;
	
	String type;
	
	public void jump()
	{
		System.out.println("跳");
	}
	public void fly()
	{
		System.out.println("飞");
	}
	public static void main(String[] agrs) {
		Monkey sun = new Monkey("假悟空","六耳猕猴");
		Monkey sun2 = new Monkey();
		System.out.println(sun.mName);
	//	System.out.println(sun2.mName);
	}	
}
