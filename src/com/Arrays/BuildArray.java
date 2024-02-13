package com.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 2, 4, 5};
        int n = nums.length;
        System.out.println(n);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] < n) {
                ans[i] = nums[nums[i]];
            } else {
                ans[i] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            {
                System.out.println(ans[i]);
            }

        }

    }
}