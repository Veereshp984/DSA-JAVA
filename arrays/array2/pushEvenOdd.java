package com.ok.javainonevideo.arrays.array2;

import java.util.Scanner;

public class pushEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int countEven =0;
        int countOdd = 0;
        for(int i =0;i<n;i++){
            if( arr[i]%2 ==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        if(countEven > 0){
//            int indexEven =0;
//            int even[] = new int[countEven];
//            for(int i =0;i<n;i++){
//                if(arr[i] % 2 ==0){
//                    even[indexEven] = arr[i];
//                    indexEven++;
//                }
//            }
            for(int i =0;i<n;i++){
                if(arr[i] % 2 ==0){
                    System.out.println(arr[i] + " ");
                }
            }
            System.out.println();
        }
        if(countOdd > 0){
            for(int i =0;i<n;i++){
                if(arr[i] % 2 !=0){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
