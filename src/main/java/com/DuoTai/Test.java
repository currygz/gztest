package com.DuoTai;

public class Test implements Tet1,Test2{
    @Override
    public void happy() {
        System.out.println("\"6666666666666\" = " + "6666666666666");
    }

    @Override
    public void eat() {

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.eat();
        test.happy();

    }
}
