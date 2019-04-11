package N20190408;

public class Shuixianhua
{
	public static void main(String[] args)
	{
		for(int i=100;i<=999;i++)
		{
			//取出百位
			int hunNum = i/100;
			//取出十位
			int tenNum = i/10%10;
			//取出个位
			int num = i%10;
			double result = Math.pow(hunNum, 3)+Math.pow(tenNum, 3)+Math.pow(num, 3);
			if(i == result)
			{
				System.out.print(i+" ");
			}
		}
	}
}
