package com.debug.test2;

import com.sun.deploy.security.BadCertificateDialog;

import java.math.BigInteger;

public class DebugTestDemo2 {

    public static void main(String[] args) {
        //第一个线程，计算100的累加
        AddThread thread1 = new AddThread(100);

        //第二个线程，计算10000的累加
        AddThread thread2 = new AddThread(10000);

        thread1.setName("第一个线程");
        thread2.setName("第二个线程");

        //开启
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    private static class AddThread extends Thread{
        private BigInteger result = BigInteger.ONE;
        private long num;

        public AddThread(long num){
            this.num = num;
        }

        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + "开始的时间：" + num);
            add(num);
            System.out.println(Thread.currentThread().getName() + "执行完成");

            System.out.println(result);
        }

        //累加
        public  void add(long num){
            BigInteger f = new BigInteger("1");
            for (int i = 2; i <=num ; i++) {
                f = f.add(BigInteger.valueOf(i));
            }
            result = f;
        }

        public BigInteger getResult(){
            return result;
        }
    }
}
