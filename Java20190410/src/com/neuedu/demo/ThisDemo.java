package com.neuedu.demo;
/**
 * this关键字
 * @author Administrator
 *
 */
public class ThisDemo {
	

	public static void main(String[] args) {
		//实例化对象
		Money RMB = new Money(100,"China");
		System.out.println(RMB.value);
		System.out.println(RMB.country);
	}
}
class Money
{	//无参构造器
	public Money()
	{
		
	}
	//有参构造器
	public Money(int value,String country)
	{
		this.value = value;
		this.country = country;
	}
	
	//面值
	int value;
	
	//国家
	String country;
}