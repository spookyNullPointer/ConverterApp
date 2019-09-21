package com.spookyNullPointer;

class Volume {

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
                        conversionResult = cbMeterToCbKilometer(valueToConvert, false);
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
                        conversionResult = cbMeterToMilliliter(valueToConvert, false);
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
                    case 23:
                        conversionResult = cbMeterToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Cubic Kilometer
            case 2:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToCbKilometer(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbKilometerToCbCentimeter(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult = cbKilometerToCbMillimeter(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = cbKilometerToLiter(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = cbKilometerToMilliliter(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = cbKilometerToUSGallon(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = cbKilometerToUSQuart(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = cbKilometerToUSPint(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = cbKilometerToUSCup(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = cbKilometerToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = cbKilometerToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = cbKilometerToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = cbKilometerToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = cbKilometerToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = cbKilometerToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = cbKilometerToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = cbKilometerToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = cbKilometerToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = cbKilometerToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = cbKilometerToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = cbKilometerToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = cbKilometerToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Cubic Centimeter
            case 3:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToCbCentimeter(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToCbCentimeter(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbCentimeterToCbMillimeter(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = cbCentimeterToLiter(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = cbCentimeterToMilliliter(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = cbCentimeterToUSGallon(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = cbCentimeterToUSQuart(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = cbCentimeterToUSPint(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = cbCentimeterToUSCup(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = cbCentimeterToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = cbCentimeterToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = cbCentimeterToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = cbCentimeterToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = cbCentimeterToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = cbCentimeterToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = cbCentimeterToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = cbCentimeterToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = cbCentimeterToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = cbCentimeterToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = cbCentimeterToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = cbCentimeterToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = cbCentimeterToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Cubic Millimeter
            case 4:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToCbMillimeter(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToCbMillimeter(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToCbMillimeter(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = cbMillimeterToLiter(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = cbMillimeterToMilliliter(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = cbMillimeterToUSGallon(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = cbMillimeterToUSQuart(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = cbMillimeterToUSPint(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = cbMillimeterToUSCup(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = cbMillimeterToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = cbMillimeterToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = cbMillimeterToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = cbMillimeterToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = cbMillimeterToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = cbMillimeterToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = cbMillimeterToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = cbMillimeterToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = cbMillimeterToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = cbMillimeterToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = cbMillimeterToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = cbMillimeterToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = cbMillimeterToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Liter
            case 5:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToLiter(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToLiter(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToLiter(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToLiter(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = literToMilliliter(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = literToUSGallon(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = literToUSQuart(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = literToUSPint(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = literToUSCup(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = literToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = literToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = literToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = literToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = literToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = literToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = literToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = literToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = literToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = literToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = literToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = literToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = literToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Millimeter
            case 6:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToMilliliter(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToMilliliter(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToMilliliter(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToMilliliter(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToMilliliter(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = milliliterToUSGallon(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = milliliterToUSQuart(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = milliliterToUSPint(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = milliliterToUSCup(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = milliliterToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = milliliterToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = milliliterToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = milliliterToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = milliliterToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = milliliterToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = milliliterToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = milliliterToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = milliliterToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = milliliterToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = milliliterToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = milliliterToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = milliliterToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //US Gallon
            case 7:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToUSGallon(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToUSGallon(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToUSGallon(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToUSGallon(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToUSGallon(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToUSGallon(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usGallonToUSQuart(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = usGallonToUSPint(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = usGallonToUSCup(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = usGallonToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = usGallonToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = usGallonToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = usGallonToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = usGallonToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = usGallonToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = usGallonToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = usGallonToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = usGallonToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = usGallonToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = usGallonToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = usGallonToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = usGallonToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //US Quart
            case 8:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToUSQuart(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToUSQuart(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToUSQuart(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToUSQuart(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToUSQuart(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToUSQuart(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToUSQuart(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usQuartToUSPint(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = usQuartToUSCup(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = usQuartToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = usQuartToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = usQuartToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = usQuartToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = usQuartToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = usQuartToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = usQuartToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = usQuartToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = usQuartToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = usQuartToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = usQuartToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = usQuartToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = usQuartToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //US Pint
            case 9:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToUSPint(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToUSPint(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToUSPint(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToUSPint(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToUSPint(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToUSPint(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToUSPint(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToUSPint(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usPintToUSCup(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = usPintToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = usPintToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = usPintToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = usPintToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = usPintToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = usPintToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = usPintToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = usPintToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = usPintToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = usPintToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = usPintToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = usPintToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = usPintToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //US Cup
            case 10:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToUSCup(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToUSCup(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToUSCup(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToUSCup(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToUSCup(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToUSCup(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToUSCup(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToUSCup(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToUSCup(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usCupToUSFluidOunce(valueToConvert, false);
                        break;
                    case 12:
                        conversionResult = usCupToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = usCupToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = usCupToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = usCupToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = usCupToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = usCupToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = usCupToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = usCupToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = usCupToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = usCupToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = usCupToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = usCupToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //US Fluid Ounce
            case 11:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToUSFluidOunce(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToUSFluidOunce(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToUSFluidOunce(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToUSFluidOunce(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToUSFluidOunce(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToUSFluidOunce(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToUSFluidOunce(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToUSFluidOunce(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToUSFluidOunce(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToUSFluidOunce(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usFluidOunceToUSTableSpoon(valueToConvert, false);
                        break;
                    case 13:
                        conversionResult = usFluidOunceToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = usFluidOunceToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = usFluidOunceToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = usFluidOunceToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = usFluidOunceToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = usFluidOunceToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = usFluidOunceToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = usFluidOunceToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = usFluidOunceToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = usFluidOunceToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = usFluidOunceToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //US Table Spoon
            case 12:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToUSTableSpoon(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToUSTableSpoon(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToUSTableSpoon(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToUSTableSpoon(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToUSTableSpoon(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToUSTableSpoon(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToUSTableSpoon(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToUSTableSpoon(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToUSTableSpoon(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToUSTableSpoon(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToUSTableSpoon(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTableSpoonToUSTeaSpoon(valueToConvert, false);
                        break;
                    case 14:
                        conversionResult = usTableSpoonToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = usTableSpoonToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = usTableSpoonToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = usTableSpoonToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = usTableSpoonToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = usTableSpoonToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = usTableSpoonToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = usTableSpoonToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = usTableSpoonToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = usTableSpoonToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //US Tea Spoon
            case 13:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToUSTeaSpoon(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = usTeaSpoonToImperialGallon(valueToConvert, false);
                        break;
                    case 15:
                        conversionResult = usTeaSpoonToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = usTeaSpoonToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = usTeaSpoonToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = usTeaSpoonToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = usTeaSpoonToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = usTeaSpoonToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = usTeaSpoonToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = usTeaSpoonToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = usTeaSpoonToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Imperial Gallon
            case 14:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToImperialGallon(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToImperialGallon(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToImperialGallon(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToImperialGallon(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToImperialGallon(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToImperialGallon(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToImperialGallon(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToImperialGallon(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToImperialGallon(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToImperialGallon(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToImperialGallon(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToImperialGallon(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToImperialGallon(valueToConvert, true);
                        break;
                    case 15:
                        conversionResult = imperialGallonToImperialQuart(valueToConvert, false);
                        break;
                    case 16:
                        conversionResult = imperialGallonToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = imperialGallonToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = imperialGallonToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = imperialGallonToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = imperialGallonToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = imperialGallonToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = imperialGallonToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = imperialGallonToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Imperial Quart
            case 15:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToImperialQuart(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToImperialQuart(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToImperialQuart(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToImperialQuart(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToImperialQuart(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToImperialQuart(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToImperialQuart(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToImperialQuart(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToImperialQuart(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToImperialQuart(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToImperialQuart(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToImperialQuart(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToImperialQuart(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = imperialGallonToImperialQuart(valueToConvert, true);
                        break;
                    case 16:
                        conversionResult = imperialQuartToImperialPint(valueToConvert, false);
                        break;
                    case 17:
                        conversionResult = imperialQuartToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = imperialQuartToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = imperialQuartToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = imperialQuartToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = imperialQuartToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = imperialQuartToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = imperialQuartToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Imperial Pint
            case 16:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToImperialPint(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToImperialPint(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToImperialPint(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToImperialPint(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToImperialPint(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToImperialPint(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToImperialPint(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToImperialPint(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToImperialPint(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToImperialPint(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToImperialPint(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToImperialPint(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToImperialPint(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = imperialGallonToImperialPint(valueToConvert, true);
                        break;
                    case 15:
                        conversionResult = imperialQuartToImperialPint(valueToConvert, true);
                        break;
                    case 17:
                        conversionResult = imperialPintToImperialFluidOunce(valueToConvert, false);
                        break;
                    case 18:
                        conversionResult = imperialPintToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = imperialPintToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = imperialPintToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = imperialPintToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = imperialPintToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = imperialPintToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Imperial Fluid Ounce
            case 17:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = imperialGallonToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 15:
                        conversionResult = imperialQuartToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 16:
                        conversionResult = imperialPintToImperialFluidOunce(valueToConvert, true);
                        break;
                    case 18:
                        conversionResult = imperialFluidOunceToImperialTableSpoon(valueToConvert, false);
                        break;
                    case 19:
                        conversionResult = imperialFluidOunceToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = imperialFluidOunceToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = imperialFluidOunceToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = imperialFluidOunceToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = imperialFluidOunceToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Imperial Table Spoon
            case 18:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = imperialGallonToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 15:
                        conversionResult = imperialQuartToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 16:
                        conversionResult = imperialPintToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 17:
                        conversionResult = imperialFluidOunceToImperialTableSpoon(valueToConvert, true);
                        break;
                    case 19:
                        conversionResult = imperialTableSpoonToImperialTeaSpoon(valueToConvert, false);
                        break;
                    case 20:
                        conversionResult = imperialTableSpoonToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = imperialTableSpoonToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = imperialTableSpoonToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = imperialTableSpoonToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Imperial Tea Spoon
            case 19:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = imperialGallonToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 15:
                        conversionResult = imperialQuartToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 16:
                        conversionResult = imperialPintToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 17:
                        conversionResult = imperialFluidOunceToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 18:
                        conversionResult = imperialTableSpoonToImperialTeaSpoon(valueToConvert, true);
                        break;
                    case 20:
                        conversionResult = imperialTeaSpoonToCbMile(valueToConvert, false);
                        break;
                    case 21:
                        conversionResult = imperialTeaSpoonToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = imperialTeaSpoonToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = imperialTeaSpoonToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Cubic Mile
            case 20:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToCbMile(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToCbMile(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToCbMile(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToCbMile(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToCbMile(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToCbMile(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToCbMile(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToCbMile(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToCbMile(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToCbMile(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToCbMile(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToCbMile(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToCbMile(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = imperialGallonToCbMile(valueToConvert, true);
                        break;
                    case 15:
                        conversionResult = imperialQuartToCbMile(valueToConvert, true);
                        break;
                    case 16:
                        conversionResult = imperialPintToCbMile(valueToConvert, true);
                        break;
                    case 17:
                        conversionResult = imperialFluidOunceToCbMile(valueToConvert, true);
                        break;
                    case 18:
                        conversionResult = imperialTableSpoonToCbMile(valueToConvert, true);
                        break;
                    case 19:
                        conversionResult = imperialTeaSpoonToCbMile(valueToConvert, true);
                        break;
                    case 21:
                        conversionResult = cbMileToCbYard(valueToConvert, false);
                        break;
                    case 22:
                        conversionResult = cbMileToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = cbMileToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Cubic Yard
            case 21:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToCbYard(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToCbYard(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToCbYard(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToCbYard(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToCbYard(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToCbYard(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToCbYard(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToCbYard(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToCbYard(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToCbYard(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToCbYard(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToCbYard(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToCbYard(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = imperialGallonToCbYard(valueToConvert, true);
                        break;
                    case 15:
                        conversionResult = imperialQuartToCbYard(valueToConvert, true);
                        break;
                    case 16:
                        conversionResult = imperialPintToCbYard(valueToConvert, true);
                        break;
                    case 17:
                        conversionResult = imperialFluidOunceToCbYard(valueToConvert, true);
                        break;
                    case 18:
                        conversionResult = imperialTableSpoonToCbYard(valueToConvert, true);
                        break;
                    case 19:
                        conversionResult = imperialTeaSpoonToCbYard(valueToConvert, true);
                        break;
                    case 20:
                        conversionResult = cbMileToCbYard(valueToConvert, true);
                        break;
                    case 22:
                        conversionResult = cbYardToCbFoot(valueToConvert, false);
                        break;
                    case 23:
                        conversionResult = cbYardToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Cubic Foot
            case 22:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToCbFoot(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToCbFoot(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToCbFoot(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToCbFoot(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToCbFoot(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToCbFoot(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToCbFoot(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToCbFoot(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToCbFoot(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToCbFoot(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToCbFoot(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToCbFoot(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToCbFoot(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = imperialGallonToCbFoot(valueToConvert, true);
                        break;
                    case 15:
                        conversionResult = imperialQuartToCbFoot(valueToConvert, true);
                        break;
                    case 16:
                        conversionResult = imperialPintToCbFoot(valueToConvert, true);
                        break;
                    case 17:
                        conversionResult = imperialFluidOunceToCbFoot(valueToConvert, true);
                        break;
                    case 18:
                        conversionResult = imperialTableSpoonToCbFoot(valueToConvert, true);
                        break;
                    case 19:
                        conversionResult = imperialTeaSpoonToCbFoot(valueToConvert, true);
                        break;
                    case 20:
                        conversionResult = cbMileToCbFoot(valueToConvert, true);
                        break;
                    case 21:
                        conversionResult = cbYardToCbFoot(valueToConvert, true);
                        break;
                    case 23:
                        conversionResult = cbFootToCbInch(valueToConvert, false);
                        break;
                }
                break;
            //Cubic Inch
            case 23:
                switch(into) {
                    case 1:
                        conversionResult = cbMeterToCbInch(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = cbKilometerToCbInch(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = cbCentimeterToCbInch(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = cbMillimeterToCbInch(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = literToCbInch(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = milliliterToCbInch(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = usGallonToCbInch(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = usQuartToCbInch(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = usPintToCbInch(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = usCupToCbInch(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = usFluidOunceToCbInch(valueToConvert, true);
                        break;
                    case 12:
                        conversionResult = usTableSpoonToCbInch(valueToConvert, true);
                        break;
                    case 13:
                        conversionResult = usTeaSpoonToCbInch(valueToConvert, true);
                        break;
                    case 14:
                        conversionResult = imperialGallonToCbInch(valueToConvert, true);
                        break;
                    case 15:
                        conversionResult = imperialQuartToCbInch(valueToConvert, true);
                        break;
                    case 16:
                        conversionResult = imperialPintToCbInch(valueToConvert, true);
                        break;
                    case 17:
                        conversionResult = imperialFluidOunceToCbInch(valueToConvert, true);
                        break;
                    case 18:
                        conversionResult = imperialTableSpoonToCbInch(valueToConvert, true);
                        break;
                    case 19:
                        conversionResult = imperialTeaSpoonToCbInch(valueToConvert, true);
                        break;
                    case 20:
                        conversionResult = cbMileToCbInch(valueToConvert, true);
                        break;
                    case 21:
                        conversionResult = cbYardToCbInch(valueToConvert, true);
                        break;
                    case 22:
                        conversionResult = cbFootToCbInch(valueToConvert, true);
                        break;
                }
                break;
        }
    }

    private double cbMeterToCbKilometer(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.E-9;
        }
        else{
            convertedValue = valueToConvert / 1.E-9;
        }
        return convertedValue;
    }

    private double cbMeterToCbCentimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double cbMeterToCbMillimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000;
        }
        else{
            convertedValue = valueToConvert / 1000000000;
        }
        return convertedValue;
    }

    private double cbMeterToLiter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double cbMeterToMilliliter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double cbMeterToUSGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 264.17217686;
        }
        else{
            convertedValue = valueToConvert / 264.17217686;
        }
        return convertedValue;
    }

    private double cbMeterToUSQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1056.6887074;
        }
        else{
            convertedValue = valueToConvert / 1056.6887074;
        }
        return convertedValue;
    }

    private double cbMeterToUSPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2113.3774149;
        }
        else{
            convertedValue = valueToConvert / 2113.3774149;
        }
        return convertedValue;
    }

    private double cbMeterToUSCup(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4226.7548297;
        }
        else{
            convertedValue = valueToConvert / 4226.7548297;
        }
        return convertedValue;
    }

    private double cbMeterToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 33814.038638;
        }
        else{
            convertedValue = valueToConvert / 33814.038638;
        }
        return convertedValue;
    }

    private double cbMeterToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 67628.077276;
        }
        else{
            convertedValue = valueToConvert / 67628.077276;
        }
        return convertedValue;
    }

    private double cbMeterToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 202884.23183;
        }
        else{
            convertedValue = valueToConvert / 202884.23183;
        }
        return convertedValue;
    }

    private double cbMeterToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 219.9692483;
        }
        else{
            convertedValue = valueToConvert / 219.9692483;
        }
        return convertedValue;
    }

    private double cbMeterToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 879.8769932;
        }
        else{
            convertedValue = valueToConvert / 879.8769932;
        }
        return convertedValue;
    }

    private double cbMeterToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1759.7539864;
        }
        else{
            convertedValue = valueToConvert / 1759.7539864;
        }
        return convertedValue;
    }

    private double cbMeterToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 35195.079728;
        }
        else{
            convertedValue = valueToConvert / 35195.079728;
        }
        return convertedValue;
    }

    private double cbMeterToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 56312.127565;
        }
        else{
            convertedValue = valueToConvert / 56312.127565;
        }
        return convertedValue;
    }

    private double cbMeterToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 168936.38269;
        }
        else{
            convertedValue = valueToConvert / 168936.38269;
        }
        return convertedValue;
    }

    private double cbMeterToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.399128636E-10;
        }
        else{
            convertedValue = valueToConvert / 2.399128636E-10;
        }
        return convertedValue;
    }

    private double cbMeterToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.3079506193;
        }
        else{
            convertedValue = valueToConvert / 1.3079506193;
        }
        return convertedValue;
    }

    private double cbMeterToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 35.314666721;
        }
        else{
            convertedValue = valueToConvert / 35.314666721;
        }
        return convertedValue;
    }

    private double cbMeterToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 61023.744095;
        }
        else{
            convertedValue = valueToConvert / 61023.744095;
        }
        return convertedValue;
    }

    private double cbKilometerToCbCentimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000000000D;
        }
        else{
            convertedValue = valueToConvert / 1000000000000000D;
        }
        return convertedValue;
    }

    private double cbKilometerToCbMillimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000000000000D;
        }
        else{
            convertedValue = valueToConvert / 1000000000000000000D;
        }
        return convertedValue;
    }

    private double cbKilometerToLiter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000000D;
        }
        else{
            convertedValue = valueToConvert / 1000000000000D;
        }
        return convertedValue;
    }

    private double cbKilometerToMilliliter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000000000D;
        }
        else{
            convertedValue = valueToConvert / 1000000000000000D;
        }
        return convertedValue;
    }

    private double cbKilometerToUSGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 264172176858D;
        }
        else{
            convertedValue = valueToConvert / 264172176858D;
        }
        return convertedValue;
    }

    private double cbKilometerToUSQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1056688707432D;
        }
        else{
            convertedValue = valueToConvert / 1056688707432D;
        }
        return convertedValue;
    }

    private double cbKilometerToUSPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2113377414864D;
        }
        else{
            convertedValue = valueToConvert / 2113377414864D;
        }
        return convertedValue;
    }

    private double cbKilometerToUSCup(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4226754829728D;
        }
        else{
            convertedValue = valueToConvert / 4226754829728D;
        }
        return convertedValue;
    }

    private double cbKilometerToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 33814038637823D;
        }
        else{
            convertedValue = valueToConvert / 33814038637823D;
        }
        return convertedValue;
    }

    private double cbKilometerToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 67628077275645D;
        }
        else{
            convertedValue = valueToConvert / 67628077275645D;
        }
        return convertedValue;
    }

    private double cbKilometerToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 202884231826936D;
        }
        else{
            convertedValue = valueToConvert / 202884231826936D;
        }
        return convertedValue;
    }

    private double cbKilometerToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 219969248299D;
        }
        else{
            convertedValue = valueToConvert / 219969248299D;
        }
        return convertedValue;
    }

    private double cbKilometerToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 879876993196D;
        }
        else{
            convertedValue = valueToConvert / 879876993196D;
        }
        return convertedValue;
    }

    private double cbKilometerToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1759753986393D;
        }
        else{
            convertedValue = valueToConvert / 1759753986393D;
        }
        return convertedValue;
    }

    private double cbKilometerToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 35195079727854D;
        }
        else{
            convertedValue = valueToConvert / 35195079727854D;
        }
        return convertedValue;
    }

    private double cbKilometerToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 56312127564566D;
        }
        else{
            convertedValue = valueToConvert / 56312127564566D;
        }
        return convertedValue;
    }

    private double cbKilometerToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 168936382693699D;
        }
        else{
            convertedValue = valueToConvert / 168936382693699D;
        }
        return convertedValue;
    }

    private double cbKilometerToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.2399128636;
        }
        else{
            convertedValue = valueToConvert / 0.2399128636;
        }
        return convertedValue;
    }

    private double cbKilometerToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1307950619.3;
        }
        else{
            convertedValue = valueToConvert / 1307950619.3;
        }
        return convertedValue;
    }

    private double cbKilometerToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 35314666721D;
        }
        else{
            convertedValue = valueToConvert / 35314666721D;
        }
        return convertedValue;
    }

    private double cbKilometerToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 61023744094732D;
        }
        else{
            convertedValue = valueToConvert / 61023744094732D;
        }
        return convertedValue;
    }

    private double cbCentimeterToCbMillimeter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double cbCentimeterToLiter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.001;
        }
        else{
            convertedValue = valueToConvert / 0.001;
        }
        return convertedValue;
    }

    private double cbCentimeterToMilliliter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1;
        }
        else{
            convertedValue = valueToConvert / 1;
        }
        return convertedValue;
    }

    private double cbCentimeterToUSGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0002641722;
        }
        else{
            convertedValue = valueToConvert / 0.0002641722;
        }
        return convertedValue;
    }

    private double cbCentimeterToUSQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0010566887;
        }
        else{
            convertedValue = valueToConvert / 0.0010566887;
        }
        return convertedValue;
    }

    private double cbCentimeterToUSPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0021133774;
        }
        else{
            convertedValue = valueToConvert / 0.0021133774;
        }
        return convertedValue;
    }

    private double cbCentimeterToUSCup(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0042267548;
        }
        else{
            convertedValue = valueToConvert / 0.0042267548;
        }
        return convertedValue;
    }

    private double cbCentimeterToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0338140386;
        }
        else{
            convertedValue = valueToConvert / 0.0338140386;
        }
        return convertedValue;
    }

    private double cbCentimeterToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0676280773;
        }
        else{
            convertedValue = valueToConvert / 0.0676280773;
        }
        return convertedValue;
    }

    private double cbCentimeterToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.2028842318;
        }
        else{
            convertedValue = valueToConvert / 0.2028842318;
        }
        return convertedValue;
    }

    private double cbCentimeterToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0002199692;
        }
        else{
            convertedValue = valueToConvert / 0.0002199692;
        }
        return convertedValue;
    }

    private double cbCentimeterToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000879877;
        }
        else{
            convertedValue = valueToConvert / 0.000879877;
        }
        return convertedValue;
    }

    private double cbCentimeterToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.001759754;
        }
        else{
            convertedValue = valueToConvert / 0.001759754;
        }
        return convertedValue;
    }

    private double cbCentimeterToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0351950797;
        }
        else{
            convertedValue = valueToConvert / 0.0351950797;
        }
        return convertedValue;
    }

    private double cbCentimeterToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0563121276;
        }
        else{
            convertedValue = valueToConvert / 0.0563121276;
        }
        return convertedValue;
    }

    private double cbCentimeterToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.1689363827;
        }
        else{
            convertedValue = valueToConvert / 0.1689363827;
        }
        return convertedValue;
    }

    private double cbCentimeterToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.399128636E-16;
        }
        else{
            convertedValue = valueToConvert / 2.399128636E-16;
        }
        return convertedValue;
    }

    private double cbCentimeterToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000001308;
        }
        else{
            convertedValue = valueToConvert / 0.000001308;
        }
        return convertedValue;
    }

    private double cbCentimeterToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000353147;
        }
        else{
            convertedValue = valueToConvert / 0.0000353147;
        }
        return convertedValue;
    }

    private double cbCentimeterToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0610237441;
        }
        else{
            convertedValue = valueToConvert / 0.0610237441;
        }
        return convertedValue;
    }

    private double cbMillimeterToLiter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000001;
        }
        else{
            convertedValue = valueToConvert / 0.000001;
        }
        return convertedValue;
    }

    private double cbMillimeterToMilliliter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.001;
        }
        else{
            convertedValue = valueToConvert / 0.001;
        }
        return convertedValue;
    }

    private double cbMillimeterToUSGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.641721768E-7;
        }
        else{
            convertedValue = valueToConvert / 2.641721768E-7;
        }
        return convertedValue;
    }

    private double cbMillimeterToUSQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000010567;
        }
        else{
            convertedValue = valueToConvert / 0.0000010567;
        }
        return convertedValue;
    }

    private double cbMillimeterToUSPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000021134;
        }
        else{
            convertedValue = valueToConvert / 0.0000021134;
        }
        return convertedValue;
    }

    private double cbMillimeterToUSCup(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000042268;
        }
        else{
            convertedValue = valueToConvert / 0.0000042268;
        }
        return convertedValue;
    }

    private double cbMillimeterToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000033814;
        }
        else{
            convertedValue = valueToConvert / 0.000033814;
        }
        return convertedValue;
    }

    private double cbMillimeterToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000676281;
        }
        else{
            convertedValue = valueToConvert / 0.0000676281;
        }
        return convertedValue;
    }

    private double cbMillimeterToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0002028842;
        }
        else{
            convertedValue = valueToConvert / 0.0002028842;
        }
        return convertedValue;
    }

    private double cbMillimeterToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.199692482E-7;
        }
        else{
            convertedValue = valueToConvert / 2.199692482E-7;
        }
        return convertedValue;
    }

    private double cbMillimeterToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 8.798769931E-7;
        }
        else{
            convertedValue = valueToConvert / 8.798769931E-7;
        }
        return convertedValue;
    }

    private double cbMillimeterToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000017598;
        }
        else{
            convertedValue = valueToConvert / 0.0000017598;
        }
        return convertedValue;
    }

    private double cbMillimeterToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000351951;
        }
        else{
            convertedValue = valueToConvert / 0.0000351951;
        }
        return convertedValue;
    }

    private double cbMillimeterToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000563121;
        }
        else{
            convertedValue = valueToConvert / 0.0000563121;
        }
        return convertedValue;
    }

    private double cbMillimeterToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0001689364;
        }
        else{
            convertedValue = valueToConvert / 0.0001689364;
        }
        return convertedValue;
    }

    private double cbMillimeterToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.399128636E-19;
        }
        else{
            convertedValue = valueToConvert / 2.399128636E-19;
        }
        return convertedValue;
    }

    private double cbMillimeterToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.307950619E-9;
        }
        else{
            convertedValue = valueToConvert / 1.307950619E-9;
        }
        return convertedValue;
    }

    private double cbMillimeterToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.531466672E-8;
        }
        else{
            convertedValue = valueToConvert / 3.531466672E-8;
        }
        return convertedValue;
    }

    private double cbMillimeterToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000610237;
        }
        else{
            convertedValue = valueToConvert / 0.0000610237;
        }
        return convertedValue;
    }

    private double literToMilliliter(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double literToUSGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.2641721769;
        }
        else{
            convertedValue = valueToConvert / 0.2641721769;
        }
        return convertedValue;
    }

    private double literToUSQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.0566887074;
        }
        else{
            convertedValue = valueToConvert / 1.0566887074;
        }
        return convertedValue;
    }

    private double literToUSPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.1133774149;
        }
        else{
            convertedValue = valueToConvert / 2.1133774149;
        }
        return convertedValue;
    }

    private double literToUSCup(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4.2267548297;
        }
        else{
            convertedValue = valueToConvert / 4.2267548297;
        }
        return convertedValue;
    }

    private double literToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 33.814038638;
        }
        else{
            convertedValue = valueToConvert / 33.814038638;
        }
        return convertedValue;
    }

    private double literToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 67.628077276;
        }
        else{
            convertedValue = valueToConvert / 67.628077276;
        }
        return convertedValue;
    }

    private double literToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 202.88423183;
        }
        else{
            convertedValue = valueToConvert / 202.88423183;
        }
        return convertedValue;
    }

    private double literToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.2199692483;
        }
        else{
            convertedValue = valueToConvert / 0.2199692483;
        }
        return convertedValue;
    }

    private double literToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.8798769932;
        }
        else{
            convertedValue = valueToConvert / 0.8798769932;
        }
        return convertedValue;
    }

    private double literToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.7597539864;
        }
        else{
            convertedValue = valueToConvert / 1.7597539864;
        }
        return convertedValue;
    }

    private double literToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 35.195079728;
        }
        else{
            convertedValue = valueToConvert / 35.195079728;
        }
        return convertedValue;
    }

    private double literToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 56.312127565;
        }
        else{
            convertedValue = valueToConvert / 56.312127565;
        }
        return convertedValue;
    }

    private double literToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 168.93638269;
        }
        else{
            convertedValue = valueToConvert / 168.93638269;
        }
        return convertedValue;
    }

    private double literToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.399128636E-13;
        }
        else{
            convertedValue = valueToConvert / 2.399128636E-13;
        }
        return convertedValue;
    }

    private double literToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0013079506;
        }
        else{
            convertedValue = valueToConvert / 0.0013079506;
        }
        return convertedValue;
    }

    private double literToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0353146667;
        }
        else{
            convertedValue = valueToConvert / 0.0353146667;
        }
        return convertedValue;
    }

    private double literToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 61.023744095;
        }
        else{
            convertedValue = valueToConvert / 61.023744095;
        }
        return convertedValue;
    }

    private double milliliterToUSGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0002641722;
        }
        else{
            convertedValue = valueToConvert / 0.0002641722;
        }
        return convertedValue;
    }

    private double milliliterToUSQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0010566887;
        }
        else{
            convertedValue = valueToConvert / 0.0010566887;
        }
        return convertedValue;
    }

