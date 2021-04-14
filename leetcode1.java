package com.leetcode;

import java.util.HashMap;


public class leetcode1 {

    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return new int[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int item = target - nums[i];
            if(map.containsKey(item)){
                return new int[]{map.get(item),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
