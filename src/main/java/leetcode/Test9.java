package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String con = "";
        HashMap<String, Integer> map = new HashMap<>();
//        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuilder = new StringBuffer();

        while (scanner.hasNext()) {
            con = scanner.nextLine();
            try {
                int num = Integer.parseInt(con);
                ArrayList<String> list = new ArrayList<>();

                map.forEach((k,v) -> list.add(v+ " " +k));
                list.sort((o1, o2)->{
                    int val1=Integer.parseInt(o1.split(" ")[0]);
                    int val2=Integer.parseInt(o2.split(" ")[0]);
                    if(val1==val2){
                        String key1 = o1.split(" ")[1];
                        String key2 = o1.split(" ")[1];
                        return key1.compareTo(key2);
                    }else {
                        System.out.println(val1 + " " +val2);
                        return val2-val1;
                    }

                });

                for (int i = 0; i < num; i++) {
                    stringBuilder.append(list.get(i).split(" ")[1]).append(",");
                }

                stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length()).append("\n");
//                stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length()).append("\n");

            }catch (Exception e){
                if (map.containsKey(con)){
                    int va = map.get(con);
                    map.put(con,va+1);
                }else {
                    map.put(con,1);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
