package com.spookyNullPointer;

class Weight {

    private double conversionResult;

    double getConversionResult(){
        return conversionResult;
    }

    Weight(int from, int into, double valueToConvert) {

        switch (from) {
            //Kilogram
            case 1:
                switch(into) {
                    case 2:
                        conversionResult = kilogramToGram(valueToConvert, false);
                        break;
                    case 3:
                        conversionResult = kilogramToMilligram(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult = kilogramToMetricTon(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = kilogramToLongTon(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = kilogramShortTon(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = kilogramToPound(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = kilogramToOunce(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = kilogramToCarrat(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = kilogramToAtomicMassUnit(valueToConvert, false);
                        break;
                }
                break;
            //Gram
            case 2:
                switch(into) {
                    case 1:
                        conversionResult = kilogramToGram(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = gramToMilligram(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult = gramToMetricTon(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = gramToLongTon(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = gramShortTon(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = gramToPound(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = gramToOunce(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = gramToCarrat(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = gramToAtomicMassUnit(valueToConvert, false);
                        break;
                }
                break;
            //Milligram
            case 3:
                switch(into) {
                    case 1:
                        conversionResult = kilogramToMilligram(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = gramToMilligram(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = milligramToMetricTon(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = milligramToLongTon(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = milligramShortTon(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = milligramToPound(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = milligramToOunce(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = milligramToCarrat(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = milligramToAtomicMassUnit(valueToConvert, false);
                        break;
                }
                break;
            //Metric Ton
            case 4:
                switch(into) {
                    case 1:
                        conversionResult = kilogramToMetricTon(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = gramToMetricTon(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = milligramToMetricTon(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = metricTonToLongTon(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = metricTonShortTon(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = metricTonToPound(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = metricTonToOunce(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = metricTonToCarrat(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = metricTonToAtomicMassUnit(valueToConvert, false);
                        break;
                }
                break;
            //Long Ton
            case 5:
                switch(into) {
                    case 1:
                        conversionResult = kilogramToLongTon(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = gramToLongTon(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = milligramToLongTon(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = metricTonToLongTon(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = longTonShortTon(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = longTonToPound(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = longTonToOunce(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = longTonToCarrat(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = longTonToAtomicMassUnit(valueToConvert, false);
                        break;
                }
                break;
            //Short Ton
            case 6:
                switch(into) {
                    case 1:
                        conversionResult = kilogramShortTon(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = gramShortTon(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = milligramShortTon(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = metricTonShortTon(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = longTonShortTon(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = shortTonToPound(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = shortTonToOunce(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = shortTonToCarrat(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = shortTonToAtomicMassUnit(valueToConvert, false);
                        break;
                }
                break;
            //Pound
            case 7:
                switch(into) {
                    case 1:
                        conversionResult = kilogramToPound(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = gramToPound(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = milligramToPound(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = metricTonToPound(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = longTonToPound(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = shortTonToPound(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = poundToOunce(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = poundToCarrat(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = poundToAtomicMassUnit(valueToConvert, false);
                        break;
                }
                break;
            //Ounce
            case 8:
                switch(into) {
                    case 1:
                        conversionResult = kilogramToOunce(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = gramToOunce(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = milligramToOunce(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = metricTonToOunce(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = longTonToOunce(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = shortTonToOunce(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = poundToOunce(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = ounceToCarrat(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = ounceToAtomicMassUnit(valueToConvert, false);
                        break;
                }
                break;
            //Carrat
            case 9:
                switch(into) {
                    case 1:
                        conversionResult = kilogramToCarrat(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = gramToCarrat(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = milligramToCarrat(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = metricTonToCarrat(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = longTonToCarrat(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = shortTonToCarrat(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = poundToCarrat(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = ounceToCarrat(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = carratToAtomicMassUnit(valueToConvert, false);
                        break;
                }
                break;
            //Atomic Mass Unit
            case 10:
                switch(into) {
                    case 1:
                        conversionResult = kilogramToAtomicMassUnit(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = gramToAtomicMassUnit(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = milligramToAtomicMassUnit(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = metricTonToAtomicMassUnit(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = longTonToAtomicMassUnit(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = shortTonToAtomicMassUnit(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = poundToAtomicMassUnit(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = ounceToAtomicMassUnit(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = carratToAtomicMassUnit(valueToConvert, true);
                        break;
                }
                break;
        }
    }

    //Kilogram To ... Test
    private double kilogramToGram(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double kilogramToMilligram(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double kilogramToMetricTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.001;
        }
        else{
            convertedValue = valueToConvert / 0.001;
        }
        return convertedValue;
    }

    private double kilogramToLongTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0009842073;
        }
        else{
            convertedValue = valueToConvert / 0.0009842073;
        }
        return convertedValue;
    }

    private double kilogramShortTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0011023122;
        }
        else{
            convertedValue = valueToConvert / 0.0011023122;
        }
        return convertedValue;
    }

    private double kilogramToPound(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.2046244202;
        }
        else{
            convertedValue = valueToConvert / 2.2046244202;
        }
        return convertedValue;
    }

    private double kilogramToOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 35.273990723;
        }
        else{
            convertedValue = valueToConvert / 35.273990723;
        }
        return convertedValue;
    }

    private double kilogramToCarrat(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 5000;
        }
        else{
            convertedValue = valueToConvert / 5000;
        }
        return convertedValue;
    }

    private double kilogramToAtomicMassUnit(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6.022136652E+26;
        }
        else{
            convertedValue = valueToConvert / 6.022136652E+26;
        }
        return convertedValue;
    }

    //Gram To ... Test
    private double gramToMilligram(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double gramToMetricTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000001;
        }
        else{
            convertedValue = valueToConvert / 0.000001;
        }
        return convertedValue;
    }

    private double gramToLongTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 9.842073304E-7;
        }
        else{
            convertedValue = valueToConvert / 9.842073304E-7;
        }
        return convertedValue;
    }

    private double gramShortTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000011023;
        }
        else{
            convertedValue = valueToConvert / 0.0000011023;
        }
        return convertedValue;
    }

    private double gramToPound(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0022046244;
        }
        else{
            convertedValue = valueToConvert / 0.0022046244;
        }
        return convertedValue;
    }

    private double gramToOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0352739907;
        }
        else{
            convertedValue = valueToConvert / 0.0352739907;
        }
        return convertedValue;
    }

    private double gramToCarrat(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 5;
        }
        else{
            convertedValue = valueToConvert / 5;
        }
        return convertedValue;
    }

    private double gramToAtomicMassUnit(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6.022136652E+23;
        }
        else{
            convertedValue = valueToConvert / 6.022136652E+23;
        }
        return convertedValue;
    }

    //Milligram To ... Test
    private double milligramToMetricTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 9.999999999E-10;
        }
        else{
            convertedValue = valueToConvert / 9.999999999E-10;
        }
        return convertedValue;
    }

    private double milligramToLongTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 9.842073304E-10;
        }
        else{
            convertedValue = valueToConvert / 9.842073304E-10;
        }
        return convertedValue;
    }

    private double milligramShortTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.10231221E-9;
        }
        else{
            convertedValue = valueToConvert / 1.10231221E-9;
        }
        return convertedValue;
    }

    private double milligramToPound(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000022046;
        }
        else{
            convertedValue = valueToConvert / 0.0000022046;
        }
        return convertedValue;
    }

    private double milligramToOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.000035274;
        }
        else{
            convertedValue = valueToConvert / 0.000035274;
        }
        return convertedValue;
    }

    private double milligramToCarrat(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.005;
        }
        else{
            convertedValue = valueToConvert / 0.005;
        }
        return convertedValue;
    }

    private double milligramToAtomicMassUnit(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 602213665200000000000D;
        }
        else{
            convertedValue = valueToConvert / 602213665200000000000D;
        }
        return convertedValue;
    }

    //MetricTon To ... Test
    private double metricTonToLongTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.9842073304;
        }
        else{
            convertedValue = valueToConvert / 0.9842073304;
        }
        return convertedValue;
    }

    private double metricTonShortTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.1023122101;
        }
        else{
            convertedValue = valueToConvert / 1.1023122101;
        }
        return convertedValue;
    }

    private double metricTonToPound(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2204.6244202;
        }
        else{
            convertedValue = valueToConvert / 2204.6244202;
        }
        return convertedValue;
    }

    private double metricTonToOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 35273.990723;
        }
        else{
            convertedValue = valueToConvert / 35273.990723;
        }
        return convertedValue;
    }

    private double metricTonToCarrat(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 5000000;
        }
        else{
            convertedValue = valueToConvert / 5000000;
        }
        return convertedValue;
    }

    private double metricTonToAtomicMassUnit(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6.022136652E+29;
        }
        else{
            convertedValue = valueToConvert / 6.022136652E+29;
        }
        return convertedValue;
    }

    //LongTon To ... Test
    private double longTonShortTon(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.12;
        }
        else{
            convertedValue = valueToConvert / 1.12;
        }
        return convertedValue;
    }

    private double longTonToPound(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2240;
        }
        else{
            convertedValue = valueToConvert / 2240;
        }
        return convertedValue;
    }

    private double longTonToOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 35840;
        }
        else{
            convertedValue = valueToConvert / 35840;
        }
        return convertedValue;
    }

    private double longTonToCarrat(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 5080230.4;
        }
        else{
            convertedValue = valueToConvert / 5080230.4;
        }
        return convertedValue;
    }

    private double longTonToAtomicMassUnit(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 6.118768338E+29;
        }
        else{
            convertedValue = valueToConvert / 6.118768338E+29;
        }
        return convertedValue;
    }

    //ShortTon To ... Test
    private double shortTonToPound(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2000;
        }
        else{
            convertedValue = valueToConvert / 2000;
        }
        return convertedValue;
    }

    private double shortTonToOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 32000;
        }
        else{
            convertedValue = valueToConvert / 32000;
        }
        return convertedValue;
    }

    private double shortTonToCarrat(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 4535920;
        }
        else{
            convertedValue = valueToConvert / 4535920;
        }
        return convertedValue;
    }

    private double shortTonToAtomicMassUnit(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 5.463186016E+29;
        }
        else{
            convertedValue = valueToConvert / 5.463186016E+29;
        }
        return convertedValue;
    }

    //Pound To ... Test
    private double poundToOunce(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 16;
        }
        else{
            convertedValue = valueToConvert / 16;
        }
        return convertedValue;
    }

    private double poundToCarrat(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2267.96;
        }
        else{
            convertedValue = valueToConvert / 2267.96;
        }
        return convertedValue;
    }

    private double poundToAtomicMassUnit(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.731593008E+26;
        }
        else{
            convertedValue = valueToConvert / 2.731593008E+26;
        }
        return convertedValue;
    }

    //Ounce To ... Test
    private double ounceToCarrat(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 141.7475;
        }
        else{
            convertedValue = valueToConvert / 141.7475;
        }
        return convertedValue;
    }

    private double ounceToAtomicMassUnit(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.70724563E+25;
        }
        else{
            convertedValue = valueToConvert / 1.70724563E+25;
        }
        return convertedValue;
    }

    //Carrat To ... Test
    private double carratToAtomicMassUnit(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.20442733E+23;
        }
        else{
            convertedValue = valueToConvert / 1.20442733E+23;
        }
        return convertedValue;
    }

}
