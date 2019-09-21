package com.spookyNullPointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeightTest {

    private static final double DELTA = 1;

    //Kilogram To .... Tests
    @Test
    public void testKilogramToGram1(){
        Weight weight = new Weight(1, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testKilogramToGram2(){
        Weight weight = new Weight(1, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testKilogramToMilligram1(){
        Weight weight = new Weight(1, 3, 1);
        double result = weight.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testKilogramToMilligram2(){
        Weight weight = new Weight(1, 3, 1000);
        double result = weight.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testKilogramToMetricTon1(){
        Weight weight = new Weight(1, 4, 1);
        double result = weight.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testKilogramToMetricTon2(){
        Weight weight = new Weight(1, 4, 1000);
        double result = weight.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testKilogramToLongTon1(){
        Weight weight = new Weight(1, 5, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0009842073, result, DELTA);
    }
    @Test
    public void testKilogramToLongTon2(){
        Weight weight = new Weight(1, 5, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.9842073304, result, DELTA);
    }
    @Test
    public void testKilogramToShortTon1(){
        Weight weight = new Weight(1, 6, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0011023122, result, DELTA);
    }
    @Test
    public void testKilogramToShortTon2(){
        Weight weight = new Weight(1, 6, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.1023122101, result, DELTA);
    }
    @Test
    public void testKilogramToPound1(){
        Weight weight = new Weight(1, 7, 1);
        double result = weight.getConversionResult();
        assertEquals(2.2046244202, result, DELTA);
    }
    @Test
    public void testKilogramToPound2(){
        Weight weight = new Weight(1, 7, 1000);
        double result = weight.getConversionResult();
        assertEquals(2204.6244202, result, DELTA);
    }
    @Test
    public void testKilogramToOunce1(){
        Weight weight = new Weight(1, 8, 1);
        double result = weight.getConversionResult();
        assertEquals(35.273990723, result, DELTA);
    }
    @Test
    public void testKilogramToOunce2(){
        Weight weight = new Weight(1, 8, 1000);
        double result = weight.getConversionResult();
        assertEquals(35273.990723, result, DELTA);
    }
    @Test
    public void testKilogramToCarrat1(){
        Weight weight = new Weight(1, 9, 1);
        double result = weight.getConversionResult();
        assertEquals(5000, result, DELTA);
    }
    @Test
    public void testKilogramToCarrat2(){
        Weight weight = new Weight(1, 9, 1000);
        double result = weight.getConversionResult();
        assertEquals(5000000, result, DELTA);
    }
    @Test
    public void testKilogramToAtomicMassUnit1(){
        Weight weight = new Weight(1, 10, 1);
        double result = weight.getConversionResult();
        assertEquals(6.022136652E+26, result, DELTA);
    }
    @Test
    public void testKilogramToAtomicMassUnit2(){
        Weight weight = new Weight(1, 10, 1000);
        double result = weight.getConversionResult();
        assertEquals(6.022136652E+29, result, DELTA);
    }

    //Gram To .... Tests
    @Test
    public void testGramToKilogram1(){
        Weight weight = new Weight(2, 1, 1);
        double result = weight.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testGramToKilogram2(){
        Weight weight = new Weight(2, 1, 1000);
        double result = weight.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testGramToMilligram1(){
        Weight weight = new Weight(2, 3, 1);
        double result = weight.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testGramToMilligram2(){
        Weight weight = new Weight(2, 3, 1000);
        double result = weight.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testGramToMetricTon1(){
        Weight weight = new Weight(2, 4, 1);
        double result = weight.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testGramToMetricTon2(){
        Weight weight = new Weight(2, 4, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testGramToLongTon1(){
        Weight weight = new Weight(2, 5, 1);
        double result = weight.getConversionResult();
        assertEquals(9.842073304E-7, result, DELTA);
    }
    @Test
    public void testGramToLongTon2(){
        Weight weight = new Weight(2, 5, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0009842073, result, DELTA);
    }
    @Test
    public void testGramToShortTon1(){
        Weight weight = new Weight(2, 6, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0000011023, result, DELTA);
    }
    @Test
    public void testGramToShortTon2(){
        Weight weight = new Weight(2, 6, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0011023122, result, DELTA);
    }
    @Test
    public void testGramToPound1(){
        Weight weight = new Weight(2, 7, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0022046244, result, DELTA);
    }
    @Test
    public void testGramToPound2(){
        Weight weight = new Weight(2, 7, 1000);
        double result = weight.getConversionResult();
        assertEquals(2.2046244202, result, DELTA);
    }
    @Test
    public void testGramToOunce1(){
        Weight weight = new Weight(2, 8, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0352739907, result, DELTA);
    }
    @Test
    public void testGramToOunce2(){
        Weight weight = new Weight(2, 8, 1000);
        double result = weight.getConversionResult();
        assertEquals(35.273990723, result, DELTA);
    }
    @Test
    public void testGramToCarrat1(){
        Weight weight = new Weight(2, 9, 1);
        double result = weight.getConversionResult();
        assertEquals(5, result, DELTA);
    }
    @Test
    public void testGramToCarrat2(){
        Weight weight = new Weight(2, 9, 1000);
        double result = weight.getConversionResult();
        assertEquals(5000, result, DELTA);
    }
    @Test
    public void testGramToAtomicMassUnit1(){
        Weight weight = new Weight(2, 10, 1);
        double result = weight.getConversionResult();
        assertEquals(6.022136652E+23, result, DELTA);
    }
    @Test
    public void testGramToAtomicMassUnit2(){
        Weight weight = new Weight(2, 10, 1000);
        double result = weight.getConversionResult();
        assertEquals(6.022136652E+26, result, DELTA);
    }

    //Milligram To .... Tests
    @Test
    public void testMilligramToKilogram1(){
        Weight weight = new Weight(2, 1, 1);
        double result = weight.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testMilligramToKilogram2(){
        Weight weight = new Weight(2, 1, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMilligramToGram1(){
        Weight weight = new Weight(2, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMilligramToGram2(){
        Weight weight = new Weight(3, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testMilligramToMetricTon1(){
        Weight weight = new Weight(3, 4, 1);
        double result = weight.getConversionResult();
        assertEquals(9.999999999E-10, result, DELTA);
    }
    @Test
    public void testMilligramToMetricTon2(){
        Weight weight = new Weight(3, 4, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testMilligramToLongTon1(){
        Weight weight = new Weight(3, 5, 1);
        double result = weight.getConversionResult();
        assertEquals(9.842073304E-10, result, DELTA);
    }
    @Test
    public void testMilligramToLongTon2(){
        Weight weight = new Weight(3, 5, 1000);
        double result = weight.getConversionResult();
        assertEquals(9.842073304E-7, result, DELTA);
    }
    @Test
    public void testMilligramToShortTon1(){
        Weight weight = new Weight(3, 6, 1);
        double result = weight.getConversionResult();
        assertEquals(1.10231221E-9, result, DELTA);
    }
    @Test
    public void testMilligramToShortTon2(){
        Weight weight = new Weight(3, 6, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0000011023, result, DELTA);
    }
    @Test
    public void testMilligramToPound1(){
        Weight weight = new Weight(3, 7, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0000022046, result, DELTA);
    }
    @Test
    public void testMilligramToPound2(){
        Weight weight = new Weight(3, 7, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0022046244, result, DELTA);
    }
    @Test
    public void testMilligramToOunce1(){
        Weight weight = new Weight(3, 8, 1);
        double result = weight.getConversionResult();
        assertEquals(0.000035274, result, DELTA);
    }
    @Test
    public void testMilligramToOunce2(){
        Weight weight = new Weight(3, 8, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0352739907, result, DELTA);
    }
    @Test
    public void testMilligramToCarrat1(){
        Weight weight = new Weight(3, 9, 1);
        double result = weight.getConversionResult();
        assertEquals(0.005, result, DELTA);
    }
    @Test
    public void testMilligramToCarrat2(){
        Weight weight = new Weight(3, 9, 1000);
        double result = weight.getConversionResult();
        assertEquals(5, result, DELTA);
    }
    @Test
    public void testMilligramToAtomicMassUnit1(){
        Weight weight = new Weight(3, 10, 1);
        double result = weight.getConversionResult();
        assertEquals(602213665200000000000D, result, DELTA);
    }
    @Test
    public void testMilligramToAtomicMassUnit2(){
        Weight weight = new Weight(3, 10, 1000);
        double result = weight.getConversionResult();
        assertEquals(6.0221366519999995E23, result, DELTA);
    }

    //Metric Ton To .... Tests
    @Test
    public void testMetricTonToKilogram1(){
        Weight weight = new Weight(4, 1, 1);
        double result = weight.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testMetricTonToKilogram2(){
        Weight weight = new Weight(4, 1, 1000);
        double result = weight.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMetricTonToGram1(){
        Weight weight = new Weight(4, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMetricTonToGram2(){
        Weight weight = new Weight(4, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testMetricTonToMilligram1(){
        Weight weight = new Weight(4, 3, 1);
        double result = weight.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testMetricTonToMilligram2(){
        Weight weight = new Weight(4, 3, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.0000000001000001E12, result, DELTA);
    }
    @Test
    public void testMetricTonToLongTon1(){
        Weight weight = new Weight(4, 5, 1);
        double result = weight.getConversionResult();
        assertEquals(0.9842073304, result, DELTA);
    }
    @Test
    public void testMetricTonToLongTon2(){
        Weight weight = new Weight(4, 5, 1000);
        double result = weight.getConversionResult();
        assertEquals(984.20733044, result, DELTA);
    }
    @Test
    public void testMetricTonToShortTon1(){
        Weight weight = new Weight(4, 6, 1);
        double result = weight.getConversionResult();
        assertEquals(1.1023122101, result, DELTA);
    }
    @Test
    public void testMetricTonToShortTon2(){
        Weight weight = new Weight(4, 6, 1000);
        double result = weight.getConversionResult();
        assertEquals(1102.3122101, result, DELTA);
    }
    @Test
    public void testMetricTonToPound1(){
        Weight weight = new Weight(4, 7, 1);
        double result = weight.getConversionResult();
        assertEquals(2204.6244202, result, DELTA);
    }
    @Test
    public void testMetricTonToPound2(){
        Weight weight = new Weight(4, 7, 1000);
        double result = weight.getConversionResult();
        assertEquals(2204624.4202, result, DELTA);
    }
    @Test
    public void testMetricTonToOunce1(){
        Weight weight = new Weight(4, 8, 1);
        double result = weight.getConversionResult();
        assertEquals(35273.990723, result, DELTA);
    }
    @Test
    public void testMetricTonToOunce2(){
        Weight weight = new Weight(4, 8, 1000);
        double result = weight.getConversionResult();
        assertEquals(35273990.723, result, DELTA);
    }
    @Test
    public void testMetricTonToCarrat1(){
        Weight weight = new Weight(4, 9, 1);
        double result = weight.getConversionResult();
        assertEquals(5000000, result, DELTA);
    }
    @Test
    public void testMetricTonToCarrat2(){
        Weight weight = new Weight(4, 9, 1000);
        double result = weight.getConversionResult();
        assertEquals(5000000000D, result, DELTA);
    }
    @Test
    public void testMetricTonToAtomicMassUnit1(){
        Weight weight = new Weight(4, 10, 1);
        double result = weight.getConversionResult();
        assertEquals(6.022136652E+29, result, DELTA);
    }
    @Test
    public void testMetricTonToAtomicMassUnit2(){
        Weight weight = new Weight(4, 10, 1000);
        double result = weight.getConversionResult();
        assertEquals(6.022136652E+32, result, DELTA);
    }

    //Long Ton To .... Tests
    @Test
    public void testLongTonToKilogram1(){
        Weight weight = new Weight(5, 1, 1);
        double result = weight.getConversionResult();
        assertEquals(1016.04608, result, DELTA);
    }
    @Test
    public void testLongTonToKilogram2(){
        Weight weight = new Weight(5, 1, 1000);
        double result = weight.getConversionResult();
        assertEquals(1016046.08, result, DELTA);
    }
    @Test
    public void testLongTonToGram1(){
        Weight weight = new Weight(5, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(1016046.08, result, DELTA);
    }
    @Test
    public void testLongTonToGram2(){
        Weight weight = new Weight(5, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(1016046080, result, DELTA);
    }
    @Test
    public void testLongTonToMilligram1(){
        Weight weight = new Weight(5, 3, 1);
        double result = weight.getConversionResult();
        assertEquals(1016046080, result, DELTA);
    }
    @Test
    public void testLongTonToMilligram2(){
        Weight weight = new Weight(5, 3, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.016046080040454E12, result, DELTA);
    }
    @Test
    public void testLongTonToMetricTon1(){
        Weight weight = new Weight(5, 4, 1);
        double result = weight.getConversionResult();
        assertEquals(1.01604608, result, DELTA);
    }
    @Test
    public void testLongTonToMetricTon2(){
        Weight weight = new Weight(5, 4, 1000);
        double result = weight.getConversionResult();
        assertEquals(1016.04608, result, DELTA);
    }
    @Test
    public void testLongTonToShortTon1(){
        Weight weight = new Weight(5, 6, 1);
        double result = weight.getConversionResult();
        assertEquals(1.12, result, DELTA);
    }
    @Test
    public void testLongTonToShortTon2(){
        Weight weight = new Weight(5, 6, 1000);
        double result = weight.getConversionResult();
        assertEquals(1120, result, DELTA);
    }
    @Test
    public void testLongTonToPound1(){
        Weight weight = new Weight(5, 7, 1);
        double result = weight.getConversionResult();
        assertEquals(2240, result, DELTA);
    }
    @Test
    public void testLongTonToPound2(){
        Weight weight = new Weight(5, 7, 1000);
        double result = weight.getConversionResult();
        assertEquals(2240000, result, DELTA);
    }
    @Test
    public void testLongTonToOunce1(){
        Weight weight = new Weight(5, 8, 1);
        double result = weight.getConversionResult();
        assertEquals(35840, result, DELTA);
    }
    @Test
    public void testLongTonToOunce2(){
        Weight weight = new Weight(5, 8, 1000);
        double result = weight.getConversionResult();
        assertEquals(35840000, result, DELTA);
    }
    @Test
    public void testLongTonToCarrat1(){
        Weight weight = new Weight(5, 9, 1);
        double result = weight.getConversionResult();
        assertEquals(5080230.4, result, DELTA);
    }
    @Test
    public void testLongTonToCarrat2(){
        Weight weight = new Weight(5, 9, 1000);
        double result = weight.getConversionResult();
        assertEquals(5080230400D, result, DELTA);
    }
    @Test
    public void testLongTonToAtomicMassUnit1(){
        Weight weight = new Weight(5, 10, 1);
        double result = weight.getConversionResult();
        assertEquals(6.118768338E+29, result, DELTA);
    }
    @Test
    public void testLongTonToAtomicMassUnit2(){
        Weight weight = new Weight(5, 10, 1000);
        double result = weight.getConversionResult();
        assertEquals(6.118768338E+32, result, DELTA);
    }

    //Short Ton To .... Tests
    @Test
    public void testShortTonToKilogram1(){
        Weight weight = new Weight(6, 1, 1);
        double result = weight.getConversionResult();
        assertEquals(907.184, result, DELTA);
    }
    @Test
    public void testShortTonToKilogram2(){
        Weight weight = new Weight(6, 1, 1000);
        double result = weight.getConversionResult();
        assertEquals(907184, result, DELTA);
    }
    @Test
    public void testShortTonToGram1(){
        Weight weight = new Weight(6, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(907194.0488070399, result, DELTA);
    }
    @Test
    public void testShortTonToGram2(){
        Weight weight = new Weight(6, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(9.071940488070399E8, result, DELTA);
    }
    @Test
    public void testShortTonToMilligram1(){
        Weight weight = new Weight(6, 3, 1);
        double result = weight.getConversionResult();
        assertEquals(907184000, result, DELTA);
    }
    @Test
    public void testShortTonToMilligram2(){
        Weight weight = new Weight(6, 3, 1000);
        double result = weight.getConversionResult();
        assertEquals(9.071840000756228E11, result, DELTA);
    }
    @Test
    public void testShortTonToMetricTon1(){
        Weight weight = new Weight(6, 4, 1);
        double result = weight.getConversionResult();
        assertEquals(0.907184, result, DELTA);
    }
    @Test
    public void testShortTonToMetricTon2(){
        Weight weight = new Weight(6, 4, 1000);
        double result = weight.getConversionResult();
        assertEquals(907.184, result, DELTA);
    }
    @Test
    public void testShortTonToLongTon1(){
        Weight weight = new Weight(6, 5, 1);
        double result = weight.getConversionResult();
        assertEquals(0.8928571429, result, DELTA);
    }
    @Test
    public void testShortTonToLongTon2(){
        Weight weight = new Weight(6, 5, 1000);
        double result = weight.getConversionResult();
        assertEquals(892.85714286, result, DELTA);
    }
    @Test
    public void testShortTonToPound1(){
        Weight weight = new Weight(6, 7, 1);
        double result = weight.getConversionResult();
        assertEquals(2000, result, DELTA);
    }
    @Test
    public void testShortTonToPound2(){
        Weight weight = new Weight(6, 7, 1000);
        double result = weight.getConversionResult();
        assertEquals(2000000, result, DELTA);
    }
    @Test
    public void testShortTonToOunce1(){
        Weight weight = new Weight(6, 8, 1);
        double result = weight.getConversionResult();
        assertEquals(32000, result, DELTA);
    }
    @Test
    public void testShortTonToOunce2(){
        Weight weight = new Weight(6, 8, 1000);
        double result = weight.getConversionResult();
        assertEquals(32000000, result, DELTA);
    }
    @Test
    public void testShortTonToCarrat1(){
        Weight weight = new Weight(6, 9, 1);
        double result = weight.getConversionResult();
        assertEquals(4535920, result, DELTA);
    }
    @Test
    public void testShortTonToCarrat2(){
        Weight weight = new Weight(6, 9, 1000);
        double result = weight.getConversionResult();
        assertEquals(4535920000D, result, DELTA);
    }
    @Test
    public void testShortTonToAtomicMassUnit1(){
        Weight weight = new Weight(6, 10, 1);
        double result = weight.getConversionResult();
        assertEquals(5.463186016E+29, result, DELTA);
    }
    @Test
    public void testShortTonToAtomicMassUnit2(){
        Weight weight = new Weight(6, 10, 1000);
        double result = weight.getConversionResult();
        assertEquals(5.463186016E+32, result, DELTA);
    }

    //Pound To .... Tests
    @Test
    public void testPoundToKilogram1(){
        Weight weight = new Weight(7, 1, 1);
        double result = weight.getConversionResult();
        assertEquals(0.453592, result, DELTA);
    }
    @Test
    public void testPoundToKilogram2(){
        Weight weight = new Weight(7, 1, 1000);
        double result = weight.getConversionResult();
        assertEquals(453.592, result, DELTA);
    }
    @Test
    public void testPoundToGram1(){
        Weight weight = new Weight(7, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(453.592, result, DELTA);
    }
    @Test
    public void testPoundToGram2(){
        Weight weight = new Weight(7, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(453592, result, DELTA);
    }
    @Test
    public void testPoundToMilligram1(){
        Weight weight = new Weight(7, 3, 1);
        double result = weight.getConversionResult();
        assertEquals(453597.0244035199, result, DELTA);
    }
    @Test
    public void testPoundToMilligram2(){
        Weight weight = new Weight(7, 3, 1000);
        double result = weight.getConversionResult();
        assertEquals(4.535970244035199E8, result, DELTA);
    }
    @Test
    public void testPoundToMetricTon1(){
        Weight weight = new Weight(7, 4, 1);
        double result = weight.getConversionResult();
        assertEquals(0.000453592, result, DELTA);
    }
    @Test
    public void testPoundToMetricTon2(){
        Weight weight = new Weight(7, 4, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.453592, result, DELTA);
    }
    @Test
    public void testPoundToLongTon1(){
        Weight weight = new Weight(7, 5, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0004464286, result, DELTA);
    }
    @Test
    public void testPoundToLongTon2(){
        Weight weight = new Weight(7, 5, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.4464285714, result, DELTA);
    }
    @Test
    public void testPoundToShortTon1(){
        Weight weight = new Weight(7, 6, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0005, result, DELTA);
    }
    @Test
    public void testPoundToShortTon2(){
        Weight weight = new Weight(7, 6, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.5, result, DELTA);
    }
    @Test
    public void testPoundToOunce1(){
        Weight weight = new Weight(7, 8, 1);
        double result = weight.getConversionResult();
        assertEquals(16, result, DELTA);
    }
    @Test
    public void testPoundToOunce2(){
        Weight weight = new Weight(7, 8, 1000);
        double result = weight.getConversionResult();
        assertEquals(16000, result, DELTA);
    }
    @Test
    public void testPoundToCarrat1(){
        Weight weight = new Weight(7, 9, 1);
        double result = weight.getConversionResult();
        assertEquals(2267.96, result, DELTA);
    }
    @Test
    public void testPoundToCarrat2(){
        Weight weight = new Weight(7, 9, 1000);
        double result = weight.getConversionResult();
        assertEquals(2267960, result, DELTA);
    }
    @Test
    public void testPoundToAtomicMassUnit1(){
        Weight weight = new Weight(7, 10, 1);
        double result = weight.getConversionResult();
        assertEquals(2.731593008E+26, result, DELTA);
    }
    @Test
    public void testPoundToAtomicMassUnit2(){
        Weight weight = new Weight(7, 10, 1000);
        double result = weight.getConversionResult();
        assertEquals(2.731593008E+29, result, DELTA);
    }

    //Carrat To .... Tests
    @Test
    public void testOunceToKilogram1(){
        Weight weight = new Weight(8, 1, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0283495, result, DELTA);
    }
    @Test
    public void testOunceToKilogram2(){
        Weight weight = new Weight(8, 1, 1000);
        double result = weight.getConversionResult();
        assertEquals(28.3495, result, DELTA);
    }
    @Test
    public void testOunceToGram1(){
        Weight weight = new Weight(8, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(28.3495, result, DELTA);
    }
    @Test
    public void testOunceToGram2(){
        Weight weight = new Weight(8, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(28349.5, result, DELTA);
    }
    @Test
    public void testOunceToMilligram1(){
        Weight weight = new Weight(8, 3, 1);
        double result = weight.getConversionResult();
        assertEquals(28349.5, result, DELTA);
    }
    @Test
    public void testOunceToMilligram2(){
        Weight weight = new Weight(8, 3, 1000);
        double result = weight.getConversionResult();
        assertEquals(2.834949254408346E7, result, DELTA);
    }
    @Test
    public void testOunceToMetricTon1(){
        Weight weight = new Weight(8, 4, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0000283495, result, DELTA);
    }
    @Test
    public void testOunceToMetricTon2(){
        Weight weight = new Weight(8, 4, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0283495, result, DELTA);
    }
    @Test
    public void testOunceToLongTon1(){
        Weight weight = new Weight(8, 5, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0000279018, result, DELTA);
    }
    @Test
    public void testOunceToLongTon2(){
        Weight weight = new Weight(8, 5, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0279017857, result, DELTA);
    }
    @Test
    public void testOunceToShortTon1(){
        Weight weight = new Weight(8, 6, 1);
        double result = weight.getConversionResult();
        assertEquals(0.00003125, result, DELTA);
    }
    @Test
    public void testOunceToShortTon2(){
        Weight weight = new Weight(8, 6, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.03125, result, DELTA);
    }
    @Test
    public void testOunceToPound1(){
        Weight weight = new Weight(8, 7, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0625, result, DELTA);
    }
    @Test
    public void testOunceToPound2(){
        Weight weight = new Weight(8, 7, 1000);
        double result = weight.getConversionResult();
        assertEquals(62.5, result, DELTA);
    }
    @Test
    public void testOunceToCarrat1(){
        Weight weight = new Weight(8, 9, 1);
        double result = weight.getConversionResult();
        assertEquals(141.7475, result, DELTA);
    }
    @Test
    public void testOunceToCarrat2(){
        Weight weight = new Weight(8, 9, 1000);
        double result = weight.getConversionResult();
        assertEquals(141747.5, result, DELTA);
    }
    @Test
    public void testOunceToAtomicMassUnit1(){
        Weight weight = new Weight(8, 10, 1);
        double result = weight.getConversionResult();
        assertEquals(1.70724563E+25, result, DELTA);
    }
    @Test
    public void testOunceToAtomicMassUnit2(){
        Weight weight = new Weight(8, 10, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.70724563E+28, result, DELTA);
    }

    //Carrat To .... Tests
    @Test
    public void testCarratToKilogram1(){
        Weight weight = new Weight(9, 1, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0002, result, DELTA);
    }
    @Test
    public void testCarratToKilogram2(){
        Weight weight = new Weight(9, 1, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.2, result, DELTA);
    }
    @Test
    public void testCarratToGram1(){
        Weight weight = new Weight(9, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(0.2, result, DELTA);
    }
    @Test
    public void testCarratToGram2(){
        Weight weight = new Weight(9, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(200, result, DELTA);
    }
    @Test
    public void testCarratToMilligram1(){
        Weight weight = new Weight(9, 3, 1);
        double result = weight.getConversionResult();
        assertEquals(200, result, DELTA);
    }
    @Test
    public void testCarratToMilligram2(){
        Weight weight = new Weight(9, 3, 1000);
        double result = weight.getConversionResult();
        assertEquals(200000, result, DELTA);
    }
    @Test
    public void testCarratToMetricTon1(){
        Weight weight = new Weight(9, 4, 1);
        double result = weight.getConversionResult();
        assertEquals(2.E-7, result, DELTA);
    }
    @Test
    public void testCarratToMetricTon2(){
        Weight weight = new Weight(9, 4, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0002, result, DELTA);
    }
    @Test
    public void testCarratToLongTon1(){
        Weight weight = new Weight(9, 5, 1);
        double result = weight.getConversionResult();
        assertEquals(1.96841466E-7, result, DELTA);
    }
    @Test
    public void testCarratToLongTon2(){
        Weight weight = new Weight(9, 5, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0001968415, result, DELTA);
    }
    @Test
    public void testCarratToShortTon1(){
        Weight weight = new Weight(9, 6, 1);
        double result = weight.getConversionResult();
        assertEquals(2.20462442E-7, result, DELTA);
    }
    @Test
    public void testCarratToShortTon2(){
        Weight weight = new Weight(9, 6, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.0002204624, result, DELTA);
    }
    @Test
    public void testCarratToPound1(){
        Weight weight = new Weight(9, 7, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0004409249, result, DELTA);
    }
    @Test
    public void testCarratToPound2(){
        Weight weight = new Weight(9, 7, 1000);
        double result = weight.getConversionResult();
        assertEquals(0.440924884, result, DELTA);
    }
    @Test
    public void testCarratToOunce1(){
        Weight weight = new Weight(9, 8, 1);
        double result = weight.getConversionResult();
        assertEquals(0.0070547981, result, DELTA);
    }
    @Test
    public void testCarratToOunce2(){
        Weight weight = new Weight(9, 8, 1000);
        double result = weight.getConversionResult();
        assertEquals(7.0547981446, result, DELTA);
    }
    @Test
    public void testCarratToAtomicMassUnit1(){
        Weight weight = new Weight(9, 10, 1);
        double result = weight.getConversionResult();
        assertEquals(1.20442733E+23, result, DELTA);
    }
    @Test
    public void testCarratToAtomicMassUnit2(){
        Weight weight = new Weight(9, 10, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.20442733E+26, result, DELTA);
    }

    //Atomic Mass Unit To .... Tests
    @Test
    public void testAtomicMassUnitToKilogram1(){
        Weight weight = new Weight(9, 1, 1);
        double result = weight.getConversionResult();
        assertEquals(1.660540199E-27, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToKilogram2(){
        Weight weight = new Weight(10, 1, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.660540199E-24, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToGram1(){
        Weight weight = new Weight(10, 2, 1);
        double result = weight.getConversionResult();
        assertEquals(1.660540199E-24, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToGram2(){
        Weight weight = new Weight(10, 2, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.660540199E-21, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitoMilligram1(){
        Weight weight = new Weight(10, 3, 1);
        double result = weight.getConversionResult();
        assertEquals(1.660540199E-21, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToMilligram2(){
        Weight weight = new Weight(10, 3, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.660540199E-18, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToMetricTon1(){
        Weight weight = new Weight(10, 4, 1);
        double result = weight.getConversionResult();
        assertEquals(1.660540199E-30, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToMetricTon2(){
        Weight weight = new Weight(10, 4, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.660540199E-27, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToLongTon1(){
        Weight weight = new Weight(10, 5, 1);
        double result = weight.getConversionResult();
        assertEquals(1.634315837E-30, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToLongTon2(){
        Weight weight = new Weight(10, 5, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.634315837E-27, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToShortTon1(){
        Weight weight = new Weight(10, 6, 1);
        double result = weight.getConversionResult();
        assertEquals(1.830433737E-30, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToShortTon2(){
        Weight weight = new Weight(10, 6, 1000);
        double result = weight.getConversionResult();
        assertEquals(1.830433737E-27, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToPound1(){
        Weight weight = new Weight(10, 7, 1);
        double result = weight.getConversionResult();
        assertEquals(3.660867475E-27, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToPound2(){
        Weight weight = new Weight(10, 7, 1000);
        double result = weight.getConversionResult();
        assertEquals(3.660867475E-24, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToOunce1(){
        Weight weight = new Weight(10, 8, 1);
        double result = weight.getConversionResult();
        assertEquals(5.85738796E-26, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToOunce2(){
        Weight weight = new Weight(10, 8, 1000);
        double result = weight.getConversionResult();
        assertEquals(5.85738796E-23, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToCarrat1(){
        Weight weight = new Weight(10, 9, 1);
        double result = weight.getConversionResult();
        assertEquals(8.302700999E-24, result, DELTA);
    }
    @Test
    public void testAtomicMassUnitToCarrat2(){
        Weight weight = new Weight(10, 9, 1000);
        double result = weight.getConversionResult();
        assertEquals(8.302700999E-21, result, DELTA);
    }

}