
public class Test08  
{
	public static void main(String[] args) 
	{
		String str = "692116851128";
		//�ַ����ĳ���
		System.out.println(str.length());
		//���������ͱ���
		int oddNum = 0;
		for(int i=0;i<str.length();i+=2)
		{
			char c = str.charAt(i);
			oddNum += c-48;
		}
		System.out.print(oddNum);
	}
}