import java.util.*;
public class Test2 
{
	public static void main(String[] args) 
	{
		//比较运算符
		/*
		>
		>=
		<
		<=
		==
		!=
			判断年龄
			>0 <18 未成年
			如果年龄>=18 <=30 青年
			==100 寿星
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入年龄:");
		int age = scanner.nextInt();
		//创建一个空字符串
		String str = "";
		if(age >0 && age <=18)
		{
			str = "未成年";
		}
		if(age >= 18 && age <=30)
		{
			str = "青年";
		}
		if(age == 100)
		{
			str = "寿星";
		}
		System.out.print("您当前的身份为:"+str);
	}
}
