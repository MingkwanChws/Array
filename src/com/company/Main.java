package com.company;

public class Main {
    public static void demo1() {
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

    public static void main(String[] args) {
        demo1();
    }
}
