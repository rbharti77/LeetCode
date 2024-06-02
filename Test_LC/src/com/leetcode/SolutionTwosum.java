package com.leetcode;
import java.util.*;

public class SolutionTwosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[] {2,3,4,11};
		int target = 7;
		int [] result = getTwoSum(numbers,target);
		System.out.print(result[0]+" " +result[1]);

	}
	
	public static int[] getTwoSum(int[] nums , int target)
	{
		Map<Integer,Integer> visitedNumbers = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int delta = target - nums[i];
			if(visitedNumbers.containsKey(delta))
				return new int []{i, visitedNumbers.get(delta)};
			visitedNumbers.put(nums[i], i);
		}
		return new int[] {-1,-1};
		
		
		
	}

}
