package com.spookyNullPointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    private static final double DELTA = 1;

    //Meter To .... Tests
    @Test
    public void testMeterToKilometer1(){
        Length length = new Length(1, 2, 1);
        double result = length.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMeterToKilometer2(){
        Length length = new Length(1, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(1, result, DELTA);
    }

    @Test
    public void testMeterToCentimeter1(){
        Length length = new Length(1, 3, 1);
        double result = length.getConversionResult();
        assertEquals(100, result, DELTA);
    }
    @Test
    public void testMeterToCentimeter2(){
        Length length = new Length(1, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(100000, result, DELTA);
    }
    @Test
    public void testMeterToMillimeter1(){
        Length length = new Length(1, 4, 1);
        double result = length.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testMeterToMillimeter2(){
        Length length = new Length(1, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }

    @Test
    public void testMeterToMicrometer1(){
        Length length = new Length(1, 5, 1);
        double result = length.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }

    @Test
    public void testMeterToMicrometer2(){
        Length length = new Length(1, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }

    @Test
    public void testMeterToNanometer1(){
        Length length = new Length(1, 6, 1);
        double result = length.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }

    @Test
    public void testMeterToNanometer2(){
        Length length = new Length(1, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000000000.0, result, DELTA);
    }

    @Test
    public void testMeterToMile1(){
        Length length = new Length(1, 7, 1);
        double result = length.getConversionResult();
        assertEquals(0.0006213689, result, DELTA);
    }

    @Test
    public void testMeterToMile2(){
        Length length = new Length(1, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(0.6213689, result, DELTA);
    }

    @Test
    public void testMeterToYard1(){
        Length length = new Length(1, 8, 1);
        double result = length.getConversionResult();
        assertEquals(1.0936132983, result, DELTA);
    }

    @Test
    public void testMeterToYard2(){
        Length length = new Length(1, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(1093.6132983, result, DELTA);
    }

    @Test
    public void testMeterToFoot1(){
        Length length = new Length(1, 9, 1);
        double result = length.getConversionResult();
        assertEquals(3.280839895, result, DELTA);
    }

    @Test
    public void testMeterToFoot2(){
        Length length = new Length(1, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(3280.839895, result, DELTA);
    }

    @Test
    public void testMeterToInch1(){
        Length length = new Length(1, 10, 1);
        double result = length.getConversionResult();
        assertEquals(39.37007874, result, DELTA);
    }

    @Test
    public void testMeterToInch2(){
        Length length = new Length(1, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(39370.07874, result, DELTA);
    }

    @Test
    public void testMeterToLightYear1(){
        Length length = new Length(1, 11, 1);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-16, result, DELTA);
    }

    @Test
    public void testMeterToLightYear2(){
        Length length = new Length(1, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-13, result, DELTA);
    }

    //KiloMeter To ... Tests
    @Test
    public void testKilometerToMeter1(){
        Length length = new Length(2, 1, 1);
        double result = length.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testKilometerToMeter2(){
        Length length = new Length(2, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testKilometerToCentimeter1(){
        Length length = new Length(2, 3, 1);
        double result = length.getConversionResult();
        assertEquals(100000, result, DELTA);
    }
    @Test
    public void testKilometerToCentimeter2(){
        Length length = new Length(2, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(100000000, result, DELTA);
    }
    @Test
    public void testKilometerToMillimeter1(){
        Length length = new Length(2, 4, 1);
        double result = length.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testKilometerToMillimeter2(){
        Length length = new Length(2, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testKilometerToMicrometer1(){
        Length length = new Length(2, 5, 1);
        double result = length.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testKilometerToMicrometer2(){
        Length length = new Length(2, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000000000.0, result, DELTA);
    }
    @Test
    public void testKilometerToNanometer1(){
        Length length = new Length(2, 6, 1);
        double result = length.getConversionResult();
        assertEquals(1000000000000.0, result, DELTA);
    }
    @Test
    public void testKilometerToNanometer2(){
        Length length = new Length(2, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000000000000.0, result, DELTA);
    }
    @Test
    public void testKilometerToMile1(){
        Length length = new Length(2, 7, 1);
        double result = length.getConversionResult();
        assertEquals(0.6213688756, result, DELTA);
    }
    @Test
    public void testKilometerToMile2(){
        Length length = new Length(2, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(621.36887563, result, DELTA);
    }
    @Test
    public void testKilometerToYard1(){
        Length length = new Length(2, 8, 1);
        double result = length.getConversionResult();
        assertEquals(1093.6132983, result, DELTA);
    }
    @Test
    public void testKilometerToYard2(){
        Length length = new Length(2, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(1093613.2983, result, DELTA);
    }
    @Test
    public void testKilometerToFoot1(){
        Length length = new Length(2, 9, 1);
        double result = length.getConversionResult();
        assertEquals(3280.839895, result, DELTA);
    }
    @Test
    public void testKilometerToFoot2(){
        Length length = new Length(2, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(3280839.895, result, DELTA);
    }
    @Test
    public void testKilometerToInch1(){
        Length length = new Length(2, 10, 1);
        double result = length.getConversionResult();
        assertEquals(39370.07874, result, DELTA);
    }
    @Test
    public void testKilometerToInch2(){
        Length length = new Length(2, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(39370078.7439, result, DELTA);
    }
    @Test
    public void testKilometerToLightYear1(){
        Length length = new Length(2, 11, 1);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-13, result, DELTA);
    }
    @Test
    public void testKilometerToLightYear2(){
        Length length = new Length(2, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-10, result, DELTA);
    }

    //Centimeter To ... Tests
    @Test
    public void testCentimeterToMeter1(){
        Length length = new Length(3, 1, 1);
        double result = length.getConversionResult();
        assertEquals(0.01, result, DELTA);
    }
    @Test
    public void testCentimeterToMeter2(){
        Length length = new Length(3, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(10, result, DELTA);
    }
    @Test
    public void testCentimeterToKilometer1(){
        Length length = new Length(3, 2, 1);
        double result = length.getConversionResult();
        assertEquals(0.00001, result, DELTA);
    }
    @Test
    public void testCentimeterToKilometer2(){
        Length length = new Length(3, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(0.01, result, DELTA);
    }
    @Test
    public void testCentimeterToMillimeter1(){
        Length length = new Length(3, 4, 1);
        double result = length.getConversionResult();
        assertEquals(10, result, DELTA);
    }
    @Test
    public void testCentimeterToMillimeter2(){
        Length length = new Length(3, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(10000, result, DELTA);
    }
    @Test
    public void testCentimeterToMicrometer1(){
        Length length = new Length(3, 5, 1);
        double result = length.getConversionResult();
        assertEquals(10000, result, DELTA);
    }
    @Test
    public void testCentimeterToMicrometer2(){
        Length length = new Length(3, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(10000000, result, DELTA);
    }
    @Test
    public void testCentimeterToNanometer1(){
        Length length = new Length(3, 6, 1);
        double result = length.getConversionResult();
        assertEquals(10000000, result, DELTA);
    }
    @Test
    public void testCentimeterToNanometer2(){
        Length length = new Length(3, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(10000000000.0, result, DELTA);
    }
    @Test
    public void testCentimeterToMile1(){
        Length length = new Length(3, 7, 1);
        double result = length.getConversionResult();
        assertEquals(0.0000062137, result, DELTA);
    }
    @Test
    public void testCentimeterToMile2(){
        Length length = new Length(3, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0062136888, result, DELTA);
    }
    @Test
    public void testCentimeterToYard1(){
        Length length = new Length(3, 8, 1);
        double result = length.getConversionResult();
        assertEquals(0.010936133, result, DELTA);
    }
    @Test
    public void testCentimeterToYard2(){
        Length length = new Length(3, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(10.936132983, result, DELTA);
    }
    @Test
    public void testCentimeterToFoot1(){
        Length length = new Length(3, 9, 1);
        double result = length.getConversionResult();
        assertEquals(0.032808399, result, DELTA);
    }
    @Test
    public void testCentimeterToFoot2(){
        Length length = new Length(3, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(32.80839895, result, DELTA);
    }
    @Test
    public void testCentimeterToInch1(){
        Length length = new Length(3, 10, 1);
        double result = length.getConversionResult();
        assertEquals(0.3937007874, result, DELTA);
    }
    @Test
    public void testCentimeterToInch2(){
        Length length = new Length(3, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(393.7007874, result, DELTA);
    }
    @Test
    public void testCentimeterToLightYear1(){
        Length length = new Length(3, 11, 1);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-18, result, DELTA);
    }
    @Test
    public void testCentimeterToLightYear2(){
        Length length = new Length(3, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-15, result, DELTA);
    }

    //Millimeter To ... Tests

    @Test
    public void testMillimeterToMeter1(){
        Length length = new Length(4, 1, 1);
        double result = length.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMillimeterToMeter2(){
        Length length = new Length(4, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testMillimeterToKilometer1(){
        Length length = new Length(4, 2, 1);
        double result = length.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testMillimeterToKilometer2(){
        Length length = new Length(4, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMillimeterToCentimeter1(){
        Length length = new Length(4, 3, 1);
        double result = length.getConversionResult();
        assertEquals(0.1, result, DELTA);
    }
    @Test
    public void testMillimeterToCentimeter2(){
        Length length = new Length(4, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(100, result, DELTA);
    }
    @Test
    public void testMillimeterToMicrometer1(){
        Length length = new Length(4, 5, 1);
        double result = length.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testMillimeterToMicrometer2(){
        Length length = new Length(4, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMillimeterToNanometer1(){
        Length length = new Length(4, 6, 1);
        double result = length.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMillimeterToNanometer2(){
        Length length = new Length(4, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testMillimeterToMile1(){
        Length length = new Length(4, 7, 1);
        double result = length.getConversionResult();
        assertEquals(6.213688756E-7, result, DELTA);
    }
    @Test
    public void testMillimeterToMile2(){
        Length length = new Length(4, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0006213689, result, DELTA);
    }
    @Test
    public void testMillimeterToYard1(){
        Length length = new Length(4, 8, 1);
        double result = length.getConversionResult();
        assertEquals(0.0010936133, result, DELTA);
    }
    @Test
    public void testMillimeterToYard2(){
        Length length = new Length(4, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(1.0936132983, result, DELTA);
    }
    @Test
    public void testMillimeterToFoot1(){
        Length length = new Length(4, 9, 1);
        double result = length.getConversionResult();
        assertEquals(0.0032808399, result, DELTA);
    }
    @Test
    public void testMillimeterToFoot2(){
        Length length = new Length(4, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(3.280839895, result, DELTA);
    }
    @Test
    public void testMillimeterToInch1(){
        Length length = new Length(4, 10, 1);
        double result = length.getConversionResult();
        assertEquals(0.0393700787, result, DELTA);
    }
    @Test
    public void testMillimeterToInch2(){
        Length length = new Length(4, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(39.37007874, result, DELTA);
    }
    @Test
    public void testMillimeterToLightYear1(){
        Length length = new Length(4, 11, 1);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-19, result, DELTA);
    }
    @Test
    public void testMillimeterToLightYear2(){
        Length length = new Length(4, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-16, result, DELTA);
    }

    //Micrometer To ... Test

    @Test
    public void testMicrometerToMeter1(){
        Length length = new Length(5, 1, 1);
        double result = length.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testMicrometerToMeter2(){
        Length length = new Length(5, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMicrometerToKilometer1(){
        Length length = new Length(5, 2, 1);
        double result = length.getConversionResult();
        assertEquals(9.999999999E-10, result, DELTA);
    }
    @Test
    public void testMicrometerToKilometer2(){
        Length length = new Length(5, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testMicrometerToCentimeter1(){
        Length length = new Length(5, 3, 1);
        double result = length.getConversionResult();
        assertEquals(0.0001, result, DELTA);
    }
    @Test
    public void testMicrometerToCentimeter2(){
        Length length = new Length(5, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(0.1, result, DELTA);
    }
    @Test
    public void testMicrometerToMillimeter1(){
        Length length = new Length(5, 4, 1);
        double result = length.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMicrometerToMillimeter2(){
        Length length = new Length(5, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testMicrometerToNanometer1(){
        Length length = new Length(5, 6, 1);
        double result = length.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testMicrometerToNanometer2(){
        Length length = new Length(5, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMicrometerToMile1(){
        Length length = new Length(5, 7, 1);
        double result = length.getConversionResult();
        assertEquals(6.213688756E-10, result, DELTA);
    }
    @Test
    public void testMicrometerToMile2(){
        Length length = new Length(5, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(6.213688756E-7, result, DELTA);
    }
    @Test
    public void testMicrometerToYard1(){
        Length length = new Length(5, 8, 1);
        double result = length.getConversionResult();
        assertEquals(0.0000010936, result, DELTA);
    }
    @Test
    public void testMicrometerToYard2(){
        Length length = new Length(5, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0010936133, result, DELTA);
    }
    @Test
    public void testMicrometerToFoot1(){
        Length length = new Length(5, 9, 1);
        double result = length.getConversionResult();
        assertEquals(0.0000032808, result, DELTA);
    }
    @Test
    public void testMicrometerToFoot2(){
        Length length = new Length(5, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0032808399, result, DELTA);
    }
    @Test
    public void testMicrometerToInch1(){
        Length length = new Length(5, 10, 1);
        double result = length.getConversionResult();
        assertEquals(0.0000393701, result, DELTA);
    }
    @Test
    public void testMicrometerToInch2(){
        Length length = new Length(5, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0393700787, result, DELTA);
    }
    @Test
    public void testMicrometerToLightYear1(){
        Length length = new Length(5, 11, 1);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-22, result, DELTA);
    }
    @Test
    public void testMicrometerToLightYear2(){
        Length length = new Length(5, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-19, result, DELTA);
    }

    //Nanometer To ... Test

    @Test
    public void testNanometerToMeter1(){
        Length length = new Length(6, 1, 1);
        double result = length.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testNanometerToMeter2(){
        Length length = new Length(6, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testNanometerToKilometer1(){
        Length length = new Length(6, 2, 1);
        double result = length.getConversionResult();
        assertEquals(1.E-12, result, DELTA);
    }
    @Test
    public void testNanometerToKilometer2(){
        Length length = new Length(6, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testNanometerToCentimeter1(){
        Length length = new Length(6, 3, 1);
        double result = length.getConversionResult();
        assertEquals(1.E-7, result, DELTA);
    }
    @Test
    public void testNanometerToCentimeter2(){
        Length length = new Length(6, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0001, result, DELTA);
    }
    @Test
    public void testNanometerToMillimeter1(){
        Length length = new Length(6, 4, 1);
        double result = length.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testNanometerToMillimeter2(){
        Length length = new Length(6, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testNanometerToMicrometer1(){
        Length length = new Length(6, 5, 1);
        double result = length.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testNanometerToMicrometer2(){
        Length length = new Length(6, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testNanometerToMile1(){
        Length length = new Length(6, 7, 1);
        double result = length.getConversionResult();
        assertEquals(6.213688756E-13, result, DELTA);
    }
    @Test
    public void testNanometerToMile2(){
        Length length = new Length(6, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(6.213688756E-10, result, DELTA);
    }
    @Test
    public void testNanometerToYard1(){
        Length length = new Length(6, 8, 1);
        double result = length.getConversionResult();
        assertEquals(1.093613298E-9, result, DELTA);
    }
    @Test
    public void testNanometerToYard2(){
        Length length = new Length(6, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0000010936, result, DELTA);
    }
    @Test
    public void testNanometerToFoot1(){
        Length length = new Length(6, 9, 1);
        double result = length.getConversionResult();
        assertEquals(3.280839895E-9, result, DELTA);
    }
    @Test
    public void testNanometerToFoot2(){
        Length length = new Length(6, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0000032808, result, DELTA);
    }
    @Test
    public void testNanometerToInch1(){
        Length length = new Length(6, 10, 1);
        double result = length.getConversionResult();
        assertEquals(3.937007874E-8, result, DELTA);
    }
    @Test
    public void testNanometerToInch2(){
        Length length = new Length(6, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0000393701, result, DELTA);
    }
    @Test
    public void testNanometerToLightYear1(){
        Length length = new Length(6, 11, 1);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-25, result, DELTA);
    }
    @Test
    public void testNanometerToLightYear2(){
        Length length = new Length(6, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(1.057008707E-22, result, DELTA);
    }

    //Mile To ... Test

    @Test
    public void testMileToMeter1(){
        Length length = new Length(7, 1, 1);
        double result = length.getConversionResult();
        assertEquals(1609.35, result, DELTA);
    }
    @Test
    public void testMileToMeter2(){
        Length length = new Length(7, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(1609350, result, DELTA);
    }
    @Test
    public void testMileToKilometer1(){
        Length length = new Length(7, 2, 1);
        double result = length.getConversionResult();
        assertEquals(1.60935, result, DELTA);
    }
    @Test
    public void testMileToKilometer2(){
        Length length = new Length(7, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(1609.35, result, DELTA);
    }
    @Test
    public void testMileToCentimeter1(){
        Length length = new Length(7, 3, 1);
        double result = length.getConversionResult();
        assertEquals(160935, result, DELTA);
    }
    @Test
    public void testMileToCentimeter2(){
        Length length = new Length(7, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(1.6093470878864443E8, result, DELTA);
    }
    @Test
    public void testMileToMillimeter1(){
        Length length = new Length(7, 4, 1);
        double result = length.getConversionResult();
        assertEquals(1609350, result, DELTA);
    }
    @Test
    public void testMileToMillimeter2(){
        Length length = new Length(7, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(1609350000, result, DELTA);
    }
    @Test
    public void testMileToMicrometer1(){
        Length length = new Length(7, 5, 1);
        double result = length.getConversionResult();
        assertEquals(1609350000, result, DELTA);
    }
    @Test
    public void testMileToMicrometer2(){
        Length length = new Length(7, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(1.609350000085521E12, result, DELTA);
    }
    @Test
    public void testMileToNanometer1(){
        Length length = new Length(7, 6, 1);
        double result = length.getConversionResult();
        assertEquals(1.6093500000855208E12, result, DELTA);
    }
    @Test
    public void testMileToNanoneter2(){
        Length length = new Length(7, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(1.6093500000855208E15, result, DELTA);
    }
    @Test
    public void testMileToYard1(){
        Length length = new Length(7, 8, 1);
        double result = length.getConversionResult();
        assertEquals(1760.0065617, result, DELTA);
    }
    @Test
    public void testMileToYard2(){
        Length length = new Length(7, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(1760006.5617, result, DELTA);
    }
    @Test
    public void testMileToFoot1(){
        Length length = new Length(7, 9, 1);
        double result = length.getConversionResult();
        assertEquals(5280.019685, result, DELTA);
    }
    @Test
    public void testMileToFoot2(){
        Length length = new Length(7, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(5280019.685, result, DELTA);
    }
    @Test
    public void testMileToInch1(){
        Length length = new Length(7, 10, 1);
        double result = length.getConversionResult();
        assertEquals(63360.23622, result, DELTA);
    }
    @Test
    public void testMileToInch2(){
        Length length = new Length(7, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(63360236.22, result, DELTA);
    }
    @Test
    public void testMileToLightYear1(){
        Length length = new Length(7, 11, 1);
        double result = length.getConversionResult();
        assertEquals(1.701096963E-13, result, DELTA);
    }
    @Test
    public void testMileToLightYear2(){
        Length length = new Length(7, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(1.701096963E-10, result, DELTA);
    }
    @Test
    public void testYardToMeter1(){
        Length length = new Length(8, 1, 1);
        double result = length.getConversionResult();
        assertEquals(0.9144, result, DELTA);
    }
    @Test
    public void testYardToMeter2(){
        Length length = new Length(8, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(914.4, result, DELTA);
    }
    @Test
    public void testYardToKilometer1(){
        Length length = new Length(8, 2, 1);
        double result = length.getConversionResult();
        assertEquals(0.0009144, result, DELTA);
    }
    @Test
    public void testYardToKilometer2(){
        Length length = new Length(8, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(0.9144, result, DELTA);
    }
    @Test
    public void testYardToCentimeter1(){
        Length length = new Length(8, 3, 1);
        double result = length.getConversionResult();
        assertEquals(91.44, result, DELTA);
    }
    @Test
    public void testYardToCentimeter2(){
        Length length = new Length(8, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(91440, result, DELTA);
    }
    @Test
    public void testYardToMillimeter1(){
        Length length = new Length(8, 4, 1);
        double result = length.getConversionResult();
        assertEquals(914.4, result, DELTA);
    }
    @Test
    public void testYardToMillimeter2(){
        Length length = new Length(8, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(914400, result, DELTA);
    }
    @Test
    public void testYardToMicrometer1(){
        Length length = new Length(8, 5, 1);
        double result = length.getConversionResult();
        assertEquals(914411.1192392099, result, DELTA);
    }
    @Test
    public void testYardToMicrometer2(){
        Length length = new Length(8, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(9.144111192392099E8, result, DELTA);
    }
    @Test
    public void testYardToNanometer1(){
        Length length = new Length(8, 6, 1);
        double result = length.getConversionResult();
        assertEquals(914400000, result, DELTA);
    }
    @Test
    public void testYardToNanometer2(){
        Length length = new Length(8, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(9.144000002823667E11, result, DELTA);
    }
    @Test
    public void testYardToMile1(){
        Length length = new Length(8, 7, 1);
        double result = length.getConversionResult();
        assertEquals(0.0005681797, result, DELTA);
    }
    @Test
    public void testYardToMile2(){
        Length length = new Length(8, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(0.5681796999, result, DELTA);
    }
    @Test
    public void testYardToFoot1(){
        Length length = new Length(8, 9, 1);
        double result = length.getConversionResult();
        assertEquals(3, result, DELTA);
    }
    @Test
    public void testYardToFoot2(){
        Length length = new Length(8, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(3000, result, DELTA);
    }
    @Test
    public void testYardToInch1(){
        Length length = new Length(8, 10, 1);
        double result = length.getConversionResult();
        assertEquals(36, result, DELTA);
    }
    @Test
    public void testYardToInch2(){
        Length length = new Length(8, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(36000, result, DELTA);
    }
    @Test
    public void testYardToLightYear1(){
        Length length = new Length(8, 11, 1);
        double result = length.getConversionResult();
        assertEquals(9.665287622E-17, result, DELTA);
    }
    @Test
    public void testYardToLightYear2(){
        Length length = new Length(8, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(9.665287622E-14, result, DELTA);
    }
    //Foot to ... Test
    @Test
    public void testFootToMeter1(){
        Length length = new Length(9, 1, 1);
        double result = length.getConversionResult();
        assertEquals(0.3048, result, DELTA);
    }
    @Test
    public void testFootToMeter2(){
        Length length = new Length(9, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(304.8, result, DELTA);
    }
    @Test
    public void testFootToKilometer1(){
        Length length = new Length(9, 2, 1);
        double result = length.getConversionResult();
        assertEquals(0.0003048, result, DELTA);
    }
    @Test
    public void testFootToKilometer2(){
        Length length = new Length(9, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(0.3048, result, DELTA);
    }
    @Test
    public void testFootToCentimeter1(){
        Length length = new Length(9, 3, 1);
        double result = length.getConversionResult();
        assertEquals(30.48, result, DELTA);
    }
    @Test
    public void testFootToCentimeter2(){
        Length length = new Length(9, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(30480, result, DELTA);
    }
    @Test
    public void testFootToMillimeter1(){
        Length length = new Length(9, 4, 1);
        double result = length.getConversionResult();
        assertEquals(304.8, result, DELTA);
    }
    @Test
    public void testFootToMillimeter2(){
        Length length = new Length(9, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(304800, result, DELTA);
    }
    @Test
    public void testFootToMicrometer1(){
        Length length = new Length(9, 5, 1);
        double result = length.getConversionResult();
        assertEquals(304803.70641307, result, DELTA);
    }
    @Test
    public void testFootToMicrometer2(){
        Length length = new Length(9, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(3.0480370641306996E8, result, DELTA);
    }
    @Test
    public void testFootToNanometer1(){
        Length length = new Length(9, 6, 1);
        double result = length.getConversionResult();
        assertEquals(304800000, result, DELTA);
    }
    @Test
    public void testFootToNanometer2(){
        Length length = new Length(9, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(3.048000000012192E11, result, DELTA);
    }
    @Test
    public void testFootToMile1(){
        Length length = new Length(9, 7, 1);
        double result = length.getConversionResult();
        assertEquals(0.0001893932, result, DELTA);
    }
    @Test
    public void testFootToMile2(){
        Length length = new Length(9, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(0.1893932333, result, DELTA);
    }
    @Test
    public void testFootToYard1(){
        Length length = new Length(9, 8, 1);
        double result = length.getConversionResult();
        assertEquals(0.3333333333, result, DELTA);
    }
    @Test
    public void testFootToYard2(){
        Length length = new Length(9, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(333.33333333, result, DELTA);
    }
    @Test
    public void testFootToInch1(){
        Length length = new Length(9, 10, 1);
        double result = length.getConversionResult();
        assertEquals(12, result, DELTA);
    }
    @Test
    public void testFootToInch2(){
        Length length = new Length(9, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(12000, result, DELTA);
    }
    @Test
    public void testFootToLightYear1(){
        Length length = new Length(9, 11, 1);
        double result = length.getConversionResult();
        assertEquals(3.22176254E-17, result, DELTA);
    }
    @Test
    public void testFootToLightYear2(){
        Length length = new Length(9, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(3.22176254E-14, result, DELTA);
    }
    //Inch To ... Test
    @Test
    public void testInchToMeter1(){
        Length length = new Length(10, 1, 1);
        double result = length.getConversionResult();
        assertEquals(0.0254, result, DELTA);
    }
    @Test
    public void testInchToMeter2(){
        Length length = new Length(10, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(25.4, result, DELTA);
    }
    @Test
    public void testInchToKilometer1(){
        Length length = new Length(10, 2, 1);
        double result = length.getConversionResult();
        assertEquals(0.0000254, result, DELTA);
    }
    @Test
    public void testInchToKilometer2(){
        Length length = new Length(10, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0254, result, DELTA);
    }
    @Test
    public void testInchToCentimeter1(){
        Length length = new Length(10, 3, 1);
        double result = length.getConversionResult();
        assertEquals(2.54, result, DELTA);
    }
    @Test
    public void testInchToCentimeter2(){
        Length length = new Length(10, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(2540, result, DELTA);
    }
    @Test
    public void testInchToMillimeter1(){
        Length length = new Length(10, 4, 1);
        double result = length.getConversionResult();
        assertEquals(25.4, result, DELTA);
    }
    @Test
    public void testInchToMillimeter2(){
        Length length = new Length(10, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(25400, result, DELTA);
    }
    @Test
    public void testInchToMicrometer1(){
        Length length = new Length(10, 5, 1);
        double result = length.getConversionResult();
        assertEquals(25400, result, DELTA);
    }
    @Test
    public void testInchToMicrometer2(){
        Length length = new Length(10, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(2.5399986284007408E7, result, DELTA);
    }
    @Test
    public void testInchToNanometer1(){
        Length length = new Length(10, 6, 1);
        double result = length.getConversionResult();
        assertEquals(25400000, result, DELTA);
    }
    @Test
    public void testInchToNanometer2(){
        Length length = new Length(10, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(25400000000.0, result, DELTA);
    }
    @Test
    public void testInchToMile1(){
        Length length = new Length(10, 7, 1);
        double result = length.getConversionResult();
        assertEquals(0.0000157828, result, DELTA);
    }
    @Test
    public void testInchToMile2(){
        Length length = new Length(10, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(0.0157827694, result, DELTA);
    }
    @Test
    public void testInchToYard1(){
        Length length = new Length(10, 8, 1);
        double result = length.getConversionResult();
        assertEquals(0.0277777778, result, DELTA);
    }
    @Test
    public void testInchToYard2(){
        Length length = new Length(10, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(27.777777778, result, DELTA);
    }
    @Test
    public void testInchToFoot1(){
        Length length = new Length(10, 9, 1);
        double result = length.getConversionResult();
        assertEquals(0.0833333333, result, DELTA);
    }
    @Test
    public void testInchToFoot2(){
        Length length = new Length(10, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(83.333333333, result, DELTA);
    }
    @Test
    public void testInchToLightYear1(){
        Length length = new Length(10, 11, 1);
        double result = length.getConversionResult();
        assertEquals(2.684802117E-18, result, DELTA);
    }
    @Test
    public void testInchToLightYear2(){
        Length length = new Length(10, 11, 1000);
        double result = length.getConversionResult();
        assertEquals(2.684802117E-15, result, DELTA);
    }

    //LightYear To ... Test
    @Test
    public void testLightYearToMeter1(){
        Length length = new Length(11, 1, 1);
        double result = length.getConversionResult();
        assertEquals(9.460660005707976E15, result, DELTA);
    }
    @Test
    public void testLightYearToMeter2(){
        Length length = new Length(11, 1, 1000);
        double result = length.getConversionResult();
        assertEquals(9.460660005707975E18, result, DELTA);
    }
    @Test
    public void testLightYearToKilometer1(){
        Length length = new Length(11, 2, 1);
        double result = length.getConversionResult();
        assertEquals(9.460660005707975E12, result, DELTA);
    }
    @Test
    public void testLightYearToKilometer2(){
        Length length = new Length(11, 2, 1000);
        double result = length.getConversionResult();
        assertEquals(9.460660005707976E15, result, DELTA);
    }
    @Test
    public void testLightYearToCentimeter1(){
        Length length = new Length(11, 3, 1);
        double result = length.getConversionResult();
        assertEquals(9.4606600057079757E17, result, DELTA);
    }
    @Test
    public void testLightYearToCentimeter2(){
        Length length = new Length(11, 3, 1000);
        double result = length.getConversionResult();
        assertEquals(9.460660005707975E20, result, DELTA);
    }
    @Test
    public void testLightYearToMillimeter1(){
        Length length = new Length(11, 4, 1);
        double result = length.getConversionResult();
        assertEquals(9.460660005707977E18, result, DELTA);
    }
    @Test
    public void testLightYearToMillimeter2(){
        Length length = new Length(11, 4, 1000);
        double result = length.getConversionResult();
        assertEquals(9.460660005707977E21, result, DELTA);
    }
    @Test
    public void testLightYearToMicrometer1(){
        Length length = new Length(11, 5, 1);
        double result = length.getConversionResult();
        assertEquals(9.460660005707977E21, result, DELTA);
    }
    @Test
    public void testLightYearToMicrometer2(){
        Length length = new Length(11, 5, 1000);
        double result = length.getConversionResult();
        assertEquals(9.460660005707976E24, result, DELTA);
    }
    @Test
    public void testLightYearToNanometer1(){
        Length length = new Length(11, 6, 1);
        double result = length.getConversionResult();
        assertEquals(9.460660005707976E24, result, DELTA);
    }
    @Test
    public void testLightYearToNanometer2(){
        Length length = new Length(11, 6, 1000);
        double result = length.getConversionResult();
        assertEquals(9.460660005707977E27, result, DELTA);
    }
    @Test
    public void testLightYearToMile1(){
        Length length = new Length(11, 7, 1);
        double result = length.getConversionResult();
        assertEquals(5.878559669146855E12, result, DELTA);
    }
    @Test
    public void testLightYearToMile2(){
        Length length = new Length(11, 7, 1000);
        double result = length.getConversionResult();
        assertEquals(5.878559669146855E15, result, DELTA);
    }
    @Test
    public void testLightYearToYard1(){
        Length length = new Length(11, 8, 1);
        double result = length.getConversionResult();
        assertEquals(1.0346303587736108E16, result, DELTA);
    }
    @Test
    public void testLightYearToYard2(){
        Length length = new Length(11, 8, 1000);
        double result = length.getConversionResult();
        assertEquals(1.0346303587736107E19, result, DELTA);
    }
    @Test
    public void testLightYearToFoot1(){
        Length length = new Length(11, 9, 1);
        double result = length.getConversionResult();
        assertEquals(3.1038910769631084E16, result, DELTA);
    }
    @Test
    public void testLightYearToFoot2(){
        Length length = new Length(11, 9, 1000);
        double result = length.getConversionResult();
        assertEquals(3.1038910769631085E19, result, DELTA);
    }
    @Test
    public void testLightYearToInch1(){
        Length length = new Length(11, 10, 1);
        double result = length.getConversionResult();
        assertEquals(3.7246692918932915E17, result, DELTA);
    }
    @Test
    public void testLightYearToInch2(){
        Length length = new Length(11, 10, 1000);
        double result = length.getConversionResult();
        assertEquals(3.724669291893292E20, result, DELTA);
    }


}