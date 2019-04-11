package com.neuedu.demo;
/**
 * 方法重载有如下规则：
 * a 方法名一样
 * b 参数列表不一样
 * 返回值类型不同不构成方法重载
 * 方法重载与返回值类型没有关系
 * 重载方法也可以说是，方法名一样，方法签名不同的方法
 * @author Administrator
 *
 */
public class Point {

	public Point() {
		
	}
	public Point(int p)
	{
		this(p,p);
	}
	
	public Point(int x,int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	int x;
	
	int y;

}

