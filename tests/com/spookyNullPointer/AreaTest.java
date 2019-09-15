package com.spookyNullPointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreaTest {

    private static final double DELTA = 1;

    //Square Meter To .... Tests
    @Test
    public void testSqMeterToSqKilometer1(){
        Area area = new Area(1, 2, 1);
        double result = area.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testSqMeterToSqKilometer2(){
        Area area = new Area(1, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testSqMeterToSqCentimeter1(){
        Area area = new Area(1, 3, 1);
        double result = area.getConversionResult();
        assertEquals(10000, result, DELTA);
    }
    @Test
    public void testSqMeterToSqCentimeter2(){
        Area area = new Area(1, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(10000000, result, DELTA);
    }
    @Test
    public void testSqMeterToSqMillimeter1(){
        Area area = new Area(1, 4, 1);
        double result = area.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testSqMeterToSqMillimeter2(){
        Area area = new Area(1, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testSqMeterToSqMicrometer1(){
        Area area = new Area(1, 5, 1);
        double result = area.getConversionResult();
        assertEquals(1000000000000D, result, DELTA);
    }
    @Test
    public void testSqMeterToSqMicrometer2(){
        Area area = new Area(1, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(1000000000000000D, result, DELTA);
    }
    @Test
    public void testSqMeterToHectare1(){
        Area area = new Area(1, 6, 1);
        double result = area.getConversionResult();
        assertEquals(0.0001, result, DELTA);
    }
    @Test
    public void testSqMeterToHectare2(){
        Area area = new Area(1, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(0.1, result, DELTA);
    }
    @Test
    public void testSqMeterToSqMile1(){
        Area area = new Area(1, 7, 1);
        double result = area.getConversionResult();
        assertEquals(3.861018768E-7, result, DELTA);
    }
    @Test
    public void testSqMeterToSqMile2(){
        Area area = new Area(1, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(0.0003861019, result, DELTA);
    }
    @Test
    public void testSqMeterToSqYard1(){
        Area area = new Area(1, 8, 1);
        double result = area.getConversionResult();
        assertEquals(1.1959900463, result, DELTA);
    }
    @Test
    public void testSqMeterToSqYard2(){
        Area area = new Area(1, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(1195.9900463, result, DELTA);
    }
    @Test
    public void testSqMeterToSqFoot1(){
        Area area = new Area(1, 9, 1);
        double result = area.getConversionResult();
        assertEquals(10.763910417, result, DELTA);
    }
    @Test
    public void testSqMeterToSqFoot2(){
        Area area = new Area(1, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(10763.910417, result, DELTA);
    }
    @Test
    public void testSqMeterToSqInch1(){
        Area area = new Area(1, 10, 1);
        double result = area.getConversionResult();
        assertEquals(1550.0031, result, DELTA);
    }
    @Test
    public void testSqMeterToSqInch2(){
        Area area = new Area(1, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(1550003.1, result, DELTA);
    }
    @Test
    public void testSqMeterToAcre1(){
        Area area = new Area(1, 11, 1);
        double result = area.getConversionResult();
        assertEquals(0.0002471054, result, DELTA);
    }
    @Test
    public void testSqMeterToAcre2(){
        Area area = new Area(1, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(0.2471053815, result, DELTA);
    }

    //Square Kilometer To .... Tests
    @Test
    public void testSqKilometerToSqMeter1(){
        Area area = new Area(2, 1, 1);
        double result = area.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqMeter2(){
        Area area = new Area(2, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqCentimeter1(){
        Area area = new Area(2, 3, 1);
        double result = area.getConversionResult();
        assertEquals(10000000000D, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqCentimeter2(){
        Area area = new Area(2, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(10000000000000D, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqMillimeter1(){
        Area area = new Area(2, 4, 1);
        double result = area.getConversionResult();
        assertEquals(1000000000000D, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqMillimeter2(){
        Area area = new Area(2, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(1000000000000000D, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqMicrometer1(){
        Area area = new Area(2, 5, 1);
        double result = area.getConversionResult();
        assertEquals(1000000000000000000D, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqMicrometer2(){
        Area area = new Area(2, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(1.E+21, result, DELTA);
    }
    @Test
    public void testSqKilometerToHectare1(){
        Area area = new Area(2, 6, 1);
        double result = area.getConversionResult();
        assertEquals(100, result, DELTA);
    }
    @Test
    public void testSqKilometerToHectare2(){
        Area area = new Area(2, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(100000, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqMile1(){
        Area area = new Area(2, 7, 1);
        double result = area.getConversionResult();
        assertEquals(0.3861018768, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqMile2(){
        Area area = new Area(2, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(386.10187684, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqYard1(){
        Area area = new Area(2, 8, 1);
        double result = area.getConversionResult();
        assertEquals(1195990.0463, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqYard2(){
        Area area = new Area(2, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(1195990046.3, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqFoot1(){
        Area area = new Area(2, 9, 1);
        double result = area.getConversionResult();
        assertEquals(10763910.417, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqFoot2(){
        Area area = new Area(2, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(10763910417D, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqInch1(){
        Area area = new Area(2, 10, 1);
        double result = area.getConversionResult();
        assertEquals(1550003100, result, DELTA);
    }
    @Test
    public void testSqKilometerToSqInch2(){
        Area area = new Area(2, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(1.5500031E12, result, DELTA);
    }
    @Test
    public void testSqKilometerToAcre1(){
        Area area = new Area(2, 11, 1);
        double result = area.getConversionResult();
        assertEquals(247.10538147, result, DELTA);
    }
    @Test
    public void testSqKilometerToAcre2(){
        Area area = new Area(2, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(247105.38147, result, DELTA);
    }

    //Square Centimeter To .... Tests
    @Test
    public void testSqCentimeterToSqMeter1(){
        Area area = new Area(3, 1, 1);
        double result = area.getConversionResult();
        assertEquals(0.0001, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqMeter2(){
        Area area = new Area(3, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(0.1, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqKilometer1(){
        Area area = new Area(3, 2, 1);
        double result = area.getConversionResult();
        assertEquals(1.E-10, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqKilometer2(){
        Area area = new Area(3, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(1.E-7, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqMillimeter1(){
        Area area = new Area(3, 4, 1);
        double result = area.getConversionResult();
        assertEquals(100, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqMillimeter2(){
        Area area = new Area(3, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(100000, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqMicrometer1(){
        Area area = new Area(3, 5, 1);
        double result = area.getConversionResult();
        assertEquals(100000000, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqMicrometer2(){
        Area area = new Area(3, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(100000000000D, result, DELTA);
    }
    @Test
    public void testSqCentimeterToHectare1(){
        Area area = new Area(3, 6, 1);
        double result = area.getConversionResult();
        assertEquals(1.E-8, result, DELTA);
    }
    @Test
    public void testSqCentimeterToHectare2(){
        Area area = new Area(3, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(0.00001, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqMile1(){
        Area area = new Area(3, 7, 1);
        double result = area.getConversionResult();
        assertEquals(3.861018768E-11, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqMile2(){
        Area area = new Area(3, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(3.861018768E-8, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqYard1(){
        Area area = new Area(3, 8, 1);
        double result = area.getConversionResult();
        assertEquals(0.000119599, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqYard2(){
        Area area = new Area(3, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(0.1195990046, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqFoot1(){
        Area area = new Area(3, 9, 1);
        double result = area.getConversionResult();
        assertEquals(0.001076391, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqFoot2(){
        Area area = new Area(3, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(1.0763910417, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqInch1(){
        Area area = new Area(3, 10, 1);
        double result = area.getConversionResult();
        assertEquals(0.15500031, result, DELTA);
    }
    @Test
    public void testSqCentimeterToSqInch2(){
        Area area = new Area(3, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(155.00031, result, DELTA);
    }
    @Test
    public void testSqCentimeterToAcre1(){
        Area area = new Area(3, 11, 1);
        double result = area.getConversionResult();
        assertEquals(2.471053814E-8, result, DELTA);
    }
    @Test
    public void testSqCentimeterToAcre2(){
        Area area = new Area(3, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(2.471053814E-5, result, DELTA);
    }

    //Square Millimeter To ... Test
    @Test
    public void testSqMillimeterToSqMeter1(){
        Area area = new Area(4, 1, 1);
        double result = area.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqMeter2(){
        Area area = new Area(4, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqKilometer1(){
        Area area = new Area(4, 2, 1);
        double result = area.getConversionResult();
        assertEquals(1.E-12, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqKilometer2(){
        Area area = new Area(4, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqCentimeter1(){
        Area area = new Area(4, 3, 1);
        double result = area.getConversionResult();
        assertEquals(0.01, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqCentimeter2(){
        Area area = new Area(4, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(10, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqMicrometer1(){
        Area area = new Area(4, 5, 1);
        double result = area.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqMicrometer2(){
        Area area = new Area(4, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testSqMillimeterToHectare1(){
        Area area = new Area(4, 6, 1);
        double result = area.getConversionResult();
        assertEquals(9.999999999E-11, result, DELTA);
    }
    @Test
    public void testSqMillimeterToHectare2(){
        Area area = new Area(4, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(1.E-7, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqMile1(){
        Area area = new Area(4, 7, 1);
        double result = area.getConversionResult();
        assertEquals(3.861018768E-13, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqMile2(){
        Area area = new Area(4, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(3.861018768E-10, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqYard1(){
        Area area = new Area(4, 8, 1);
        double result = area.getConversionResult();
        assertEquals(0.000001196, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqYard2(){
        Area area = new Area(4, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(0.00119599, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqFoot1(){
        Area area = new Area(4, 9, 1);
        double result = area.getConversionResult();
        assertEquals(0.0000107639, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqFoot2(){
        Area area = new Area(4, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(0.0107639104, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqInch1(){
        Area area = new Area(4, 10, 1);
        double result = area.getConversionResult();
        assertEquals(0.0015500031, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqInch2(){
        Area area = new Area(4, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(1.5500031, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqAcre1(){
        Area area = new Area(4, 11, 1);
        double result = area.getConversionResult();
        assertEquals(2.471053814E-10, result, DELTA);
    }
    @Test
    public void testSqMillimeterToSqAcre2(){
        Area area = new Area(4, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(2.471053814E-7, result, DELTA);
    }

    //Square Micrometer To ... Tests
    @Test
    public void testSqMicrometerToSqMeter1(){
        Area area = new Area(5, 1, 1);
        double result = area.getConversionResult();
        assertEquals(1.E-12, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqMeter2(){
        Area area = new Area(5, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqKilometer1(){
        Area area = new Area(5, 2, 1);
        double result = area.getConversionResult();
        assertEquals(1.E-18, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqKilometer2(){
        Area area = new Area(5, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(1.E-15, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqCentimeter1(){
        Area area = new Area(5, 3, 1);
        double result = area.getConversionResult();
        assertEquals(9.999999999E-9, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqCentimeter2(){
        Area area = new Area(5, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(0.00001, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqMillimeter1(){
        Area area = new Area(5, 4, 1);
        double result = area.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqMillimeter2(){
        Area area = new Area(5, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testSqMicrometerToHectare1(){
        Area area = new Area(5, 6, 1);
        double result = area.getConversionResult();
        assertEquals(1.E-16, result, DELTA);
    }
    @Test
    public void testSqMicrometerToHectare2(){
        Area area = new Area(5, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(1.E-13, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqMile1(){
        Area area = new Area(5, 7, 1);
        double result = area.getConversionResult();
        assertEquals(3.861018768E-19, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqMile2(){
        Area area = new Area(5, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(3.861018768E-16, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqYard1(){
        Area area = new Area(5, 8, 1);
        double result = area.getConversionResult();
        assertEquals(1.195990046E-12, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqYard2(){
        Area area = new Area(5, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(1.195990046E-9, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqFoot1(){
        Area area = new Area(5, 9, 1);
        double result = area.getConversionResult();
        assertEquals(1.076391041E-11, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqFoot2(){
        Area area = new Area(5, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(1.076391041E-8, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqInch1(){
        Area area = new Area(5, 10, 1);
        double result = area.getConversionResult();
        assertEquals(1.5500031E-9, result, DELTA);
    }
    @Test
    public void testSqMicrometerToSqInch2(){
        Area area = new Area(5, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(0.00000155, result, DELTA);
    }
    @Test
    public void testSqMicrometerToAcre1(){
        Area area = new Area(5, 11, 1);
        double result = area.getConversionResult();
        assertEquals(2.471053814E-16, result, DELTA);
    }
    @Test
    public void testSqMicrometerToAcre2(){
        Area area = new Area(5, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(2.471053814E-13, result, DELTA);
    }

    //Hectare To ... Tests
    @Test
    public void testHectareToMeter1(){
        Area area = new Area(6, 1, 1);
        double result = area.getConversionResult();
        assertEquals(10000, result, DELTA);
    }
    @Test
    public void testHectareToMeter2(){
        Area area = new Area(6, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(10000000, result, DELTA);
    }
    @Test
    public void testHectareToKilometer1(){
        Area area = new Area(6, 2, 1);
        double result = area.getConversionResult();
        assertEquals(0.01, result, DELTA);
    }
    @Test
    public void testHectareToKilometer2(){
        Area area = new Area(6, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(10, result, DELTA);
    }
    @Test
    public void testHectareToCentimeter1(){
        Area area = new Area(6, 3, 1);
        double result = area.getConversionResult();
        assertEquals(100000000, result, DELTA);
    }
    @Test
    public void testHectareToCentimeter2(){
        Area area = new Area(6, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(100000000000D, result, DELTA);
    }
    @Test
    public void testHectareToMillimeter1(){
        Area area = new Area(6, 4, 1);
        double result = area.getConversionResult();
        assertEquals(10000000000D, result, DELTA);
    }
    @Test
    public void testHectareToMillimeter2(){
        Area area = new Area(6, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(1.0000000001E13, result, DELTA);
    }
    @Test
    public void testHectareToMicrometer1(){
        Area area = new Area(6, 5, 1);
        double result = area.getConversionResult();
        assertEquals(10000000000000000D, result, DELTA);
    }
    @Test
    public void testHectareToMicrometer2(){
        Area area = new Area(6, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(10000000000000000000D, result, DELTA);
    }
    @Test
    public void testHectareToSqMile1(){
        Area area = new Area(6, 7, 1);
        double result = area.getConversionResult();
        assertEquals(0.0038610188, result, DELTA);
    }
    @Test
    public void testHectareToSqMile2(){
        Area area = new Area(6, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(3.8610187684, result, DELTA);
    }
    @Test
    public void testHectareToSqYard1(){
        Area area = new Area(6, 8, 1);
        double result = area.getConversionResult();
        assertEquals(11959.900463, result, DELTA);
    }
    @Test
    public void testHectareToSqYard2(){
        Area area = new Area(6, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(11959900.463, result, DELTA);
    }
    @Test
    public void testHectareToSqFoot1(){
        Area area = new Area(6, 9, 1);
        double result = area.getConversionResult();
        assertEquals(107639.10417, result, DELTA);
    }
    @Test
    public void testHectareToSqFoot2(){
        Area area = new Area(6, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(107639104.17, result, DELTA);
    }
    @Test
    public void testHectareToSqInch1(){
        Area area = new Area(6, 10, 1);
        double result = area.getConversionResult();
        assertEquals(15500031, result, DELTA);
    }
    @Test
    public void testHectareToSqInch2(){
        Area area = new Area(6, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(15500031000D, result, DELTA);
    }
    @Test
    public void testHectareToAcre1(){
        Area area = new Area(6, 11, 1);
        double result = area.getConversionResult();
        assertEquals(2.4710538147, result, DELTA);
    }
    @Test
    public void testHectareToAcre2(){
        Area area = new Area(6, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(2471.0538147, result, DELTA);
    }

    //Square Mile To ... Tests
    @Test
    public void testSqMileToMeter1(){
        Area area = new Area(7, 1, 1);
        double result = area.getConversionResult();
        assertEquals(2589990, result, DELTA);
    }
    @Test
    public void testSqMileToMeter2(){
        Area area = new Area(7, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(2589990000D, result, DELTA);
    }
    @Test
    public void testSqMileToKilometer1(){
        Area area = new Area(7, 2, 1);
        double result = area.getConversionResult();
        assertEquals(2.58999, result, DELTA);
    }
    @Test
    public void testSqMileToKilometer2(){
        Area area = new Area(7, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(2589.99, result, DELTA);
    }
    @Test
    public void testSqMileToCentimeter1(){
        Area area = new Area(7, 3, 1);
        double result = area.getConversionResult();
        assertEquals(2.589990000276528E10, result, DELTA);
    }
    @Test
    public void testSqMileToCentimeter2(){
        Area area = new Area(7, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(2.589990000276528E13, result, DELTA);
    }
    @Test
    public void testSqMileToMillimeter1(){
        Area area = new Area(7, 4, 1);
        double result = area.getConversionResult();
        assertEquals(2.589990000276528E12, result, DELTA);
    }
    @Test
    public void testSqMileToMillimeter2(){
        Area area = new Area(7, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(2.589990000276528E15, result, DELTA);
    }
    @Test
    public void testSqMileToMicrometer1(){
        Area area = new Area(7, 5, 1);
        double result = area.getConversionResult();
        assertEquals(2.5899900002765281E18, result, DELTA);
    }
    @Test
    public void testSqMileToMicrometer2(){
        Area area = new Area(7, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(2.589990000276528E21, result, DELTA);
    }
    @Test
    public void testSqMileToHectare1(){
        Area area = new Area(7, 6, 1);
        double result = area.getConversionResult();
        assertEquals(258.999, result, DELTA);
    }
    @Test
    public void testSqMileToHectare2(){
        Area area = new Area(7, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(258999, result, DELTA);
    }
    @Test
    public void testSqMileToSqYard1(){
        Area area = new Area(7, 8, 1);
        double result = area.getConversionResult();
        assertEquals(3097602.26, result, DELTA);
    }
    @Test
    public void testSqMileToSqYard2(){
        Area area = new Area(7, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(3097602260D, result, DELTA);
    }
    @Test
    public void testSqMileToSqFoot1(){
        Area area = new Area(7, 9, 1);
        double result = area.getConversionResult();
        assertEquals(27878420.34, result, DELTA);
    }
    @Test
    public void testSqMileToSqFoot2(){
        Area area = new Area(7, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(27878420340D, result, DELTA);
    }
    @Test
    public void testSqMileToSqInch1(){
        Area area = new Area(7, 10, 1);
        double result = area.getConversionResult();
        assertEquals(4014492529D, result, DELTA);
    }
    @Test
    public void testSqMileToSqInch2(){
        Area area = new Area(7, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(4.014492529E12, result, DELTA);
    }
    @Test
    public void testSqMileToAcre1(){
        Area area = new Area(7, 11, 1);
        double result = area.getConversionResult();
        assertEquals(640.00046695, result, DELTA);
    }
    @Test
    public void testSqMileToAcre2(){
        Area area = new Area(7, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(640000.46695, result, DELTA);
    }

    //Square Yard To ... Tests
    @Test
    public void testSqYardToSqMeter1(){
        Area area = new Area(8, 1, 1);
        double result = area.getConversionResult();
        assertEquals(0.83612736, result, DELTA);
    }
    @Test
    public void testSqYardToSqMeter2(){
        Area area = new Area(8, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(836.12736, result, DELTA);
    }
    @Test
    public void testSqYardToSqKilometer1(){
        Area area = new Area(8, 2, 1);
        double result = area.getConversionResult();
        assertEquals(8.3612736E-7, result, DELTA);
    }
    @Test
    public void testSqYardToSqKilometer2(){
        Area area = new Area(8, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(0.0008361274, result, DELTA);
    }
    @Test
    public void testSqYardToSqCentimeter1(){
        Area area = new Area(8, 3, 1);
        double result = area.getConversionResult();
        assertEquals(8361.2736, result, DELTA);
    }
    @Test
    public void testSqYardToSqCentimeter2(){
        Area area = new Area(8, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(8361273.6, result, DELTA);
    }
    @Test
    public void testSqYardToSqMillimeter1(){
        Area area = new Area(8, 4, 1);
        double result = area.getConversionResult();
        assertEquals(836120.4, result, DELTA);
    }
    @Test
    public void testSqYardToSqMillimeter2(){
        Area area = new Area(8, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(8.361204013377926E8, result, DELTA);
    }
    @Test
    public void testSqYardToSqMicrometer1(){
        Area area = new Area(8, 5, 1);
        double result = area.getConversionResult();
        assertEquals(8.361273602104879E11, result, DELTA);
    }
    @Test
    public void testSqYardToSqMicrometer2(){
        Area area = new Area(8, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(8.361273602104879E14, result, DELTA);
    }
    @Test
    public void testSqYardToHectare1(){
        Area area = new Area(8, 6, 1);
        double result = area.getConversionResult();
        assertEquals(0.0000836127, result, DELTA);
    }
    @Test
    public void testSqYardToHectare2(){
        Area area = new Area(8, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(0.083612736, result, DELTA);
    }
    @Test
    public void testSqYardToSqMile1(){
        Area area = new Area(8, 7, 1);
        double result = area.getConversionResult();
        assertEquals(3.228303429E-7, result, DELTA);
    }
    @Test
    public void testSqYardToSqMile2(){
        Area area = new Area(8, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(0.0003228303, result, DELTA);
    }
    @Test
    public void testSqYardToSqFoot1(){
        Area area = new Area(8, 9, 1);
        double result = area.getConversionResult();
        assertEquals(9, result, DELTA);
    }
    @Test
    public void testSqYardToSqFoot2(){
        Area area = new Area(8, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(9000, result, DELTA);
    }
    @Test
    public void testSqYardToSqInch1(){
        Area area = new Area(8, 10, 1);
        double result = area.getConversionResult();
        assertEquals(1296, result, DELTA);
    }
    @Test
    public void testSqYardToSqInch2(){
        Area area = new Area(8, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(1296000, result, DELTA);
    }
    @Test
    public void testSqYardToAcre1(){
        Area area = new Area(8, 11, 1);
        double result = area.getConversionResult();
        assertEquals(0.0002066116, result, DELTA);
    }
    @Test
    public void testSqYardToAcre2(){
        Area area = new Area(8, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(0.2066115702, result, DELTA);
    }

    //Square Foot To ... Tests
    @Test
    public void testSqFootToSqMeter1(){
        Area area = new Area(9, 1, 1);
        double result = area.getConversionResult();
        assertEquals(0.09290304, result, DELTA);
    }
    @Test
    public void testSqFootToSqMeter2(){
        Area area = new Area(9, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(92.90304, result, DELTA);
    }
    @Test
    public void testSqFootToSqKilometer1(){
        Area area = new Area(9, 2, 1);
        double result = area.getConversionResult();
        assertEquals(9.290304E-8, result, DELTA);
    }
    @Test
    public void testSqFootToSqKilometer2(){
        Area area = new Area(9, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(0.000092903, result, DELTA);
    }
    @Test
    public void testSqFootToSqCentimeter1(){
        Area area = new Area(9, 3, 1);
        double result = area.getConversionResult();
        assertEquals(929.0304, result, DELTA);
    }
    @Test
    public void testSqFootToSqCentimeter2(){
        Area area = new Area(9, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(929030.4, result, DELTA);
    }
    @Test
    public void testSqFootToSqMillimeter1(){
        Area area = new Area(9, 4, 1);
        double result = area.getConversionResult();
        assertEquals(92903.04, result, DELTA);
    }
    @Test
    public void testSqFootToSqMillimeter2(){
        Area area = new Area(9, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(9.290312990644655E7, result, DELTA);
    }
    @Test
    public void testSqFootToSqMicrometer1(){
        Area area = new Area(9, 5, 1);
        double result = area.getConversionResult();
        assertEquals(9.290304005791144E10, result, DELTA);
    }
    @Test
    public void testSqFootToSqMicrometer2(){
        Area area = new Area(9, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(9.290304005791144E13, result, DELTA);
    }
    @Test
    public void testSqFootToHectare1(){
        Area area = new Area(9, 6, 1);
        double result = area.getConversionResult();
        assertEquals(0.0000092903, result, DELTA);
    }
    @Test
    public void testSqFootToHectare2(){
        Area area = new Area(9, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(0.009290304, result, DELTA);
    }
    @Test
    public void testSqFootToSqMile1(){
        Area area = new Area(9, 7, 1);
        double result = area.getConversionResult();
        assertEquals(3.58700381E-8, result, DELTA);
    }
    @Test
    public void testSqFootToSqMile2(){
        Area area = new Area(9, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(0.00003587, result, DELTA);
    }
    @Test
    public void testSqFootToSqYard1(){
        Area area = new Area(9, 8, 1);
        double result = area.getConversionResult();
        assertEquals(0.1111111111, result, DELTA);
    }
    @Test
    public void testSqFootToSqYard2(){
        Area area = new Area(9, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(111.11111111, result, DELTA);
    }
    @Test
    public void testSqFootToSqInch1(){
        Area area = new Area(9, 10, 1);
        double result = area.getConversionResult();
        assertEquals(144, result, DELTA);
    }
    @Test
    public void testSqFootToSqInch2(){
        Area area = new Area(9, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(144000, result, DELTA);
    }
    @Test
    public void testSqFootToAcre1(){
        Area area = new Area(9, 11, 1);
        double result = area.getConversionResult();
        assertEquals(0.0000229568, result, DELTA);
    }
    @Test
    public void testSqFootToAcre2(){
        Area area = new Area(9, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(0.0229568411, result, DELTA);
    }

    //Square Inch To ... Tests
    @Test
    public void testSqInchToSqMeter1(){
        Area area = new Area(10, 1, 1);
        double result = area.getConversionResult();
        assertEquals(0.00064516, result, DELTA);
    }
    @Test
    public void testSqInchToSqMeter2(){
        Area area = new Area(10, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(0.64516, result, DELTA);
    }
    @Test
    public void testSqInchToSqKilometer1(){
        Area area = new Area(10, 2, 1);
        double result = area.getConversionResult();
        assertEquals(6.4516E-10, result, DELTA);
    }
    @Test
    public void testSqInchToSqKilometer2(){
        Area area = new Area(10, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(6.451599999E-7, result, DELTA);
    }
    @Test
    public void testSqInchToSqCentimeter1(){
        Area area = new Area(10, 3, 1);
        double result = area.getConversionResult();
        assertEquals(6.4516, result, DELTA);
    }
    @Test
    public void testSqInchToSqCentimeter2(){
        Area area = new Area(10, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(6451.6, result, DELTA);
    }
    @Test
    public void testSqInchToSqMillimeter1(){
        Area area = new Area(10, 4, 1);
        double result = area.getConversionResult();
        assertEquals(645.16, result, DELTA);
    }
    @Test
    public void testSqInchToSqMillimeter2(){
        Area area = new Area(10, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(645160, result, DELTA);
    }
    @Test
    public void testSqInchToSqMicrometer1(){
        Area area = new Area(10, 5, 1);
        double result = area.getConversionResult();
        assertEquals(645160000, result, DELTA);
    }
    @Test
    public void testSqInchToSqMicrometer2(){
        Area area = new Area(10, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(6.451600000025807E11, result, DELTA);
    }
    @Test
    public void testSqInchToHectare1(){
        Area area = new Area(10, 6, 1);
        double result = area.getConversionResult();
        assertEquals(6.4516E-8, result, DELTA);
    }
    @Test
    public void testSqInchToHectare2(){
        Area area = new Area(10, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(0.000064516, result, DELTA);
    }
    @Test
    public void testSqInchToSqMile1(){
        Area area = new Area(10, 7, 1);
        double result = area.getConversionResult();
        assertEquals(2.490974868E-10, result, DELTA);
    }
    @Test
    public void testSqInchToSqMile2(){
        Area area = new Area(10, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(2.490974868E-7, result, DELTA);
    }
    @Test
    public void testSqInchToSqYard1(){
        Area area = new Area(10, 8, 1);
        double result = area.getConversionResult();
        assertEquals(0.0007716049, result, DELTA);
    }
    @Test
    public void testSqInchToSqYard2(){
        Area area = new Area(10, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(0.7716049383, result, DELTA);
    }
    @Test
    public void testSqInchToSqFoot1(){
        Area area = new Area(10, 9, 1);
        double result = area.getConversionResult();
        assertEquals(0.0069444444, result, DELTA);
    }
    @Test
    public void testSqInchToSqFoot2(){
        Area area = new Area(10, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(6.9444444444, result, DELTA);
    }
    @Test
    public void testSqInchToAcre1(){
        Area area = new Area(10, 11, 1);
        double result = area.getConversionResult();
        assertEquals(1.594225079E-7, result, DELTA);
    }
    @Test
    public void testSqInchToAcre2(){
        Area area = new Area(10, 11, 1000);
        double result = area.getConversionResult();
        assertEquals(0.0001594225, result, DELTA);
    }

    //Acre To ... Tests
    @Test
    public void testAcreToSqMeter1(){
        Area area = new Area(11, 1, 1);
        double result = area.getConversionResult();
        assertEquals(4046.8564224, result, DELTA);
    }
    @Test
    public void testAcreToSqMeter2(){
        Area area = new Area(11, 1, 1000);
        double result = area.getConversionResult();
        assertEquals(4046856.4224, result, DELTA);
    }
    @Test
    public void testAcreToSqKilometer1(){
        Area area = new Area(11, 2, 1);
        double result = area.getConversionResult();
        assertEquals(0.0040468564, result, DELTA);
    }
    @Test
    public void testAcreToSqKilometer2(){
        Area area = new Area(11, 2, 1000);
        double result = area.getConversionResult();
        assertEquals(4.0468564224, result, DELTA);
    }
    @Test
    public void testAcreToSqCentimeter1(){
        Area area = new Area(11, 3, 1);
        double result = area.getConversionResult();
        assertEquals(40468564.224, result, DELTA);
    }
    @Test
    public void testAcreToSqCentimeter2(){
        Area area = new Area(11, 3, 1000);
        double result = area.getConversionResult();
        assertEquals(4.0468564234999695E10, result, DELTA);
    }
    @Test
    public void testAcreToSqMillimeter1(){
        Area area = new Area(11, 4, 1);
        double result = area.getConversionResult();
        assertEquals(4.0468564234999695E9, result, DELTA);
    }
    @Test
    public void testAcreToSqMillimeter2(){
        Area area = new Area(11, 4, 1000);
        double result = area.getConversionResult();
        assertEquals(4.0468564234999697E12, result, DELTA);
    }
    @Test
    public void testAcreToSqMicrometer1(){
        Area area = new Area(11, 5, 1);
        double result = area.getConversionResult();
        assertEquals(4.04685642349997E15, result, DELTA);
    }
    @Test
    public void testAcreToSqMicrometer2(){
        Area area = new Area(11, 5, 1000);
        double result = area.getConversionResult();
        assertEquals(4.04685642349997E18, result, DELTA);
    }
    @Test
    public void testAcreToHectare1(){
        Area area = new Area(11, 6, 1);
        double result = area.getConversionResult();
        assertEquals(0.4046856422, result, DELTA);
    }
    @Test
    public void testAcreToHectare2(){
        Area area = new Area(11, 6, 1000);
        double result = area.getConversionResult();
        assertEquals(404.68564224, result, DELTA);
    }
    @Test
    public void testAcreToSqMile1(){
        Area area = new Area(11, 7, 1);
        double result = area.getConversionResult();
        assertEquals(0.0015624989, result, DELTA);
    }
    @Test
    public void testAcreToSqMile2(){
        Area area = new Area(11, 7, 1000);
        double result = area.getConversionResult();
        assertEquals(1.56249886, result, DELTA);
    }
    @Test
    public void testAcreToSqYard1(){
        Area area = new Area(11, 8, 1);
        double result = area.getConversionResult();
        assertEquals(4840, result, DELTA);
    }
    @Test
    public void testAcreToSqYard2(){
        Area area = new Area(11, 8, 1000);
        double result = area.getConversionResult();
        assertEquals(4840000, result, DELTA);
    }
    @Test
    public void testAcreToSqFoot1(){
        Area area = new Area(11, 9, 1);
        double result = area.getConversionResult();
        assertEquals(43560, result, DELTA);
    }
    @Test
    public void testAcreToSqFoot2(){
        Area area = new Area(11, 9, 1000);
        double result = area.getConversionResult();
        assertEquals(4.356007805965988E7, result, DELTA);
    }
    @Test
    public void testAcreToSqInch1(){
        Area area = new Area(11, 10, 1);
        double result = area.getConversionResult();
        assertEquals(6272640, result, DELTA);
    }
    @Test
    public void testAcreToSqInch2(){
        Area area = new Area(11, 10, 1000);
        double result = area.getConversionResult();
        assertEquals(6272640000D, result, DELTA);
    }
}