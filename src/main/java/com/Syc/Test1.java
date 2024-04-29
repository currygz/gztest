package com.Syc;

import java.util.Date;

public class Test1 implements Runnable{

    public void run(){
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println(i + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
//        Test1 test1 = new Test1();
////        Test1 test2 = new Test1();
//        Thread one = new Thread(test1, "one");
//        Thread two = new Thread(test1, "two");
//        one.start();
//        two.start();

        new Thread(()->{
            System.out.println("开始了一个线程"+new Date());
        }).start();

    }
}
