package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    static  List<Integer> path = new ArrayList<>();
    static List<List<Integer>> res = new ArrayList<>();

    public   static List<List<Integer>> combinationSum(int[] candidates, int target) {

        int sum = 0;
        back(candidates,target,0,path,sum);
        return res;
    }


     static void  back(int[] candidates, int target,int start,List<Integer> path,int sum) {
        if (sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        if (sum>target){
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            sum += candidates[i];
            path.add(candidates[i]);
            back(candidates,target,i,path,sum);
            path.remove(path.size()-1);
            sum -= candidates[i];
        }
    }

    public static void main(String[] args) {
            int[] q ={2,3,6,7};
        List<List<Integer>> lists = combinationSum(q, 7);
        System.out.println(lists);
    }
}
