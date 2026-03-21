package array;

import java.util.Scanner;
// row wise printing of array
public class twodIntro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];
        for(int i =0;i<n;i++){ // outer loop row ko chnage karta hai
            for(int j =0;j<n;j++){ // inner loop column ko change karta hai
                arr[i][j] = in.nextInt();
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