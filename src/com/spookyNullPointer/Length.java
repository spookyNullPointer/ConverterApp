package com.spookyNullPointer;

import java.math.BigDecimal;

class Length {

    private double conversionResult;

    double getConversionResult(){
        return conversionResult;
    }

    Length(int from, int into, double valueToConvert){

        switch(from){
            //Meter
            case 1:
                switch(into){
                    case 2:
                        conversionResult= meterToKilometer(valueToConvert, false);
                        break;
                    case 3:
                        conversionResult= meterToCentimeter(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult= meterToMillimeter(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult= meterToMicrometer(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult= meterToNanometer(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult= meterToMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult= meterToYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult= meterToFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult= meterToInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult= meterToLightYear(valueToConvert, false);
                        break;
                    default:
                            System.out.println("Unknown Error: Length Class, Meter");
                            break;
                }
                break;
            //Kilometer
            case 2:
                switch(into){
                    case 1:
                        conversionResult= meterToKilometer(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult= kilometerToCentimeter(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult= kilometerToMillimeter(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult= kilometerToMicrometer(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult= kilometerToNanometer(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult= kilometerToMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult= kilometerToYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult= kilometerToFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult= kilometerToInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult= kilometerToLightYear(valueToConvert, false);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Kilometer");
                        break;
                }
                break;
            //Centimeter
            case 3:
                switch(into){
                    case 1:
                        conversionResult= meterToCentimeter(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult= kilometerToCentimeter(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult= centimeterToMillimeter(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult= centimeterToMicrometer(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult= centimeterToNanometer(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult= centimeterToMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult= centimeterToYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult= centimeterToFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult= centimeterToInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult= centimeterToLightYear(valueToConvert, false);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Centimeter");
                        break;
                }
                break;
            //Millimeter
            case 4:
                switch(into){
                    case 1:
                        conversionResult= meterToMillimeter(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult= kilometerToMillimeter(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult= centimeterToMillimeter(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult= millimeterToMicrometer(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult= millimeterToNanometer(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult= millimeterToMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult= millimeterToYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult= millimeterToFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult= millimeterToInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult= millimeterToLightYear(valueToConvert, false);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Millimeter");
                        break;
                }
                break;
            //Micrometer
            case 5:
                switch(into){
                    case 1:
                        conversionResult= meterToMicrometer(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult= kilometerToMicrometer(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult= centimeterToMicrometer(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult= millimeterToMicrometer(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult= micrometerToNanometer(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult= micrometerToMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult= micrometerToYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult= micrometerToFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult= micrometerToInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult= micrometerToLightYear(valueToConvert, false);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Micrometer");
                        break;
                }
                break;
            //Nanometer
            case 6:
                switch(into){
                    case 1:
                        conversionResult= meterToNanometer(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult= kilometerToNanometer(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult= centimeterToNanometer(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult= millimeterToNanometer(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult= micrometerToNanometer(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult= nanometerToMile(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult= nanometerToYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult= nanometerToFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult= nanometerToInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult= nanometerToLightYear(valueToConvert, false);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Nanometer");
                        break;
                }
                break;
            //Mile
            case 7:
                switch(into){
                    case 1:
                        conversionResult= meterToMile(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult= kilometerToMile(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult= centimeterToMile(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult= millimeterToMile(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult= micrometerToMile(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult= nanometerToMile(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult= mileToYard(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult= mileToFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult= mileToInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult= mileToLightYear(valueToConvert, false);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Nanometer");
                        break;
                }
                break;

                //Yard
            case 8:
                switch(into){
                    case 1:
                        conversionResult= meterToYard(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult= kilometerToYard(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult= centimeterToYard(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult= millimeterToYard(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult= micrometerToYard(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult= nanometerToYard(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult= mileToYard(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult= yardToFoot(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult= yardToInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult= yardToLightYear(valueToConvert, false);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Mile");
                        break;
                }
                break;

                //Foot
            case 9:
                switch(into){
                    case 1:
                        conversionResult= meterToFoot(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult= kilometerToFoot(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult= centimeterToFoot(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult= millimeterToFoot(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult= micrometerToFoot(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult= nanometerToFoot(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult= mileToFoot(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult= yardToFoot(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult= footToInch(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult= footToLightYear(valueToConvert, false);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Yard");
                        break;
                }
                break;
                //Inch
            case 10:
                switch(into){
                    case 1:
                        conversionResult= meterToInch(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult= kilometerToInch(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult= centimeterToInch(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult= millimeterToInch(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult= micrometerToInch(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult= nanometerToInch(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult= mileToInch(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult= yardToInch(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult= footToInch(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult= inchToLightYear(valueToConvert, false);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Foot");
                        break;
                }
                break;
                //Light Year
            case 11:
                switch(into){
                    case 1:
                        conversionResult= meterToLightYear(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult= kilometerToLightYear(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult= centimeterToLightYear(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult= millimeterToLightYear(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult= micrometerToLightYear(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult= nanometerToLightYear(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult= mileToLightYear(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult= yardToLightYear(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult= footToLightYear(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult= inchToLightYear(valueToConvert, true);
                        break;
                    default:
                        System.out.println("Unknown Error: Length Class, Foot");
                        break;
                }
                break;
        }
        //Temp Test
        System.out.println("Conversion Result: " + conversionResult);
    }

    private double meterToKilometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double meterToCentimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 100;
        }
        else{
            convertedValue = valueToConvert / 100;
        }
        return convertedValue;
    }

    private double meterToMillimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double meterToMicrometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1_000_000;
        }
        else{
            convertedValue = valueToConvert / 1_000_000;
        }
        return convertedValue;
    }

    private double meterToNanometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1_000_000_000;
        }
        else{
            convertedValue = valueToConvert / 1_000_000_000;
        }
        return convertedValue;
    }

    private double meterToMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0006213689;
        }
        else{
            convertedValue = valueToConvert / 0.0006213689;
        }
        return convertedValue;
    }

    private double meterToYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.0936132983;
        }
        else{
            convertedValue = valueToConvert / 1.0936132983;
        }
        return convertedValue;
    }

    private double meterToFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.280839895;
        }
        else{
            convertedValue = valueToConvert / 3.280839895;
        }
        return convertedValue;
    }

    private double meterToInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 39.37007874;
        }
        else{
            convertedValue = valueToConvert / 39.37007874;
        }
        return convertedValue;
    }

    private double meterToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.057008707E-16;
        }
        else{
            convertedValue = valueToConvert / 1.057008707E-16;
        }
        return convertedValue;
    }

    private double kilometerToCentimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 100000;
        }
        else{
            convertedValue = valueToConvert / 100000;
        }
        return convertedValue;
    }

    private double kilometerToMillimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double kilometerToMicrometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000;
        }
        else{
            convertedValue = valueToConvert / 1000000000;
        }
        return convertedValue;
    }

    private double kilometerToNanometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000000D;
        }
        else{
            convertedValue = valueToConvert / 1000000000000D;
        }
        return convertedValue;
    }

    private double kilometerToMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.6213688756;
        }
        else{
            convertedValue = valueToConvert / 0.6213688756;
        }
        return convertedValue;
    }

    private double kilometerToYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1093.6132983;
        }
        else{
            convertedValue = valueToConvert / 1093.6132983;
        }
        return convertedValue;
    }

    private double kilometerToFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3280.839895;
        }
        else{
            convertedValue = valueToConvert / 3280.839895;
        }
        return convertedValue;
    }

    private double kilometerToInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 39370.07874;
        }
        else{
            convertedValue = valueToConvert / 39370.07874;
        }
        return convertedValue;
    }

    private double kilometerToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.057008707E-13;
        }
        else{
            convertedValue = valueToConvert / 1.057008707E-13;
        }
        return convertedValue;
    }

    private double centimeterToMillimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 10;
        }
        else{
            convertedValue = valueToConvert / 10;
        }
        return convertedValue;
    }

    private double centimeterToMicrometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 10000;
        }
        else{
            convertedValue = valueToConvert / 10000;
        }
        return convertedValue;
    }

    private double centimeterToNanometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 10000000;
        }
        else{
            convertedValue = valueToConvert / 10000000;
        }
        return convertedValue;
    }

    private double centimeterToMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000062137;
        }
        else{
            convertedValue = valueToConvert / 0.0000062137;
        }
        return convertedValue;
    }

    private double centimeterToYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.010936133;
        }
        else{
            convertedValue = valueToConvert / 0.010936133;
        }
        return convertedValue;
    }

    private double centimeterToFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.032808399;
        }
        else{
            convertedValue = valueToConvert / 0.032808399;
        }
        return convertedValue;
    }

    private double centimeterToInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.3937007874;
        }
        else{
            convertedValue = valueToConvert / 0.3937007874;
        }
        return convertedValue;
    }

    private double centimeterToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.057008707E-18;
        }
        else{
            convertedValue = valueToConvert / 1.057008707E-18;
        }
        return convertedValue;
    }

    private double millimeterToMicrometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double millimeterToNanometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double millimeterToMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6.213688756E-7;
        }
        else{
            convertedValue = valueToConvert / 6.213688756E-7;
        }
        return convertedValue;
    }

    private double millimeterToYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0010936133;
        }
        else{
            convertedValue = valueToConvert / 0.0010936133;
        }
        return convertedValue;
    }

    private double millimeterToFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0032808399;
        }
        else{
            convertedValue = valueToConvert / 0.0032808399;
        }
        return convertedValue;
    }

    private double millimeterToInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0393700787;
        }
        else{
            convertedValue = valueToConvert / 0.0393700787;
        }
        return convertedValue;
    }

    private double millimeterToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.057008707E-19;
        }
        else{
            convertedValue = valueToConvert / 1.057008707E-19;
        }
        return convertedValue;
    }

    private double micrometerToNanometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double micrometerToMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6.213688756E-10;
        }
        else{
            convertedValue = valueToConvert / 6.213688756E-10;
        }
        return convertedValue;
    }

    private double micrometerToYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000010936;
        }
        else{
            convertedValue = valueToConvert / 0.0000010936;
        }
        return convertedValue;
    }

    private double micrometerToFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000032808;
        }
        else{
            convertedValue = valueToConvert / 0.0000032808;
        }
        return convertedValue;
    }

    private double micrometerToInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000393701;
        }
        else{
            convertedValue = valueToConvert / 0.0000393701;
        }
        return convertedValue;
    }

    private double micrometerToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.057008707E-22;
        }
        else{
            convertedValue = valueToConvert / 1.057008707E-22;
        }
        return convertedValue;
    }

    private double nanometerToMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6.213688756E-13;
        }
        else{
            convertedValue = valueToConvert / 6.213688756E-13;
        }
        return convertedValue;
    }

    private double nanometerToYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.093613298E-9;
        }
        else{
            convertedValue = valueToConvert / 1.093613298E-9;
        }
        return convertedValue;
    }

