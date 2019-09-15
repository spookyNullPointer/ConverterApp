package com.spookyNullPointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeTest {

    private static final double DELTA = 1;

    //Cubic Meter To .... Tests
    @Test
    public void testCbMeterToCbKilometer1(){
        Area area = new Area(1, 2, 1);
        double result = area.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testCbMeterToCbKilometer2(){
        Area area = new Area(1, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }

}