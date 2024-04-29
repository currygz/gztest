import org.junit.Test;

import java.util.ArrayList;

public class Book {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("111111111");
        Thread.sleep(30000);
        Byte[] bytes = new Byte[1024 * 1024 * 10];
        System.out.println("222222222222222");
        Thread.sleep(20000);
        bytes = null;
        System.gc();
        System.out.println("333333333333333");
        Thread.sleep(300000L);


    }


    @Test
    public void test(){
//        method1();

        int i = 0;

        try {
            ArrayList<Object> list = new ArrayList<>();
            String s = "hello";
            while (true){

                list.add(s);
                s = s + s;
                i++;
            }
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(i);
        }
    }

    private void method1() {
        int i = method2(1, 2);
        System.out.println(i+100);
    }

    private int method2(int i,int j) {
        System.out.println(i+j);
        return i+j;
    }
}
