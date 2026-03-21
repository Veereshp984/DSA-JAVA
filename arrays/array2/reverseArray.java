package com.ok.javainonevideo.arrays.array2;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int i =0;
        int j = n-1;
        while(i< j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for( i= 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
