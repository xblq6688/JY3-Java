 public class BuyDrink 
{
	public static void main(String[] args) 
	{
		System.out.print(buy(2,6));
	}
	/*
		�����ϵķ���
		0������ 1������ �ڶ������
	*/
	public static double buy(int count,double price)
	{
		if(count < 1)
		{
			System.out.print("����");
			return 0.0;
		}else
 		{
			//price = price + (count-1) * price/2;
			price += (count -1) * price/2;
			return price;
		}
	}
}
