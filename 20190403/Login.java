//�ж��û��������Ƿ���ȷ
import java.util.*;
public class Login
{
	public static void main(String[] args)
	{
		//������������Ķ���
		Scanner scanner = new Scanner(System.in);
		//�����ʼ���û���������
		char userName = 'a';
		char passWord = 'c';
		System.out.print("�����������û���:");
		//���ܼ�������ĵ�һ���ַ���
		String inputUser = scanner.next();
		System.out.print("��������������:");
		//���ܼ�������ĵڶ����ַ���
		String inputPsw = scanner.next();
		//��������ȡ���ַ����еĵ�һ���ַ�
		char c1 = inputUser.charAt(0);
		//��������ȡ�������еĵ�һ���ַ�
		char c2 = inputPsw.charAt(0);
		if(!(userName == c1 && passWord ==c2))
		{
			System.out.print("��¼Failed...");
		}
	}
}