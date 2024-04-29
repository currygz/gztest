package gz.lianxi;


//并发问题 抢票
public class MyThread4 implements Runnable{


    private Integer ticketNum = 10;
    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0){
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "拿到了第" + ticketNum-- + "张票");

        }

    }


    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();

        new Thread(myThread4,"老师").start();
        new Thread(myThread4,"黄牛").start();
        new Thread(myThread4,"学生").start();
    }
}
