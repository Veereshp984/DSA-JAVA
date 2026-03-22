package arrays.medium;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int maxNum = 0;
        for(int i=0;i<n;i++){
            maxNum = Math.max(maxNum , arr[i]);
        }
        int fre[] = new int[maxNum + 1];
        for(int i =0;i<n;i++){
            fre[arr[i]]++;
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(fre[i] >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
