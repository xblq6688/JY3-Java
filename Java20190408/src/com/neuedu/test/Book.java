package com.neuedu.test;

import java.util.Scanner;

/**
 * ����һ��book����
 * Ҫ��
 *	   ����
 *	   ҳ��
 *   ��Ǯ
 *   ����
 *   IBSN
 *   ����
 *   ������
 * ��Ϊ��
 * 	  ����
 *   �ղ�
 *   ����  ����  ����  ���ؼ۸�
 * @author Administrator
 *
 */
public class Book {
	String bookname;
	
	int pagenum;
	
	double price;
	
	String author;
	
	String IBSN;
	
	String bookType;
	
	String press;
	
	boolean isCollection;
	
	public void readBook()
	{
		System.out.println("����...");
	}
	
	public boolean getCollectionStatus()
	{
		return isCollection;
	}
	
	public double getBookPrice()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����빺�������:");
	    int nextInt = scanner.nextInt();
		return price*nextInt;
	}
}