    private double milliliterToUSPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0021133774;
        }
        else{
            convertedValue = valueToConvert / 0.0021133774;
        }
        return convertedValue;
    }

    private double milliliterToUSCup(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0042267548;
        }
        else{
            convertedValue = valueToConvert / 0.0042267548;
        }
        return convertedValue;
    }

    private double milliliterToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0338140386;
        }
        else{
            convertedValue = valueToConvert / 0.0338140386;
        }
        return convertedValue;
    }

    private double milliliterToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0676280773;
        }
        else{
            convertedValue = valueToConvert / 0.0676280773;
        }
        return convertedValue;
    }

    private double milliliterToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.2028842318;
        }
        else{
            convertedValue = valueToConvert / 0.2028842318;
        }
        return convertedValue;
    }

    private double milliliterToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0002199692;
        }
        else{
            convertedValue = valueToConvert / 0.0002199692;
        }
        return convertedValue;
    }

    private double milliliterToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000879877;
        }
        else{
            convertedValue = valueToConvert / 0.000879877;
        }
        return convertedValue;
    }

    private double milliliterToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.001759754;
        }
        else{
            convertedValue = valueToConvert / 0.001759754;
        }
        return convertedValue;
    }

    private double milliliterToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0351950797;
        }
        else{
            convertedValue = valueToConvert / 0.0351950797;
        }
        return convertedValue;
    }

    private double milliliterToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0563121276;
        }
        else{
            convertedValue = valueToConvert / 0.0563121276;
        }
        return convertedValue;
    }

    private double milliliterToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.1689363827;
        }
        else{
            convertedValue = valueToConvert / 0.1689363827;
        }
        return convertedValue;
    }

    private double milliliterToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.399128636E-16;
        }
        else{
            convertedValue = valueToConvert / 2.399128636E-16;
        }
        return convertedValue;
    }

    private double milliliterToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000001308;
        }
        else{
            convertedValue = valueToConvert / 0.000001308;
        }
        return convertedValue;
    }

    private double milliliterToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000353147;
        }
        else{
            convertedValue = valueToConvert / 0.0000353147;
        }
        return convertedValue;
    }

    private double milliliterToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0610237441;
        }
        else{
            convertedValue = valueToConvert / 0.0610237441;
        }
        return convertedValue;
    }

    private double usGallonToUSQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4;
        }
        else{
            convertedValue = valueToConvert / 4;
        }
        return convertedValue;
    }

    private double usGallonToUSPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 8;
        }
        else{
            convertedValue = valueToConvert / 8;
        }
        return convertedValue;
    }

    private double usGallonToUSCup(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 16;
        }
        else{
            convertedValue = valueToConvert / 16;
        }
        return convertedValue;
    }

    private double usGallonToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 128;
        }
        else{
            convertedValue = valueToConvert / 128;
        }
        return convertedValue;
    }

    private double usGallonToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 256;
        }
        else{
            convertedValue = valueToConvert / 256;
        }
        return convertedValue;
    }

    private double usGallonToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 768;
        }
        else{
            convertedValue = valueToConvert / 768;
        }
        return convertedValue;
    }

    private double usGallonToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.8326737922;
        }
        else{
            convertedValue = valueToConvert / 0.8326737922;
        }
        return convertedValue;
    }

    private double usGallonToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.3306951688;
        }
        else{
            convertedValue = valueToConvert / 3.3306951688;
        }
        return convertedValue;
    }

    private double usGallonToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6.6613903376;
        }
        else{
            convertedValue = valueToConvert / 6.6613903376;
        }
        return convertedValue;
    }

    private double usGallonToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 133.22780675;
        }
        else{
            convertedValue = valueToConvert / 133.22780675;
        }
        return convertedValue;
    }

    private double usGallonToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 213.1644908;
        }
        else{
            convertedValue = valueToConvert / 213.1644908;
        }
        return convertedValue;
    }

    private double usGallonToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 639.49347241;
        }
        else{
            convertedValue = valueToConvert / 639.49347241;
        }
        return convertedValue;
    }

    private double usGallonToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 9.081685531E-13;
        }
        else{
            convertedValue = valueToConvert / 9.081685531E-13;
        }
        return convertedValue;
    }

    private double usGallonToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0049511294;
        }
        else{
            convertedValue = valueToConvert / 0.0049511294;
        }
        return convertedValue;
    }

    private double usGallonToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.1336804926;
        }
        else{
            convertedValue = valueToConvert / 0.1336804926;
        }
        return convertedValue;
    }

    private double usGallonToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 230.99989113;
        }
        else{
            convertedValue = valueToConvert / 230.99989113;
        }
        return convertedValue;
    }

    private double usQuartToUSPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2;
        }
        else{
            convertedValue = valueToConvert / 2;
        }
        return convertedValue;
    }

    private double usQuartToUSCup(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4;
        }
        else{
            convertedValue = valueToConvert / 4;
        }
        return convertedValue;
    }

    private double usQuartToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 32;
        }
        else{
            convertedValue = valueToConvert / 32;
        }
        return convertedValue;
    }

    private double usQuartToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 64;
        }
        else{
            convertedValue = valueToConvert / 64;
        }
        return convertedValue;
    }

    private double usQuartToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 192;
        }
        else{
            convertedValue = valueToConvert / 192;
        }
        return convertedValue;
    }

    private double usQuartToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.2081684481;
        }
        else{
            convertedValue = valueToConvert / 0.2081684481;
        }
        return convertedValue;
    }

    private double usQuartToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.8326737922;
        }
        else{
            convertedValue = valueToConvert / 0.8326737922;
        }
        return convertedValue;
    }

    private double usQuartToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.6653475844;
        }
        else{
            convertedValue = valueToConvert / 1.6653475844;
        }
        return convertedValue;
    }

    private double usQuartToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 33.306951688;
        }
        else{
            convertedValue = valueToConvert / 33.306951688;
        }
        return convertedValue;
    }

    private double usQuartToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 53.291122701;
        }
        else{
            convertedValue = valueToConvert / 53.291122701;
        }
        return convertedValue;
    }

    private double usQuartToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 159.8733681;
        }
        else{
            convertedValue = valueToConvert / 159.8733681;
        }
        return convertedValue;
    }

    private double usQuartToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.270421382E-13;
        }
        else{
            convertedValue = valueToConvert / 2.270421382E-13;
        }
        return convertedValue;
    }

    private double usQuartToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0012377823;
        }
        else{
            convertedValue = valueToConvert / 0.0012377823;
        }
        return convertedValue;
    }

    private double usQuartToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0334201231;
        }
        else{
            convertedValue = valueToConvert / 0.0334201231;
        }
        return convertedValue;
    }

    private double usQuartToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 57.749972783;
        }
        else{
            convertedValue = valueToConvert / 57.749972783;
        }
        return convertedValue;
    }

    private double usPintToUSCup(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2;
        }
        else{
            convertedValue = valueToConvert / 2;
        }
        return convertedValue;
    }

    private double usPintToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 16;
        }
        else{
            convertedValue = valueToConvert / 16;
        }
        return convertedValue;
    }

    private double usPintToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 32;
        }
        else{
            convertedValue = valueToConvert / 32;
        }
        return convertedValue;
    }

    private double usPintToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 96;
        }
        else{
            convertedValue = valueToConvert / 96;
        }
        return convertedValue;
    }

    private double usPintToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.104084224;
        }
        else{
            convertedValue = valueToConvert / 0.104084224;
        }
        return convertedValue;
    }

    private double usPintToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.4163368961;
        }
        else{
            convertedValue = valueToConvert / 0.4163368961;
        }
        return convertedValue;
    }

    private double usPintToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.8326737922;
        }
        else{
            convertedValue = valueToConvert / 0.8326737922;
        }
        return convertedValue;
    }

    private double usPintToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 16.653475844;
        }
        else{
            convertedValue = valueToConvert / 16.653475844;
        }
        return convertedValue;
    }

    private double usPintToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 26.645561351;
        }
        else{
            convertedValue = valueToConvert / 26.645561351;
        }
        return convertedValue;
    }

    private double usPintToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 79.936684052;
        }
        else{
            convertedValue = valueToConvert / 79.936684052;
        }
        return convertedValue;
    }

    private double usPintToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.135210691E-13;
        }
        else{
            convertedValue = valueToConvert / 1.135210691E-13;
        }
        return convertedValue;
    }

    private double usPintToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0006188912;
        }
        else{
            convertedValue = valueToConvert / 0.0006188912;
        }
        return convertedValue;
    }

    private double usPintToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0167100616;
        }
        else{
            convertedValue = valueToConvert / 0.0167100616;
        }
        return convertedValue;
    }

    private double usPintToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 28.874986392;
        }
        else{
            convertedValue = valueToConvert / 28.874986392;
        }
        return convertedValue;
    }

    private double usCupToUSFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 8;
        }
        else{
            convertedValue = valueToConvert / 8;
        }
        return convertedValue;
    }

    private double usCupToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 16;
        }
        else{
            convertedValue = valueToConvert / 16;
        }
        return convertedValue;
    }

    private double usCupToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 48;
        }
        else{
            convertedValue = valueToConvert / 48;
        }
        return convertedValue;
    }

    private double usCupToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.052042112;
        }
        else{
            convertedValue = valueToConvert / 0.052042112;
        }
        return convertedValue;
    }

    private double usCupToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.2081684481;
        }
        else{
            convertedValue = valueToConvert / 0.2081684481;
        }
        return convertedValue;
    }

    private double usCupToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.4163368961;
        }
        else{
            convertedValue = valueToConvert / 0.4163368961;
        }
        return convertedValue;
    }

    private double usCupToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 8.326737922;
        }
        else{
            convertedValue = valueToConvert / 8.326737922;
        }
        return convertedValue;
    }

    private double usCupToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 13.322780675;
        }
        else{
            convertedValue = valueToConvert / 13.322780675;
        }
        return convertedValue;
    }

    private double usCupToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 39.968342026;
        }
        else{
            convertedValue = valueToConvert / 39.968342026;
        }
        return convertedValue;
    }

    private double usCupToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 5.676053457E-14;
        }
        else{
            convertedValue = valueToConvert / 5.676053457E-14;
        }
        return convertedValue;
    }

    private double usCupToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0003094456;
        }
        else{
            convertedValue = valueToConvert / 0.0003094456;
        }
        return convertedValue;
    }

    private double usCupToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0083550308;
        }
        else{
            convertedValue = valueToConvert / 0.0083550308;
        }
        return convertedValue;
    }

    private double usCupToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 14.437493196;
        }
        else{
            convertedValue = valueToConvert / 14.437493196;
        }
        return convertedValue;
    }

    private double usFluidOunceToUSTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2;
        }
        else{
            convertedValue = valueToConvert / 2;
        }
        return convertedValue;
    }

    private double usFluidOunceToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6;
        }
        else{
            convertedValue = valueToConvert / 6;
        }
        return convertedValue;
    }

    private double usFluidOunceToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.006505264;
        }
        else{
            convertedValue = valueToConvert / 0.006505264;
        }
        return convertedValue;
    }

    private double usFluidOunceToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.026021056;
        }
        else{
            convertedValue = valueToConvert / 0.026021056;
        }
        return convertedValue;
    }

    private double usFluidOunceToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.052042112;
        }
        else{
            convertedValue = valueToConvert / 0.052042112;
        }
        return convertedValue;
    }

    private double usFluidOunceToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.0408422403;
        }
        else{
            convertedValue = valueToConvert / 1.0408422403;
        }
        return convertedValue;
    }

    private double usFluidOunceToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.6653475844;
        }
        else{
            convertedValue = valueToConvert / 1.6653475844;
        }
        return convertedValue;
    }

    private double usFluidOunceToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4.9960427532;
        }
        else{
            convertedValue = valueToConvert / 4.9960427532;
        }
        return convertedValue;
    }

    private double usFluidOunceToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 7.095066821E-15;
        }
        else{
            convertedValue = valueToConvert / 7.095066821E-15;
        }
        return convertedValue;
    }

    private double usFluidOunceToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000386807;
        }
        else{
            convertedValue = valueToConvert / 0.0000386807;
        }
        return convertedValue;
    }

    private double usFluidOunceToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0010443788;
        }
        else{
            convertedValue = valueToConvert / 0.0010443788;
        }
        return convertedValue;
    }

    private double usFluidOunceToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.8046866495;
        }
        else{
            convertedValue = valueToConvert / 1.8046866495;
        }
        return convertedValue;
    }

    private double usTableSpoonToUSTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3;
        }
        else{
            convertedValue = valueToConvert / 3;
        }
        return convertedValue;
    }

    private double usTableSpoonToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.003252632;
        }
        else{
            convertedValue = valueToConvert / 0.003252632;
        }
        return convertedValue;
    }

    private double usTableSpoonToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.013010528;
        }
        else{
            convertedValue = valueToConvert / 0.013010528;
        }
        return convertedValue;
    }

    private double usTableSpoonToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.026021056;
        }
        else{
            convertedValue = valueToConvert / 0.026021056;
        }
        return convertedValue;
    }

    private double usTableSpoonToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.5204211201;
        }
        else{
            convertedValue = valueToConvert / 0.5204211201;
        }
        return convertedValue;
    }

    private double usTableSpoonToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.8326737922;
        }
        else{
            convertedValue = valueToConvert / 0.8326737922;
        }
        return convertedValue;
    }

    private double usTableSpoonToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.4980213766;
        }
        else{
            convertedValue = valueToConvert / 2.4980213766;
        }
        return convertedValue;
    }

    private double usTableSpoonToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.54753341E-15;
        }
        else{
            convertedValue = valueToConvert / 3.54753341E-15;
        }
        return convertedValue;
    }

    private double usTableSpoonToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000193403;
        }
        else{
            convertedValue = valueToConvert / 0.0000193403;
        }
        return convertedValue;
    }

    private double usTableSpoonToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0005221894;
        }
        else{
            convertedValue = valueToConvert / 0.0005221894;
        }
        return convertedValue;
    }

    private double usTableSpoonToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.9023433247;
        }
        else{
            convertedValue = valueToConvert / 0.9023433247;
        }
        return convertedValue;
    }

    private double usTeaSpoonToImperialGallon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0010842107;
        }
        else{
            convertedValue = valueToConvert / 0.0010842107;
        }
        return convertedValue;
    }

    private double usTeaSpoonToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0043368427;
        }
        else{
            convertedValue = valueToConvert / 0.0043368427;
        }
        return convertedValue;
    }

    private double usTeaSpoonToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0086736853;
        }
        else{
            convertedValue = valueToConvert / 0.0086736853;
        }
        return convertedValue;
    }

    private double usTeaSpoonToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.1734737067;
        }
        else{
            convertedValue = valueToConvert / 0.1734737067;
        }
        return convertedValue;
    }

    private double usTeaSpoonToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.2775579307;
        }
        else{
            convertedValue = valueToConvert / 0.2775579307;
        }
        return convertedValue;
    }

    private double usTeaSpoonToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.8326737922;
        }
        else{
            convertedValue = valueToConvert / 0.8326737922;
        }
        return convertedValue;
    }

    private double usTeaSpoonToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.182511136E-15;
        }
        else{
            convertedValue = valueToConvert / 1.182511136E-15;
        }
        return convertedValue;
    }

    private double usTeaSpoonToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000064468;
        }
        else{
            convertedValue = valueToConvert / 0.0000064468;
        }
        return convertedValue;
    }

    private double usTeaSpoonToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0001740631;
        }
        else{
            convertedValue = valueToConvert / 0.0001740631;
        }
        return convertedValue;
    }

    private double usTeaSpoonToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.3007811082;
        }
        else{
            convertedValue = valueToConvert / 0.3007811082;
        }
        return convertedValue;
    }

    private double imperialGallonToImperialQuart(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4;
        }
        else{
            convertedValue = valueToConvert / 4;
        }
        return convertedValue;
    }

    private double imperialGallonToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 8;
        }
        else{
            convertedValue = valueToConvert / 8;
        }
        return convertedValue;
    }

    private double imperialGallonToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 160;
        }
        else{
            convertedValue = valueToConvert / 160;
        }
        return convertedValue;
    }

    private double imperialGallonToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 256;
        }
        else{
            convertedValue = valueToConvert / 256;
        }
        return convertedValue;
    }

    private double imperialGallonToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 768;
        }
        else{
            convertedValue = valueToConvert / 768;
        }
        return convertedValue;
    }

    private double imperialGallonToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.09066547E-12;
        }
        else{
            convertedValue = valueToConvert / 1.09066547E-12;
        }
        return convertedValue;
    }

    private double imperialGallonToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0059460612;
        }
        else{
            convertedValue = valueToConvert / 0.0059460612;
        }
        return convertedValue;
    }

    private double imperialGallonToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.1605436532;
        }
        else{
            convertedValue = valueToConvert / 0.1605436532;
        }
        return convertedValue;
    }

    private double imperialGallonToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 277.41943279;
        }
        else{
            convertedValue = valueToConvert / 277.41943279;
        }
        return convertedValue;
    }

    private double imperialQuartToImperialPint(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2;
        }
        else{
            convertedValue = valueToConvert / 2;
        }
        return convertedValue;
    }

    private double imperialQuartToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 40;
        }
        else{
            convertedValue = valueToConvert / 40;
        }
        return convertedValue;
    }

    private double imperialQuartToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 64;
        }
        else{
            convertedValue = valueToConvert / 64;
        }
        return convertedValue;
    }

    private double imperialQuartToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 192;
        }
        else{
            convertedValue = valueToConvert / 192;
        }
        return convertedValue;
    }

    private double imperialQuartToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.726663675E-13;
        }
        else{
            convertedValue = valueToConvert / 2.726663675E-13;
        }
        return convertedValue;
    }

    private double imperialQuartToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0014865153;
        }
        else{
            convertedValue = valueToConvert / 0.0014865153;
        }
        return convertedValue;
    }

    private double imperialQuartToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0401359133;
        }
        else{
            convertedValue = valueToConvert / 0.0401359133;
        }
        return convertedValue;
    }

    private double imperialQuartToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 69.354858198;
        }
        else{
            convertedValue = valueToConvert / 69.354858198;
        }
        return convertedValue;
    }

    private double imperialPintToImperialFluidOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 20;
        }
        else{
            convertedValue = valueToConvert / 20;
        }
        return convertedValue;
    }

    private double imperialPintToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 32;
        }
        else{
            convertedValue = valueToConvert / 32;
        }
        return convertedValue;
    }

    private double imperialPintToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 96;
        }
        else{
            convertedValue = valueToConvert / 96;
        }
        return convertedValue;
    }

    private double imperialPintToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.363331837E-13;
        }
        else{
            convertedValue = valueToConvert / 1.363331837E-13;
        }
        return convertedValue;
    }

    private double imperialPintToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0007432577;
        }
        else{
            convertedValue = valueToConvert / 0.0007432577;
        }
        return convertedValue;
    }

    private double imperialPintToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0200679567;
        }
        else{
            convertedValue = valueToConvert / 0.0200679567;
        }
        return convertedValue;
    }

    private double imperialPintToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 34.677429099;
        }
        else{
            convertedValue = valueToConvert / 34.677429099;
        }
        return convertedValue;
    }

    private double imperialFluidOunceToImperialTableSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.6;
        }
        else{
            convertedValue = valueToConvert / 1.6;
        }
        return convertedValue;
    }

    private double imperialFluidOunceToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4.8;
        }
        else{
            convertedValue = valueToConvert / 4.8;
        }
        return convertedValue;
    }

    private double imperialFluidOunceToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6.816659189E-15;
        }
        else{
            convertedValue = valueToConvert / 6.816659189E-15;
        }
        return convertedValue;
    }

    private double imperialFluidOunceToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000371629;
        }
        else{
            convertedValue = valueToConvert / 0.0000371629;
        }
        return convertedValue;
    }

    private double imperialFluidOunceToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0010033978;
        }
        else{
            convertedValue = valueToConvert / 0.0010033978;
        }
        return convertedValue;
    }

    private double imperialFluidOunceToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.7338714549;
        }
        else{
            convertedValue = valueToConvert / 1.7338714549;
        }
        return convertedValue;
    }

    private double imperialTableSpoonToImperialTeaSpoon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3;
        }
        else{
            convertedValue = valueToConvert / 3;
        }
        return convertedValue;
    }

    private double imperialTableSpoonToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4.260411993E-15;
        }
        else{
            convertedValue = valueToConvert / 4.260411993E-15;
        }
        return convertedValue;
    }

    private double imperialTableSpoonToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000232268;
        }
        else{
            convertedValue = valueToConvert / 0.0000232268;
        }
        return convertedValue;
    }

    private double imperialTableSpoonToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0006271236;
        }
        else{
            convertedValue = valueToConvert / 0.0006271236;
        }
        return convertedValue;
    }

    private double imperialTableSpoonToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.0836696593;
        }
        else{
            convertedValue = valueToConvert / 1.0836696593;
        }
        return convertedValue;
    }

    private double imperialTeaSpoonToCbMile(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.420137331E-15;
        }
        else{
            convertedValue = valueToConvert / 1.420137331E-15;
        }
        return convertedValue;
    }

    private double imperialTeaSpoonToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000077423;
        }
        else{
            convertedValue = valueToConvert / 0.0000077423;
        }
        return convertedValue;
    }

    private double imperialTeaSpoonToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0002090412;
        }
        else{
            convertedValue = valueToConvert / 0.0002090412;
        }
        return convertedValue;
    }

    private double imperialTeaSpoonToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.3612232198;
        }
        else{
            convertedValue = valueToConvert / 0.3612232198;
        }
        return convertedValue;
    }

    private double cbMileToCbYard(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 5451773612.4;
        }
        else{
            convertedValue = valueToConvert / 5451773612.4;
        }
        return convertedValue;
    }

    private double cbMileToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 147197887535D;
        }
        else{
            convertedValue = valueToConvert / 147197887535D;
        }
        return convertedValue;
    }

    private double cbMileToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 254357949660781D;
        }
        else{
            convertedValue = valueToConvert / 254357949660781D;
        }
        return convertedValue;
    }

    private double cbYardToCbFoot(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 27;
        }
        else{
            convertedValue = valueToConvert / 27;
        }
        return convertedValue;
    }

    private double cbYardToCbInch(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 46656;
        }
        else{
            convertedValue = valueToConvert / 46656;
        }
        return convertedValue;
    }

    private double cbFootToCbInch(double valueToConvert, boolean reverse) {

        double convertedValue;
        if (!reverse) {
            convertedValue = valueToConvert * 1728;
        } else {
            convertedValue = valueToConvert / 1728;
        }
        return convertedValue;
    }

}