package com.niit.bej;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {
    FibonacciSeries fibonacciSeries;

    @BeforeEach
    void setUp() {
        fibonacciSeries = new FibonacciSeries();
    }

    @AfterEach
    void tearDown() {
        fibonacciSeries=null;
    }

    @Test
    void printFibonacciSeriesUpTo5Terms() {
        int[] expected={0,1,1,2,3};
        int[] actual=fibonacciSeries.printFibonacciSeries(5);
        assertArrayEquals(expected,actual);
    }
}