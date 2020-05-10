package com.neusoft;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/5/10 15:27
 */
public class APIDemo1 {
    //API application programming  interface 应用程序接口
    public static void main(String[] args) {
        // 1.Scanner类
        // System.in 是指通过键盘录入数据
        Scanner scanner = new Scanner(System.in);
        // 除了Java.lang包下的类不需要导入 其他的必须导入才能使用
        // 导包的格式  import 包名.类名；
        // 调用方法 变量名.方法名（）；
        int i = scanner.nextInt();
        System.out.println(i);


        // 2.Random类
        // Random用于生成伪随机数
        Random random = new Random();
        //[0,100)之间随之整数
        for (int j = 0; j < 10; j++) {
            int i1 = random.nextInt(100);
            System.out.println(i1);
        }

        // 3.ArrayList类

    }
}
