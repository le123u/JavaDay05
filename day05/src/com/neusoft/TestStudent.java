package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/10 14:21
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("刘东东", 23);
        System.out.println(student1);
        System.out.println(student);
    }
}
