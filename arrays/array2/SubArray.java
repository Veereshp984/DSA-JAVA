package com.ok.javainonevideo.arrays.array2;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }

        for(int i =0;i<n;i++){ // i --> starting point
            for(int j =i;j<n;j++){ // j --> ending point
                // sub array --> i to j;

                for(int k =i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }


}
