package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums1Map = new HashMap<Integer, Integer>();
        for(int num : nums1){
            int count = nums1Map.getOrDefault(num,0) + 1;
            nums1Map.put(num,count);
        }
        // int[] result = new int[nums2.length];
        int index = 0;
        for(int num : nums2){
            int item = nums1Map.getOrDefault(num,0);
            if(item > 0){
                nums1[index++] = num;
                item--;
                if(item>0){
                    nums1Map.put(num,item);
                }else{
                    nums1Map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(nums1,0,index);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        intersect(nums1, nums2);
    }
}


