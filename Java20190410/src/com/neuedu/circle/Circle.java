package com.neuedu.circle;
/**
 * �½�һ��Բ����
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
	//Բ��
	Point p1;
	
	//�뾶
	int r;
	
	//��Բ������ķ���
	public double getArea(int r)
	{
		return Math.PI*r*r;
	}
	//���㵱ǰͼ���Ƿ����(contains(Point))ָ���ĵ�
	public boolean contains(Point p)
	{
		boolean result = Math.pow((p.x - p1.x),2) + Math.pow((p.y - p1.y),2) <=r*r;
		return result;
	}
	//���ط��� contains(int x,int y)
	public boolean contains(int x,int y)
	{
		double twoPointDistance = Math.pow((x - p1.x),2) + Math.pow((y - p1.y),2);
		boolean result = twoPointDistance <= r*r;
		return result;
	}
}
class Point
{
	//�޲�
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