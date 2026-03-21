package array;

import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        int brr[][] = new int[n][n];
        int crr[][] = new int[n][n];
        // STEP 1 ==> input 2 matrix
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                brr[i][j] = in.nextInt();
            }
        }

        // STEP 2 ==> Multiply logic
        for(int i =0;i<n;i++){ // ith row arr
            for(int j=0;j<n;j++){ // jth  col brr
                int newElement =0;
                for(int k=0;k<n;k++){
                   newElement = newElement + arr[i][k] * brr[k][j];
                }
                crr[i][j] = newElement;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
