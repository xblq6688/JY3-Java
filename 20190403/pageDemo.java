import java.util.*;
public class pageDemo
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入总的数据数量:");
		//从键盘接收的数作为总的数据
		int total = scanner.nextInt();
		//规定一页显示多少条数据
		int pageDate = 10;
		int page = total % pageDate == 0 ? total/pageDate : total/pageDate + 1;
		System.out.print("一共有"+page+"页");
	}
}
