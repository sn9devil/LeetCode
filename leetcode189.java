package com.leetcode;

public class leetcode189 {
    public void rotate1(int[] nums, int k) {
        int length = nums.length;
        int[] newNums = new int[length];
        for(int i = 0;i<length;i++){
            newNums[(i + k) % length] = nums[i];
        }
        System.arraycopy(newNums,0,nums,0,length);
    }

    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length - 1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length - 1);
    }

    public void reverse(int[] nums,int start,int end){
        while (start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start += 1;
            end -= 1;
        }
    }
}
