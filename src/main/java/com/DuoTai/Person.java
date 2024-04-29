package com.DuoTai;

public class Person {

    private String name;
    private String address;
    private Integer sum = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void run() {
        System.out.println("run !!!");
    }

    void run1(){
        System.out.println("7777777777777");
    }


    public static class Student extends Person{
        @Override
        void run() {
            System.out.println("stu run !!!!!!!!!!!!!");
        }
        private Integer sum = 14;


        void run1(String s){
            System.out.println("222222222222");
        }

//        void eat(){
//            System.out.println("0000000000000");
//        }
    }

    public static void main(String[] args) {
        Person person = new Student();
        person.run1();
//        person.run();
//        person.setName("zhnagsan");
//        System.out.println(person.name);
//        if (person instanceof Person) {
//            System.out.println(66666);
//        }

//        Student stu = (Student) person;
//        stu.eat();
//
//        ((Student) person).eat();
    }
}
