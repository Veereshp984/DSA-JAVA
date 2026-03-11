package com.ok.javainonevideo.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensionarray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
//        int[][] arr = new int[3][];
//        int[][] arr2d ={
//                {1,2,3},
//                {4,6},
//                {7,8,9,9}
//        };
        int[][] arr = new int[3][3];
        //input
        for(int row = 0;row< arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col]=SC.nextInt();
            }
        }

        //output

//        for(int row = 0;row< arr.length;row++){
//            for(int col = 0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for(int row =0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a :arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
