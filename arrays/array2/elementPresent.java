package com.ok.javainonevideo.arrays.array2;

import java.util.Scanner;

public class elementPresent {
    public static boolean IfElementPresent(int arr[] , int a){
        for(int i =0;i< arr.length;i++){
            if(arr[i] == a){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {1,3,5,6,9,10,11};
        int target = sc.nextInt();
        if((IfElementPresent(arr,target))== true){
            System.out.println("element is present");
        }else{
            System.out.println("element is not present");
        }

    }
}
