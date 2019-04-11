package com.neuedu.soft;

import java.util.Arrays;

public class ChooseSortAndSystemSort {
	public static void main(String[] args)
	{
		//选择排序
		int[] arr = {-1,999,-100,9999,10000};
		int[] newArr =chooseSort(arr);
		//System.out.print(Arrays.toString(newArr));
		//系统排序
		Arrays.sort(arr);
		System.out.print(Arrays.toString(newArr));
		
		//毫秒值
		long time = System.currentTimeMillis();
		System.out.print(time);
		//long的最大值
		long max = Long.MAX_VALUE;
		long maxYears = max/1000/60/60/24/365+1970;
		System.out.println(maxYears);
	}
	public static int[] chooseSort(int[] arr)
	{
        for (int i=0;i<arr.length-1;i++) 
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}

