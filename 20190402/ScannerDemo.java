import java.util.*;
public class ScannerDemo
{
    public static void main(String[] args)
    {
     //接受键盘输入
	 //不需要懂
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("请输入一个数字：");
	 int num = scanner.nextInt();
	 System.out.print("您输入的值："+num);
    }
}