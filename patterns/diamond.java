package com.ok.javainonevideo.patterns;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int star = 1;
        // step 1 -- print upper part
        for(int i =1;i<=n;i++){
            // space
            for(int j =1;j<=space;j++){
                System.out.print(" ");
            }

            //star
            for(int j =1;j<=star;j++){
                System.out.print("*");
            }
            space=space-1;
            star = star+2;
            System.out.println();
        }

        // step-2 -- lower part
        space =1;
        star = star-4;
        for(int i =1;i<=n-1;i++){
            for(int j =1;j<=space;j++){
                System.out.print(" ");
            }

            //star
            for(int j =1;j<=star;j++){
                System.out.print("*");
            }
            space=space+1;
            star = star-2;
            System.out.println();
        }
    }
}
