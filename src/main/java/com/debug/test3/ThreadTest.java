package com.debug.test3;

import cn.hutool.Hutool;
import cn.hutool.core.util.ObjectUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

public class ThreadTest extends java.lang.Thread {

    public static void main(String[] args) {
//        ThreadTest threadTest = new ThreadTest();
//        threadTest.start();

//        new ThreadTest().start();
//        int a =2;
//        System.out.println(a==0);

        String testStr =  " ";

        ArrayList<String> strings = new ArrayList<>();
//        strings.add("fsdgs");
//        strings.add("fsdydrydgs");
//        strings.add("fsdgdrys");
//        strings.add("fsdzsrysgs");
        if (testStr != null) {
            System.out.println("testStr = " + testStr);
        }

    }

    @Override
    public synchronized void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + currentThread().getName());
        }

    }
}
