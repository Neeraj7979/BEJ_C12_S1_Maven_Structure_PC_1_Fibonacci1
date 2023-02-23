package com.niit.bej;

public class FibonacciSeries {
    public int[] printFibonacciSeries(int length) {
        int[] fibonacciSeries = new int[length];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        for (int i = 2; i < length; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        for (int j = 0; j < length; j++) {
            System.out.print( fibonacciSeries[j]+",");
        }
        return fibonacciSeries;
    }
}
