package com.spookyNullPointer;

import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureTest {

    private static final double DELTA = 1;

    //Celsius To .... Tests
    @Test
    public void testCelsiusToKelvin1(){
        Temperature temp = new Temperature(1, 2, 1);
        double result = temp.getConversionResult();
        assertEquals(274.15, result, DELTA);
    }
    @Test
    public void testCelsiusToKelvin2(){
        Temperature temp = new Temperature(1, 2, 1000);
        double result = temp.getConversionResult();
        assertEquals(1273.15, result, DELTA);
    }
    @Test
    public void testCelsiusToFahrenheit1(){
        Temperature temp = new Temperature(1, 3, 1);
        double result = temp.getConversionResult();
        assertEquals(33.8, result, DELTA);
    }
    @Test
    public void testCelsiusToFahrenheit2(){
        Temperature temp = new Temperature(1, 3, 1000);
        double result = temp.getConversionResult();
        assertEquals(1832, result, DELTA);
    }

    //Kelvin To ... Tests
    @Test
    public void testKelvinToCelsius1(){
        Temperature temp = new Temperature(2, 1, 1);
        double result = temp.getConversionResult();
        assertEquals(-273.15, result, DELTA);
    }
    @Test
    public void testKelvinToCelsius2(){
        Temperature temp = new Temperature(2, 1, 1000);
        double result = temp.getConversionResult();
        assertEquals(726.85, result, DELTA);
    }
    @Test
    public void testKelvinToFahrenheit1(){
        Temperature temp = new Temperature(2, 3, 1);
        double result = temp.getConversionResult();
        assertEquals(-457.87, result, DELTA);
    }
    @Test
    public void testKelvinToFahrenheit2(){
        Temperature temp = new Temperature(2, 3, 1000);
        double result = temp.getConversionResult();
        assertEquals(1340.33, result, DELTA);
    }

    //Fahrenheit To ... Tests
    @Test
    public void testFahrenheitToCelsius1(){
        Temperature temp = new Temperature(3, 1, 1);
        double result = temp.getConversionResult();
        assertEquals(-17.222222222, result, DELTA);
    }
    @Test
    public void testFahrenheitToCelsius2(){
        Temperature temp = new Temperature(3, 1, 1000);
        double result = temp.getConversionResult();
        assertEquals(537.77777778, result, DELTA);
    }
    @Test
    public void testFahrenheitToKelvin1(){
        Temperature temp = new Temperature(3, 2, 1);
        double result = temp.getConversionResult();
        assertEquals(255.92777778, result, DELTA);
    }
    @Test
    public void testFahrenheitToKelvin2(){
        Temperature temp = new Temperature(3, 2, 1000);
        double result = temp.getConversionResult();
        assertEquals(810.92777778, result, DELTA);
    }

}