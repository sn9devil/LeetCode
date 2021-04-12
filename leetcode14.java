package com.leetcode;

public class leetcode14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length < 1 || strs == null){
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for(int i = 1; i < count; i++){
            prefix = comparePrefix(prefix,strs[i]);
            if(prefix.length() == 0)
                return "";
        }
        return prefix;

    }


    public static String comparePrefix(String strs1,String strs2){
        int length = Math.min(strs1.length(),strs2.length());
        int index = 0;
        while(index < length && strs1.charAt(index) == strs2.charAt(index)){
            index++;
        }
        return strs1.substring(0,index);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        longestCommonPrefix(strs);
    }
}
