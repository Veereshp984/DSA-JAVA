package arrays.medium;

import java.util.Scanner;
public class rotataeArray {



     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (!sc.hasNextInt()) {
            System.out.println("Input missing. Enter an integer for array size.");
            return;
        }
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter rotation count: ");
        if (!sc.hasNextInt()) {
            System.out.println("Input missing. Enter an integer for rotation count.");
            return;
        }
        int k = sc.nextInt();
        System.out.println("Enter " + n + " array elements:");
        for(int i =0;i<n;i++){
            if (!sc.hasNextInt()) {
                System.out.println("Input missing. Expected " + n + " integers.");
                return;
            }
            arr[i] = sc.nextInt();
        }
        int reversed [] = new int[n];
        // k = k %n;
        // for(int i =0;i<n;i++){
        //     int newIndex = (i-k);
        //     if(newIndex < 0){
        //         newIndex +=n;
        //     }
        //     reversed[newIndex] = arr[i];
        // }

        k = k%n;
        for(int i =0;i<n;i++){
            int newIndex = i -k;
            if(newIndex < 0){
                newIndex +=n; 
            }
            reversed[newIndex] = arr[i];
        }

        for(int i =0;i<n;i++){
            System.out.print(reversed[i] + " ");
        }
    }
}







