package com.neuedu.test;

import java.util.Arrays;
/**
 * ͳ���ַ�����ͳ��һ���ַ����ַ����е�����λ�á����ַ� '��'���ֵ�����λ��
 * @author Administrator
 *
 */
public class Work1 {
	//abcdefgabc
	public static void main(String[] args) 
	{
		String str = "ͳ��һ���ַ����ַ����е�����λ��";
		char c = '��';
		int[] findCharPos = findCharPos(str,c);
		System.out.println(Arrays.toString(findCharPos));
	}	
	public static int[] findCharPos(String str,char c)
	{
		int[] nums = new int[0];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == c)
			{
				nums = Arrays.copyOf(nums,nums.length+1);
				nums[nums.length-1] = i+1;
			}
		}
		return nums;
	}
}
