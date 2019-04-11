package com.neuedu.test;

import java.util.Arrays;
/**
 * 统计字符串“统计一个字符在字符串中的所有位置”中字符 '字'出现的所有位置
 * @author Administrator
 *
 */
public class Work1 {
	//abcdefgabc
	public static void main(String[] args) 
	{
		String str = "统计一个字符在字符串中的所有位置";
		char c = '字';
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
