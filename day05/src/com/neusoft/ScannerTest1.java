package com.neusoft;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/5/10 15:48
 */
public class ScannerTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int i = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int i1 = scanner.nextInt();
        int sum = i + i1;
        System.out.println(i +"+"+ i1+"="+sum );
    }
}
