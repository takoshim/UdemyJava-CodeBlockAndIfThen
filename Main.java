package com.gaho;

public class Main {

    public static void main(String[] args) {
        boolean p1GameOver = true;
        int p1Score = 100;
        int p1LevelCompleted = 5;
        int p1Bonus = 100;

        // if (score > 5000) {
        //    System.out.println("Your score was equal to or more than 5000.");
        // } else if (score > 4000) {
        //     System.out.println("Your score was more than 4000 and less than 5000.");
        // } else if (score > 3000) {
        //     System.out.println("Your score was more than 3000 and less than 4000.");
        // } else if (score > 2000) {
        //     System.out.println("Your score was more than 2000 and less than 3000.");
        // } else if (score > 1000) {
        //     System.out.println("Your score was more than 1000 and less than 2000.");
        // } else if (score > 0) {
        //     System.out.println("Your score was more than 0 and less than 1000.");
        // } else {
        //     System.out.println("Your score must be a negative number.");
        // }
        // System.out.println("This was executed.");

        if (p1GameOver) {
            int p1FinalScore = p1Score + (p1LevelCompleted * p1Bonus);
            p1FinalScore += 1000;
            System.out.println("p1's final score was " + p1FinalScore);
        }

        boolean p2GameOver = true;
        int p2Score = 10000;
        int p2LevelCompleted = 8;
        int p2Bonus = 200;

        if (p2GameOver) {
            int p2FinalScore = p2Score + (p2LevelCompleted * p2Bonus);
            p2FinalScore += 1000;
            System.out.println("p2's final score was " + p2FinalScore);
        }
    }
}
