package leetcode;

import java.util.HashMap;
import java.util.LinkedList;

public class Test06 {

    public static void main(String[] args) {


    }

    //k[encoded_string]
    //输入：s = "2[abc]3[cd]ef"
    //输出："abcabccdcdcdef"

    //输入：s = "3[a2[c]]"
    //输出："accaccacc"
    public String decodeString(String s) {
        LinkedList<Integer> str_tp = new LinkedList<>();
        LinkedList<String> res_tp = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        int mu = 0;
        for (Character c : s.toCharArray()) {
            if (c == '[') {
                str_tp.addLast(mu);
                res_tp.addLast(res.toString());
                mu=0;
                res=new StringBuilder();

            }else if (c == ']'){

                StringBuilder tmp = new StringBuilder();
                int mu_now = str_tp.removeLast();
                for (int i = 0; i < mu_now; i++) {
                    tmp.append(res);
                }
                res=new StringBuilder(res_tp.removeLast()+tmp);

            }else if(c>='0'&&c<='9'){
                    mu = mu *10+Integer.parseInt(c+"");
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
