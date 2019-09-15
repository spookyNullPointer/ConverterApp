package com.spookyNullPointer;

public class Area {

    private double conversionResult;

    double getConversionResult(){
        return conversionResult;
    }

    Area(int from, int into, double valueToConvert) {

        switch (from) {
            //Square Meter
            case 1:
                switch(into) {
                    case 2:
                        conversionResult = sqMeterToSqKilometer(valueToConvert, false);
                        break;
                    case 3:
                        conversionResult = sqMeterToSqCentimeter(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult = sqMeterToSqMillimeter(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = sqMeterToSqMicrometer(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = sqMeterToHectare(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = sqMeterToSqMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = sqMeterToSqYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = sqMeterToSqFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = sqMeterToSqInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = sqMeterToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 2:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToSqKilometer(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = sqKilometerToSqCentimeter(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult = sqKilometerToSqMillimeter(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = sqKilometerToSqMicrometer(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = sqKilometerToHectare(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = sqKilometerToSqMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = sqKilometerToSqYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = sqKilometerToSqFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = sqKilometerToSqInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = sqKilometerToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 3:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToSqCentimeter(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = sqKilometerToSqCentimeter(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = sqCentimeterToSqMillimeter(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = sqCentimeterToSqMicrometer(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = sqCentimeterToHectare(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = sqCentimeterToSqMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = sqCentimeterToSqYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = sqCentimeterToSqFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = sqCentimeterToSqInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = sqCentimeterToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 4:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToSqMillimeter(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = sqKilometerToSqMillimeter(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = sqCentimeterToSqMillimeter(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = sqMillimeterToSqMicrometer(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = sqMillimeterToHectare(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = sqMillimeterToSqMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = sqMillimeterToSqYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = sqMillimeterToSqFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = sqMillimeterToSqInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = sqMillimeterToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 5:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToSqMicrometer(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = sqKilometerToSqMicrometer(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = sqCentimeterToSqMicrometer(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = sqMillimeterToSqMicrometer(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = sqMicrometerToHectare(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = sqMicrometerToSqMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = sqMicrometerToSqYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = sqMicrometerToSqFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = sqMicrometerToSqInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = sqMicrometerToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 6:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToHectare(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = sqKilometerToHectare(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = sqCentimeterToHectare(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = sqMillimeterToHectare(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = sqMicrometerToHectare(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = hectareToSqMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = hectareToSqYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = hectareToSqFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = hectareToSqInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = hectareToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 7:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToSqMile(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = sqKilometerToSqMile(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = sqCentimeterToSqMile(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = sqMillimeterToSqMile(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = sqMicrometerToSqMile(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = hectareToSqMile(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = sqMileToSqYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = sqMileToSqFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = sqMileToSqInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = sqMileToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 8:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToSqYard(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = sqKilometerToSqYard(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = sqCentimeterToSqYard(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = sqMillimeterToSqYard(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = sqMicrometerToSqYard(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = hectareToSqYard(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = sqMileToSqYard(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = sqYardToSqFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = sqYardToSqInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = sqYardToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 9:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToSqFoot(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = sqKilometerToSqFoot(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = sqCentimeterToSqFoot(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = sqMillimeterToSqFoot(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = sqMicrometerToSqFoot(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = hectareToSqFoot(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = sqMileToSqFoot(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = sqYardToSqFoot(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = sqFootToSqInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = sqFootToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 10:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToSqInch(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = sqKilometerToSqInch(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = sqCentimeterToSqInch(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = sqMillimeterToSqInch(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = sqMicrometerToSqInch(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = hectareToSqInch(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = sqMileToSqInch(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = sqYardToSqInch(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = sqFootToSqInch(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = sqInchToAcre(valueToConvert, false);
                        break;
                }
                break;
            case 11:
                switch(into) {
                    case 1:
                        conversionResult = sqMeterToAcre(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = sqKilometerToAcre(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = sqCentimeterToAcre(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = sqMillimeterToAcre(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = sqMicrometerToAcre(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = hectareToAcre(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = sqMileToAcre(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = sqYardToAcre(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = sqFootToAcre(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = sqInchToAcre(valueToConvert, true);
                        break;
                }
                break;
        }
    }

    private double sqMeterToSqKilometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000001;
        }
        else{
            convertedValue = valueToConvert / 0.000001;
        }
        return convertedValue;
    }

    private double sqMeterToSqCentimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 10000;
        }
        else{
            convertedValue = valueToConvert / 10000;
        }
        return convertedValue;
    }

    private double sqMeterToSqMillimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double sqMeterToSqMicrometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000000D;
        }
        else{
            convertedValue = valueToConvert / 1000000000000D;
        }
        return convertedValue;
    }

    private double sqMeterToHectare(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0001;
        }
        else{
            convertedValue = valueToConvert / 0.0001;
        }
        return convertedValue;
    }

    private double sqMeterToSqMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.861018768E-7;
        }
        else{
            convertedValue = valueToConvert / 3.861018768E-7;
        }
        return convertedValue;
    }

    private double sqMeterToSqYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.1959900463;
        }
        else{
            convertedValue = valueToConvert / 1.1959900463;
        }
        return convertedValue;
    }

    private double sqMeterToSqFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 10.763910417;
        }
        else{
            convertedValue = valueToConvert / 10.763910417;
        }
        return convertedValue;
    }

    private double sqMeterToSqInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1550.0031;
        }
        else{
            convertedValue = valueToConvert / 1550.0031;
        }
        return convertedValue;
    }

    private double sqMeterToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0002471054;
        }
        else{
            convertedValue = valueToConvert / 0.0002471054;
        }
        return convertedValue;
    }

    private double sqKilometerToSqCentimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 10000000000D;
        }
        else{
            convertedValue = valueToConvert / 10000000000D;
        }
        return convertedValue;
    }

    private double sqKilometerToSqMillimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000000D;
        }
        else{
            convertedValue = valueToConvert / 1000000000000D;
        }
        return convertedValue;
    }

    private double sqKilometerToSqMicrometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000000000000D;
        }
        else{
            convertedValue = valueToConvert / 1000000000000000000D;
        }
        return convertedValue;
    }

    private double sqKilometerToHectare(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 100;
        }
        else{
            convertedValue = valueToConvert / 100;
        }
        return convertedValue;
    }

    private double sqKilometerToSqMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.3861018768;
        }
        else{
            convertedValue = valueToConvert / 0.3861018768;
        }
        return convertedValue;
    }

    private double sqKilometerToSqYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1195990.0463;
        }
        else{
            convertedValue = valueToConvert / 1195990.0463;
        }
        return convertedValue;
    }

    private double sqKilometerToSqFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 10763910.417;
        }
        else{
            convertedValue = valueToConvert / 10763910.417;
        }
        return convertedValue;
    }

    private double sqKilometerToSqInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1550003100;
        }
        else{
            convertedValue = valueToConvert / 1550003100;
        }
        return convertedValue;
    }

    private double sqKilometerToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 247.10538147;
        }
        else{
            convertedValue = valueToConvert / 247.10538147;
        }
        return convertedValue;
    }

    private double sqCentimeterToSqMillimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 100;
        }
        else{
            convertedValue = valueToConvert / 100;
        }
        return convertedValue;
    }

    private double sqCentimeterToSqMicrometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 100000000;
        }
        else{
            convertedValue = valueToConvert / 100000000;
        }
        return convertedValue;
    }

    private double sqCentimeterToHectare(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.E-8;
        }
        else{
            convertedValue = valueToConvert / 1.E-8;
        }
        return convertedValue;
    }

    private double sqCentimeterToSqMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.861018768E-11;
        }
        else{
            convertedValue = valueToConvert / 3.861018768E-11;
        }
        return convertedValue;
    }

    private double sqCentimeterToSqYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000119599;
        }
        else{
            convertedValue = valueToConvert / 0.000119599;
        }
        return convertedValue;
    }

    private double sqCentimeterToSqFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.001076391;
        }
        else{
            convertedValue = valueToConvert / 0.001076391;
        }
        return convertedValue;
    }

    private double sqCentimeterToSqInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.15500031;
        }
        else{
            convertedValue = valueToConvert / 0.15500031;
        }
        return convertedValue;
    }

    private double sqCentimeterToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.471053814E-8;
        }
        else{
            convertedValue = valueToConvert / 2.471053814E-8;
        }
        return convertedValue;
    }

    private double sqMillimeterToSqMicrometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double sqMillimeterToHectare(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 9.999999999E-11;
        }
        else{
            convertedValue = valueToConvert / 9.999999999E-11;
        }
        return convertedValue;
    }

    private double sqMillimeterToSqMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.861018768E-13;
        }
        else{
            convertedValue = valueToConvert / 3.861018768E-13;
        }
        return convertedValue;
    }

    private double sqMillimeterToSqYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000001196;
        }
        else{
            convertedValue = valueToConvert / 0.000001196;
        }
        return convertedValue;
    }

    private double sqMillimeterToSqFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000107639;
        }
        else{
            convertedValue = valueToConvert / 0.0000107639;
        }
        return convertedValue;
    }

    private double sqMillimeterToSqInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0015500031;
        }
        else{
            convertedValue = valueToConvert / 0.0015500031;
        }
        return convertedValue;
    }

    private double sqMillimeterToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.471053814E-10;
        }
        else{
            convertedValue = valueToConvert / 2.471053814E-10;
        }
        return convertedValue;
    }

    private double sqMicrometerToHectare(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.E-16;
        }
        else{
            convertedValue = valueToConvert / 1.E-16;
        }
        return convertedValue;
    }

    private double sqMicrometerToSqMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.861018768E-19;
        }
        else{
            convertedValue = valueToConvert / 3.861018768E-19;
        }
        return convertedValue;
    }

    private double sqMicrometerToSqYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.195990046E-12;
        }
        else{
            convertedValue = valueToConvert / 1.195990046E-12;
        }
        return convertedValue;
    }

    private double sqMicrometerToSqFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.076391041E-11;
        }
        else{
            convertedValue = valueToConvert / 1.076391041E-11;
        }
        return convertedValue;
    }

    private double sqMicrometerToSqInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.5500031E-9;
        }
        else{
            convertedValue = valueToConvert / 1.5500031E-9;
        }
        return convertedValue;
    }

    private double sqMicrometerToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.471053814E-16;
        }
        else{
            convertedValue = valueToConvert / 2.471053814E-16;
        }
        return convertedValue;
    }

    private double hectareToSqMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0038610188;
        }
        else{
            convertedValue = valueToConvert / 0.0038610188;
        }
        return convertedValue;
    }

    private double hectareToSqYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 11959.900463;
        }
        else{
            convertedValue = valueToConvert / 11959.900463;
        }
        return convertedValue;
    }

    private double hectareToSqFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 107639.10417;
        }
        else{
            convertedValue = valueToConvert / 107639.10417;
        }
        return convertedValue;
    }

    private double hectareToSqInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 15500031;
        }
        else{
            convertedValue = valueToConvert / 15500031;
        }
        return convertedValue;
    }

    private double hectareToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.4710538147;
        }
        else{
            convertedValue = valueToConvert / 2.4710538147;
        }
        return convertedValue;
    }

    private double sqMileToSqYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3097602.26;
        }
        else{
            convertedValue = valueToConvert / 3097602.26;
        }
        return convertedValue;
    }

    private double sqMileToSqFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 27878420.34;
        }
        else{
            convertedValue = valueToConvert / 27878420.34;
        }
        return convertedValue;
    }

    private double sqMileToSqInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4014492529D;
        }
        else{
            convertedValue = valueToConvert / 4014492529D;
        }
        return convertedValue;
    }

    private double sqMileToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 640.00046695;
        }
        else{
            convertedValue = valueToConvert / 640.00046695;
        }
        return convertedValue;
    }

    private double sqYardToSqFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 9;
        }
        else{
            convertedValue = valueToConvert / 9;
        }
        return convertedValue;
    }

    private double sqYardToSqInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1296;
        }
        else{
            convertedValue = valueToConvert / 1296;
        }
        return convertedValue;
    }

    private double sqYardToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0002066116;
        }
        else{
            convertedValue = valueToConvert / 0.0002066116;
        }
        return convertedValue;
    }

    private double sqFootToSqInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 144;
        }
        else{
            convertedValue = valueToConvert / 144;
        }
        return convertedValue;
    }

    private double sqFootToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000229568;
        }
        else{
            convertedValue = valueToConvert / 0.0000229568;
        }
        return convertedValue;
    }

    private double sqInchToAcre(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.594225079E-7;
        }
        else{
            convertedValue = valueToConvert / 1.594225079E-7;
        }
        return convertedValue;
    }

}
