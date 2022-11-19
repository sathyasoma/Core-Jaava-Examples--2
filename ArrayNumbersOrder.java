package com.arrays.assignaments;

import java.util.Arrays;

/*Write a Java program to sort an array of positive integers of a given array, in the sorted array the value of the first element should be maximum, 
second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.

Sample Pattern:

[100, 10, 90, 20, 80, 30, 70, 40, 60, 50]*/
		
		
public class ArrayNumbersOrder {

	static int[] rearrange(int[] new_arra, int n)
    {
        int temp[] = new int[n];
     
         int small_num = 0, large_num = n-1;
         boolean flag = true;
     
        for (int i=0; i < n; i++)
        {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
     
            flag = !flag;
        }
     
        return temp;
    }
 
    public static void main(String[] args) 
    {
        int nums[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result[];
         
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));
         
        result = rearrange(nums,nums.length);
         
        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));
     
    }
}
