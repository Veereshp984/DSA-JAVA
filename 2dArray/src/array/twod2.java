package array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class twod2 {
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
        // sum of 2d array by rows
//        for(int j = 0;j<m;j++){ // outer column
//            int sum =0;
//            for(int i =0;i<n;i++){ // innner row
//                sum += arr[i][j];
//            }
//            System.out.println(sum + " ");
//        }
        // sum of 2d array by columns
//        for(int i =0;i<n;i++){ // outer column
//            int sum =0;
//            for(int j =0;j<n;j++){ // innner row
//                sum += arr[i][j];
//            }
//            System.out.println(sum);

        // sum of 2d array by diagonal
//        int sumL = 0;
//        int sumR =0;
//        for(int i=0;i<n;i++){
//            for(int j =0;j<n;j++){
//                if( i == j){
//                    sumL+= arr[i][j];
//                }
//                if((i + j )== n-1){
//                    sumR += arr[i][j];
//                }
//            }
//        }
//        System.out.println(sumL);
//        System.out.println(sumR);

        // print upper Triangular Elements
//        for(int i =0;i<n;i++){
//            for(int j =0;j<n;j++){
//                if(i<=j){
//                    System.out.print(arr[i][j] + " ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        // change diagonal of a matrix
        int j =0;
        for(int i =0;i<n;i++){
            //swap(arr[i][j] , arr[i][n-1-j])
            int temp = arr[i][j];
            arr[i][j] = arr[i][n-1-j];
            arr[i][n-1-j] = temp;
            j++;
        }
        for(int i =0;i<n;i++){ // outer loop row ko chnage karta hai
            for(j =0;j<n;j++){ // inner loop column ko change karta hai
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        }
    }

