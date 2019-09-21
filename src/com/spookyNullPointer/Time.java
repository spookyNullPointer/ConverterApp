package com.spookyNullPointer;

class Time {

    private double conversionResult;

    double getConversionResult(){
        return conversionResult;
    }

    Time(int from, int into, double valueToConvert) {

        switch (from) {
            //Second
            case 1:
                switch (into) {
                    case 2:
                        conversionResult = secondToMillisecond(valueToConvert, false);
                        break;
                    case 3:
                        conversionResult = secondToMicrosecond(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult = secondToNanosecond(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = secondToPicosecond(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = secondToMinute(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = secondToHour(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = secondToDay(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = secondToWeek(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = secondToMonth(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = secondToYear(valueToConvert, false);
                        break;
                }
                break;
            //Millisecond
            case 2:
                break;
            //Microsecond
            case 3:
                break;
            //Nanosecond
            case 4:
                break;
            //Picosecond
            case 5:
                break;
            //Minute
            case 6:
                break;
            //Hour
            case 7:
                break;
            //Day
            case 8:
                break;
            //Week
            case 9:
                break;
            //Month
            case 10:
                break;
            //Year
            case 11:
                break;

        }
    }

    //Second To ... Test
    private double secondToMillisecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double secondToMicrosecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double secondToNanosecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000;
        }
        else{
            convertedValue = valueToConvert / 1000000000;
        }
        return convertedValue;
    }

    private double secondToPicosecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000000D;
        }
        else{
            convertedValue = valueToConvert / 1000000000000D;
        }
        return convertedValue;
    }

    private double secondToMinute(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0166666667;
        }
        else{
            convertedValue = valueToConvert / 0.0166666667;
        }
        return convertedValue;
    }

    private double secondToHour(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0002777778;
        }
        else{
            convertedValue = valueToConvert / 0.0002777778;
        }
        return convertedValue;
    }

    private double secondToDay(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000115741;
        }
        else{
            convertedValue = valueToConvert / 0.0000115741;
        }
        return convertedValue;
    }

    private double secondToWeek(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000016534;
        }
        else{
            convertedValue = valueToConvert / 0.0000016534;
        }
        return convertedValue;
    }

    private double secondToMonth(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.802570537E-7;
        }
        else{
            convertedValue = valueToConvert / 3.802570537E-7;
        }
        return convertedValue;
    }

    private double secondToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.168808781E-8;
        }
        else{
            convertedValue = valueToConvert / 3.168808781E-8;
        }
        return convertedValue;
    }
}
