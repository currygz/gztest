package leetcode;

import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {
        int abcabacva = lengthOfLongestSubstring("abfabfghjk");
        System.out.println(abcabacva);
    }


    //给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }


        int sum = 1;
        for (int i = 0; i <s.length(); i++) {
            String str = "";
            str+=s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                char c = s.charAt(j);
                String s1 = String.valueOf(c);
                if (str.contains(s1)) {
                   sum = Math.max(sum,j-i);
                   break;
                }else if (str.contains(s1)&&j==s.length()-1){
                    return j-i;
                } else if (!str.contains(s1)&&j==s.length()-1) {
                    sum = Math.max(sum,j-i+1);
                    break;
                }
                str+=s1;
            }
        }
        return sum;
    }
}
