package com.debug.test1;

public class DebugTestDemo {

    //行断点
    public static void line(){
        System.out.println("this is a line point");
    }

    //详细断点
    public static void detailLine(){
        System.out.println("this is a detailLine");
    }

    //方法断点
    public static int method(int num){
        System.out.println("this is a method");
        Integer res = 0;
        for (int i = 0; i < num; i++) {
            res += i;
        }

        //接口测试
        IService iService = new IServiceImpl();
        iService.testExcute();

        return res;
    }

    //空指针异常断点 全局捕获
    public static void nullException(){
        Object object = null;
        object.toString();
        System.out.println("this is line will never be print!!!");
    }

    //数组越界异常断点 全局捕获
    public static void indexException(){
        int [] arr  = {1,2,3,4,5};
        System.out.println(arr[5]);
    }

    //字段断点 读写进行监控
    public static void field(){

        Person person = new Person("Tom",20);
        person.setAge(18);
        System.out.println(person.toString());

    }


    public static void main(String[] args) {
//        line();
//        detailLine();
//        method(5);
//         nullException();
//        indexException();
        field();
    }

}
