package com.debug.test3;

import com.debug.test1.IService;
import com.debug.test1.IServiceImpl;
import com.debug.test1.Person;

import java.util.Arrays;

public class DebugTestDemo3 {

    public static void main(String[] args) {
//        conditions();
//        evaluate();
//          safe();
//        key();
        streamDebug();
    }


    //条件表达式
    public static void conditions(){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
    }

    //表达式解析
    public static void evaluate(){
        System.out.println("evaluate");
        Person zhangsan = new Person("zhangsan", 30);
        System.out.println("evaluate");
        System.out.println(zhangsan.toString());
    }

    //避免资源操作 force return
    public static void safe(){
        System.out.println("报错了");

        System.out.println("db的操作");
        System.out.println("db的操作");

    }

    //快捷键 图标
    public static void key(){
        System.out.println("show execution points");//回到断点停顿的地方

        System.out.println("step over");//直接跳到下一行，无论该行调用了哪些方法


        System.out.println("step into  step out");//进出入方法的内部
        IService iService = new IServiceImpl();
        iService.testExcute();

        System.out.println("force step into");//进入方法内部
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("hello");
        stringBuffer.append("world");


        System.out.println("run to cursor");//光标的移动
        System.out.println("11111111");
        System.out.println("22222222");
        System.out.println("33333333");
        System.out.println("44444444");
    }

    //stream 调试
    public static void streamDebug(){

        //选择断点的方式
        Arrays.asList(1,3,5,7,6,12).stream()
                .filter(i -> i%2 == 0 || i%3 == 0)
                .map(i -> i*i)
                .forEach(System.out::println);

    }
}
