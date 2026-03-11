package com.ok.javainonevideo.arrays.array2;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};

        boolean isArraySorted = true;
        for(int i =0;i< arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isArraySorted = false;
                break;
            }
        }

        if(isArraySorted == true){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }

    }
}