    private double nanometerToFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.280839895E-9;
        }
        else{
            convertedValue = valueToConvert / 3.280839895E-9;
        }
        return convertedValue;
    }

    private double nanometerToInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.937007874E-8;
        }
        else{
            convertedValue = valueToConvert / 3.937007874E-8;
        }
        return convertedValue;
    }

    private double nanometerToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.057008707E-25;
        }
        else{
            convertedValue = valueToConvert / 1.057008707E-25;
        }
        return convertedValue;
    }

    private double mileToYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1760.0065617;
        }
        else{
            convertedValue = valueToConvert / 1760.0065617;
        }
        return convertedValue;
    }

    private double mileToFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 5280.019685;
        }
        else{
            convertedValue = valueToConvert / 5280.019685;
        }
        return convertedValue;
    }

    private double mileToInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 63360.23622;
        }
        else{
            convertedValue = valueToConvert / 63360.23622;
        }
        return convertedValue;
    }

    private double mileToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.701096963E-13;
        }
        else{
            convertedValue = valueToConvert / 1.701096963E-13;
        }
        return convertedValue;
    }

    private double yardToFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3;
        }
        else{
            convertedValue = valueToConvert / 3;
        }
        return convertedValue;
    }

    private double yardToInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 36;
        }
        else{
            convertedValue = valueToConvert / 36;
        }
        return convertedValue;
    }

    private double yardToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 9.665287622E-17;
        }
        else{
            convertedValue = valueToConvert / 9.665287622E-17;
        }
        return convertedValue;
    }

    private double footToInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 12;
        }
        else{
            convertedValue = valueToConvert / 12;
        }
        return convertedValue;
    }

    private double footToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.22176254E-17;
        }
        else{
            convertedValue = valueToConvert / 3.22176254E-17;
        }
        return convertedValue;
    }

    private double inchToLightYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.684802117E-18;
        }
        else{
            convertedValue = valueToConvert / 2.684802117E-18;
        }
        return convertedValue;
    }












}
