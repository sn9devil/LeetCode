package com.leetcode;

public class leetcode26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int index = 1;
        int last = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != last){
                last = nums[i];
                nums[index] = nums[i];
                index += 1;
            }
        }
        return index;
    }
}
