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

}