package change.change;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;

public class gzTest implements IConstants {
    public static void main(String[] args) {
         int[] s = {1,1,1,1,1,1,1,1};
//        int[] ints = twoSum(s,6);
        int i1 = minSubArrayLen(11,s);
        System.out.println(i1);
        System.out.println(1111);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }

//        相关企业
//        给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target
//        的那 两个 整数，并返回它们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
//        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]

    }

//    public int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target){
//
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return  new int[0];
//    }
public static  int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            int[] ints = {map.get(target - nums[i]), i};
            return ints;
        }
        map.put(nums[i],i);
        System.out.println("hello world");
        System.out.println("hello world push");
        System.out.println("hello world push");
        System.out.println("hello world push");
        System.out.println("1014.5.10");
    }
    return new int[0];
}


    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            if (nums[left]*nums[left] >= nums[right] * nums[right]) {
                res[--len] = nums[left] * nums[left];
                left++;
            }else{
                res[--len] = nums[right] * nums[right];
                right--;
            }
        }
        return res;

    }


    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i <nums.length; i++) {
            sum += nums[i];
            while(sum>=target){
                res = Math.min(res, i - left + 1);
                sum-=nums[left];
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }


}

