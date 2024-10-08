package com.nt.test;

public class TwoSum 
{
	public static int[] twoSum(int[] nums, int target)
	{

        for(int i=0;i<nums.length-1;i++)
        {
            int sum = nums[i]+nums[i+1];
            if(sum==target)
            {
                int []arr= {i};
                
                System.out.println(arr);
            }
        }
		return nums;
		
	}
	
	public static void main(String[] args) 
	{
		int []arr= {1,5,8,9};
		twoSum(arr, 10);
	}
}