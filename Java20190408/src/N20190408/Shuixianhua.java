package N20190408;

public class Shuixianhua
{
	public static void main(String[] args)
	{
		for(int i=100;i<=999;i++)
		{
			//ȡ����λ
			int hunNum = i/100;
			//ȡ��ʮλ
			int tenNum = i/10%10;
			//ȡ����λ
			int num = i%10;
			double result = Math.pow(hunNum, 3)+Math.pow(tenNum, 3)+Math.pow(num, 3);
			if(i == result)
			{
				System.out.print(i+" ");
			}
		}
	}
}
