package com.neuedu.test;

/**
 * ������
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args)
	{
		Book b1 = new Book();
		b1.bookname = "ˮ䰴�";
		b1.author = "ʩ����";
		b1.bookType = "�Ĵ�����";
		b1.IBSN = "78945612354";
		b1.price = 188;
		b1.pagenum = 600;
		b1.press = "���������";
		b1.isCollection = true;
		b1.readBook();
		boolean result = b1.getCollectionStatus();
		if(result == true)
		{
			System.out.println("���ղ�");
		}else
		{
			System.out.println("δ�ղ�");
		}
		double bookPrice = b1.getBookPrice();
		System.out.println("�۸�Ϊ��"+bookPrice);
		
	}

}
