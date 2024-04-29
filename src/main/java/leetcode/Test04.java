package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {

    public static void main(String[] args) {
        int[] s = {1,2,3,1,2,3};
        boolean b = containsNearbyDuplicate(s, 2);
        System.out.println(b);

    }


    //给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true
    // ；如果数组中每个元素互不相同，返回 false 。
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }


    //给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j]
    // 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <= Math.min(i+k,nums.length-1) ; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
