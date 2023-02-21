package com.niit.bej;

public class FibonacciSeries {
    public void printFibonacciSeries(int numberOfTerms) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;
        System.out.print(firstTerm + "" + secondTerm);
        for (int i = 2; i < numberOfTerms; ++i) {
            nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
