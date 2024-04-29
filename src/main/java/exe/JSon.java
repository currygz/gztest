package exe;

import cn.hutool.log.level.Level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class JSon {

    public static void main(String[] args) {
        /**
        JSONArray array = new JSONArray();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array);
        String str = "[1,2,3]";
       JSONArray jsonArray = new JSONArray();
        */

        // 类型声明
        Integer[] ints = {98, 243, 35, 13, 57, 243};
        List<Integer> list = Arrays.asList(ints);

        //之前的排序
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);
        //[243, 243, 98, 57, 35, 13]

        //使用Lambda表达式
        list.sort((o1,o2)->(o1-o2));
        System.out.println(list);
    }
}
