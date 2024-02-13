package com.Arrays;

import java.util.HashSet;

public class RemoveDupUnSortedArr {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDuplicates(nums);
        // Output the modified array
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Output the length of the modified array
        System.out.println("Length of Modified Array: " + newLength);
    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);// adding elements to hash set
        }

        int index = 0;
        for (int num : set) {
            nums[index++] = num;//copying unique elements to original array from set
        }

        return set.size(); //returning the size of set.
    }
}
