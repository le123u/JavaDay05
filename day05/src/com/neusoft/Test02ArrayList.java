package com.neusoft;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Liu
 * @date 2020/5/10 19:37
 */
public class Test02ArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000) + 1;
            list.add(r);
        }
        // 打印随机生成的20个数
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+", ");

        }
        System.out.println();
        System.out.println("--------------");


        // 调用一个方法 筛选出list里所有的偶数组成的新集合
        ArrayList<Integer> arrayList = getArrayList(list);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i)+", ");
        }

    }

    public static ArrayList<Integer> getArrayList( ArrayList<Integer> list){
        // 1.创建一个小集合存储偶数
        ArrayList<Integer> smallList = new ArrayList<>();
        // 2.遍历传入的list
        for(int i = 0;i < list.size();i++){
            // 3.获取每一个元素
            Integer num = list.get(i);
            if(num%2 == 0){
                smallList.add(num);
            }
        }

        return smallList;
    }
}
