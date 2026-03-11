package com.ok.javainonevideo.arrays.array2;

import java.util.Scanner;

public class MaxOrMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,3,5,7,4};

        int max = arr[0];
        int min = arr[0];
        for(int i =1;i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
