package com.neuedu.demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//����һ���û��Ķ���
		User user = new User();
		//����һ�����ռ�������Ķ���
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������û���");
		String username = scanner.next();
		System.out.print("����������");
		String psw = scanner.next();
		//���ü���û��ķ���
		boolean checkUser = user.checkUser(username,psw);
		System.out.println(checkUser == true ? "��¼�ɹ�":"��¼ʧ��");
		//�ر�ˮ��
		scanner.close();
	}

}
