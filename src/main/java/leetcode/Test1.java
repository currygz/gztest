package leetcode;

import java.util.*;

public class Test1 {


   static List<String> res = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {

        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        back(digits,map,0,new StringBuilder());
        return res;

    }


    static void back(String s, HashMap<Character, String> map, int index, StringBuilder path) {

        if (index == s.length()){
            res.add(path.toString());
            return;
        }
        char c = s.charAt(index);
        String s1 = map.get(c);
        for (int i = 0; i < s1.length(); i++) {
            path.append(s1.charAt(i));
            back(s,map,index+1,path);
            path.deleteCharAt(index);
        }
    }

    public static void main(String[] args) {
        List<String> strings = letterCombinations("23");
        System.out.println(strings);
    }
}
