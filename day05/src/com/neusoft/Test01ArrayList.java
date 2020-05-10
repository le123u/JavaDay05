package com.neusoft;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Liu
 * @date 2020/5/10 19:37
 */
public class Test01ArrayList {
    public static void main(String[] args) {
        // 生成十个1-33之间的随机整数，添加到集合中，并遍历输出
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(33) + 1;
            list.add(num);
        }
//        for (int j = 0; j < list.size(); j++) {
//
//            System.out.print(list.get(j)+"\t");
//        }
        printArrayList(list);


    }
    // 自定义方法打印；list
    public static void printArrayList(ArrayList<Integer> list){
        // 拼接左括号
        System.out.print("[");
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
           //获取元素
            Integer integer = list.get(i);
            if (i != list.size()-1){
                System.out.print(integer+",");
            }else{
                // 拼接右括号
                System.out.print(integer + "]");
            }

        }

    }
}
