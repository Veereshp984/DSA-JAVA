package com.ok.javainonevideo.arrays.array2;

public class MissingNumber {
    //leetcode Problem
    public static void main(String[] args) {
        int nums[] = {1,0,3};

        int n = nums.length;
        // step 1 :  sum from 0 to n
        int x = ( n * (n+1)/2);

        //step2 - sum of elemnets of array

        int y = 0;
        for(int i =0; i <n;i++){
            y = y+ nums[i];
        }

        System.out.println(x-y);

    }
}
