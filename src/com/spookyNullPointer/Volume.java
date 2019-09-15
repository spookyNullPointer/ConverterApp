package com.spookyNullPointer;

public class Volume {

    private double conversionResult;

    double getConversionResult(){
        return conversionResult;
    }

    Volume(int from, int into, double valueToConvert) {

        switch (from) {
            //Cubic Meter
            case 1:
                switch(into) {
                    case 2:
                        conversionResult = cbMeterTocbKilometer(valueToConvert, false);
                        break;
                    case 3:
                        conversionResult = cbMeterToCbCentimeter(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult = cbMeterToCbMillimeter(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = cbMeterToLiter(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = CbMeterToMilliliter(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = cbMeterToUSGallon(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = cbMeterToUSQuart(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = cbMeterToUSPint(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = cbMeterToUSCup(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = cbMeterToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = cbMeterToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = cbMeterToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = cbMeterToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = cbMeterToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = cbMeterToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = cbMeterToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = cbMeterToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = cbMeterToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = cbMeterToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = cbMeterToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = cbMeterToCbFoot(valueToConvert, false);
                        break;
                    case 24:
                        conversionResult = cbMeterToCbInch(valueToConvert, false);
                        break;

                }
                break;
            case 2:
                break;
        }
    }
}
