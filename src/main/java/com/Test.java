package com;

public class Test extends Abstract{
    public static void main(String[] args) {
        Test test = new Test();
        String eat = test.eat("444");
        System.out.println(eat);
//        System.out.println();
//        System.out.println(test.sum);
        synchronized (test) {
            System.out.println("hello");
        }
    }
}
