import java.util.*;
public class IfElseDemo01
{
	/*
		如果输入正数 输出正整数
		如果输入负数 输出负整数
		如果输入0 输出0
	*/
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数:");
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
