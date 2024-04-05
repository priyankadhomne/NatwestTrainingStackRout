package com.natwest.stramproject.task2;

import java.util.Scanner;

public class TestScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CricketScoreAnalyzer cricketScoreAnalyzer = new CricketScoreAnalyzer();

        // Adding runs to the list
        cricketScoreAnalyzer.addRunsToList(scanner.nextInt());
        cricketScoreAnalyzer.addRunsToList(scanner.nextInt());
        cricketScoreAnalyzer.addRunsToList(scanner.nextInt());
        cricketScoreAnalyzer.addRunsToList(scanner.nextInt());
        cricketScoreAnalyzer.addRunsToList(scanner.nextInt());

        System.out.println("Display the Run of All Batsman");
        cricketScoreAnalyzer.displayRuns();

        System.out.println();
        System.out.println("Display the Runrate");
        System.out.println(cricketScoreAnalyzer.calcRunRate());

        System.out.println("Display the lowest runs scored");
        System.out.println(cricketScoreAnalyzer.lowestRunsScored());

        System.out.println("Display the count of player who did batting");
        System.out.println(cricketScoreAnalyzer.countOfBatsman());

    }
}