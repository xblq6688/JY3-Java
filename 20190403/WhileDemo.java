import java.util.*;
public class WhileDemo
{
    public static void main(String[] args)
    {
		Scanner scanner = new Scanner(System.in);
        while(1==1)
	   {
            System.out.print("������һ�����֣�");
	        int num = scanner.nextInt();
            if(num >=0 && num <= 5)
	        {
		          break;		
		    }	 
	   }
	   System.out.print("exit...");
    }
}
