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
    @Test
    public void testCbCentimeterToCbMeter1(){
        Volume vol = new Volume(3, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCbMeter2(){
        Volume vol = new Volume(3, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCbKilometer1(){
        Volume vol = new Volume(3, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(9.999999999E-16, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCbCKilometer2(){
        Volume vol = new Volume(3, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.E-12, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCbMillimeter1(){
        Volume vol = new Volume(3, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCbMillimeter2(){
        Volume vol = new Volume(3, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testCbCentimeterToLiter1(){
        Volume vol = new Volume(3, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testCbCentimeterToLiter2(){
        Volume vol = new Volume(3, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testCbCentimeterToMillimeter1(){
        Volume vol = new Volume(3, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testCbCentimeterToMillimeter2(){
        Volume vol = new Volume(3, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSGallon1(){
        Volume vol = new Volume(3, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0002641722, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSGallon2(){
        Volume vol = new Volume(3, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.2641721769, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSQuart1(){
        Volume vol = new Volume(3, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0010566887, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSQuart2(){
        Volume vol = new Volume(3, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.0566887074, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSPint1(){
        Volume vol = new Volume(3, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0021133774, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSPint2(){
        Volume vol = new Volume(3, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.1133774149, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSCup1(){
        Volume vol = new Volume(3, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0042267548, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSCup2(){
        Volume vol = new Volume(3, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.2267548297, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSFluidOunce1(){
        Volume vol = new Volume(3, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0338140386, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSFluidOunce2(){
        Volume vol = new Volume(3, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(33.814038638, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSTableSpoon1(){
        Volume vol = new Volume(3, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0676280773, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSTableSpoon2(){
        Volume vol = new Volume(3, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(67.628077276, result, DELTA);
    }
    @Test
    public void testCbCentimeterToUSTeaSpoon1(){
        Volume vol = new Volume(3, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2028842318, result, DELTA);
    }
    @Test
    public void testCbCentimeteroUSTeaSpoon2(){
        Volume vol = new Volume(3, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(202.88423183, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialGallon1(){
        Volume vol = new Volume(3, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0002199692, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialGallon2(){
        Volume vol = new Volume(3, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.2199692483, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialQuart1(){
        Volume vol = new Volume(3, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.000879877, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialQuart2(){
        Volume vol = new Volume(3, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.8798769932, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialPint1(){
        Volume vol = new Volume(3, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.001759754, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialPint2(){
        Volume vol = new Volume(3, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.7597539864, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialFluidOunce1(){
        Volume vol = new Volume(3, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0351950797, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialFluidOunce2(){
        Volume vol = new Volume(3, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(35.195079728, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialTableSpoon1(){
        Volume vol = new Volume(3, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0563121276, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialTableSpoon2(){
        Volume vol = new Volume(3, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(56.312127565, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialTeaSpoon1(){
        Volume vol = new Volume(3, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(0.1689363827, result, DELTA);
    }
    @Test
    public void testCbCentimeterToImperialTeaSpoon2(){
        Volume vol = new Volume(3, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(168.93638269, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCubicMile1(){
        Volume vol = new Volume(3, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-16, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCubicMile2(){
        Volume vol = new Volume(3, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-13, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCubicYard1(){
        Volume vol = new Volume(3, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.000001308, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCubicYard2(){
        Volume vol = new Volume(3, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0013079506, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCubicFoot1(){
        Volume vol = new Volume(3, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000353147, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCubicFoot2(){
        Volume vol = new Volume(3, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0353146667, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCubicInch1(){
        Volume vol = new Volume(3, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0610237441, result, DELTA);
    }
    @Test
    public void testCbCentimeterToCubicInch2(){
        Volume vol = new Volume(3, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(61.023744095, result, DELTA);
    }

    //Cubic Millimeter To ... Tests
    @Test
    public void testCbMillimeterToCbMeter1(){
        Volume vol = new Volume(4, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCbMeter2(){
        Volume vol = new Volume(4, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCbKilometer1(){
        Volume vol = new Volume(4, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(1.E-18, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCbCKilometer2(){
        Volume vol = new Volume(4, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.E-15, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCbCentimeter1(){
        Volume vol = new Volume(4, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCbCentimeter2(){
        Volume vol = new Volume(4, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testCbMillimeterToLiter1(){
        Volume vol = new Volume(4, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testCbMillimeterToLiter2(){
        Volume vol = new Volume(4, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testCbMillimeterToMillimeter1(){
        Volume vol = new Volume(4, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testCbMillimeterToMillimeter2(){
        Volume vol = new Volume(4, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSGallon1(){
        Volume vol = new Volume(4, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(2.641721768E-7, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSGallon2(){
        Volume vol = new Volume(4, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0002641722, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSQuart1(){
        Volume vol = new Volume(4, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000010567, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSQuart2(){
        Volume vol = new Volume(4, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0010566887, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSPint1(){
        Volume vol = new Volume(4, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000021134, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSPint2(){
        Volume vol = new Volume(4, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0021133774, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSCup1(){
        Volume vol = new Volume(4, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000042268, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSCup2(){
        Volume vol = new Volume(4, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0042267548, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSFluidOunce1(){
        Volume vol = new Volume(4, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(0.000033814, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSFluidOunce2(){
        Volume vol = new Volume(4, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0338140386, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSTableSpoon1(){
        Volume vol = new Volume(4, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000676281, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSTableSpoon2(){
        Volume vol = new Volume(4, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0676280773, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSTeaSpoon1(){
        Volume vol = new Volume(4, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0002028842, result, DELTA);
    }
    @Test
    public void testCbMillimeterToUSTeaSpoon2(){
        Volume vol = new Volume(4, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.2028842318, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialGallon1(){
        Volume vol = new Volume(4, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(2.199692482E-7, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialGallon2(){
        Volume vol = new Volume(4, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0002199692, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialQuart1(){
        Volume vol = new Volume(4, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(8.798769931E-7, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialQuart2(){
        Volume vol = new Volume(4, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.000879877, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialPint1(){
        Volume vol = new Volume(4, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000017598, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialPint2(){
        Volume vol = new Volume(4, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.001759754, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialFluidOunce1(){
        Volume vol = new Volume(4, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000351951, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialFluidOunce2(){
        Volume vol = new Volume(4, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0351950797, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialTableSpoon1(){
        Volume vol = new Volume(4, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000563121, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialTableSpoon2(){
        Volume vol = new Volume(4, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0563121276, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialTeaSpoon1(){
        Volume vol = new Volume(4, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0001689364, result, DELTA);
    }
    @Test
    public void testCbMillimeterToImperialTeaSpoon2(){
        Volume vol = new Volume(4, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.1689363827, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCubicMile1(){
        Volume vol = new Volume(4, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-19, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCubicMile2(){
        Volume vol = new Volume(4, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-16, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCubicYard1(){
        Volume vol = new Volume(4, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(1.307950619E-9, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCubicYard2(){
        Volume vol = new Volume(4, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.000001308, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCubicFoot1(){
        Volume vol = new Volume(4, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(3.531466672E-8, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCubicFoot2(){
        Volume vol = new Volume(4, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0000353147, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCubicInch1(){
        Volume vol = new Volume(4, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000610237, result, DELTA);
    }
    @Test
    public void testCbMillimeterToCubicInch2(){
        Volume vol = new Volume(4, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0610237441, result, DELTA);
    }


    //Milliliter To ... Tests
    @Test
    public void testLiterToCbMeter1(){
        Volume vol = new Volume(5, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testLiterToCbMeter2(){
        Volume vol = new Volume(5, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testLiterToCbKilometer1(){
        Volume vol = new Volume(5, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(1.E-12, result, DELTA);
    }
    @Test
    public void testLiterToCbCKilometer2(){
        Volume vol = new Volume(5, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.E-9, result, DELTA);
    }
    @Test
    public void testLiterToCbCentimeter1(){
        Volume vol = new Volume(5, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testLiterToCbCentimeter2(){
        Volume vol = new Volume(5, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testLiterToMillimeter1(){
        Volume vol = new Volume(5, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testLiterToMillimeter2(){
        Volume vol = new Volume(5, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000000, result, DELTA);
    }
    @Test
    public void testLiterToMilliliter1(){
        Volume vol = new Volume(5, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testLiterToMilliliter2(){
        Volume vol = new Volume(5, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testLiterToUSGallon1(){
        Volume vol = new Volume(5, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2641721769, result, DELTA);
    }
    @Test
    public void testLiterToUSGallon2(){
        Volume vol = new Volume(5, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(264.17217686, result, DELTA);
    }
    @Test
    public void testLiterToUSQuart1(){
        Volume vol = new Volume(5, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(1.0566887074, result, DELTA);
    }
    @Test
    public void testLiterToUSQuart2(){
        Volume vol = new Volume(5, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(1056.6887074, result, DELTA);
    }
    @Test
    public void testLiterToUSPint1(){
        Volume vol = new Volume(5, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(2.1133774149, result, DELTA);
    }
    @Test
    public void testLiterToUSPint2(){
        Volume vol = new Volume(5, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(2113.3774149, result, DELTA);
    }
    @Test
    public void testLiterToUSCup1(){
        Volume vol = new Volume(5, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(4.2267548297, result, DELTA);
    }
    @Test
    public void testLiterToUSCup2(){
        Volume vol = new Volume(5, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(4226.7548297, result, DELTA);
    }
    @Test
    public void testLiterToUSFluidOunce1(){
        Volume vol = new Volume(5, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(33.814038638, result, DELTA);
    }
    @Test
    public void testLiterToUSFluidOunce2(){
        Volume vol = new Volume(5, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(33814.038638, result, DELTA);
    }
    @Test
    public void testLiterToUSTableSpoon1(){
        Volume vol = new Volume(5, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(67.628077276, result, DELTA);
    }
    @Test
    public void testLiterToUSTableSpoon2(){
        Volume vol = new Volume(5, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(67628.077276, result, DELTA);
    }
    @Test
    public void testLiterToUSTeaSpoon1(){
        Volume vol = new Volume(5, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(202.88423183, result, DELTA);
    }
    @Test
    public void testLiterToUSTeaSpoon2(){
        Volume vol = new Volume(5, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(202884.23183, result, DELTA);
    }
    @Test
    public void testLiterToImperialGallon1(){
        Volume vol = new Volume(5, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2199692483, result, DELTA);
    }
    @Test
    public void testLiterToImperialGallon2(){
        Volume vol = new Volume(5, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(219.9692483, result, DELTA);
    }
    @Test
    public void testLiterToImperialQuart1(){
        Volume vol = new Volume(5, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.8798769932, result, DELTA);
    }
    @Test
    public void testLiterToImperialQuart2(){
        Volume vol = new Volume(5, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(879.8769932, result, DELTA);
    }
    @Test
    public void testLiterToImperialPint1(){
        Volume vol = new Volume(5, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(1.7597539864, result, DELTA);
    }
    @Test
    public void testLiterToImperialPint2(){
        Volume vol = new Volume(5, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(1759.7539864, result, DELTA);
    }
    @Test
    public void testLiterToImperialFluidOunce1(){
        Volume vol = new Volume(5, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(35.195079728, result, DELTA);
    }
    @Test
    public void testLiterToImperialFluidOunce2(){
        Volume vol = new Volume(5, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(35195.079728, result, DELTA);
    }
    @Test
    public void testLiterToImperialTableSpoon1(){
        Volume vol = new Volume(5, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(56.312127565, result, DELTA);
    }
    @Test
    public void testLiterToImperialTableSpoon2(){
        Volume vol = new Volume(5, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(56312.127565, result, DELTA);
    }
    @Test
    public void testLiterToImperialTeaSpoon1(){
        Volume vol = new Volume(5, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(168.93638269, result, DELTA);
    }
    @Test
    public void testLiterToImperialTeaSpoon2(){
        Volume vol = new Volume(5, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(168936.38269, result, DELTA);
    }
    @Test
    public void testLiterToCubicMile1(){
        Volume vol = new Volume(5, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-13, result, DELTA);
    }
    @Test
    public void testLiterToCubicMile2(){
        Volume vol = new Volume(5, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-10, result, DELTA);
    }
    @Test
    public void testLiterToCubicYard1(){
        Volume vol = new Volume(5, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0013079506, result, DELTA);
    }
    @Test
    public void testLiterToCubicYard2(){
        Volume vol = new Volume(5, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.3079506193, result, DELTA);
    }
    @Test
    public void testLiterToCubicFoot1(){
        Volume vol = new Volume(5, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0353146667, result, DELTA);
    }
    @Test
    public void testLiterToCubicFoot2(){
        Volume vol = new Volume(5, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(35.314666721, result, DELTA);
    }
    @Test
    public void testLiterToCubicInch1(){
        Volume vol = new Volume(5, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(61.023744095, result, DELTA);
    }
    @Test
    public void testLiterToCubicInch2(){
        Volume vol = new Volume(5, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(61023.744095, result, DELTA);
    }


    //Milliliter To ... Tests
    @Test
    public void testMilliliterToCbMeter1(){
        Volume vol = new Volume(6, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.000001, result, DELTA);
    }
    @Test
    public void testMilliliterToCbMeter2(){
        Volume vol = new Volume(6, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMilliliterToCbKilometer1(){
        Volume vol = new Volume(6, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(9.999999999E-16, result, DELTA);
    }
    @Test
    public void testMilliliterToCbCKilometer2(){
        Volume vol = new Volume(6, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.E-12, result, DELTA);
    }
    @Test
    public void testMilliliterToCbCentimeter1(){
        Volume vol = new Volume(6, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testMilliliterToCbCentimeter2(){
        Volume vol = new Volume(6, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testMilliliterToMillimeter1(){
        Volume vol = new Volume(6, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(1000, result, DELTA);
    }
    @Test
    public void testMilliliterToMillimeter2(){
        Volume vol = new Volume(6, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(1000000, result, DELTA);
    }
    @Test
    public void testMilliliterToLiter1(){
        Volume vol = new Volume(6, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.001, result, DELTA);
    }
    @Test
    public void testMilliliterToLiter2(){
        Volume vol = new Volume(6, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(1, result, DELTA);
    }
    @Test
    public void testMilliliterToUSGallon1(){
        Volume vol = new Volume(6, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0002641722, result, DELTA);
    }
    @Test
    public void testMilliliterToUSGallon2(){
        Volume vol = new Volume(6, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.2641721769, result, DELTA);
    }
    @Test
    public void testMilliliterToUSQuart1(){
        Volume vol = new Volume(6, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0010566887, result, DELTA);
    }
    @Test
    public void testMilliliterToUSQuart2(){
        Volume vol = new Volume(6, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.0566887074, result, DELTA);
    }
    @Test
    public void testMilliliterToUSPint1(){
        Volume vol = new Volume(6, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0021133774, result, DELTA);
    }
    @Test
    public void testMilliliterToUSPint2(){
        Volume vol = new Volume(6, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.1133774149, result, DELTA);
    }
    @Test
    public void testMilliliterToUSCup1(){
        Volume vol = new Volume(6, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0042267548, result, DELTA);
    }
    @Test
    public void testMilliliterToUSCup2(){
        Volume vol = new Volume(6, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.2267548297, result, DELTA);
    }
    @Test
    public void testMilliliterToUSFluidOunce1(){
        Volume vol = new Volume(6, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0338140386, result, DELTA);
    }
    @Test
    public void testMilliliterToUSFluidOunce2(){
        Volume vol = new Volume(6, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(33.814038638, result, DELTA);
    }
    @Test
    public void testMilliliterToUSTableSpoon1(){
        Volume vol = new Volume(6, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0676280773, result, DELTA);
    }
    @Test
    public void testMilliliterToUSTableSpoon2(){
        Volume vol = new Volume(6, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(67.628077276, result, DELTA);
    }
    @Test
    public void testMilliliterToUSTeaSpoon1(){
        Volume vol = new Volume(6, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2028842318, result, DELTA);
    }
    @Test
    public void testMilliliterToUSTeaSpoon2(){
        Volume vol = new Volume(6, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(202.88423183, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialGallon1(){
        Volume vol = new Volume(6, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0002199692, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialGallon2(){
        Volume vol = new Volume(6, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.2199692483, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialQuart1(){
        Volume vol = new Volume(6, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.000879877, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialQuart2(){
        Volume vol = new Volume(6, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.8798769932, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialPint1(){
        Volume vol = new Volume(6, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.001759754, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialPint2(){
        Volume vol = new Volume(6, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.7597539864, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialFluidOunce1(){
        Volume vol = new Volume(6, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0351950797, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialFluidOunce2(){
        Volume vol = new Volume(6, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(35.195079728, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialTableSpoon1(){
        Volume vol = new Volume(6, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0563121276, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialTableSpoon2(){
        Volume vol = new Volume(6, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(56.312127565, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialTeaSpoon1(){
        Volume vol = new Volume(6, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(0.1689363827, result, DELTA);
    }
    @Test
    public void testMilliliterToImperialTeaSpoon2(){
        Volume vol = new Volume(6, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(168.93638269, result, DELTA);
    }
    @Test
    public void testMilliliterToCubicMile1(){
        Volume vol = new Volume(6, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-16, result, DELTA);
    }
    @Test
    public void testMilliliterToCubicMile2(){
        Volume vol = new Volume(6, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.399128636E-13, result, DELTA);
    }
    @Test
    public void testMilliliterToCubicYard1(){
        Volume vol = new Volume(6, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.000001308, result, DELTA);
    }
    @Test
    public void testMilliliterToCubicYard2(){
        Volume vol = new Volume(6, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0013079506, result, DELTA);
    }
    @Test
    public void testMilliliterToCubicFoot1(){
        Volume vol = new Volume(6, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000353147, result, DELTA);
    }
    @Test
    public void testMilliliterToCubicFoot2(){
        Volume vol = new Volume(6, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0353146667, result, DELTA);
    }
    @Test
    public void testMilliliterToCubicInch1(){
        Volume vol = new Volume(6, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0610237441, result, DELTA);
    }
    @Test
    public void testMilliliterToCubicInch2(){
        Volume vol = new Volume(6, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(61.023744095, result, DELTA);
    }

    //US Gallon To ... Tests
    @Test
    public void testUSGallonToCbMeter1(){
        Volume vol = new Volume(7, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.00378541, result, DELTA);
    }
    @Test
    public void testUSGallonToCbMeter2(){
        Volume vol = new Volume(7, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.78541, result, DELTA);
    }
    @Test
    public void testUSGallonToCbKilometer1(){
        Volume vol = new Volume(7, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(3.78541E-12, result, DELTA);
    }
    @Test
    public void testUSGallonToCbCKilometer2(){
        Volume vol = new Volume(7, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.78541E-9, result, DELTA);
    }
    @Test
    public void testUSGallonToCbCentimeter1(){
        Volume vol = new Volume(7, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(3785.41, result, DELTA);
    }
    @Test
    public void testUSGallonToCbCentimeter2(){
        Volume vol = new Volume(7, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(3785410, result, DELTA);
    }
    @Test
    public void testUSGallonToMillimeter1(){
        Volume vol = new Volume(7, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(3785410, result, DELTA);
    }
    @Test
    public void testUSGallonToMillimeter2(){
        Volume vol = new Volume(7, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(3785410000D, result, DELTA);
    }
    @Test
    public void testUSGallonToLiter1(){
        Volume vol = new Volume(7, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(3.78541, result, DELTA);
    }
    @Test
    public void testUSGallonToLiter2(){
        Volume vol = new Volume(7, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(3785.41, result, DELTA);
    }
    @Test
    public void testUSGallonToMilliliter1(){
        Volume vol = new Volume(7, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(3785.41, result, DELTA);
    }
    @Test
    public void testUSGallonToMilliliter2(){
        Volume vol = new Volume(7, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(3785410, result, DELTA);
    }
    @Test
    public void testUSGallonToUSQuart1(){
        Volume vol = new Volume(7, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(4, result, DELTA);
    }
    @Test
    public void testUSGallonToUSQuart2(){
        Volume vol = new Volume(7, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(4000, result, DELTA);
    }
    @Test
    public void testUSGallonToUSPint1(){
        Volume vol = new Volume(7, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(8, result, DELTA);
    }
    @Test
    public void testUSGallonToUSPint2(){
        Volume vol = new Volume(7, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(8000, result, DELTA);
    }
    @Test
    public void testUSGallonToUSCup1(){
        Volume vol = new Volume(7, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(16, result, DELTA);
    }
    @Test
    public void testUSGallonToUSCup2(){
        Volume vol = new Volume(7, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(16000, result, DELTA);
    }
    @Test
    public void testUSGallonToUSFluidOunce1(){
        Volume vol = new Volume(7, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(128, result, DELTA);
    }
    @Test
    public void testUSGallonToUSFluidOunce2(){
        Volume vol = new Volume(7, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(128000, result, DELTA);
    }
    @Test
    public void testUSGallonToUSTableSpoon1(){
        Volume vol = new Volume(7, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(256, result, DELTA);
    }
    @Test
    public void testUSGallonToUSTableSpoon2(){
        Volume vol = new Volume(7, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(256000, result, DELTA);
    }
    @Test
    public void testUSGallonToUSTeaSpoon1(){
        Volume vol = new Volume(7, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(768, result, DELTA);
    }
    @Test
    public void testUSGallonToUSTeaSpoon2(){
        Volume vol = new Volume(7, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(768000, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialGallon1(){
        Volume vol = new Volume(7, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.8326737922, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialGallon2(){
        Volume vol = new Volume(7, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(832.6737922, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialQuart1(){
        Volume vol = new Volume(7, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(3.3306951688, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialQuart2(){
        Volume vol = new Volume(7, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(3330.6951688, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialPint1(){
        Volume vol = new Volume(7, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(6.6613903376, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialPint2(){
        Volume vol = new Volume(7, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(6661.3903376, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialFluidOunce1(){
        Volume vol = new Volume(7, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(133.22780675, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialFluidOunce2(){
        Volume vol = new Volume(7, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(133227.80675, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialTableSpoon1(){
        Volume vol = new Volume(7, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(213.1644908, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialTableSpoon2(){
        Volume vol = new Volume(7, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(213164.4908, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialTeaSpoon1(){
        Volume vol = new Volume(7, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(639.49347241, result, DELTA);
    }
    @Test
    public void testUSGallonToImperialTeaSpoon2(){
        Volume vol = new Volume(7, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(639493.47241, result, DELTA);
    }
    @Test
    public void testUSGallonToCubicMile1(){
        Volume vol = new Volume(7, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(9.081685531E-13, result, DELTA);
    }
    @Test
    public void testUSGallonToCubicMile2(){
        Volume vol = new Volume(7, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(9.081685531E-10, result, DELTA);
    }
    @Test
    public void testUSGallonToCubicYard1(){
        Volume vol = new Volume(7, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0049511294, result, DELTA);
    }
    @Test
    public void testUSGallonToCubicYard2(){
        Volume vol = new Volume(7, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.9511293539, result, DELTA);
    }
    @Test
    public void testUSGallonToCubicFoot1(){
        Volume vol = new Volume(7, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.1336804926, result, DELTA);
    }
    @Test
    public void testUSGallonToCubicFoot2(){
        Volume vol = new Volume(7, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(133.68049255, result, DELTA);
    }
    @Test
    public void testUSGallonToCubicInch1(){
        Volume vol = new Volume(7, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(230.99989113, result, DELTA);
    }
    @Test
    public void testUSGallonToCubicInch2(){
        Volume vol = new Volume(7, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(230999.89113, result, DELTA);
    }

    //US Quart To ... Tests
    @Test
    public void testUSQuartToCbMeter1(){
        Volume vol = new Volume(8, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0009463525, result, DELTA);
    }
    @Test
    public void testUSQuartToCbMeter2(){
        Volume vol = new Volume(8, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.9463525, result, DELTA);
    }
    @Test
    public void testUSGQuartToCbKilometer1(){
        Volume vol = new Volume(8, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(9.463525E-13, result, DELTA);
    }
    @Test
    public void testUSQuartToCbCKilometer2(){
        Volume vol = new Volume(8, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(9.463525E-10, result, DELTA);
    }
    @Test
    public void testUSQuartToCbCentimeter1(){
        Volume vol = new Volume(8, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(946.3525, result, DELTA);
    }
    @Test
    public void testUSQuartToCbCentimeter2(){
        Volume vol = new Volume(8, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(946352.5, result, DELTA);
    }
    @Test
    public void testUSQuartToMillimeter1(){
        Volume vol = new Volume(8, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(946342.3866754993, result, DELTA);
    }
    @Test
    public void testUSQuartToMillimeter2(){
        Volume vol = new Volume(8, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(9.463423866754992E8, result, DELTA);
    }
    @Test
    public void testUSQuartToLiter1(){
        Volume vol = new Volume(8, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.9463525, result, DELTA);
    }
    @Test
    public void testUSQuartToLiter2(){
        Volume vol = new Volume(8, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(946.3525, result, DELTA);
    }
    @Test
    public void testUSQuartToMilliliter1(){
        Volume vol = new Volume(8, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(946.3525, result, DELTA);
    }
    @Test
    public void testUSQuartToMilliliter2(){
        Volume vol = new Volume(8, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(946352.5, result, DELTA);
    }
    @Test
    public void testUSQuartToUSGallon1(){
        Volume vol = new Volume(8, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.25, result, DELTA);
    }
    @Test
    public void testUSQuartToUSGallon2(){
        Volume vol = new Volume(8, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(250, result, DELTA);
    }
    @Test
    public void testUSQuartToUSPint1(){
        Volume vol = new Volume(8, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(2, result, DELTA);
    }
    @Test
    public void testUSQuartToUSPint2(){
        Volume vol = new Volume(8, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(2000, result, DELTA);
    }
    @Test
    public void testUSQuartToUSCup1(){
        Volume vol = new Volume(8, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(4, result, DELTA);
    }
    @Test
    public void testUSQuartToUSCup2(){
        Volume vol = new Volume(8, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(4000, result, DELTA);
    }
    @Test
    public void testUSQuartToUSFluidOunce1(){
        Volume vol = new Volume(8, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(32, result, DELTA);
    }
    @Test
    public void testUSQuartToUSFluidOunce2(){
        Volume vol = new Volume(8, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(32000, result, DELTA);
    }
    @Test
    public void testUSQuartToUSTableSpoon1(){
        Volume vol = new Volume(8, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(64, result, DELTA);
    }
    @Test
    public void testUSQuartToUSTableSpoon2(){
        Volume vol = new Volume(8, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(64000, result, DELTA);
    }
    @Test
    public void testUSQuartToUSTeaSpoon1(){
        Volume vol = new Volume(8, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(192, result, DELTA);
    }
    @Test
    public void testUSQuartToUSTeaSpoon2(){
        Volume vol = new Volume(8, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(192000, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialGallon1(){
        Volume vol = new Volume(8, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2081684481, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialGallon2(){
        Volume vol = new Volume(8, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(208.16844805, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialQuart1(){
        Volume vol = new Volume(8, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.8326737922, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialQuart2(){
        Volume vol = new Volume(8, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(832.6737922, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialPint1(){
        Volume vol = new Volume(8, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(1.6653475844, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialPint2(){
        Volume vol = new Volume(8, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(1665.3475844, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialFluidOunce1(){
        Volume vol = new Volume(8, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(33.306951688, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialFluidOunce2(){
        Volume vol = new Volume(8, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(33306.951688, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialTableSpoon1(){
        Volume vol = new Volume(8, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(53.291122701, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialTableSpoon2(){
        Volume vol = new Volume(8, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(53291.122701, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialTeaSpoon1(){
        Volume vol = new Volume(8, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(159.8733681, result, DELTA);
    }
    @Test
    public void testUSQuartToImperialTeaSpoon2(){
        Volume vol = new Volume(8, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(159873.3681, result, DELTA);
    }
    @Test
    public void testUSQuartToCubicMile1(){
        Volume vol = new Volume(8, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(2.270421382E-13, result, DELTA);
    }
    @Test
    public void testUSQuartToCubicMile2(){
        Volume vol = new Volume(8, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.270421382E-10, result, DELTA);
    }
    @Test
    public void testUSQuartToCubicYard1(){
        Volume vol = new Volume(8, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0012377823, result, DELTA);
    }
    @Test
    public void testUSQuartToCubicYard2(){
        Volume vol = new Volume(8, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.2377823385, result, DELTA);
    }
    @Test
    public void testUSQuartToCubicFoot1(){
        Volume vol = new Volume(8, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0334201231, result, DELTA);
    }
    @Test
    public void testUSQuartToCubicFoot2(){
        Volume vol = new Volume(8, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(33.420123139, result, DELTA);
    }
    @Test
    public void testUSQuartToCubicInch1(){
        Volume vol = new Volume(8, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(57.749972783, result, DELTA);
    }
    @Test
    public void testUSQuartToCubicInch2(){
        Volume vol = new Volume(8, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(57749.972783, result, DELTA);
    }


    //US Pint To ... Test
    @Test
    public void testUSPintToCbMeter1(){
        Volume vol = new Volume(9, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0004731763, result, DELTA);
    }
    @Test
    public void testUSPintToCbMeter2(){
        Volume vol = new Volume(9, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.47317625, result, DELTA);
    }
    @Test
    public void testUSPintToCbKilometer1(){
        Volume vol = new Volume(9, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(4.7317625E-13, result, DELTA);
    }
    @Test
    public void testUSPintToCbCKilometer2(){
        Volume vol = new Volume(9, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.7317625E-10, result, DELTA);
    }
    @Test
    public void testUSPintToCbCentimeter1(){
        Volume vol = new Volume(9, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(473.17625, result, DELTA);
    }
    @Test
    public void testUSPintToCbCentimeter2(){
        Volume vol = new Volume(9, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(473176.25, result, DELTA);
    }
    @Test
    public void testUSPintToMillimeter1(){
        Volume vol = new Volume(9, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(473171.19333774963, result, DELTA);
    }
    @Test
    public void testUSPintToMillimeter2(){
        Volume vol = new Volume(9, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.731711933377496E8, result, DELTA);
    }
    @Test
    public void testUSPintToLiter1(){
        Volume vol = new Volume(9, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.47317625, result, DELTA);
    }
    @Test
    public void testUSPintToLiter2(){
        Volume vol = new Volume(9, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(473.17625, result, DELTA);
    }
    @Test
    public void testUSPintToMilliliter1(){
        Volume vol = new Volume(9, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(473.17625, result, DELTA);
    }
    @Test
    public void testUSPintToMilliliter2(){
        Volume vol = new Volume(9, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(473176.25, result, DELTA);
    }
    @Test
    public void testUSPintToUSGallon1(){
        Volume vol = new Volume(9, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.125, result, DELTA);
    }
    @Test
    public void testUSPintToUSGallon2(){
        Volume vol = new Volume(9, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(125, result, DELTA);
    }
    @Test
    public void testUSPintToUSQuart1(){
        Volume vol = new Volume(9, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.5, result, DELTA);
    }
    @Test
    public void testUSPintToUSQuart2(){
        Volume vol = new Volume(9, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(500, result, DELTA);
    }
    @Test
    public void testUSPintToUSCup1(){
        Volume vol = new Volume(9, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(2, result, DELTA);
    }
    @Test
    public void testUSPintToUSCup2(){
        Volume vol = new Volume(9, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(2000, result, DELTA);
    }
    @Test
    public void testUSPintToUSFluidOunce1(){
        Volume vol = new Volume(9, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(16, result, DELTA);
    }
    @Test
    public void testUSPintToUSFluidOunce2(){
        Volume vol = new Volume(9, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(16000, result, DELTA);
    }
    @Test
    public void testUSPintToUSTableSpoon1(){
        Volume vol = new Volume(9, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(32, result, DELTA);
    }
    @Test
    public void testUSPintToUSTableSpoon2(){
        Volume vol = new Volume(9, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(32000, result, DELTA);
    }
    @Test
    public void testUSPintToUSTeaSpoon1(){
        Volume vol = new Volume(9, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(96, result, DELTA);
    }
    @Test
    public void testUSPintToUSTeaSpoon2(){
        Volume vol = new Volume(9, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(96000, result, DELTA);
    }
    @Test
    public void testUSPintToImperialGallon1(){
        Volume vol = new Volume(9, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.104084224, result, DELTA);
    }
    @Test
    public void testUSPintToImperialGallon2(){
        Volume vol = new Volume(9, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(104.08422403, result, DELTA);
    }
    @Test
    public void testUSPintToImperialQuart1(){
        Volume vol = new Volume(9, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.4163368961, result, DELTA);
    }
    @Test
    public void testUSPintToImperialQuart2(){
        Volume vol = new Volume(9, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(416.3368961, result, DELTA);
    }
    @Test
    public void testUSPintToImperialPint1(){
        Volume vol = new Volume(9, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.8326737922, result, DELTA);
    }
    @Test
    public void testUSPintToImperialPint2(){
        Volume vol = new Volume(9, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(832.6737922, result, DELTA);
    }
    @Test
    public void testUSPintToImperialFluidOunce1(){
        Volume vol = new Volume(9, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(16.653475844, result, DELTA);
    }
    @Test
    public void testUSPintToImperialFluidOunce2(){
        Volume vol = new Volume(9, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(16653.475844, result, DELTA);
    }
    @Test
    public void testUSPintToImperialTableSpoon1(){
        Volume vol = new Volume(9, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(26.645561351, result, DELTA);
    }
    @Test
    public void testUSPintToImperialTableSpoon2(){
        Volume vol = new Volume(9, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(26645.561351, result, DELTA);
    }
    @Test
    public void testUSPintToImperialTeaSpoon1(){
        Volume vol = new Volume(9, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(79.936684052, result, DELTA);
    }
    @Test
    public void testUSPintToImperialTeaSpoon2(){
        Volume vol = new Volume(9, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(79936.684052, result, DELTA);
    }
    @Test
    public void testUSPintToCubicMile1(){
        Volume vol = new Volume(9, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(1.135210691E-13, result, DELTA);
    }
    @Test
    public void testUSPintToCubicMile2(){
        Volume vol = new Volume(9, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.135210691E-10, result, DELTA);
    }
    @Test
    public void testUSPintToCubicYard1(){
        Volume vol = new Volume(9, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0006188912, result, DELTA);
    }
    @Test
    public void testUSPintToCubicYard2(){
        Volume vol = new Volume(9, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.6188911692, result, DELTA);
    }
    @Test
    public void testUSPintToCubicFoot1(){
        Volume vol = new Volume(9, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0167100616, result, DELTA);
    }
    @Test
    public void testUSPintToCubicFoot2(){
        Volume vol = new Volume(9, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(16.710061569, result, DELTA);
    }
    @Test
    public void testUSPintToCubicInch1(){
        Volume vol = new Volume(9, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(28.874986392, result, DELTA);
    }
    @Test
    public void testUSPintToCubicInch2(){
        Volume vol = new Volume(9, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(28874.986392, result, DELTA);
    }

    //US Cup To ... Test
    @Test
    public void testUSCupToCbMeter1(){
        Volume vol = new Volume(10, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0002365881, result, DELTA);
    }
    @Test
    public void testUSCupToCbMeter2(){
        Volume vol = new Volume(10, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.236588125, result, DELTA);
    }
    @Test
    public void testUSCupToCbKilometer1(){
        Volume vol = new Volume(10, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(2.36588125E-13, result, DELTA);
    }
    @Test
    public void testUSCupToCbCKilometer2(){
        Volume vol = new Volume(10, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.36588125E-10, result, DELTA);
    }
    @Test
    public void testUSCupToCbCentimeter1(){
        Volume vol = new Volume(10, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(236.588125, result, DELTA);
    }
    @Test
    public void testUSCupToCbCentimeter2(){
        Volume vol = new Volume(10, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(236588.125, result, DELTA);
    }
    @Test
    public void testUSCupToCbMillimeter1(){
        Volume vol = new Volume(10, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(236585.59666887482, result, DELTA);
    }
    @Test
    public void testUSCupToCbMillimeter2(){
        Volume vol = new Volume(10, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.365855966688748E8, result, DELTA);
    }
    @Test
    public void testUSCupToLiter1(){
        Volume vol = new Volume(10, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.236588125, result, DELTA);
    }
    @Test
    public void testUSCupToLiter2(){
        Volume vol = new Volume(10, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(236.588125, result, DELTA);
    }
    @Test
    public void testUSCupToMilliliter1(){
        Volume vol = new Volume(10, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(236.588125, result, DELTA);
    }
    @Test
    public void testUSCupToMilliliter2(){
        Volume vol = new Volume(10, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(236588.125, result, DELTA);
    }
    @Test
    public void testUSCupToUSGallon1(){
        Volume vol = new Volume(10, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0625, result, DELTA);
    }
    @Test
    public void testUSCupToUSGallon2(){
        Volume vol = new Volume(10, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(62.5, result, DELTA);
    }
    @Test
    public void testUSCupToUSQuart1(){
        Volume vol = new Volume(10, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.25, result, DELTA);
    }
    @Test
    public void testUSCupToUSQuart2(){
        Volume vol = new Volume(10, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(250, result, DELTA);
    }
    @Test
    public void testUSCupToUSPint1(){
        Volume vol = new Volume(10, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.5, result, DELTA);
    }
    @Test
    public void testUSCupToUSPint2(){
        Volume vol = new Volume(10, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(500, result, DELTA);
    }
    @Test
    public void testUSCupToUSFluidOunce1(){
        Volume vol = new Volume(10, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(8, result, DELTA);
    }
    @Test
    public void testUSCupToUSFluidOunce2(){
        Volume vol = new Volume(10, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(8000, result, DELTA);
    }
    @Test
    public void testUSCupToUSTableSpoon1(){
        Volume vol = new Volume(10, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(16, result, DELTA);
    }
    @Test
    public void testUSCupToUSTableSpoon2(){
        Volume vol = new Volume(10, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(16000, result, DELTA);
    }
    @Test
    public void testUSCupToUSTeaSpoon1(){
        Volume vol = new Volume(10, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(48, result, DELTA);
    }
    @Test
    public void testUSCupToUSTeaSpoon2(){
        Volume vol = new Volume(10, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(48000, result, DELTA);
    }
    @Test
    public void testUSCupToImperialGallon1(){
        Volume vol = new Volume(10, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.052042112, result, DELTA);
    }
    @Test
    public void testUSCupToImperialGallon2(){
        Volume vol = new Volume(10, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(52.042112013, result, DELTA);
    }
    @Test
    public void testUSCupToImperialQuart1(){
        Volume vol = new Volume(10, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2081684481, result, DELTA);
    }
    @Test
    public void testUSCupToImperialQuart2(){
        Volume vol = new Volume(10, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(208.16844805, result, DELTA);
    }
    @Test
    public void testUSCupToImperialPint1(){
        Volume vol = new Volume(10, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.4163368961, result, DELTA);
    }
    @Test
    public void testUSCupToImperialPint2(){
        Volume vol = new Volume(10, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(416.3368961, result, DELTA);
    }
    @Test
    public void testUSCupToImperialFluidOunce1(){
        Volume vol = new Volume(10, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(8.326737922, result, DELTA);
    }
    @Test
    public void testUSCupToImperialFluidOunce2(){
        Volume vol = new Volume(10, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(8326.737922, result, DELTA);
    }
    @Test
    public void testUSCupToImperialTableSpoon1(){
        Volume vol = new Volume(10, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(13.322780675, result, DELTA);
    }
    @Test
    public void testUSCupToImperialTableSpoon2(){
        Volume vol = new Volume(10, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(13322.780675, result, DELTA);
    }
    @Test
    public void testUSCupToImperialTeaSpoon1(){
        Volume vol = new Volume(10, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(39.968342026, result, DELTA);
    }
    @Test
    public void testUSCupToImperialTeaSpoon2(){
        Volume vol = new Volume(10, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(39968.342026, result, DELTA);
    }
    @Test
    public void testUSCupToCubicMile1(){
        Volume vol = new Volume(10, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(5.676053457E-14, result, DELTA);
    }
    @Test
    public void testUSCupToCubicMile2(){
        Volume vol = new Volume(10, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(5.676053457E-11, result, DELTA);
    }
    @Test
    public void testUSCupToCubicYard1(){
        Volume vol = new Volume(10, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0003094456, result, DELTA);
    }
    @Test
    public void testUSCupToCubicYard2(){
        Volume vol = new Volume(10, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.3094455846, result, DELTA);
    }
    @Test
    public void testUSCupToCubicFoot1(){
        Volume vol = new Volume(10, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0083550308, result, DELTA);
    }
    @Test
    public void testUSCupToCubicFoot2(){
        Volume vol = new Volume(10, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(8.3550307846, result, DELTA);
    }
    @Test
    public void testUSCupToCubicInch1(){
        Volume vol = new Volume(10, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(14.437493196, result, DELTA);
    }
    @Test
    public void testUSCupToCubicInch2(){
        Volume vol = new Volume(10, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(14437.493196, result, DELTA);
    }


    //US Fluid Ounce To ... Test
    @Test
    public void testUSFluidOunceToCbMeter1(){
        Volume vol = new Volume(11, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000295735, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCbMeter2(){
        Volume vol = new Volume(11, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0295735156, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCbKilometer1(){
        Volume vol = new Volume(11, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(2.957351562E-14, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCbCKilometer2(){
        Volume vol = new Volume(11, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.957351562E-11, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCbCentimeter1(){
        Volume vol = new Volume(11, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(29.573515625, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCbCentimeter2(){
        Volume vol = new Volume(11, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(29573.515625, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCbMillimeter1(){
        Volume vol = new Volume(11, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(29573.515625, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCbMillimeter2(){
        Volume vol = new Volume(11, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.957354941740108E7, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToLiter1(){
        Volume vol = new Volume(11, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0295735156, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToLiter2(){
        Volume vol = new Volume(11, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(29.573515625, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToMilliliter1(){
        Volume vol = new Volume(11, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(29.573515625, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToMilliliter2(){
        Volume vol = new Volume(11, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(29573.515625, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSGallon1(){
        Volume vol = new Volume(11, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0078125, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSGallon2(){
        Volume vol = new Volume(11, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(7.8125, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSQuart1(){
        Volume vol = new Volume(11, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.03125, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSQuart2(){
        Volume vol = new Volume(11, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(31.25, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSPint1(){
        Volume vol = new Volume(11, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0625, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSPint2(){
        Volume vol = new Volume(11, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(62.5, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSCup1(){
        Volume vol = new Volume(11, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.125, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSCup2(){
        Volume vol = new Volume(11, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(125, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSTableSpoon1(){
        Volume vol = new Volume(11, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(2, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSTableSpoon2(){
        Volume vol = new Volume(11, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(2000, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSTeaSpoon1(){
        Volume vol = new Volume(11, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(6, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToUSTeaSpoon2(){
        Volume vol = new Volume(11, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(6000, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialGallon1(){
        Volume vol = new Volume(11, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.006505264, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialGallon2(){
        Volume vol = new Volume(11, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(6.5052640016, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialQuart1(){
        Volume vol = new Volume(11, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.026021056, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialQuart2(){
        Volume vol = new Volume(11, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(26.021056006, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialPint1(){
        Volume vol = new Volume(11, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.052042112, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialPint2(){
        Volume vol = new Volume(11, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(52.042112013, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialFluidOunce1(){
        Volume vol = new Volume(11, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(1.0408422403, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialFluidOunce2(){
        Volume vol = new Volume(11, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(1040.8422403, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialTableSpoon1(){
        Volume vol = new Volume(11, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(1.6653475844, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialTableSpoon2(){
        Volume vol = new Volume(11, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(1665.3475844, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialTeaSpoon1(){
        Volume vol = new Volume(11, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(4.9960427532, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToImperialTeaSpoon2(){
        Volume vol = new Volume(11, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(4996.0427532, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCubicMile1(){
        Volume vol = new Volume(11, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(7.095066821E-15, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCubicMile2(){
        Volume vol = new Volume(11, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(7.095066821E-12, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCubicYard1(){
        Volume vol = new Volume(11, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000386807, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCubicYard2(){
        Volume vol = new Volume(11, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0386806981, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCubicFoot1(){
        Volume vol = new Volume(11, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0010443788, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCubicFoot2(){
        Volume vol = new Volume(11, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.0443788481, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCubicInch1(){
        Volume vol = new Volume(11, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(1.8046866495, result, DELTA);
    }
    @Test
    public void testUSFluidOunceToCubicInch2(){
        Volume vol = new Volume(11, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(1804.6866495, result, DELTA);
    }

    //US Table Spoon Ounce To ... Test
    @Test
    public void testUSTableSpoonToCbMeter1(){
        Volume vol = new Volume(12, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000147868, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCbMeter2(){
        Volume vol = new Volume(12, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0147867578, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCbKilometer1(){
        Volume vol = new Volume(12, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(1.478675781E-14, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCbCKilometer2(){
        Volume vol = new Volume(12, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.478675781E-11, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCbCentimeter1(){
        Volume vol = new Volume(12, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(14.786757812, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCbCentimeter2(){
        Volume vol = new Volume(12, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(14786.757813, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCbMillimeter1(){
        Volume vol = new Volume(12, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(14786.757812, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCbMillimeter2(){
        Volume vol = new Volume(12, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(14786757.812, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToLiter1(){
        Volume vol = new Volume(12, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0147867578, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToLiter2(){
        Volume vol = new Volume(12, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(14.786757812, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToMilliliter1(){
        Volume vol = new Volume(12, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(14.786757812, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToMilliliter2(){
        Volume vol = new Volume(12, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(14786.757813, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSGallon1(){
        Volume vol = new Volume(12, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.00390625, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSGallon2(){
        Volume vol = new Volume(12, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.90625, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSQuart1(){
        Volume vol = new Volume(12, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.015625, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSQuart2(){
        Volume vol = new Volume(12, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(15.625, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSPint1(){
        Volume vol = new Volume(12, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.03125, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSPint2(){
        Volume vol = new Volume(12, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(31.25, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSCup1(){
        Volume vol = new Volume(12, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0625, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSCup2(){
        Volume vol = new Volume(12, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(62.5, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSFluidOunce1(){
        Volume vol = new Volume(12, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(0.5, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSFluidOunce2(){
        Volume vol = new Volume(12, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(500, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSTeaSpoon1(){
        Volume vol = new Volume(12, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(3, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToUSTeaSpoon2(){
        Volume vol = new Volume(12, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(3000, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialGallon1(){
        Volume vol = new Volume(12, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.003252632, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialGallon2(){
        Volume vol = new Volume(12, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.2526320008, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialQuart1(){
        Volume vol = new Volume(12, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.013010528, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialQuart2(){
        Volume vol = new Volume(12, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(13.010528003, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialPint1(){
        Volume vol = new Volume(12, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.026021056, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialPint2(){
        Volume vol = new Volume(12, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(26.021056006, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialFluidOunce1(){
        Volume vol = new Volume(12, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(0.5204211201, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialFluidOunce2(){
        Volume vol = new Volume(12, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(520.42112013, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialTableSpoon1(){
        Volume vol = new Volume(12, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(0.8326737922, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialTableSpoon2(){
        Volume vol = new Volume(12, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(832.6737922, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialTeaSpoon1(){
        Volume vol = new Volume(12, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(2.4980213766, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToImperialTeaSpoon2(){
        Volume vol = new Volume(12, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(2498.0213766, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCubicMile1(){
        Volume vol = new Volume(12, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(3.54753341E-15, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCubicMile2(){
        Volume vol = new Volume(12, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.54753341E-12, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCubicYard1(){
        Volume vol = new Volume(12, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000193403, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCubicYard2(){
        Volume vol = new Volume(12, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.019340349, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCubicFoot1(){
        Volume vol = new Volume(12, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0005221894, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCubicFoot2(){
        Volume vol = new Volume(12, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.522189424, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCubicInch1(){
        Volume vol = new Volume(12, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(0.9023433247, result, DELTA);
    }
    @Test
    public void testUSTableSpoonToCubicInch2(){
        Volume vol = new Volume(12, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(902.34332474, result, DELTA);
    }

    //US Tea Spoon Ounce To ... Test
    @Test
    public void testUSTeaSpoonToCbMeter1(){
        Volume vol = new Volume(13, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000049289, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCbMeter2(){
        Volume vol = new Volume(13, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0049289193, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCbKilometer1(){
        Volume vol = new Volume(13, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(4.92891927E-15, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCbCKilometer2(){
        Volume vol = new Volume(13, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.92891927E-12, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCbCentimeter1(){
        Volume vol = new Volume(13, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(4.9289192708, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCbCentimeter2(){
        Volume vol = new Volume(13, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(4928.9192708, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCbMillimeter1(){
        Volume vol = new Volume(13, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(4928.9192708, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCbMillimeter2(){
        Volume vol = new Volume(13, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(4928919.2708, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToLiter1(){
        Volume vol = new Volume(13, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0049289193, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToLiter2(){
        Volume vol = new Volume(13, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.9289192708, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToMilliliter1(){
        Volume vol = new Volume(13, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(4.9289192708, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToMilliliter2(){
        Volume vol = new Volume(13, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(4928.9192708, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSGallon1(){
        Volume vol = new Volume(13, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0013020833, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSGallon2(){
        Volume vol = new Volume(13, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.3020833333, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSQuart1(){
        Volume vol = new Volume(13, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0052083333, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSQuart2(){
        Volume vol = new Volume(13, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(5.2083333333, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSPint1(){
        Volume vol = new Volume(13, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0104166667, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSPint2(){
        Volume vol = new Volume(13, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(10.416666667, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSCup1(){
        Volume vol = new Volume(13, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0208333333, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSCup2(){
        Volume vol = new Volume(13, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(20.833333333, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSFluidOunce1(){
        Volume vol = new Volume(13, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(0.1666666667, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSFluidOunce2(){
        Volume vol = new Volume(13, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(166.66666667, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSTableSpoon1(){
        Volume vol = new Volume(13, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(0.3333333333, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToUSTableSpoon2(){
        Volume vol = new Volume(13, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(333.33333333, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialGallon1(){
        Volume vol = new Volume(13, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0010842107, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialGallon2(){
        Volume vol = new Volume(13, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.0842106669, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialQuart1(){
        Volume vol = new Volume(13, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0043368427, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialQuart2(){
        Volume vol = new Volume(13, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.3368426677, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialPint1(){
        Volume vol = new Volume(13, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0086736853, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialPint2(){
        Volume vol = new Volume(13, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(8.6736853355, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialFluidOunce1(){
        Volume vol = new Volume(13, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(0.1734737067, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialFluidOunce2(){
        Volume vol = new Volume(13, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(173.47370671, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialTableSpoon1(){
        Volume vol = new Volume(13, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2775579307, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialTableSpoon2(){
        Volume vol = new Volume(13, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(277.55793073, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialTeaSpoon1(){
        Volume vol = new Volume(13, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(0.8326737922, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToImperialTeaSpoon2(){
        Volume vol = new Volume(13, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(832.6737922, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCubicMile1(){
        Volume vol = new Volume(13, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(1.182511136E-15, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCubicMile2(){
        Volume vol = new Volume(13, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.182511136E-12, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCubicYard1(){
        Volume vol = new Volume(13, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000064468, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCubicYard2(){
        Volume vol = new Volume(13, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.006446783, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCubicFoot1(){
        Volume vol = new Volume(13, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0001740631, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCubicFoot2(){
        Volume vol = new Volume(13, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.1740631413, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCubicInch1(){
        Volume vol = new Volume(13, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(0.3007811082, result, DELTA);
    }
    @Test
    public void testUSTeaSpoonToCubicInch2(){
        Volume vol = new Volume(13, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(300.78110825, result, DELTA);
    }

    //Imperial Gallon To ... Test
    @Test
    public void testImperialGallonToCbMeter1(){
        Volume vol = new Volume(14, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.00454609, result, DELTA);
    }
    @Test
    public void testImperialGallonToCbMeter2(){
        Volume vol = new Volume(14, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.54609, result, DELTA);
    }
    @Test
    public void testImperialGallonToCbKilometer1(){
        Volume vol = new Volume(14, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(4.54609E-12, result, DELTA);
    }
    @Test
    public void testImperialGallonToCbKilometer2(){
        Volume vol = new Volume(14, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.54609E-9, result, DELTA);
    }
    @Test
    public void testImperialGallonToCbCentimeter1(){
        Volume vol = new Volume(14, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(4546.09, result, DELTA);
    }
    @Test
    public void testImperialGallonToCbCentimeter2(){
        Volume vol = new Volume(14, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(4546090, result, DELTA);
    }
    @Test
    public void testImperialGallonToCbMillimeter1(){
        Volume vol = new Volume(14, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(4546090, result, DELTA);
    }
    @Test
    public void testImperialGallonToCbMillimeter2(){
        Volume vol = new Volume(14, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(4546090000D, result, DELTA);
    }
    @Test
    public void testImperialGallonToLiter1(){
        Volume vol = new Volume(14, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(4.54609, result, DELTA);
    }
    @Test
    public void testImperialGallonToLiter2(){
        Volume vol = new Volume(14, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(4546.09, result, DELTA);
    }
    @Test
    public void testImperialGallonToMilliliter1(){
        Volume vol = new Volume(14, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(4546.09, result, DELTA);
    }
    @Test
    public void testImperialGallonToMilliliter2(){
        Volume vol = new Volume(14, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(4546090, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSGallon1(){
        Volume vol = new Volume(14, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(1.2009504915, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSGallon2(){
        Volume vol = new Volume(14, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(1200.9504915, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSQuart1(){
        Volume vol = new Volume(14, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(4.803801966, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSQuart2(){
        Volume vol = new Volume(14, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(4803.801966, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSPint1(){
        Volume vol = new Volume(14, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(9.6076039319, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSPint2(){
        Volume vol = new Volume(14, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(9607.6039319, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSCup1(){
        Volume vol = new Volume(14, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(19.215207864, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSCup2(){
        Volume vol = new Volume(14, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(19215.207864, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSFluidOunce1(){
        Volume vol = new Volume(14, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(153.72166291, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSFluidOunce2(){
        Volume vol = new Volume(14, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(153721.66291, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSTableSpoon1(){
        Volume vol = new Volume(14, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(307.44332582, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSTableSpoon2(){
        Volume vol = new Volume(14, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(307443.32582, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSTeaSpoon1(){
        Volume vol = new Volume(14, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(922.32997747, result, DELTA);
    }
    @Test
    public void testImperialGallonToUSTeaSpoon2(){
        Volume vol = new Volume(14, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(922329.97747, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialQuart1(){
        Volume vol = new Volume(14, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(4, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialQuart2(){
        Volume vol = new Volume(14, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(4000, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialPint1(){
        Volume vol = new Volume(14, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(8, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialPint2(){
        Volume vol = new Volume(14, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(8000, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialFluidOunce1(){
        Volume vol = new Volume(14, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(160, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialFluidOunce2(){
        Volume vol = new Volume(14, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(160000, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialTableSpoon1(){
        Volume vol = new Volume(14, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(256, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialTableSpoon2(){
        Volume vol = new Volume(14, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(256000, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialTeaSpoon1(){
        Volume vol = new Volume(14, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(768, result, DELTA);
    }
    @Test
    public void testImperialGallonToImperialTeaSpoon2(){
        Volume vol = new Volume(14, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(768000, result, DELTA);
    }
    @Test
    public void testImperialGallonToCubicMile1(){
        Volume vol = new Volume(14, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(1.09066547E-12, result, DELTA);
    }
    @Test
    public void testImperialGallonToCubicMile2(){
        Volume vol = new Volume(14, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.09066547E-9, result, DELTA);
    }
    @Test
    public void testImperialGallonToCubicYard1(){
        Volume vol = new Volume(14, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0059460612, result, DELTA);
    }
    @Test
    public void testImperialGallonToCubicYard2(){
        Volume vol = new Volume(14, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(5.946061231, result, DELTA);
    }
    @Test
    public void testImperialGallonToCubicFoot1(){
        Volume vol = new Volume(14, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.1605436532, result, DELTA);
    }
    @Test
    public void testImperialGallonToCubicFoot2(){
        Volume vol = new Volume(14, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(160.54365324, result, DELTA);
    }
    @Test
    public void testImperialGallonToCubicInch1(){
        Volume vol = new Volume(14, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(277.41943279, result, DELTA);
    }
    @Test
    public void testImperialGallonToCubicInch2(){
        Volume vol = new Volume(14, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(277419.43279, result, DELTA);
    }

}