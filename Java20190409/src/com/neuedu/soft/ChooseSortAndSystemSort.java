package com.neuedu.soft;

import java.util.Arrays;

public class ChooseSortAndSystemSort {
	public static void main(String[] args)
	{
		//ѡ������
		int[] arr = {-1,999,-100,9999,10000};
		int[] newArr =chooseSort(arr);
		//System.out.print(Arrays.toString(newArr));
		//ϵͳ����
		Arrays.sort(arr);
		System.out.print(Arrays.toString(newArr));
		
		//����ֵ
		long time = System.currentTimeMillis();
		System.out.print(time);
		//long�����ֵ
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

