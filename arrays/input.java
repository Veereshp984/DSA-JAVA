package com.ok.javainonevideo.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] num = new int[5];
//
//            for(int i =0;i<num.length;i++){
//                num[i] = sc.nextInt();
//            }
//            for(int i=0;i<num.length;i++){
//                System.out.println(num[i]);
//            }

//            for(int n :num){
//                System.out.println(n); // n reprsent element in the array
//            }
//

        // array of primitives
        String[] str = new String[4];
        for(int i =0;i<str.length ;i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }

}
