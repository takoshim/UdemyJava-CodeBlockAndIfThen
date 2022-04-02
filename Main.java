package com.gaho;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        System.out.println("Score: " + score);

        if (score < 4000) {
            System.out.println("Your score was less than 5000.");
        } else {
            System.out.println("Your score was more or equal to 4000.");

        }
        System.out.println("This was executed.");
    }
}
