package com.neuedu.circle;
/**
 * ������
 * @author Administrator
 *
 */
public class CircleTest {
	
	public static void main(String[] args) {
		//Բ��
		Point center = new Point(0,0);
		//Բ
		Circle circle = new Circle(center,2);
		//Ҫ�Ƚϵĵ�
		Point comparePoint = new Point(3,0);
		//���ñȽϷ���
		System.out.print(circle.contains(comparePoint.x,comparePoint.y) == true ? "��Բ��":"��Բ��");
		
	}
}
