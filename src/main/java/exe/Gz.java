package exe;

import java.util.ArrayList;
import java.util.HashMap;

public class Gz {

    public static void main(String[] args) {
//        ZtreeNode 张三 = ZtreeNode.creat("张三", 234556);
//        System.out.println(张三);
        int []a = {1,2,3,4};
        Gz gz = new Gz();
        int[] ints = reOrderArray(a);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


//    输入一个长度为 n 整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前面部分，
//    所有的偶数位于数组的后面部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    public static int[] reOrderArray (int[] array) {
        // write code here
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer i : array){
            if (i % 2 == 0){
                list1.add(i);
            }else {
                list2.add(i);
            }
        }
        res.addAll(list2);
        res.addAll(list1);
        int[] ans = new int[array.length];

        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
            System.out.println(res.get(i));
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] % 2 == 0){
                list.add(ans[i]);
            }
        }

        return ans;
    }

}

