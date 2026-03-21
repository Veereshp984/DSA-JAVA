package com.ok.javainonevideo.functions;

public class maxOrMin {
    public static int max(int a ,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public static int min(int a ,int b){
        if(a < b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(max(a,b));
        System.out.println(min(a,b));
    }
}
