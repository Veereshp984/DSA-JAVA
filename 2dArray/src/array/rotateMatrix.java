package array;

import java.util.Scanner;

public class rotateMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][n];
        for(int i =0;i<n;i++){ // outer loop row ko chnage karta hai
            for(int j =0;j<n;j++){ // inner loop column ko change karta hai
                arr[i][j] = in.nextInt();
            }
        }
        for(int i =0;i<n;i++){ // outer loop row ko chnage karta hai
            for(int j =i;j<n;j++){ // inner loop column ko change karta hai
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i =0;i<n;i++){
            int start =0;
            int end = n-1;
            while(start < end){
                int temp = arr[i][start];
                arr[i][start] =arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        for(int i =0;i<n;i++){ // outer loop row ko chnage karta hai
            for(int j =0;j<n;j++){ // inner loop column ko change karta hai
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
