package com.ok.javainonevideo.patterns;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number = 5;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(number);
            }
           number = number -1;
            System.out.println();
        }
    }
}
