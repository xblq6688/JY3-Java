import java.util.*;
public class IfElseDemo01
{
	/*
		����������� ���������
		������븺�� ���������
		�������0 ���0
	*/
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ����:");
		int num = scanner.nextInt();
		if(num > 0)
		{
			System.out.print(">0");
		}else if(num < 0)
		{
			System.out.print("<0");
		}
		else
		{
			System.out.print("=0");
		}
	}
}