package com.Arrays;

public class RemoveDupSortedArr {
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
            int j=1;//pointer
            for(int i=1;i<nums.length;i++)//loop
            {
                if(nums[i]!=nums[i-1])//condition
                {
                    nums[j]=nums[i];
                    j++;//incrementation of unique pointer
                }
            }
            return j;
        }
    }

