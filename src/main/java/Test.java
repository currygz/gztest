import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = Integer.parseInt(in.nextLine());
       String s[] =  new String[n];
        if (n<4){
            System.out.println(0);
        }else{
            for (int i = 0; i < n; i++) {
                String s1 = in.nextLine();
                s[i] = s1;
            }
            System.out.println(res(n,s));
        }

    }


    public static int res(int n ,String[] s) {
        int flag =0;
        HashSet<String> set = new HashSet<>(Arrays.asList(s));
        for (int i = 0; i < n; i++) {
            Integer[] s1 = Arrays.stream(s[i].split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

            int x1 =s1[0];
            int y1 =s1[1];


            for (int j = i+1; j < n; j++) {
                Integer[] s2 = Arrays.stream(s[i].split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
                int x2 =s2[0];
                int y2 =s2[1];

                int x3=x1-(y1-y2);
                int y3=y1+(x1-x2);
                int x4=x2-(y1-y2);
                int y4=y2+(x1-x2);
                if (set.contains(x3+" "+y3)&&set.contains(x4+" "+y4))flag++;
                int x5=x1+(y1-y2);
                int y5=y1-(x1-x2);
                int x6=x2+(y1-y2);
                int y6=y2-(x1-x2);
                if (set.contains(x5+" "+y5)&&set.contains(x6+" "+y6)) flag++;

            }
        }

        if (flag/4 >0){
            return 1;
        }else{
            return 0;
        }
    }
}
