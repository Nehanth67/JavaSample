package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumInArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        int res=0;
        for(int i =0;i<arr.length;i++)//rows length
        {
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++)//column length
            {
                sum+=arr[i][j];
            }
            res = Math.max(res,sum);
        }
        System.out.println("MAX sum: "+res);


        // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        // output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

}