package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/10 14:39
 */
public class TestJavaBean {
    // JavaBean 爪洼 的 咖啡豆  是一种Java的标准规范
    // 符合JavaBean的类的要求：
    // 1.类必须是具体的和公共的
    // 2.并且具有无参数构造方法
    // 3.提供用来操作成员变量的set和get方法，和数据库中表字段对应的实体类就是一个典型的JavaBean

    // 格式：
    // 成员变量
    // 无参构造方法必须的，有参构造方法是建议的
    // 成员方法
    // get方法和set方法 getxxx()  setxxx()

    // 无参构造方法调用
    public static void main(String[] args) {
        StudentJavaBean s = new StudentJavaBean();
        s.setName("刘东东");
        s.setAge(18);
        System.out.println(s.getName()+"-------"+s.getAge());

        // 有参构造方法
        StudentJavaBean ldd = new StudentJavaBean("ldd", 23);
        System.out.println(s.getName()+"-------"+s.getAge());
    }
}
