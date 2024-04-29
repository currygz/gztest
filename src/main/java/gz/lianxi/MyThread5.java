package gz.lianxi;

public class MyThread5 implements Runnable{

    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            boolean flag = gameOver(i);

            if (flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+ "跑了" + i + "步");
        }
    }

    //判断比赛是否结束
    public boolean gameOver(Integer step){
        if (winner != null){//已经有胜利者
            return true;
        }
        if (step >= 100){
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + winner);
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        new Thread(myThread5,"兔子").start();
        new Thread(myThread5,"乌龟").start();
    }
}
