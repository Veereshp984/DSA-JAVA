package com.ok.javainonevideo.functions;

import java.util.Scanner;

public class sumOfDigits {
    public static int sum(int n){
        int sum = 0;
        while(n > 0){
            int ld = n % 10;
            sum = sum + ld;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
