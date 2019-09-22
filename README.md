## Converter 1.0
A basic console based, Unit Converter Java based application. As it stands, there are plans to further perfect 
It is capable of converting the following - 

Length - Meter, Kilometer, Centimeter, Millimeter, Micrometer, Nanometer, Mile, Yard, Foot, Inch, Lightyear.

Temperature - Celsius, Kelvin, Fahrenheit.

Area - Sq Meter, Sq Kilometer, Sq Centimeter, Sq Millimeter, Sq Micrometer, Hectare, Sq Mile, Sq Yard, Sq Foot, Sq Inch, Acre.

Volume - Cubic Meter, Cubic Kilometer, Cubic Centimeter, Cubic Millimeter, Liter, Milliliter, US Gallon, US Quart, US Pint, US Cup, 
         US Fluid Ounce, US Table Spoon, US Tea Spoon, Imperial Gallon, Imperial Quart, Imperial Pint, Imperial Fluid Ounce, 
         Imperial Table Spoon, Imperial Tea Spoon, Cubic Mile, Cubic Yard, Cubic Foot, Cubic Inch.

Weight - Kilogram, Gram, Milligram, Metric Ton, Long Ton, Short Ton, Pound, Ounce, Carrat, Atomic Mass Unit.

Time - Second, Millisecond, Microsecond, Nanosecond, Picosecond, Minute, Hour, Day, Week, Month, Year.


## Motivation
First self build project in Java. Purpose was to build understanding of OOP, JUnit and Git. App is fairly basic but functional.

## Built with
Java 11.0.1

JUnit 4.12

## Tests
Tests to check basic accuracy and functionality of all unit conversions include in /tests.

Tests only check for conversion of "1" and "1000" of any possible conversion.

## How to use?
Clone repository. 
Run Main.java

## Contribute
Feel free to contribute any fixes. Various identified issues and potential developments have been outlined below.

## Planned Features
- Add UI
- Add Popular Conversions list

## Identified Issues
- Does not have a build file. All tests and compilation is currently manual.
- Exits out after 1 conversion. Need to add - "Back to Menu" / "Exit" options.
- Practically no pen testing carried out.
