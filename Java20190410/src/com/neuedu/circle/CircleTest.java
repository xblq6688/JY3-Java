package com.neuedu.circle;
/**
 * 测试类
 * @author Administrator
 *
 */
public class CircleTest {
	
	public static void main(String[] args) {
		//圆心
		Point center = new Point(0,0);
		//圆
		Circle circle = new Circle(center,2);
		//要比较的点
		Point comparePoint = new Point(3,0);
		//调用比较方法
		System.out.print(circle.contains(comparePoint.x,comparePoint.y) == true ? "在圆内":"在圆外");
		
	}
}
