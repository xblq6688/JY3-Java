package com.neuedu.test;

import java.util.Scanner;

/**
 * 定义一个book的类
 * 要求：
 *	   书名
 *	   页数
 *   价钱
 *   作者
 *   IBSN
 *   类型
 *   出版社
 * 行为：
 * 	  看书
 *   收藏
 *   买书  单价  数量  返回价格
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
		System.out.println("看书...");
	}
	
	public boolean getCollectionStatus()
	{
		return isCollection;
	}
	
	public double getBookPrice()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入购买的数量:");
	    int nextInt = scanner.nextInt();
		return price*nextInt;
	}
}
