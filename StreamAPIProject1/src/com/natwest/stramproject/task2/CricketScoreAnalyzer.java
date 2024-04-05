package com.natwest.stramproject.task2;

import java.util.Comparator;
import java.util.LinkedList;

public class CricketScoreAnalyzer {
    private LinkedList<Integer>runData;

    public CricketScoreAnalyzer() {
        this.runData = new LinkedList<>();
    }
    public void addRunsToList(int run) {
        runData.add(run);
    }
    public double calcRunRate(){
        Integer n = runData.stream().mapToInt(Integer::intValue).sum();
        return (n/50);
    }
    public int lowestRunsScored(){
        Integer m = runData.stream().min(Comparator.comparingInt(i->i)).orElseThrow();
        return m;
    }
    public void displayRuns(){
        runData.stream().forEach(i-> System.out.print(i + " "));
    }
    public long countOfBatsman(){
        return runData.stream().count();
    }
}



