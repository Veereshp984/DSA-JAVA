package com.ok.javainonevideo.functions;

import java.util.Scanner;

public class nPrProblem {
    public static long factorial(int n){
        long factorial = 1;
        for(int i =1;i<=n;i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        long n_factorial = factorial(n);
        long r_factorial = factorial(r);
        long nR_factorial = factorial(n-r);
        long answer = n_factorial / nR_factorial;

        System.out.println(answer);
    }
}
