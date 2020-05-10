package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/10 20:55
 */

// 自己实现一个ArrayList01
public class OwnArrayList01 {

        // 定义成员变量
    // data数组存储数据
    private  int[] data;
    // 集合中有效元素的个数
    private  int size;
        // 构造方法
    // 有参的构造方法,传入数组的初始容量
    public OwnArrayList01(int capacity){
        data = new int[capacity];
        size = 0;
    }
    // 无参的构造方法,默认容量是10
    public OwnArrayList01(){
       this(10);
    }

        // 成员方法
    // 获取数组中元素的个数
    public  int getSize(){
        return size;
    }
    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }
    // 获取数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }



}
