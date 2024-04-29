package gz.lianxi;

public class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println("测试线程" + i);
        }
    }

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("主线程正在进行" + i);
        }
    }
}
