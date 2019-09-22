package com.spookyNullPointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {

    private static final double DELTA = 1;

    //Second To .... Tests
    @Test
    public void testSecondToMillisecond1(){
        Time time = new Time(1, 2, 1);
        double result = time.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testSecondToMillisecond2(){
        Time time = new Time(1, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testSecondToMicrosecond1(){
        Time time = new Time(1, 3, 1);
        double result = time.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testSecondToMicrosecond2(){
        Time time = new Time(1, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testSecondToNanosecond1(){
        Time time = new Time(1, 4, 1);
        double result = time.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testSecondToNanosecond2(){
        Time time = new Time(1, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000000000D, result, DELTA);
    }
    @Test
    public void testSecondToPicosecond1(){
        Time time = new Time(1, 5, 1);
        double result = time.getConversionResult();
        assertEquals(1000000000000D, result, DELTA);
    }
    @Test
    public void testSecondToPicosecond2(){
        Time time = new Time(1, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000000000000D, result, DELTA);
    }
    @Test
    public void testSecondToMinute1(){
        Time time = new Time(1, 6, 1);
        double result = time.getConversionResult();
        assertEquals(0.0166666667, result, DELTA);
    }
    @Test
    public void testSecondToMinute2(){
        Time time = new Time(1, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(16.666666667, result, DELTA);
    }
    @Test
    public void testSecondToHour1(){
        Time time = new Time(1, 7, 1);
        double result = time.getConversionResult();
        assertEquals(0.0002777778, result, DELTA);
    }
    @Test
    public void testSecondToHour2(){
        Time time = new Time(1, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(0.2777777778, result, DELTA);
    }
    @Test
    public void testSecondToDay1(){
        Time time = new Time(1, 8, 1);
        double result = time.getConversionResult();
        assertEquals(0.0000115741, result, DELTA);
    }
    @Test
    public void testSecondToDay2(){
        Time time = new Time(1, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0115740741, result, DELTA);
    }
    @Test
    public void testSecondToWeek1(){
        Time time = new Time(1, 9, 1);
        double result = time.getConversionResult();
        assertEquals(0.0000016534, result, DELTA);
    }
    @Test
    public void testSecondToWeek2(){
        Time time = new Time(1, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0016534392, result, DELTA);
    }
    @Test
    public void testSecondToMonth1(){
        Time time = new Time(1, 10, 1);
        double result = time.getConversionResult();
        assertEquals(3.802570537E-7, result, DELTA);
    }
    @Test
    public void testSecondToMonth2(){
        Time time = new Time(1, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0003802571, result, DELTA);
    }
    @Test
    public void testSecondToYear1(){
        Time time = new Time(1, 11, 1);
        double result = time.getConversionResult();
        assertEquals(3.168808781E-8, result, DELTA);
    }
    @Test
    public void testSecondToYear2(){
        Time time = new Time(1, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0000316881, result, DELTA);
    }

    //Millisecond To .... Tests
    @Test
    public void testMillisecondToSecond1(){
        Time time = new Time(2, 1, 1);
        double result = time.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMillisecondToSecond2(){
        Time time = new Time(2, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testMillisecondToMicrosecond1(){
        Time time = new Time(2, 3, 1);
        double result = time.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testMillisecondToMicrosecond2(){
        Time time = new Time(2, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMillisecondToNanosecond1(){
        Time time = new Time(2, 4, 1);
        double result = time.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMillisecondToNanosecond2(){
        Time time = new Time(2, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testMillisecondToPicosecond1(){
        Time time = new Time(2, 5, 1);
        double result = time.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testMillisecondToPicosecond2(){
        Time time = new Time(2, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000000000D, result, DELTA);
    }
    @Test
    public void testMillisecondToMinute1(){
        Time time = new Time(2, 6, 1);
        double result = time.getConversionResult();
        assertEquals(0.0000166667, result, DELTA);
    }
    @Test
    public void testMillisecondToMinute2(){
        Time time = new Time(2, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0166666667, result, DELTA);
    }
    @Test
    public void testMillisecondToHour1(){
        Time time = new Time(2, 7, 1);
        double result = time.getConversionResult();
        assertEquals(2.777777777E-7, result, DELTA);
    }
    @Test
    public void testMillisecondoHour2(){
        Time time = new Time(2, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0002777778, result, DELTA);
    }
    @Test
    public void testMillisecondToDay1(){
        Time time = new Time(2, 8, 1);
        double result = time.getConversionResult();
        assertEquals(1.157407407E-8, result, DELTA);
    }
    @Test
    public void testMillisecondToDay2(){
        Time time = new Time(2, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0000115741, result, DELTA);
    }
    @Test
    public void testMillisecondToWeek1(){
        Time time = new Time(2, 9, 1);
        double result = time.getConversionResult();
        assertEquals(1.653439153E-9, result, DELTA);
    }
    @Test
    public void testMillisecondToWeek2(){
        Time time = new Time(2, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0000016534, result, DELTA);
    }
    @Test
    public void testMillisecondToMonth1(){
        Time time = new Time(2, 10, 1);
        double result = time.getConversionResult();
        assertEquals(3.802570537E-10, result, DELTA);
    }
    @Test
    public void testMillisecondToMonth2(){
        Time time = new Time(2, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(3.802570537E-7, result, DELTA);
    }
    @Test
    public void testMillisecondToYear1(){
        Time time = new Time(2, 11, 1);
        double result = time.getConversionResult();
        assertEquals(3.168808781E-11, result, DELTA);
    }
    @Test
    public void testMillisecondToYear2(){
        Time time = new Time(2, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(3.168808781E-8, result, DELTA);
    }

    //Microsecond To .... Tests
    @Test
    public void testMicrosecondToSecond1(){
        Time time = new Time(3, 1, 1);
        double result = time.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testMicrosecondToSecond2(){
        Time time = new Time(3, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMicrosecondToMillisecond1(){
        Time time = new Time(3, 2, 1);
        double result = time.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMicrosecondToMillisecond2(){
        Time time = new Time(3, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testMicrosecondToNanosecond1(){
        Time time = new Time(3, 4, 1);
        double result = time.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testMicrosecondToNanosecond2(){
        Time time = new Time(3, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMicrosecondToPicosecond1(){
        Time time = new Time(3, 5, 1);
        double result = time.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMicrosecondToPicosecond2(){
        Time time = new Time(3, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testMicrosecondToMinute1(){
        Time time = new Time(3, 6, 1);
        double result = time.getConversionResult();
        assertEquals(1.666666666E-8, result, DELTA);
    }
    @Test
    public void testMicrosecondToMinute2(){
        Time time = new Time(3, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0000166667, result, DELTA);
    }
    @Test
    public void testMicrosecondToHour1(){
        Time time = new Time(3, 7, 1);
        double result = time.getConversionResult();
        assertEquals(2.777777777E-10, result, DELTA);
    }
    @Test
    public void testMicrosecondoHour2(){
        Time time = new Time(3, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(2.777777777E-7, result, DELTA);
    }
    @Test
    public void testMicrosecondToDay1(){
        Time time = new Time(3, 8, 1);
        double result = time.getConversionResult();
        assertEquals(1.157407407E-11, result, DELTA);
    }
    @Test
    public void testMicrosecondToDay2(){
        Time time = new Time(3, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(1.157407407E-8, result, DELTA);
    }
    @Test
    public void testMicrosecondToWeek1(){
        Time time = new Time(3, 9, 1);
        double result = time.getConversionResult();
        assertEquals(1.653439153E-12, result, DELTA);
    }
    @Test
    public void testMicrosecondToWeek2(){
        Time time = new Time(3, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(1.653439153E-9, result, DELTA);
    }
    @Test
    public void testMicrosecondToMonth1(){
        Time time = new Time(3, 10, 1);
        double result = time.getConversionResult();
        assertEquals(3.802570537E-13, result, DELTA);
    }
    @Test
    public void testMicrosecondToMonth2(){
        Time time = new Time(3, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(3.802570537E-10, result, DELTA);
    }
    @Test
    public void testMicrosecondToYear1(){
        Time time = new Time(3, 11, 1);
        double result = time.getConversionResult();
        assertEquals(3.168808781E-14, result, DELTA);
    }
    @Test
    public void testMicrosecondToYear2(){
        Time time = new Time(3, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(3.168808781E-11, result, DELTA);
    }

    //Nanosecond To .... Tests
    @Test
    public void testNanosecondToSecond1(){
        Time time = new Time(4, 1, 1);
        double result = time.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testNanosecondToSecond2(){
        Time time = new Time(4, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testNanoecondToMillisecond1(){
        Time time = new Time(4, 2, 1);
        double result = time.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testNanosecondToMillisecond2(){
        Time time = new Time(4, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testNanosecondToMicrosecond1(){
        Time time = new Time(4, 3, 1);
        double result = time.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testNanosecondToMicrosecond2(){
        Time time = new Time(4, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testNanosecondToPicosecond1(){
        Time time = new Time(4, 5, 1);
        double result = time.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testNanosecondToPicosecond2(){
        Time time = new Time(4, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testNanosecondToMinute1(){
        Time time = new Time(4, 6, 1);
        double result = time.getConversionResult();
        assertEquals(1.666666666E-11, result, DELTA);
    }
    @Test
    public void testNanosecondToMinute2(){
        Time time = new Time(4, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(1.666666666E-8, result, DELTA);
    }
    @Test
    public void testNanosecondToHour1(){
        Time time = new Time(4, 7, 1);
        double result = time.getConversionResult();
        assertEquals(2.777777777E-13, result, DELTA);
    }
    @Test
    public void testNanosecondoHour2(){
        Time time = new Time(4, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(2.777777777E-10, result, DELTA);
    }
    @Test
    public void testNanosecondToDay1(){
        Time time = new Time(4, 8, 1);
        double result = time.getConversionResult();
        assertEquals(1.157407407E-14, result, DELTA);
    }
    @Test
    public void testNanosecondToDay2(){
        Time time = new Time(4, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(1.157407407E-11, result, DELTA);
    }
    @Test
    public void testNanosecondToWeek1(){
        Time time = new Time(4, 9, 1);
        double result = time.getConversionResult();
        assertEquals(1.653439153E-15, result, DELTA);
    }
    @Test
    public void testNanosecondToWeek2(){
        Time time = new Time(4, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(1.653439153E-12, result, DELTA);
    }
    @Test
    public void testNanosecondToMonth1(){
        Time time = new Time(4, 10, 1);
        double result = time.getConversionResult();
        assertEquals(3.802570537E-16, result, DELTA);
    }
    @Test
    public void testNanosecondToMonth2(){
        Time time = new Time(4, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(3.802570537E-13, result, DELTA);
    }
    @Test
    public void testNanosecondToYear1(){
        Time time = new Time(4, 11, 1);
        double result = time.getConversionResult();
        assertEquals(3.168808781E-17, result, DELTA);
    }
    @Test
    public void testNanosecondToYear2(){
        Time time = new Time(4, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(3.168808781E-14, result, DELTA);
    }

    //Picosecond To .... Tests
    @Test
    public void testPicosecondToSecond1(){
        Time time = new Time(5, 1, 1);
        double result = time.getConversionResult();
        assertEquals(1.E-12, result, DELTA);
    }
    @Test
    public void testPicosecondToSecond2(){
        Time time = new Time(5, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testPicosecondToMillisecond1(){
        Time time = new Time(5, 2, 1);
        double result = time.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testPicosecondToMillisecond2(){
        Time time = new Time(5, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testPicosecondToMicrosecond1(){
        Time time = new Time(5, 3, 1);
        double result = time.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testPicosecondToMicrosecond2(){
        Time time = new Time(5, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testPicosecondToNanosecond1(){
        Time time = new Time(5, 4, 1);
        double result = time.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testPicosecondToNanosecond2(){
        Time time = new Time(5, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testPicosecondToMinute1(){
        Time time = new Time(5, 6, 1);
        double result = time.getConversionResult();
        assertEquals(1.666666666E-14, result, DELTA);
    }
    @Test
    public void testPicosecondToMinute2(){
        Time time = new Time(5, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(1.666666666E-11, result, DELTA);
    }
    @Test
    public void testPicosecondToHour1(){
        Time time = new Time(5, 7, 1);
        double result = time.getConversionResult();
        assertEquals(2.777777777E-16, result, DELTA);
    }
    @Test
    public void testPicosecondoHour2(){
        Time time = new Time(5, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(2.777777777E-13, result, DELTA);
    }
    @Test
    public void testPicosecondToDay1(){
        Time time = new Time(5, 8, 1);
        double result = time.getConversionResult();
        assertEquals(1.157407407E-17, result, DELTA);
    }
    @Test
    public void testPicosecondToDay2(){
        Time time = new Time(5, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(1.157407407E-14, result, DELTA);
    }
    @Test
    public void testPicosecondToWeek1(){
        Time time = new Time(5, 9, 1);
        double result = time.getConversionResult();
        assertEquals(1.653439153E-18, result, DELTA);
    }
    @Test
    public void testPicosecondToWeek2(){
        Time time = new Time(5, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(1.653439153E-15, result, DELTA);
    }
    @Test
    public void testPicosecondToMonth1(){
        Time time = new Time(5, 10, 1);
        double result = time.getConversionResult();
        assertEquals(3.802570537E-19, result, DELTA);
    }
    @Test
    public void testPicosecondToMonth2(){
        Time time = new Time(5, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(3.802570537E-16, result, DELTA);
    }
    @Test
    public void testPicosecondToYear1(){
        Time time = new Time(5, 11, 1);
        double result = time.getConversionResult();
        assertEquals(3.168808781E-20, result, DELTA);
    }
    @Test
    public void testPicosecondToYear2(){
        Time time = new Time(5, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(3.168808781E-17, result, DELTA);
    }

    //Minute To .... Tests
    @Test
    public void testMinuteToSecond1(){
        Time time = new Time(6, 1, 1);
        double result = time.getConversionResult();
        assertEquals(60, result, DELTA);
    }
    @Test
    public void testMinuteToSecond2(){
        Time time = new Time(6, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(60000, result, DELTA);
    }
    @Test
    public void testMinuteToMillisecond1(){
        Time time = new Time(6, 2, 1);
        double result = time.getConversionResult();
        assertEquals(60000, result, DELTA);
    }
    @Test
    public void testMinuteToMillisecond2(){
        Time time = new Time(6, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(5.999988000024E7, result, DELTA);
    }
    @Test
    public void testMinuteToMicrosecond1(){
        Time time = new Time(6, 3, 1);
        double result = time.getConversionResult();
        assertEquals(60000000, result, DELTA);
    }
    @Test
    public void testMinuteToMicrosecond2(){
        Time time = new Time(6, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(6.000000002399999E10, result, DELTA);
    }
    @Test
    public void testMinuteToNanosecond1(){
        Time time = new Time(6, 4, 1);
        double result = time.getConversionResult();
        assertEquals(6.000000002400001E10, result, DELTA);
    }
    @Test
    public void testMinuteToNanosecond2(){
        Time time = new Time(6, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(6.000000002400001E13, result, DELTA);
    }
    @Test
    public void testMinuteToPicosecond1(){
        Time time = new Time(6, 5, 1);
        double result = time.getConversionResult();
        assertEquals(6.0000000024E13, result, DELTA);
    }
    @Test
    public void testMinuteToPicosecond2(){
        Time time = new Time(6, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(6.0000000024E16, result, DELTA);
    }
    @Test
    public void testMinuteToHour1(){
        Time time = new Time(6, 7, 1);
        double result = time.getConversionResult();
        assertEquals(0.0166666667, result, DELTA);
    }
    @Test
    public void testMinuteToHour2(){
        Time time = new Time(6, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(16.666666667, result, DELTA);
    }
    @Test
    public void testMinuteToDay1(){
        Time time = new Time(6, 8, 1);
        double result = time.getConversionResult();
        assertEquals(0.0006944444, result, DELTA);
    }
    @Test
    public void testMinuteToDay2(){
        Time time = new Time(6, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(0.6944444444, result, DELTA);
    }
    @Test
    public void testMinuteToWeek1(){
        Time time = new Time(6, 9, 1);
        double result = time.getConversionResult();
        assertEquals(0.0000992063, result, DELTA);
    }
    @Test
    public void testMinuteToWeek2(){
        Time time = new Time(6, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0992063492, result, DELTA);
    }
    @Test
    public void testMinuteToMonth1(){
        Time time = new Time(6, 10, 1);
        double result = time.getConversionResult();
        assertEquals(0.0000228154, result, DELTA);
    }
    @Test
    public void testMinuteToMonth2(){
        Time time = new Time(6, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0228154232, result, DELTA);
    }
    @Test
    public void testMinuteToYear1(){
        Time time = new Time(6, 11, 1);
        double result = time.getConversionResult();
        assertEquals(0.0000019013, result, DELTA);
    }
    @Test
    public void testMinuteToYear2(){
        Time time = new Time(6, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(0.0019012853, result, DELTA);
    }

    //Hour To .... Tests
    @Test
    public void testHourToSecond1(){
        Time time = new Time(7, 1, 1);
        double result = time.getConversionResult();
        assertEquals(3600, result, DELTA);
    }
    @Test
    public void testHourToSecond2(){
        Time time = new Time(7, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(3600000, result, DELTA);
    }
    @Test
    public void testHourToMillisecond1(){
        Time time = new Time(7, 2, 1);
        double result = time.getConversionResult();
        assertEquals(3600000, result, DELTA);
    }
    @Test
    public void testHourToMillisecond2(){
        Time time = new Time(7, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(3.600000001008E9, result, DELTA);
    }
    @Test
    public void testHourToMicrosecond1(){
        Time time = new Time(7, 3, 1);
        double result = time.getConversionResult();
        assertEquals(3.600000001008E9, result, DELTA);
    }
    @Test
    public void testHourToMicrosecond2(){
        Time time = new Time(7, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(3.600000001008E12, result, DELTA);
    }
    @Test
    public void testHourToNanosecond1(){
        Time time = new Time(7, 4, 1);
        double result = time.getConversionResult();
        assertEquals(3.600000001008E12, result, DELTA);
    }
    @Test
    public void testHourToNanosecond2(){
        Time time = new Time(7, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(3.600000001008E15, result, DELTA);
    }
    @Test
    public void testHourToPicosecond1(){
        Time time = new Time(7, 5, 1);
        double result = time.getConversionResult();
        assertEquals(3.600000001008E15, result, DELTA);
    }
    @Test
    public void testHourToPicosecond2(){
        Time time = new Time(7, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(3.600000001008E18, result, DELTA);
    }
    @Test
    public void testHourToMinute1(){
        Time time = new Time(7, 6, 1);
        double result = time.getConversionResult();
        assertEquals(60, result, DELTA);
    }
    @Test
    public void testHourToMinute2(){
        Time time = new Time(7, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(60000, result, DELTA);
    }
    @Test
    public void testHourToDay1(){
        Time time = new Time(7, 8, 1);
        double result = time.getConversionResult();
        assertEquals(0.0416666667, result, DELTA);
    }
    @Test
    public void testHourToDay2(){
        Time time = new Time(7, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(41.666666667, result, DELTA);
    }
    @Test
    public void testHourToWeek1(){
        Time time = new Time(7, 9, 1);
        double result = time.getConversionResult();
        assertEquals(0.005952381, result, DELTA);
    }
    @Test
    public void testHourToWeek2(){
        Time time = new Time(7, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(5.9523809524, result, DELTA);
    }
    @Test
    public void testHourToMonth1(){
        Time time = new Time(7, 10, 1);
        double result = time.getConversionResult();
        assertEquals(0.0013689254, result, DELTA);
    }
    @Test
    public void testHourToMonth2(){
        Time time = new Time(7, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(1.3689253936, result, DELTA);
    }
    @Test
    public void testHourToYear1(){
        Time time = new Time(7, 11, 1);
        double result = time.getConversionResult();
        assertEquals(0.0001140771, result, DELTA);
    }
    @Test
    public void testHourToYear2(){
        Time time = new Time(7, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(0.1140771161, result, DELTA);
    }

    //Day To .... Tests
    @Test
    public void testDayToSecond1(){
        Time time = new Time(8, 1, 1);
        double result = time.getConversionResult();
        assertEquals(86400, result, DELTA);
    }
    @Test
    public void testDayToSecond2(){
        Time time = new Time(8, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(8.639980646443352E7, result, DELTA);
    }
    @Test
    public void testDayToMillisecond1(){
        Time time = new Time(8, 2, 1);
        double result = time.getConversionResult();
        assertEquals(86400000, result, DELTA);
    }
    @Test
    public void testDayToMillisecond2(){
        Time time = new Time(8, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(8.640000003041281E10, result, DELTA);
    }
    @Test
    public void testDayToMicrosecond1(){
        Time time = new Time(8, 3, 1);
        double result = time.getConversionResult();
        assertEquals(8.64000000304128E10, result, DELTA);
    }
    @Test
    public void testDayToMicrosecond2(){
        Time time = new Time(8, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(8.64000000304128E13, result, DELTA);
    }
    @Test
    public void testDayToNanosecond1(){
        Time time = new Time(8, 4, 1);
        double result = time.getConversionResult();
        assertEquals(8.64000000304128E13, result, DELTA);
    }
    @Test
    public void testDayToNanosecond2(){
        Time time = new Time(8, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(8.64000000304128E16, result, DELTA);
    }
    @Test
    public void testDayToPicosecond1(){
        Time time = new Time(8, 5, 1);
        double result = time.getConversionResult();
        assertEquals(8.64000000304128E16, result, DELTA);
    }
    @Test
    public void testDayToPicosecond2(){
        Time time = new Time(8, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(8.64000000304128E19, result, DELTA);
    }
    @Test
    public void testDayToMinute1(){
        Time time = new Time(8, 6, 1);
        double result = time.getConversionResult();
        assertEquals(1440, result, DELTA);
    }
    @Test
    public void testDayToMinute2(){
        Time time = new Time(8, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(1440000, result, DELTA);
    }
    @Test
    public void testDayToHour1(){
        Time time = new Time(8, 7, 1);
        double result = time.getConversionResult();
        assertEquals(24, result, DELTA);
    }
    @Test
    public void testDayToHour2(){
        Time time = new Time(8, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(24000, result, DELTA);
    }
    @Test
    public void testDayToWeek1(){
        Time time = new Time(8, 9, 1);
        double result = time.getConversionResult();
        assertEquals(0.1428571429, result, DELTA);
    }
    @Test
    public void testDayToWeek2(){
        Time time = new Time(8, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(142.85714286, result, DELTA);
    }
    @Test
    public void testDayToMonth1(){
        Time time = new Time(8, 10, 1);
        double result = time.getConversionResult();
        assertEquals(0.0328542094, result, DELTA);
    }
    @Test
    public void testDayToMonth2(){
        Time time = new Time(8, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(32.854209446, result, DELTA);
    }
    @Test
    public void testDayToYear1(){
        Time time = new Time(8, 11, 1);
        double result = time.getConversionResult();
        assertEquals(0.0027378508, result, DELTA);
    }
    @Test
    public void testDayToYear2(){
        Time time = new Time(8, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(2.7378507871, result, DELTA);
    }

    //Week To .... Tests
    @Test
    public void testWeekToSecond1(){
        Time time = new Time(9, 1, 1);
        double result = time.getConversionResult();
        assertEquals(604814.3220031451, result, DELTA);
    }
    @Test
    public void testWeekToSecond2(){
        Time time = new Time(9, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(6.048143220031451E8, result, DELTA);
    }
    @Test
    public void testWeekToMillisecond1(){
        Time time = new Time(9, 2, 1);
        double result = time.getConversionResult();
        assertEquals(604800000, result, DELTA);
    }
    @Test
    public void testWeekToMillisecond2(){
        Time time = new Time(9, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(6.048000001606349E11, result, DELTA);
    }
    @Test
    public void testWeekToMicrosecond1(){
        Time time = new Time(9, 3, 1);
        double result = time.getConversionResult();
        assertEquals(6.048000001606349E11, result, DELTA);
    }
    @Test
    public void testWeekToMicrosecond2(){
        Time time = new Time(9, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(6.048000001606349E14, result, DELTA);
    }
    @Test
    public void testWeekToNanosecond1(){
        Time time = new Time(9, 4, 1);
        double result = time.getConversionResult();
        assertEquals(6.048000001606349E14, result, DELTA);
    }
    @Test
    public void testWeekToNanosecond2(){
        Time time = new Time(9, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(6.0480000016063488E17, result, DELTA);
    }
    @Test
    public void testWeekToPicosecond1(){
        Time time = new Time(9, 5, 1);
        double result = time.getConversionResult();
        assertEquals(6.0480000016063488E17, result, DELTA);
    }
    @Test
    public void testWeekToPicosecond2(){
        Time time = new Time(9, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(6.048000001606349E20, result, DELTA);
    }
    @Test
    public void testWeekToMinute1(){
        Time time = new Time(9, 6, 1);
        double result = time.getConversionResult();
        assertEquals(10080, result, DELTA);
    }
    @Test
    public void testWeekToMinute2(){
        Time time = new Time(9, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(1.0080004999682479E7, result, DELTA);
    }
    @Test
    public void testWeekToHour1(){
        Time time = new Time(9, 7, 1);
        double result = time.getConversionResult();
        assertEquals(168, result, DELTA);
    }
    @Test
    public void testWeekToHour2(){
        Time time = new Time(9, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(168000, result, DELTA);
    }
    @Test
    public void testWeekToDay1(){
        Time time = new Time(9, 8, 1);
        double result = time.getConversionResult();
        assertEquals(7, result, DELTA);
    }
    @Test
    public void testWeekToDay2(){
        Time time = new Time(9, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(7000, result, DELTA);
    }
    @Test
    public void testWeekToMonth1(){
        Time time = new Time(9, 10, 1);
        double result = time.getConversionResult();
        assertEquals(0.2299794661, result, DELTA);
    }
    @Test
    public void testWeekToMonth2(){
        Time time = new Time(9, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(229.97946612, result, DELTA);
    }
    @Test
    public void testWeekToYear1(){
        Time time = new Time(9, 11, 1);
        double result = time.getConversionResult();
        assertEquals(0.0191649555, result, DELTA);
    }
    @Test
    public void testWeekToYear2(){
        Time time = new Time(9, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(19.16495551, result, DELTA);
    }

    //Month To .... Tests
    @Test
    public void testMonthToSecond1(){
        Time time = new Time(10, 1, 1);
        double result = time.getConversionResult();
        assertEquals(2629800, result, DELTA);
    }
    @Test
    public void testMonthToSecond2(){
        Time time = new Time(10, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(2629800000D, result, DELTA);
    }
    @Test
    public void testMonthToMillisecond1(){
        Time time = new Time(10, 2, 1);
        double result = time.getConversionResult();
        assertEquals(2629800000D, result, DELTA);
    }
    @Test
    public void testMonthToMillisecond2(){
        Time time = new Time(10, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(2.62980000047268E12, result, DELTA);
    }
    @Test
    public void testMonthToMicrosecond1(){
        Time time = new Time(10, 3, 1);
        double result = time.getConversionResult();
        assertEquals(2.62980000047268E12, result, DELTA);
    }
    @Test
    public void testMonthToMicrosecond2(){
        Time time = new Time(10, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(2.6298000004726805E15, result, DELTA);
    }
    @Test
    public void testMonthToNanosecond1(){
        Time time = new Time(10, 4, 1);
        double result = time.getConversionResult();
        assertEquals(2.62980000047268E15, result, DELTA);
    }
    @Test
    public void testMonthToNanosecond2(){
        Time time = new Time(10, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(2.6298000004726804E18, result, DELTA);
    }
    @Test
    public void testMonthToPicosecond1(){
        Time time = new Time(10, 5, 1);
        double result = time.getConversionResult();
        assertEquals(2.6298000004726804E18, result, DELTA);
    }
    @Test
    public void testMonthToPicosecond2(){
        Time time = new Time(10, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(2.6298000004726805E21, result, DELTA);
    }
    @Test
    public void testMonthToMinute1(){
        Time time = new Time(10, 6, 1);
        double result = time.getConversionResult();
        assertEquals(43830, result, DELTA);
    }
    @Test
    public void testMonthToMinute2(){
        Time time = new Time(10, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(4.383004461898542E7, result, DELTA);
    }
    @Test
    public void testMonthToHour1(){
        Time time = new Time(10, 7, 1);
        double result = time.getConversionResult();
        assertEquals(730.5, result, DELTA);
    }
    @Test
    public void testMonthToHour2(){
        Time time = new Time(10, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(730500, result, DELTA);
    }
    @Test
    public void testMonthToDay1(){
        Time time = new Time(10, 8, 1);
        double result = time.getConversionResult();
        assertEquals(30.4375, result, DELTA);
    }
    @Test
    public void testMonthToDay2(){
        Time time = new Time(10, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(30437.5, result, DELTA);
    }
    @Test
    public void testMonthToWeek1(){
        Time time = new Time(10, 9, 1);
        double result = time.getConversionResult();
        assertEquals(4.3482142857, result, DELTA);
    }
    @Test
    public void testMonthToWeek2(){
        Time time = new Time(10, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(4348.2142857, result, DELTA);
    }
    @Test
    public void testMonthToYear1(){
        Time time = new Time(10, 11, 1);
        double result = time.getConversionResult();
        assertEquals(0.0833333333, result, DELTA);
    }
    @Test
    public void testMonthToYear2(){
        Time time = new Time(10, 11, 1000);
        double result = time.getConversionResult();
        assertEquals(83.333333333, result, DELTA);
    }

    //Year To .... Tests
    @Test
    public void testYearToSecond1(){
        Time time = new Time(11, 1, 1);
        double result = time.getConversionResult();
        assertEquals(31557600, result, DELTA);
    }
    @Test
    public void testYearToSecond2(){
        Time time = new Time(11, 1, 1000);
        double result = time.getConversionResult();
        assertEquals(3.1557600004012356E10, result, DELTA);
    }
    @Test
    public void testYearToMillisecond1(){
        Time time = new Time(11, 2, 1);
        double result = time.getConversionResult();
        assertEquals(3.1557600004012363E10, result, DELTA);
    }
    @Test
    public void testYearToMillisecond2(){
        Time time = new Time(11, 2, 1000);
        double result = time.getConversionResult();
        assertEquals(3.1557600004012363E13, result, DELTA);
    }
    @Test
    public void testYearToMicrosecond1(){
        Time time = new Time(11, 3, 1);
        double result = time.getConversionResult();
        assertEquals(3.1557600004012363E13, result, DELTA);
    }
    @Test
    public void testYearToMicrosecond2(){
        Time time = new Time(11, 3, 1000);
        double result = time.getConversionResult();
        assertEquals(3.1557600004012364E16, result, DELTA);
    }
    @Test
    public void testYearToNanosecond1(){
        Time time = new Time(11, 4, 1);
        double result = time.getConversionResult();
        assertEquals(3.1557600004012364E16, result, DELTA);
    }
    @Test
    public void testYearToNanosecond2(){
        Time time = new Time(11, 4, 1000);
        double result = time.getConversionResult();
        assertEquals(3.1557600004012364E19, result, DELTA);
    }
    @Test
    public void testYearToPicosecond1(){
        Time time = new Time(11, 5, 1);
        double result = time.getConversionResult();
        assertEquals(3.1557600004012356E19, result, DELTA);
    }
    @Test
    public void testYearToPicosecond2(){
        Time time = new Time(11, 5, 1000);
        double result = time.getConversionResult();
        assertEquals(3.1557600004012356E22, result, DELTA);
    }
    @Test
    public void testYearToMinute1(){
        Time time = new Time(11, 6, 1);
        double result = time.getConversionResult();
        assertEquals(525955.924893494, result, DELTA);
    }
    @Test
    public void testYearToMinute2(){
        Time time = new Time(11, 6, 1000);
        double result = time.getConversionResult();
        assertEquals(5.2595592489349395E8, result, DELTA);
    }
    @Test
    public void testYearToHour1(){
        Time time = new Time(11, 7, 1);
        double result = time.getConversionResult();
        assertEquals(8766, result, DELTA);
    }
    @Test
    public void testYearToHour2(){
        Time time = new Time(11, 7, 1000);
        double result = time.getConversionResult();
        assertEquals(8766001.239512574, result, DELTA);
    }
    @Test
    public void testYearToDay1(){
        Time time = new Time(11, 8, 1);
        double result = time.getConversionResult();
        assertEquals(365.25, result, DELTA);
    }
    @Test
    public void testYearToDay2(){
        Time time = new Time(11, 8, 1000);
        double result = time.getConversionResult();
        assertEquals(365250, result, DELTA);
    }
    @Test
    public void testYearToWeek1(){
        Time time = new Time(11, 9, 1);
        double result = time.getConversionResult();
        assertEquals(52.178571429, result, DELTA);
    }
    @Test
    public void testYearToWeek2(){
        Time time = new Time(11, 9, 1000);
        double result = time.getConversionResult();
        assertEquals(52178.571429, result, DELTA);
    }
    @Test
    public void testYearToMonth1(){
        Time time = new Time(11, 10, 1);
        double result = time.getConversionResult();
        assertEquals(12, result, DELTA);
    }
    @Test
    public void testYearToMonth2(){
        Time time = new Time(11, 10, 1000);
        double result = time.getConversionResult();
        assertEquals(12000, result, DELTA);
    }


}