package com.neuedu.demo;
/**
 * this�ؼ���
 * @author Administrator
 *
 */
public class ThisDemo {
	

	public static void main(String[] args) {
		//ʵ��������
		Money RMB = new Money(100,"China");
		System.out.println(RMB.value);
		System.out.println(RMB.country);
	}
}
class Money
{	//�޲ι�����
	public Money()
	{
		
	}
	//�вι�����
	public Money(int value,String country)
	{
		this.value = value;
		this.country = country;
	}
	
	//��ֵ
	int value;
	
	//����
	String country;
}