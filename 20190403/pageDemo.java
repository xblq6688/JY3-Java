import java.util.*;
public class pageDemo
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������ܵ���������:");
		//�Ӽ��̽��յ�����Ϊ�ܵ�����
		int total = scanner.nextInt();
		//�涨һҳ��ʾ����������
		int pageDate = 10;
		int page = total % pageDate == 0 ? total/pageDate : total/pageDate + 1;
		System.out.print("һ����"+page+"ҳ");
	}
}