package com.xuesong.test;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        //1. 准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个用来存储牌的花色，另一个数组存储牌的序号
        String[] color = {"♥", "♠", "♦", "♣"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //把大小王添加到poker里
        poker.add("Red Joker");
        poker.add("Black Jocker");
        //循环嵌套遍历两个数组 组装52张牌
        for (String pokerColor : color) {
            for (String pokerNumber : number) {
                //System.out.println(pokerColor+pokerNumber);
                poker.add(pokerColor + pokerNumber);
            }
        }
        //System.out.println(poker);
        //洗牌
        Collections.shuffle(poker);
        System.out.println("洗好的牌： " + poker);

        //发牌
        //定义4个集合，来存储玩家的牌的底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        //遍历poker牌 获取每一张牌
        // 使用poker集合的索引 % 3 来给3个玩家轮流发牌，剩余3张牌给底牌
        // 注意： 先判断底牌（i >=51 ）否则牌就发没了
        for (int i = 0; i < poker.size(); i++) {
            String Card = poker.get(i);
            if (i >= 51) {
                diPai.add(Card);
            } else if (i % 3 == 0) {
                player1.add(Card);
            } else if (i % 3 == 1) {
                player2.add(Card);
            } else if (i % 3 == 2) {
                player3.add(Card);
            }
        }

        //看牌
        System.out.println("jiangjiang: " + player1);
        System.out.println("xuexue: " + player2);
        System.out.println("songsong: " + player3);
        System.out.println("diPai: " + diPai);


    }
}
