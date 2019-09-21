package com.spookyNullPointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {

    private static final double DELTA = 1;

    //Kilogram To .... Tests
    @Test
    public void testSecondToMillimeter1(){
        Weight weight = new Weight(1, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testSecondToMillimeter2(){
        Weight weight = new Weight(1, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }

}