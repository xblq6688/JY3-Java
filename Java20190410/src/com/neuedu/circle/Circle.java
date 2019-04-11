package com.neuedu.circle;
/**
 * 新建一个圆的类
 * @author Administrator
 *
 */
public class Circle {
	public Circle() {
		
	}
	public Circle(Point p1,int r)
	{
		this.p1 = p1;
		this.r = r;
	}
	//圆心
	Point p1;
	
	//半径
	int r;
	
	//求圆的面积的方法
	public double getArea(int r)
	{
		return Math.PI*r*r;
	}
	//计算当前图形是否包含(contains(Point))指定的点
	public boolean contains(Point p)
	{
		boolean result = Math.pow((p.x - p1.x),2) + Math.pow((p.y - p1.y),2) <=r*r;
		return result;
	}
	//重载方法 contains(int x,int y)
	public boolean contains(int x,int y)
	{
		double twoPointDistance = Math.pow((x - p1.x),2) + Math.pow((y - p1.y),2);
		boolean result = twoPointDistance <= r*r;
		return result;
	}
}
class Point
{
	//无参
	public Point() {
		
	}
	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	int x;
	
	int y;
	
}