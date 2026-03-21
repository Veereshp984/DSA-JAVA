package com.ok.javainonevideo.arrays.array2;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []= new int[n];
        for(int i =0;i<n;i++){
            arr[i]  = sc.nextInt();
        }
        int value = sc.nextInt();
        int position = sc.nextInt();
        int ans[] = new int[n+1];
        int i =0;
        int j =0;
        while(i <n + 1){
            if(i == position -1){
                ans[i] = value;
            }else{
                ans[i] = arr[j];
                j++;
            }
            i++;
        }
        i =0;
        while(i < n+1){
            System.out.println(ans[i] + " ");
            i++;
        }


    }
}
