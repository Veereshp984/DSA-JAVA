package com.ok.javainonevideo.arrays.array2;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = -1;
        result[1] = -1;
        int n = nums.length;
        int i =0;
        int j = n-1;
        while(i <=j)
        {
            int currentSum = nums[i] + nums[j];
            if(currentSum == target){
                result[0] = i+1;
                result[1] = j+1;

                break;
            }else if(currentSum > target){
               j--;
            }else{
                i++;
            }
        }
        return result;
    }
}




