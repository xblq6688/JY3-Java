import java.util.*;
public class Test2 
{
	public static void main(String[] args) 
	{
		//�Ƚ������
		/*
		>
		>=
		<
		<=
		==
		!=
			�ж�����
			>0 <18 δ����
			�������>=18 <=30 ����
			==100 ����
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������:");
		int age = scanner.nextInt();
		//����һ�����ַ���
		String str = "";
		if(age >0 && age <=18)
		{
			str = "δ����";
		}
		if(age >= 18 && age <=30)
		{
			str = "����";
		}
		if(age == 100)
		{
			str = "����";
		}
		System.out.print("����ǰ�����Ϊ:"+str);
	}
}
