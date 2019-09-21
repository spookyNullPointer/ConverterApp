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
        assertEquals(1.478675284386224E7, result, DELTA);
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
        assertEquals(4.546090002047841E9, result, DELTA);
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

    //Imperial Quart To ... Test
    @Test
    public void testImperialQuartToCbMeter1(){
        Volume vol = new Volume(15, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0011365225, result, DELTA);
    }
    @Test
    public void testImperialQuartToCbMeter2(){
        Volume vol = new Volume(15, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.1365225, result, DELTA);
    }
    @Test
    public void testImperialQuartToCbKilometer1(){
        Volume vol = new Volume(15, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(1.1365225E-12, result, DELTA);
    }
    @Test
    public void testImperialQuartToCbKilometer2(){
        Volume vol = new Volume(15, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.1365225E-9, result, DELTA);
    }
    @Test
    public void testImperialQuartToCbCentimeter1(){
        Volume vol = new Volume(15, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(1136.5225, result, DELTA);
    }
    @Test
    public void testImperialQuartToCbCentimeter2(){
        Volume vol = new Volume(15, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(1136522.5, result, DELTA);
    }
    @Test
    public void testImperialQuartToCbMillimeter1(){
        Volume vol = new Volume(15, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(1136522.5, result, DELTA);
    }
    @Test
    public void testImperialQuartToCbMillimeter2(){
        Volume vol = new Volume(15, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(1136522500, result, DELTA);
    }
    @Test
    public void testImperialQuartToLiter1(){
        Volume vol = new Volume(15, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(1.1365225, result, DELTA);
    }
    @Test
    public void testImperialQuartToLiter2(){
        Volume vol = new Volume(15, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(1136.5225, result, DELTA);
    }
    @Test
    public void testImperialQuartToMilliliter1(){
        Volume vol = new Volume(15, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(1136.5225, result, DELTA);
    }
    @Test
    public void testImperialQuartToMilliliter2(){
        Volume vol = new Volume(15, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(1136522.5, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSGallon1(){
        Volume vol = new Volume(15, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.3002376229, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSGallon2(){
        Volume vol = new Volume(15, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(300.23762287, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSQuart1(){
        Volume vol = new Volume(15, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(1.2009504915, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSQuart2(){
        Volume vol = new Volume(15, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(1200.9504915, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSPint1(){
        Volume vol = new Volume(15, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(2.401900983, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSPint2(){
        Volume vol = new Volume(15, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(2401.900983, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSCup1(){
        Volume vol = new Volume(15, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(4.803801966, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSCup2(){
        Volume vol = new Volume(15, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(4803.801966, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSFluidOunce1(){
        Volume vol = new Volume(15, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(38.430415728, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSFluidOunce2(){
        Volume vol = new Volume(15, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(38430.415728, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSTableSpoon1(){
        Volume vol = new Volume(15, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(76.860831456, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSTableSpoon2(){
        Volume vol = new Volume(15, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(76860.831456, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSTeaSpoon1(){
        Volume vol = new Volume(15, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(230.58249437, result, DELTA);
    }
    @Test
    public void testImperialQuartToUSTeaSpoon2(){
        Volume vol = new Volume(15, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(230582.49437, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialGallon1(){
        Volume vol = new Volume(15, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.25, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialGallon2(){
        Volume vol = new Volume(15, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(250, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialPint1(){
        Volume vol = new Volume(15, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(2, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialPint2(){
        Volume vol = new Volume(15, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(2000, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialFluidOunce1(){
        Volume vol = new Volume(15, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(40, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialFluidOunce2(){
        Volume vol = new Volume(15, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(40000, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialTableSpoon1(){
        Volume vol = new Volume(15, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(64, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialTableSpoon2(){
        Volume vol = new Volume(15, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(64000, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialTeaSpoon1(){
        Volume vol = new Volume(15, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(192, result, DELTA);
    }
    @Test
    public void testImperialQuartToImperialTeaSpoon2(){
        Volume vol = new Volume(15, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(192000, result, DELTA);
    }
    @Test
    public void testImperialQuartToCubicMile1(){
        Volume vol = new Volume(15, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(2.726663675E-13, result, DELTA);
    }
    @Test
    public void testImperialQuartToCubicMile2(){
        Volume vol = new Volume(15, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.726663675E-10, result, DELTA);
    }
    @Test
    public void testImperialQuartToCubicYard1(){
        Volume vol = new Volume(15, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0014865153, result, DELTA);
    }
    @Test
    public void testImperialQuartToCubicYard2(){
        Volume vol = new Volume(15, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.4865153077, result, DELTA);
    }
    @Test
    public void testImperialQuartToCubicFoot1(){
        Volume vol = new Volume(15, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0401359133, result, DELTA);
    }
    @Test
    public void testImperialQuartToCubicFoot2(){
        Volume vol = new Volume(15, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(40.135913309, result, DELTA);
    }
    @Test
    public void testImperialQuartToCubicInch1(){
        Volume vol = new Volume(15, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(69.354858198, result, DELTA);
    }
    @Test
    public void testImperialQuartToCubicInch2(){
        Volume vol = new Volume(15, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(69354.858198, result, DELTA);
    }

    //Imperial Fluid Ounce To ... Test
    @Test
    public void testImperialFluidOunceToCbMeter1(){
        Volume vol = new Volume(17, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000284131, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCbMeter2(){
        Volume vol = new Volume(17, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0284130625, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCbKilometer1(){
        Volume vol = new Volume(17, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(2.84130625E-14, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCbKilometer2(){
        Volume vol = new Volume(17, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.84130625E-11, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCbCentimeter1(){
        Volume vol = new Volume(17, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(28.4130625, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCbCentimeter2(){
        Volume vol = new Volume(17, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(28413.0625, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCbMillimeter1(){
        Volume vol = new Volume(17, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(28413.0625, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCbMillimeter2(){
        Volume vol = new Volume(17, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.841304613426301E7, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToLiter1(){
        Volume vol = new Volume(17, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0284130625, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToLiter2(){
        Volume vol = new Volume(17, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(28.4130625, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToMilliliter1(){
        Volume vol = new Volume(17, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(28.4130625, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToMilliliter2(){
        Volume vol = new Volume(17, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(28413.0625, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSGallon1(){
        Volume vol = new Volume(17, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0075059406, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSGallon2(){
        Volume vol = new Volume(17, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(7.5059405718, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSQuart1(){
        Volume vol = new Volume(17, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0300237623, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSQuart2(){
        Volume vol = new Volume(17, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(30.023762287, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSPint1(){
        Volume vol = new Volume(17, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0600475246, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSPint2(){
        Volume vol = new Volume(17, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(60.047524575, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSCup1(){
        Volume vol = new Volume(17, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.1200950491, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSCup2(){
        Volume vol = new Volume(17, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(120.09504915, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSFluidOunce1(){
        Volume vol = new Volume(17, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(0.9607603932, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSFluidOunce2(){
        Volume vol = new Volume(17, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(960.76039319, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSTableSpoon1(){
        Volume vol = new Volume(17, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(1.9215207864, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSTableSpoon2(){
        Volume vol = new Volume(17, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(1921.5207864, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSTeaSpoon1(){
        Volume vol = new Volume(17, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(5.7645623592, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToUSTeaSpoon2(){
        Volume vol = new Volume(17, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(5764.5623592, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialGallon1(){
        Volume vol = new Volume(17, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.00625, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialGallon2(){
        Volume vol = new Volume(17, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(6.25, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialQuart1(){
        Volume vol = new Volume(17, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.025, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialQuart2(){
        Volume vol = new Volume(17, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(25, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialPint1(){
        Volume vol = new Volume(17, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.05, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialPint2(){
        Volume vol = new Volume(17, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(50, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialTableSpoon1(){
        Volume vol = new Volume(17, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(1.6, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialTableSpoon2(){
        Volume vol = new Volume(17, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(1600, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialTeaSpoon1(){
        Volume vol = new Volume(17, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(4.8, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToImperialTeaSpoon2(){
        Volume vol = new Volume(17, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(4800, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCubicMile1(){
        Volume vol = new Volume(17, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(6.816659189E-15, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCubicMile2(){
        Volume vol = new Volume(17, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(6.816659189E-12, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCubicYard1(){
        Volume vol = new Volume(17, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000371629, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCubicYard2(){
        Volume vol = new Volume(17, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0371628827, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCubicFoot1(){
        Volume vol = new Volume(17, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0010033978, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCubicFoot2(){
        Volume vol = new Volume(17, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.0033978327, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCubicInch1(){
        Volume vol = new Volume(17, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(1.7338714549, result, DELTA);
    }
    @Test
    public void testImperialFluidOunceToCubicInch2(){
        Volume vol = new Volume(17, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(1733.8714549, result, DELTA);
    }

    //Imperial Table Spoon To ... Test
    @Test
    public void testImperialTableSpoonToCbMeter1(){
        Volume vol = new Volume(18, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000177582, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCbMeter2(){
        Volume vol = new Volume(18, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0177581641, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCbKilometer1(){
        Volume vol = new Volume(18, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(1.775816406E-14, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCbKilometer2(){
        Volume vol = new Volume(18, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.775816406E-11, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCbCentimeter1(){
        Volume vol = new Volume(18, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(17.758164063, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCbCentimeter2(){
        Volume vol = new Volume(18, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(17758.164063, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCbMillimeter1(){
        Volume vol = new Volume(18, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(17758.164063, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCbMillimeter2(){
        Volume vol = new Volume(18, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.7758172755056195E7, result, DELTA);
    }
    @Test
    public void testImperialTableSpooneToLiter1(){
        Volume vol = new Volume(18, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0177581641, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToLiter2(){
        Volume vol = new Volume(18, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(17.758164063, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToMilliliter1(){
        Volume vol = new Volume(18, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(17.758164063, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToMilliliter2(){
        Volume vol = new Volume(18, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(17758.164063, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSGallon1(){
        Volume vol = new Volume(18, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0046912129, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSGallon2(){
        Volume vol = new Volume(18, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.6912128574, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSQuart1(){
        Volume vol = new Volume(18, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0187648514, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSQuart2(){
        Volume vol = new Volume(18, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(18.76485143, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSPint1(){
        Volume vol = new Volume(18, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0375297029, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSPint2(){
        Volume vol = new Volume(18, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(37.529702859, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSCup1(){
        Volume vol = new Volume(18, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0750594057, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSCup2(){
        Volume vol = new Volume(18, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(75.059405718, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSFluidOunce1(){
        Volume vol = new Volume(18, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(0.6004752457, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSFluidOunce2(){
        Volume vol = new Volume(18, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(600.47524575, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSTableSpoon1(){
        Volume vol = new Volume(18, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(1.2009504915, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSTableSpoon2(){
        Volume vol = new Volume(18, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(1200.9504915, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSTeaSpoon1(){
        Volume vol = new Volume(18, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(3.6028514745, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToUSTeaSpoon2(){
        Volume vol = new Volume(18, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(3602.8514745, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialGallon1(){
        Volume vol = new Volume(18, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.00390625, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialGallon2(){
        Volume vol = new Volume(18, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.90625, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialQuart1(){
        Volume vol = new Volume(18, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.015625, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialQuart2(){
        Volume vol = new Volume(18, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(15.625, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialPint1(){
        Volume vol = new Volume(18, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.03125, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialPint2(){
        Volume vol = new Volume(18, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(31.25, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialFluidOunce1(){
        Volume vol = new Volume(18, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(0.625, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialFluidOunce2(){
        Volume vol = new Volume(18, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(625, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialTeaSpoon1(){
        Volume vol = new Volume(18, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(3, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToImperialTeaSpoon2(){
        Volume vol = new Volume(18, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(3000, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCubicMile1(){
        Volume vol = new Volume(18, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(4.260411993E-15, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCubicMile2(){
        Volume vol = new Volume(18, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.260411993E-12, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCubicYard1(){
        Volume vol = new Volume(18, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000232268, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCubicYard2(){
        Volume vol = new Volume(18, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0232268017, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCubicFoot1(){
        Volume vol = new Volume(18, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0006271236, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCubicFoot2(){
        Volume vol = new Volume(18, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.6271236455, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCubicInch1(){
        Volume vol = new Volume(18, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(1.0836696593, result, DELTA);
    }
    @Test
    public void testImperialTableSpoonToCubicInch2(){
        Volume vol = new Volume(18, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(1083.6696593, result, DELTA);
    }


    //Imperial Tea Spoon To ... Test
    @Test
    public void testImperialTeaSpoonToCbMeter1(){
        Volume vol = new Volume(19, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000059194, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCbMeter2(){
        Volume vol = new Volume(19, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.005919388, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCbKilometer1(){
        Volume vol = new Volume(19, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(5.91938802E-15, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCbKilometer2(){
        Volume vol = new Volume(19, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(5.91938802E-12, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCbCentimeter1(){
        Volume vol = new Volume(19, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(5.9193880208, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCbCentimeter2(){
        Volume vol = new Volume(19, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(5919.3880208, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCbMillimeter1(){
        Volume vol = new Volume(19, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(5919.3880208, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCbMillimeter2(){
        Volume vol = new Volume(19, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(5919388.0208, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToLiter1(){
        Volume vol = new Volume(19, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.005919388, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToLiter2(){
        Volume vol = new Volume(19, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(5.9193880208, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToMilliliter1(){
        Volume vol = new Volume(19, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(5.9193880208, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToMilliliter2(){
        Volume vol = new Volume(19, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(5919.3880208, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSGallon1(){
        Volume vol = new Volume(19, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0015637376, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSGallon2(){
        Volume vol = new Volume(19, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.5637376191, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSQuart1(){
        Volume vol = new Volume(19, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0062549505, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSQuart2(){
        Volume vol = new Volume(19, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(6.2549504765, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSPint1(){
        Volume vol = new Volume(19, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.012509901, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSPint2(){
        Volume vol = new Volume(19, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(12.509900953, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSCup1(){
        Volume vol = new Volume(19, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0250198019, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSCup2(){
        Volume vol = new Volume(19, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(25.019801906, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSFluidOunce1(){
        Volume vol = new Volume(19, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2001584152, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSFluidOunce2(){
        Volume vol = new Volume(19, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(200.15841525, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSTableSpoon1(){
        Volume vol = new Volume(19, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(0.4003168305, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSTableSpoon2(){
        Volume vol = new Volume(19, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(400.3168305, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSTeaSpoon1(){
        Volume vol = new Volume(19, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(1.2009504915, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToUSTeaSpoon2(){
        Volume vol = new Volume(19, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(1200.9504915, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialGallon1(){
        Volume vol = new Volume(19, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0013020833, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialGallon2(){
        Volume vol = new Volume(19, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.3020833333, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialQuart1(){
        Volume vol = new Volume(19, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0052083333, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialQuart2(){
        Volume vol = new Volume(19, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(5.2083333333, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialPint1(){
        Volume vol = new Volume(19, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0104166667, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialPint2(){
        Volume vol = new Volume(19, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(10.416666667, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialFluidOunce1(){
        Volume vol = new Volume(19, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(0.2083333333, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialFluidOunce2(){
        Volume vol = new Volume(19, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(208.33333333, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialTableSpoon1(){
        Volume vol = new Volume(19, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(0.3333333333, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToImperialTableSpoon2(){
        Volume vol = new Volume(19, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(333.33333333, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCubicMile1(){
        Volume vol = new Volume(19, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(1.420137331E-15, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCubicMile2(){
        Volume vol = new Volume(19, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.420137331E-12, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCubicYard1(){
        Volume vol = new Volume(19, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000077423, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCubicYard2(){
        Volume vol = new Volume(19, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0077422672, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCubicFoot1(){
        Volume vol = new Volume(19, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0002090412, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCubicFoot2(){
        Volume vol = new Volume(19, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.2090412152, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCubicInch1(){
        Volume vol = new Volume(19, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(0.3612232198, result, DELTA);
    }
    @Test
    public void testImperialTeaSpoonToCubicInch2(){
        Volume vol = new Volume(19, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(361.22321978, result, DELTA);
    }

    //Cubic Mile To ... Test
    @Test
    public void testCubicMileToCbMeter1(){
        Volume vol = new Volume(20, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(4168180000D, result, DELTA);
    }
    @Test
    public void testCubicMileToCbMeter2(){
        Volume vol = new Volume(20, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.168180000832602E12, result, DELTA);
    }
    @Test
    public void testCubicMileToCbKilometer1(){
        Volume vol = new Volume(20, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(4.16818, result, DELTA);
    }
    @Test
    public void testCubicMileToCbKilometer2(){
        Volume vol = new Volume(20, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(4168.18, result, DELTA);
    }
    @Test
    public void testCubicMileToCbCentimeter1(){
        Volume vol = new Volume(20, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(4.1681800008326025E15, result, DELTA);
    }
    @Test
    public void testCubicMileToCbCentimeter2(){
        Volume vol = new Volume(20, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.1681800008326026E18, result, DELTA);
    }
    @Test
    public void testCubicMileToCbMillimeter1(){
        Volume vol = new Volume(20, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(4.1681800008326026E18, result, DELTA);
    }
    @Test
    public void testCubicMileToCbMillimeter2(){
        Volume vol = new Volume(20, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.168180000832603E21, result, DELTA);
    }
    @Test
    public void testCubicMileToLiter1(){
        Volume vol = new Volume(20, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(4.1681800008326025E12, result, DELTA);
    }
    @Test
    public void testCubicMileToLiter2(){
        Volume vol = new Volume(20, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.1681800008326025E15, result, DELTA);
    }
    @Test
    public void testCubicMileToMilliliter1(){
        Volume vol = new Volume(20, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(4.1681800008326025E15, result, DELTA);
    }
    @Test
    public void testCubicMileToMilliliter2(){
        Volume vol = new Volume(20, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.1681800008326026E18, result, DELTA);
    }
    @Test
    public void testCubicMileToUSGallon1(){
        Volume vol = new Volume(20, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(1.101117184234729E12, result, DELTA);
    }
    @Test
    public void testCubicMileToUSGallon2(){
        Volume vol = new Volume(20, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.101117184234729E15, result, DELTA);
    }
    @Test
    public void testCubicMileToUSQuart1(){
        Volume vol = new Volume(20, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(4.404468738393867E12, result, DELTA);
    }
    @Test
    public void testCubicMileToUSQuart2(){
        Volume vol = new Volume(20, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.404468738393867E15, result, DELTA);
    }
    @Test
    public void testCubicMileToUSPint1(){
        Volume vol = new Volume(20, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(8.808937476787734E12, result, DELTA);
    }
    @Test
    public void testCubicMileToUSPint2(){
        Volume vol = new Volume(20, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(8.808937476787734E15, result, DELTA);
    }
    @Test
    public void testCubicMileToUSCup1(){
        Volume vol = new Volume(20, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(1.761787494736768E13, result, DELTA);
    }
    @Test
    public void testCubicMileToUSCup2(){
        Volume vol = new Volume(20, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.7617874947367678E16, result, DELTA);
    }
    @Test
    public void testCubicMileToUSFluidOunce1(){
        Volume vol = new Volume(20, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(1.4094299958390766E14, result, DELTA);
    }
    @Test
    public void testCubicMileToUSFluidOunce2(){
        Volume vol = new Volume(20, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.40942999583907664E17, result, DELTA);
    }
    @Test
    public void testCubicMileToUSTableSpoon1(){
        Volume vol = new Volume(20, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(2.818859992075452E14, result, DELTA);
    }
    @Test
    public void testCubicMileToUSTableSpoon2(){
        Volume vol = new Volume(20, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.81885999207545152E17, result, DELTA);
    }
    @Test
    public void testCubicMileToUSTeaSpoon1(){
        Volume vol = new Volume(20, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(8.456579980993938E14, result, DELTA);
    }
    @Test
    public void testCubicMileToUSTeaSpoon2(){
        Volume vol = new Volume(20, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(8.4565799809939379E17, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialGallon1(){
        Volume vol = new Volume(20, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(9.168714216284852E11, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialGallon2(){
        Volume vol = new Volume(20, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(9.168714216284852E14, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialQuart1(){
        Volume vol = new Volume(20, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(3.667485686513941E12, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialQuart2(){
        Volume vol = new Volume(20, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.667485686513941E15, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialPint1(){
        Volume vol = new Volume(20, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(7.334971375717972E12, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialPint2(){
        Volume vol = new Volume(20, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(7.334971375717972E15, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialFluidOunce1(){
        Volume vol = new Volume(20, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(1.4669942742827656E14, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialFluidOunce2(){
        Volume vol = new Volume(20, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.46699427428276576E17, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialTableSpoon1(){
        Volume vol = new Volume(20, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(2.3471908389212912E14, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialTableSpoon2(){
        Volume vol = new Volume(20, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.3471908389212912E17, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialTeaSpoon1(){
        Volume vol = new Volume(20, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(7.041572516763874E14, result, DELTA);
    }
    @Test
    public void testCubicMileToImperialTeaSpoon2(){
        Volume vol = new Volume(20, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(7.0415725167638733E17, result, DELTA);
    }
    @Test
    public void testCubicMileToCubicYard1(){
        Volume vol = new Volume(20, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(5451773612.4, result, DELTA);
    }
    @Test
    public void testCubicMileToCubicYard2(){
        Volume vol = new Volume(20, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(5.4517736124E12, result, DELTA);
    }
    @Test
    public void testCubicMileToCubicFoot1(){
        Volume vol = new Volume(20, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(147197887535D, result, DELTA);
    }
    @Test
    public void testCubicMileToCubicFoot2(){
        Volume vol = new Volume(20, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.47197887535E14, result, DELTA);
    }
    @Test
    public void testCubicMileToCubicInch1(){
        Volume vol = new Volume(20, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(254357949660781D, result, DELTA);
    }
    @Test
    public void testCubicMileToCubicInch2(){
        Volume vol = new Volume(20, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.54357949660780992E17, result, DELTA);
    }

    //Cubic Yard To ... Test
    @Test
    public void testCubicYardToCbMeter1(){
        Volume vol = new Volume(21, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.764554858, result, DELTA);
    }
    @Test
    public void testCubicYardToCbMeter2(){
        Volume vol = new Volume(21, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(764.55485798, result, DELTA);
    }
    @Test
    public void testCubicYardToCbKilometer1(){
        Volume vol = new Volume(21, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(7.645548579E-10, result, DELTA);
    }
    @Test
    public void testCubicYardToCbKilometer2(){
        Volume vol = new Volume(21, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(7.645548579E-7, result, DELTA);
    }
    @Test
    public void testCubicYardToCbCentimeter1(){
        Volume vol = new Volume(21, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(764525.9938837921, result, DELTA);
    }
    @Test
    public void testCubicYardToCbCentimeter2(){
        Volume vol = new Volume(21, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(7.64525993883792E8, result, DELTA);
    }
    @Test
    public void testCubicYardToCbMillimeter1(){
        Volume vol = new Volume(21, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(764554857.98, result, DELTA);
    }
    @Test
    public void testCubicYardToCbMillimeter2(){
        Volume vol = new Volume(21, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(7.645548581677761E11, result, DELTA);
    }
    @Test
    public void testCubicYardToLiter1(){
        Volume vol = new Volume(21, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(764.55485798, result, DELTA);
    }
    @Test
    public void testCubicYardToLiter2(){
        Volume vol = new Volume(21, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(764554.85798, result, DELTA);
    }
    @Test
    public void testCubicYardToMilliliter1(){
        Volume vol = new Volume(21, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(764525.9938837921, result, DELTA);
    }
    @Test
    public void testCubicYardToMilliliter2(){
        Volume vol = new Volume(21, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(7.64525993883792E8, result, DELTA);
    }
    @Test
    public void testCubicYardToUSGallon1(){
        Volume vol = new Volume(21, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(201.97412116, result, DELTA);
    }
    @Test
    public void testCubicYardToUSGallon2(){
        Volume vol = new Volume(21, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(201974.12116, result, DELTA);
    }
    @Test
    public void testCubicYardToUSQuart1(){
        Volume vol = new Volume(21, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(807.89648464, result, DELTA);
    }
    @Test
    public void testCubicMYardToUSQuart2(){
        Volume vol = new Volume(21, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(807896.48464, result, DELTA);
    }
    @Test
    public void testCubicYardToUSPint1(){
        Volume vol = new Volume(21, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(1615.79296932, result, DELTA);
    }
    @Test
    public void testCubicYardToUSPint2(){
        Volume vol = new Volume(21, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(1615792.9693, result, DELTA);
    }
    @Test
    public void testCubicYardToUSCup1(){
        Volume vol = new Volume(21, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(3231.5859386, result, DELTA);
    }
    @Test
    public void testCubicYardToUSCup2(){
        Volume vol = new Volume(21, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(3231585.9386, result, DELTA);
    }
    @Test
    public void testCubicYardToUSFluidOunce1(){
        Volume vol = new Volume(21, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(25852.687509, result, DELTA);
    }
    @Test
    public void testCubicYardToUSFluidOunce2(){
        Volume vol = new Volume(21, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.585268622336204E7, result, DELTA);
    }
    @Test
    public void testCubicYardToUSTableSpoon1(){
        Volume vol = new Volume(21, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(51705.375017, result, DELTA);
    }
    @Test
    public void testCubicYardToUSTableSpoon2(){
        Volume vol = new Volume(21, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(5.1705506119346656E7, result, DELTA);
    }
    @Test
    public void testCubicYardToUSTeaSpoon1(){
        Volume vol = new Volume(21, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(155116.12505, result, DELTA);
    }
    @Test
    public void testCubicYardToUSTeaSpoon2(){
        Volume vol = new Volume(21, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.5511571632437798E8, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialGallon1(){
        Volume vol = new Volume(21, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(168.17855739, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialGallon2(){
        Volume vol = new Volume(21, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(168178.55739, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialQuart1(){
        Volume vol = new Volume(21, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(672.714229582, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialQuart2(){
        Volume vol = new Volume(21, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(672714.22958, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialPint1(){
        Volume vol = new Volume(21, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(1345.4284592, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialPint2(){
        Volume vol = new Volume(21, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(1345428.4592, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialFluidOunce1(){
        Volume vol = new Volume(21, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(26908.569183, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialFluidOunce2(){
        Volume vol = new Volume(21, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.6908556651929744E7, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialTableSpoon1(){
        Volume vol = new Volume(21, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(43053.710693, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialTableSpoon2(){
        Volume vol = new Volume(21, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.305371381335354E7, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialTeaSpoon1(){
        Volume vol = new Volume(21, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(129161.13208, result, DELTA);
    }
    @Test
    public void testCubicYardToImperialTeaSpoon2(){
        Volume vol = new Volume(21, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.2916058535577282E8, result, DELTA);
    }
    @Test
    public void testCubicYardToCubicMile1(){
        Volume vol = new Volume(21, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(1.834265453E-10, result, DELTA);
    }
    @Test
    public void testCubicYardToCubicMile2(){
        Volume vol = new Volume(21, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.834265453E-7, result, DELTA);
    }
    @Test
    public void testCubicYardToCubicFoot1(){
        Volume vol = new Volume(21, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(27, result, DELTA);
    }
    @Test
    public void testCubicYardToCubicFoot2(){
        Volume vol = new Volume(21, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(27000, result, DELTA);
    }
    @Test
    public void testCubicYardToCubicInch1(){
        Volume vol = new Volume(21, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(46656, result, DELTA);
    }
    @Test
    public void testCubicYardToCubicInch2(){
        Volume vol = new Volume(21, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(46656000, result, DELTA);
    }

    //Cubic Foot To ... Test
    @Test
    public void testCubicFootToCbMeter1(){
        Volume vol = new Volume(22, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0283168466, result, DELTA);
    }
    @Test
    public void testCubicFootToCbMeter2(){
        Volume vol = new Volume(22, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(28.316846592, result, DELTA);
    }
    @Test
    public void testCubicFootToCbKilometer1(){
        Volume vol = new Volume(22, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(2.831684659E-11, result, DELTA);
    }
    @Test
    public void testCubicFootToCbKilometer2(){
        Volume vol = new Volume(22, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.831684659E-8, result, DELTA);
    }
    @Test
    public void testCubicFootToCbCentimeter1(){
        Volume vol = new Volume(22, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(28316.846592, result, DELTA);
    }
    @Test
    public void testCubicFootToCbCentimeter2(){
        Volume vol = new Volume(22, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.8316819907857064E7, result, DELTA);
    }
    @Test
    public void testCubicFootToCbMillimeter1(){
        Volume vol = new Volume(22, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(28316846.592, result, DELTA);
    }
    @Test
    public void testCubicFootToCbMillimeter2(){
        Volume vol = new Volume(22, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.8316846593193615E10, result, DELTA);
    }
    @Test
    public void testCubicFootToLiter1(){
        Volume vol = new Volume(22, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(28.316846592, result, DELTA);
    }
    @Test
    public void testCubicFootToLiter2(){
        Volume vol = new Volume(22, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(28316.846592, result, DELTA);
    }
    @Test
    public void testCubicFootToMilliliter1(){
        Volume vol = new Volume(22, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(28316.846592, result, DELTA);
    }
    @Test
    public void testCubicFootToMilliliter2(){
        Volume vol = new Volume(22, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(2.8316819907857064E7, result, DELTA);
    }
    @Test
    public void testCubicFootToUSGallon1(){
        Volume vol = new Volume(22, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(7.480523006, result, DELTA);
    }
    @Test
    public void testCubicFootToUSGallon2(){
        Volume vol = new Volume(22, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(7480.523006, result, DELTA);
    }
    @Test
    public void testCubicFootToUSQuart1(){
        Volume vol = new Volume(22, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(29.922092024, result, DELTA);
    }
    @Test
    public void testCubicFootToUSQuart2(){
        Volume vol = new Volume(22, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(29922.092024, result, DELTA);
    }
    @Test
    public void testCubicFootToUSPint1(){
        Volume vol = new Volume(22, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(59.844184048, result, DELTA);
    }
    @Test
    public void testCubicFootToUSPint2(){
        Volume vol = new Volume(22, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(59844.184048, result, DELTA);
    }
    @Test
    public void testCubicFootToUSCup1(){
        Volume vol = new Volume(22, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(119.6883681, result, DELTA);
    }
    @Test
    public void testCubicFootToUSCup2(){
        Volume vol = new Volume(22, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(119688.3681, result, DELTA);
    }
    @Test
    public void testCubicFootToUSFluidOunce1(){
        Volume vol = new Volume(22, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(957.50694476, result, DELTA);
    }
    @Test
    public void testCubicFootToUSFluidOunce2(){
        Volume vol = new Volume(22, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(957506.94476, result, DELTA);
    }
    @Test
    public void testCubicFootToUSTableSpoon1(){
        Volume vol = new Volume(22, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(1915.0138895, result, DELTA);
    }
    @Test
    public void testCubicFootToUSTableSpoon2(){
        Volume vol = new Volume(22, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(1915013.8895, result, DELTA);
    }
    @Test
    public void testCubicFootToUSTeaSpoon1(){
        Volume vol = new Volume(22, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(5745.0416686, result, DELTA);
    }
    @Test
    public void testCubicFootToUSTeaSpoon2(){
        Volume vol = new Volume(22, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(5745043.033244841, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialGallon1(){
        Volume vol = new Volume(22, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(6.228835459, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialGallon2(){
        Volume vol = new Volume(22, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(6228.835459, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialQuart1(){
        Volume vol = new Volume(22, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(24.915341836, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialQuart2(){
        Volume vol = new Volume(22, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(24915.341836, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialPint1(){
        Volume vol = new Volume(22, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(49.830683672, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialPint2(){
        Volume vol = new Volume(22, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(49830.683672, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialFluidOunce1(){
        Volume vol = new Volume(22, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(996.61367345, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialFluidOunce2(){
        Volume vol = new Volume(22, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(996613.67345, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialTableSpoon1(){
        Volume vol = new Volume(22, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(1594.5818775, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialTableSpoon2(){
        Volume vol = new Volume(22, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(1594581.8775, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialTeaSpoon1(){
        Volume vol = new Volume(22, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(4783.7456325, result, DELTA);
    }
    @Test
    public void testCubicFootToImperialTeaSpoon2(){
        Volume vol = new Volume(22, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(4783745.6325, result, DELTA);
    }
    @Test
    public void testCubicFootToCubicMile1(){
        Volume vol = new Volume(22, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(6.793575755E-12, result, DELTA);
    }
    @Test
    public void testCubicFootToCubicMile2(){
        Volume vol = new Volume(22, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(6.793575755E-9, result, DELTA);
    }
    @Test
    public void testCubicFootToCubicYard1(){
        Volume vol = new Volume(22, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.037037037, result, DELTA);
    }
    @Test
    public void testCubicFootToCubicYard2(){
        Volume vol = new Volume(22, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(37.037037037, result, DELTA);
    }
    @Test
    public void testCubicFootToCubicInch1(){
        Volume vol = new Volume(22, 23, 1);
        double result = vol.getConversionResult();
        assertEquals(1728, result, DELTA);
    }
    @Test
    public void testCubicFootToCubicInch2(){
        Volume vol = new Volume(22, 23, 1000);
        double result = vol.getConversionResult();
        assertEquals(1728000, result, DELTA);
    }

    //Cubic Inch To ... Test
    @Test
    public void testCubicInchToCbMeter1(){
        Volume vol = new Volume(23, 1, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000163871, result, DELTA);
    }
    @Test
    public void testCubicInchToCbMeter2(){
        Volume vol = new Volume(23, 1, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.016387064, result, DELTA);
    }
    @Test
    public void testCubicInchToCbKilometer1(){
        Volume vol = new Volume(23, 2, 1);
        double result = vol.getConversionResult();
        assertEquals(1.6387064E-14, result, DELTA);
    }
    @Test
    public void testCubicInchToCbKilometer2(){
        Volume vol = new Volume(23, 2, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.6387064E-11, result, DELTA);
    }
    @Test
    public void testCubicInchToCbCentimeter1(){
        Volume vol = new Volume(23, 3, 1);
        double result = vol.getConversionResult();
        assertEquals(16.387064, result, DELTA);
    }
    @Test
    public void testCubicInchToCbCentimeter2(){
        Volume vol = new Volume(23, 3, 1000);
        double result = vol.getConversionResult();
        assertEquals(16387.064, result, DELTA);
    }
    @Test
    public void testCubicInchToCbMillimeter1(){
        Volume vol = new Volume(23, 4, 1);
        double result = vol.getConversionResult();
        assertEquals(16387.064, result, DELTA);
    }
    @Test
    public void testCubicInchToCbMillimeter2(){
        Volume vol = new Volume(23, 4, 1000);
        double result = vol.getConversionResult();
        assertEquals(1.6387075841025699E7, result, DELTA);
    }
    @Test
    public void testCubicInchToLiter1(){
        Volume vol = new Volume(23, 5, 1);
        double result = vol.getConversionResult();
        assertEquals(0.016387064, result, DELTA);
    }
    @Test
    public void testCubicInchToLiter2(){
        Volume vol = new Volume(23, 5, 1000);
        double result = vol.getConversionResult();
        assertEquals(16.387064, result, DELTA);
    }
    @Test
    public void testCubicInchToMilliliter1(){
        Volume vol = new Volume(23, 6, 1);
        double result = vol.getConversionResult();
        assertEquals(16.387064, result, DELTA);
    }
    @Test
    public void testCubicInchToMilliliter2(){
        Volume vol = new Volume(23, 6, 1000);
        double result = vol.getConversionResult();
        assertEquals(16387.064, result, DELTA);
    }
    @Test
    public void testCubicInchToUSGallon1(){
        Volume vol = new Volume(23, 7, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0043290064, result, DELTA);
    }
    @Test
    public void testCubicInchToUSGallon2(){
        Volume vol = new Volume(23, 7, 1000);
        double result = vol.getConversionResult();
        assertEquals(4.3290063692, result, DELTA);
    }
    @Test
    public void testCubicInchToUSQuart1(){
        Volume vol = new Volume(23, 8, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0173160255, result, DELTA);
    }
    @Test
    public void testCubicInchToUSQuart2(){
        Volume vol = new Volume(23, 8, 1000);
        double result = vol.getConversionResult();
        assertEquals(17.316025477, result, DELTA);
    }
    @Test
    public void testCubicInchToUSPint1(){
        Volume vol = new Volume(23, 9, 1);
        double result = vol.getConversionResult();
        assertEquals(0.034632051, result, DELTA);
    }
    @Test
    public void testCubicInchToUSPint2(){
        Volume vol = new Volume(23, 9, 1000);
        double result = vol.getConversionResult();
        assertEquals(34.632050954, result, DELTA);
    }
    @Test
    public void testCubicInchToUSCup1(){
        Volume vol = new Volume(23, 10, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0692641019, result, DELTA);
    }
    @Test
    public void testCubicInchToUSCup2(){
        Volume vol = new Volume(23, 10, 1000);
        double result = vol.getConversionResult();
        assertEquals(69.264101907, result, DELTA);
    }
    @Test
    public void testCubicInchToUSFluidOunce1(){
        Volume vol = new Volume(23, 11, 1);
        double result = vol.getConversionResult();
        assertEquals(0.5541128153, result, DELTA);
    }
    @Test
    public void testCubicInchToUSFluidOunce2(){
        Volume vol = new Volume(23, 11, 1000);
        double result = vol.getConversionResult();
        assertEquals(554.11281526, result, DELTA);
    }
    @Test
    public void testCubicInchToUSTableSpoon1(){
        Volume vol = new Volume(23, 12, 1);
        double result = vol.getConversionResult();
        assertEquals(1.1082256305, result, DELTA);
    }
    @Test
    public void testCubicInchToUSTableSpoon2(){
        Volume vol = new Volume(23, 12, 1000);
        double result = vol.getConversionResult();
        assertEquals(1108.2256305, result, DELTA);
    }
    @Test
    public void testCubicInchToUSTeaSpoon1(){
        Volume vol = new Volume(23, 13, 1);
        double result = vol.getConversionResult();
        assertEquals(3.3246768915, result, DELTA);
    }
    @Test
    public void testCubicInchoUSTeaSpoon2(){
        Volume vol = new Volume(23, 13, 1000);
        double result = vol.getConversionResult();
        assertEquals(3324.6768915, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialGallon1(){
        Volume vol = new Volume(23, 14, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0036046501, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialGallon2(){
        Volume vol = new Volume(23, 14, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.6046501499, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialQuart1(){
        Volume vol = new Volume(23, 15, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0144186006, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialQuart2(){
        Volume vol = new Volume(23, 15, 1000);
        double result = vol.getConversionResult();
        assertEquals(14.4186006, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialPint1(){
        Volume vol = new Volume(23, 16, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0288372012, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialPint2(){
        Volume vol = new Volume(23, 16, 1000);
        double result = vol.getConversionResult();
        assertEquals(28.837201199, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialFluidOunce1(){
        Volume vol = new Volume(23, 17, 1);
        double result = vol.getConversionResult();
        assertEquals(0.576744024, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialFluidOunce2(){
        Volume vol = new Volume(23, 17, 1000);
        double result = vol.getConversionResult();
        assertEquals(576.74402399, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialTableSpoon1(){
        Volume vol = new Volume(23, 18, 1);
        double result = vol.getConversionResult();
        assertEquals(0.9227904384, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialTableSpoon2(){
        Volume vol = new Volume(23, 18, 1000);
        double result = vol.getConversionResult();
        assertEquals(922.79043838, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialTeaSpoon1(){
        Volume vol = new Volume(23, 19, 1);
        double result = vol.getConversionResult();
        assertEquals(2.7683713151, result, DELTA);
    }
    @Test
    public void testCubicInchToImperialTeaSpoon2(){
        Volume vol = new Volume(23, 19, 1000);
        double result = vol.getConversionResult();
        assertEquals(2768.3713151, result, DELTA);
    }
    @Test
    public void testCubicInchToCubicMile1(){
        Volume vol = new Volume(23, 20, 1);
        double result = vol.getConversionResult();
        assertEquals(3.931467451E-15, result, DELTA);
    }
    @Test
    public void testCubicInchToCubicMile2(){
        Volume vol = new Volume(23, 20, 1000);
        double result = vol.getConversionResult();
        assertEquals(3.931467451E-12, result, DELTA);
    }
    @Test
    public void testCubicInchToCubicYard1(){
        Volume vol = new Volume(23, 21, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0000214335, result, DELTA);
    }
    @Test
    public void testCubicInchToCubicYard2(){
        Volume vol = new Volume(23, 21, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.0214334705, result, DELTA);
    }
    @Test
    public void testCubicInchToCubicFoot1(){
        Volume vol = new Volume(23, 22, 1);
        double result = vol.getConversionResult();
        assertEquals(0.0005787037, result, DELTA);
    }
    @Test
    public void testCubicInchToCubicFoot2(){
        Volume vol = new Volume(23, 22, 1000);
        double result = vol.getConversionResult();
        assertEquals(0.5787037037, result, DELTA);
    }
}