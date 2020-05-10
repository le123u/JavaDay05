package com.neusoft;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/5/10 18:18
 */
public class RandomTest1 {
    public static void main(String[] args) {
        // 1.游戏开始生成一个1-100之间的随机整数  num
        //2. 玩家猜测一个数字 guessNum
        // 系统提示猜大了还是猜小了，直到玩家猜对
        Random random = new Random();
        int num = random.nextInt(100 ) + 1;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入1-100之间的数：");
            int guessNumber = scanner.nextInt();
            if(guessNumber > num){
                System.out.println("猜大了");
            }else if(guessNumber < num){
                System.out.println("猜小了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }

    }
}
