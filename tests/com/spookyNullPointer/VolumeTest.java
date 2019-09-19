package com.spookyNullPointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeTest {

    private static final double DELTA = 1;

    //Cubic Meter To .... Tests
    @Test
    public void testCbMeterToCbKilometer1(){
        Volume vol = new Volume(1, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testCbMeterToCbKilometer2(){
        Volume vol = new Volume(1, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testCbMeterToCbCentimeter1(){
        Volume vol = new Volume(1, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testCbMeterToCbCentimeter2(){
        Volume vol = new Volume(1, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testCbMeterToCbMillimeter1(){
        Volume vol = new Volume(1, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testCbMeterToCbMillimeter2(){
        Volume vol = new Volume(1, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000000000D, result, DELTA);
    }
    @Test
    public void testCbMeterToLiter1(){
        Volume vol = new Volume(1, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testCbMeterToLiter2(){
        Volume vol = new Volume(1, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testCbMeterToMillimeter1(){
        Volume vol = new Volume(1, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testCbMeterToMillimeter2(){
        Volume vol = new Volume(1, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testCbMeterToUSGallon1(){
        Volume vol = new Volume(1, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(264.17217686, result, DELTA);
    }
    @Test
    public void testCbMeterToUSGallon2(){
        Volume vol = new Volume(1, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(264172.17686, result, DELTA);
    }
    @Test
    public void testCbMeterToUSQuart1(){
        Volume vol = new Volume(1, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(1056.6887074, result, DELTA);
    }
    @Test
    public void testCbMeterToUSQuart2(){
        Volume vol = new Volume(1, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(1056688.7074, result, DELTA);
    }
    @Test
    public void testCbMeterToUSPint1(){
        Volume vol = new Volume(1, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(2113.3774149, result, DELTA);
    }
    @Test
    public void testCbMeterToUSPint2(){
        Volume vol = new Volume(1, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(2113377.4149, result, DELTA);
    }
    @Test
    public void testCbMeterToUSCup1(){
        Volume vol = new Volume(1, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(4226.7548297, result, DELTA);
    }
    @Test
    public void testCbMeterToUSCup2(){
        Volume vol = new Volume(1, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(4226754.8297, result, DELTA);
    }
    @Test
    public void testCbMeterToUSFluidOunce1(){
        Volume vol = new Volume(1, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(33814.038638, result, DELTA);
    }
    @Test
    public void testCbMeterToUSFluidOunce2(){
        Volume vol = new Volume(1, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(33814038.638, result, DELTA);
    }
    @Test
    public void testCbMeterToUSTableSpoon1(){
        Volume vol = new Volume(1, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(67628.077276, result, DELTA);
    }
    @Test
    public void testCbMeterToUSTableSpoon2(){
        Volume vol = new Volume(1, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(67628077.276, result, DELTA);
    }
    @Test
    public void testCbMeterToUSTeaSpoon1(){
        Volume vol = new Volume(1, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(202884.23183, result, DELTA);
    }
    @Test
    public void testCbMeterToUSTeaSpoon2(){
        Volume vol = new Volume(1, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(202884231.83, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialGallon1(){
        Volume vol = new Volume(1, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(219.9692483, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialGallon2(){
        Volume vol = new Volume(1, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(219969.2483, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialQuart1(){
        Volume vol = new Volume(1, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(879.8769932, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialQuart2(){
        Volume vol = new Volume(1, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(879876.9932, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialPint(){
        Volume vol = new Volume(1, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(1759.7539864, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialPint2(){
        Volume vol = new Volume(1, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(1759753.9864, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialFluidOunce1(){
        Volume vol = new Volume(1, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(35195.079728, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialFluidOunce2(){
        Volume vol = new Volume(1, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(35195079.728, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialTableSpoon1(){
        Volume vol = new Volume(1, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(56312.127565, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialTableSpoon2(){
        Volume vol = new Volume(1, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(56312127.565, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialTeaSpoon1(){
        Volume vol = new Volume(1, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(168936.38269, result, DELTA);
    }
    @Test
    public void testCbMeterToImperialTeaSpoon2(){
        Volume vol = new Volume(1, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(168936382.69, result, DELTA);
    }
    @Test
    public void testCbMeterToCubicMile1(){
        Volume vol = new Volume(1, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-10, result, DELTA);
    }
    @Test
    public void testCbMeterToCubicMile2(){
        Volume vol = new Volume(1, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-10, result, DELTA);
    }
    @Test
    public void testCbMeterToCubicYard1(){
        Volume vol = new Volume(1, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(1.3079506193, result, DELTA);
    }
    @Test
    public void testCbMeterToCubicYard2(){
        Volume vol = new Volume(1, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(1307.9506193, result, DELTA);
    }
    @Test
    public void testCbMeterToCubicFoot1(){
        Volume vol = new Volume(1, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(35.314666721, result, DELTA);
    }
    @Test
    public void testCbMeterToCubicFoot2(){
        Volume vol = new Volume(1, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(35314.666721, result, DELTA);
    }
    @Test
    public void testCbMeterToCubicInch1(){
        Volume vol = new Volume(1, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(61023.744095, result, DELTA);
    }
    @Test
    public void testCbMeterToCubicInch2(){
        Volume vol = new Volume(1, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(61023744.095, result, DELTA);
    }

    //Cubic Kilometer To ... Tests
    @Test
    public void testCbKilometerToCbMeter1(){
        Volume vol = new Volume(2, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testCbKilometerToCbMeter2(){
        Volume vol = new Volume(2, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000000000D, result, DELTA);
    }
    @Test
    public void testCbKilometerToCbCentimeter1(){
        Volume vol = new Volume(2, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(1000000000000000D, result, DELTA);
    }
    @Test
    public void testCbKilometerToCbCentimeter2(){
        Volume vol = new Volume(2, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000000000000000D, result, DELTA);
    }
    @Test
    public void testCbKilometerToCbMillimeter1(){
        Volume vol = new Volume(2, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(1000000000000000000D, result, DELTA);
    }
    @Test
    public void testCbKilometerToCbMillimeter2(){
        Volume vol = new Volume(2, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.E+21, result, DELTA);
    }
    @Test
    public void testCbKilometerToLiter1(){
        Volume vol = new Volume(2, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(1000000000000D, result, DELTA);
    }
    @Test
    public void testCbKilometerToLiter2(){
        Volume vol = new Volume(2, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000000000000D, result, DELTA);
    }
    @Test
    public void testCbKilometerToMillimeter1(){
        Volume vol = new Volume(2, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(1000000000000000D, result, DELTA);
    }
    @Test
    public void testCbKilometerToMillimeter2(){
        Volume vol = new Volume(2, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000000000000000D, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSGallon1(){
        Volume vol = new Volume(2, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(264172176858D, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSGallon2(){
        Volume vol = new Volume(2, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.64172176858E14, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSQuart1(){
        Volume vol = new Volume(2, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(1056688707432D, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSQuart2(){
        Volume vol = new Volume(2, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.056688707432E15, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSPint1(){
        Volume vol = new Volume(2, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(2113377414864D, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSPint2(){
        Volume vol = new Volume(2, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.113377414864E15, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSCup1(){
        Volume vol = new Volume(2, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(4226754829728D, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSCup2(){
        Volume vol = new Volume(2, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.226754829728E15, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSFluidOunce1(){
        Volume vol = new Volume(2, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(33814038637823D, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSFluidOunce2(){
        Volume vol = new Volume(2, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.3814038637823E16, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSTableSpoon1(){
        Volume vol = new Volume(2, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(67628077275645D, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSTableSpoon2(){
        Volume vol = new Volume(2, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(6.7628077275645E16, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSTeaSpoon1(){
        Volume vol = new Volume(2, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(202884231826936D, result, DELTA);
    }
    @Test
    public void testCbKilometerToUSTeaSpoon2(){
        Volume vol = new Volume(2, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.02884231826936E17, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialGallon1(){
        Volume vol = new Volume(2, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(219969248299D, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialGallon2(){
        Volume vol = new Volume(2, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.19969248299E14, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialQuart1(){
        Volume vol = new Volume(2, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(879876993196D, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialQuart2(){
        Volume vol = new Volume(2, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(8.79876993196E14, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialPint1(){
        Volume vol = new Volume(2, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(1759753986393D, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialPint2(){
        Volume vol = new Volume(2, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.759753986393E15, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialFluidOunce1(){
        Volume vol = new Volume(2, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(35195079727854D, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialFluidOunce2(){
        Volume vol = new Volume(2, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.5195079727854E16, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialTableSpoon1(){
        Volume vol = new Volume(2, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(56312127564566D, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialTableSpoon2(){
        Volume vol = new Volume(2, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(5.6312127564566E16, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialTeaSpoon1(){
        Volume vol = new Volume(2, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(168936382693699D, result, DELTA);
    }
    @Test
    public void testCbKilometerToImperialTeaSpoon2(){
        Volume vol = new Volume(2, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.68936382693699008E17, result, DELTA);
    }
    @Test
    public void testCbKilometerToCubicMile1(){
        Volume vol = new Volume(2, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2399128636, result, DELTA);
    }
    @Test
    public void testCbKilometerToCubicMile2(){
        Volume vol = new Volume(2, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(239.91286365, result, DELTA);
    }
    @Test
    public void testCbKilometerToCubicYard1(){
        Volume vol = new Volume(2, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(1307950619.3, result, DELTA);
    }
    @Test
    public void testCbKilometerToCubicYard2(){
        Volume vol = new Volume(2, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.3079506193E12, result, DELTA);
    }
    @Test
    public void testCbKilometerToCubicFoot1(){
        Volume vol = new Volume(2, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(35314666721D, result, DELTA);
    }
    @Test
    public void testCbKilometerToCubicFoot2(){
        Volume vol = new Volume(2, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.5314666721E13, result, DELTA);
    }
    @Test
    public void testCbKilometerToCubicInch1(){
        Volume vol = new Volume(2, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(61023744094732D, result, DELTA);
    }
    @Test
    public void testCbKilometerToCubicInch2(){
        Volume vol = new Volume(2, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(6.1023744094732E16, result, DELTA);
    }

    //Cubic Centimeter To ... Tests


}