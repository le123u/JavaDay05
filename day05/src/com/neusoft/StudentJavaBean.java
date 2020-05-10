package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/10 14:48
 */
public class StudentJavaBean {
    // 格式：
    // 成员变量
    private String name;
    private int age;
    // 无参构造方法必须的，有参构造方法是建议的
    public  StudentJavaBean(){
        System.out.println("无参构造方法被调用");
    }
    public StudentJavaBean(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("有参构造方法被调用");
    }
    // 成员方法



    // get方法和set方法 getxxx()  setxxx()
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
