package com.neuedu.test;

public class Monkey {
	
	//�޲ι�����
	public Monkey() {
		mName = "���";
		type = "ͨ��ʯ��";
	}
	//�������췽�����в����Ĺ��췽��
	public Monkey(String name,String type1)
	{
		mName = name;
		type = type1;
	}
	String mName;
	
	String type;
	
	public void jump()
	{
		System.out.println("��");
	}
	public void fly()
	{
		System.out.println("��");
	}
	public static void main(String[] agrs) {
		Monkey sun = new Monkey("�����","����⨺�");
		Monkey sun2 = new Monkey();
		System.out.println(sun.mName);
	//	System.out.println(sun2.mName);
	}	
}
