
public class Test08  
{
	public static void main(String[] args) 
	{
		String str = "692116851128";
		//字符串的长度
		System.out.println(str.length());
		//定义奇数和变量
		int oddNum = 0;
		for(int i=0;i<str.length();i+=2)
		{
			char c = str.charAt(i);
			oddNum += c-48;
		}
		System.out.print(oddNum);
	}
}
