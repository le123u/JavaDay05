package com.neusoft;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/5/10 14:07
 */
// 构造方法：一种特殊的方法
// 面向对象里只有：属性、方法（C/python中的函数function）
/**
 * 构造方法：当对象被创建的时候，构造方法用于初始化该对象，给对象成员变量赋予初始值
 *
 * 构造方法格式：
 * 修饰符 构造方法名（参数列表）{方法体}
 *
 * 构造方法写法上 ：
 * 1.方法名与他所在类的名字相同
 * 2.没有返回值  所以不需要指定返回的类型  也不需要void
 *
 * 小贴士：
 * 无论你是否定义了构造方法，所有类都有构造方法  因为Java自动为你提供了一个无参的构造方法
 * 一旦你自己定义了构造方法 Java自动提供的默认无参构造方法就会失效
 */
public class Student {

    private String name;
    private int age;
    // 无参构造方法
    public  Student(){
        System.out.println("无参构造方法被调用");
    }
    //有参数的构造方法,初始化学生类的时候 就给成员变量一个初始值
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("有参构造方法被调用");
    }

    // 1.如果不提供构造方法 系统会默认给你一个无参构造方法
    // 2.如果提供了构造方法 系统就不在给你提供无参的构造方法
    // 3.构造方法是可以重载的  即可以定义参数 也可以不定义参数


}
