package com.neusoft;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/5/10 15:48
 */
public class ScannerTest3 {
    public static void main(String[] args) {

        // 匿名对象（没有名的对象）只创建对象语句 没有把对象地址值赋值给某个变量
        new Scanner(System.in); // 这就是匿名对象的创建 一个对象 优点：简洁
        System.out.println(new Scanner(System.in).nextInt());
        // 缺点：一旦调用两次成员方法，就创建了两个对象，造成了浪费
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();


        // 匿名对象可以作为方法的参数和返回值
        // 1.作为参数
        Scanner scanner1 = new Scanner(System.in);
        // 匿名对象作为方法的接收参数
        input(scanner1);
        // input (new Scanner(System.in))


        // 2.作为返回值
        // 普通方式Scanner的返回值
        getScanner();

        // 匿名对象作为方法的返回值

    }
    // 1.作为参数
    public  static  void input(Scanner sc){
        System.out.println(sc);
    }

    public static Scanner getScanner(){
        // 2.作为返回值
        // 普通方式Scanner的返回值
//        Scanner scanner = new Scanner(System.in);
//        return scanner;

        // 匿名对象作为方法的返回值
        return new Scanner(System.in);
    }


}
