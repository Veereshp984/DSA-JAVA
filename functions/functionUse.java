package com.ok.javainonevideo.functions;

import java.util.Scanner;

public class functionUse {
    public static boolean isArmstrong(int n){
        int copy = n;
        int sum = 0;
        while(n > 0){
            int ld = n% 10;
            sum = sum + ld * ld * ld;
            n = n/10;
        }
        if(sum == copy){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            if(isArmstrong(i) == true){
                System.out.println(i);
            }
        }
    }
}
