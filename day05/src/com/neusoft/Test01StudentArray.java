package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/10 18:33
 */
public class Test01StudentArray {
    public static void main(String[] args) {
        /**
         * 创建一个学生数组 存储刘、关、张、赵四名同学的信息
         */
        // 1.创建一个StudentJavaBean类的数组对象，名字叫students
        StudentJavaBean[] students = new StudentJavaBean[4];

        // 2.创建四个StudentJavaBean类实例 分别初始化刘、关、张、赵四名同学的信息
        StudentJavaBean s1 = new StudentJavaBean("刘玄德", 50);
        StudentJavaBean s2 = new StudentJavaBean("关云长", 45);
        StudentJavaBean s3 = new StudentJavaBean("张翼德", 43);
        StudentJavaBean s4 = new StudentJavaBean("赵子龙", 42);

        // 3.把这四个实例赋值给students
        students[0] = s1;
        students[1] = s2;
        students[2] = s4;
        students[3] = s4;


        // 4.遍历输出这四个同学的名字和年龄
        for (int i = 0; i < students.length; i++) {
            StudentJavaBean s = students[i];
            System.out.println(s.getName()+"-----"+s.getAge());
        }



        // 上面我们使用的是数组对象
        //好处;一个容器可以存储多个变量，这样的话一个变量就可以存放很多信息
        // 缺点：数组对象在创建的时候容量是固定的 无法根据需求动态扩容
        // Java提供了一个ArrayList类 是大小可变的数组 存储在数组中的数据我们一般叫元素，可以不断添加元素，大小也会不断增长
    }
}
