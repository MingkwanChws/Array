package com.company;

public class Main {
    public static void array1() {
        int score1, score2, score3, score4, score5;
        score1 = 10;
        score2 = 15;
        score3 = 20;
        score4 = 25;
        score5 = 30;
        int sum = score1 + score2 + score3 + score4 + score5;
        System.out.println(sum);

        int[] scores = new int[6]; //0-4
        scores[0] = 10;
        scores[1] = 15;
        scores[2] = 20;
        scores[3] = 25;
        scores[4] = 30;
        scores[5] = 150;
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum2 = sum2 + scores[i];
        }
        System.out.println(sum2);
    }

    public static void array2() {
        int[] scores = {10, 15, 20, 25, 30, 35};  //line14-20 แต่ละค่าต้องเป็นประเภทเดียวกัน
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum2 = sum2 + scores[i];
        }
        System.out.println(sum2);
    }

    public static void arrayString() {
        String[] coffee = {"Latte" , "Americano"};
        for (int i = 0; i < coffee.length; i++) {
            System.out.println(coffee[i]);
        }
    }

    public static void main(String[] args) {
        array1();
        array2();
        arrayString();

    }
}
