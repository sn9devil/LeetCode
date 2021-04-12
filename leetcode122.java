package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode122 {
    public static int maxProfit(int[] prices) {
        if(prices.length < 2 || prices == null){
            return 0;
        }

        int ans = 0;
        int length = prices.length;
        for(int i = 1; i < length; i++){
            if(prices[i] > prices[i - 1]){
                ans += prices[i] - prices[i - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}


