package gz;

import java.util.ArrayList;

public class jvmTest {


    public static void main(String[] args) throws InterruptedException {
        ArrayList<Student> students = new ArrayList<>();
//        for (int i = 0; i < 200; i++) {
//            students.add(new Student());
//        }
        Thread.sleep(10000000000L);
    }

}


class Student{
        private byte[] by = new byte[1024*1024];
}
