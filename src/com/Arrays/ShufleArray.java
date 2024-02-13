package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShufleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int n=size/2;
        int[] ans = new int[2*n];
        int j = n;
        int k = -1;
        for(int i = 0;i<n&&j<(2*n);i++,j++){
            ans[++k]=(nums[i]);
            ans[++k]=(nums[j]);
        }
            System.out.println(Arrays.toString(ans));
    }
}
