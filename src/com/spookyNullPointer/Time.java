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
                switch (into) {
                    case 1:
                        conversionResult = secondToMillisecond(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = millisecondToMicrosecond(valueToConvert, false);
                        break;
                    case 4:
                        conversionResult = millisecondToNanosecond(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = millisecondToPicosecond(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = millisecondToMinute(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = millisecondToHour(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = millisecondToDay(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = millisecondToWeek(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = millisecondToMonth(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = millisecondToYear(valueToConvert, false);
                        break;
                }
                break;
            //Microsecond
            case 3:
                switch (into) {
                    case 1:
                        conversionResult = secondToMillisecond(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = millisecondToMicrosecond(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = microsecondToNanosecond(valueToConvert, false);
                        break;
                    case 5:
                        conversionResult = microsecondToPicosecond(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = microsecondToMinute(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = microsecondToHour(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = microsecondToDay(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = microsecondToWeek(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = microsecondToMonth(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = microsecondToYear(valueToConvert, false);
                        break;
                }
                break;
            //Nanosecond
            case 4:
                switch (into) {
                    case 1:
                        conversionResult = secondToNanosecond(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = millisecondToNanosecond(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = microsecondToNanosecond(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = nanosecondToPicosecond(valueToConvert, false);
                        break;
                    case 6:
                        conversionResult = nanosecondToMinute(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = nanosecondToHour(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = nanosecondToDay(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = nanosecondToWeek(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = nanosecondToMonth(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = nanosecondToYear(valueToConvert, false);
                        break;
                }
                break;
            //Picosecond
            case 5:
                switch (into) {
                    case 1:
                        conversionResult = secondToNanosecond(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = millisecondToNanosecond(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = microsecondToNanosecond(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = nanosecondToPicosecond(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = picosecondToMinute(valueToConvert, false);
                        break;
                    case 7:
                        conversionResult = picosecondToHour(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = picosecondToDay(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = picosecondToWeek(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = picosecondToMonth(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = picosecondToYear(valueToConvert, false);
                        break;
                }
                break;
            //Minute
            case 6:
                switch (into) {
                    case 1:
                        conversionResult = secondToNanosecond(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = millisecondToNanosecond(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = microsecondToNanosecond(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = nanosecondToPicosecond(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = picosecondToMinute(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = minuteToHour(valueToConvert, false);
                        break;
                    case 8:
                        conversionResult = minuteToDay(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = minuteToWeek(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = minuteToMonth(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = minuteToYear(valueToConvert, false);
                        break;
                }
                break;
            //Hour
            case 7:
                switch (into) {
                    case 1:
                        conversionResult = secondToNanosecond(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = millisecondToNanosecond(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = microsecondToNanosecond(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = nanosecondToPicosecond(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = picosecondToMinute(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = minuteToHour(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = hourToDay(valueToConvert, false);
                        break;
                    case 9:
                        conversionResult = hourToWeek(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = hourToMonth(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = hourToYear(valueToConvert, false);
                        break;
                }
                break;
            //Day
            case 8:
                switch (into) {
                    case 1:
                        conversionResult = secondToNanosecond(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = millisecondToNanosecond(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = microsecondToNanosecond(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = nanosecondToPicosecond(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = picosecondToMinute(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = minuteToHour(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = hourToDay(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = dayToWeek(valueToConvert, false);
                        break;
                    case 10:
                        conversionResult = dayToMonth(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = dayToYear(valueToConvert, false);
                        break;
                }
                break;
            //Week
            case 9:
                switch (into) {
                    case 1:
                        conversionResult = secondToNanosecond(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = millisecondToNanosecond(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = microsecondToNanosecond(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = nanosecondToPicosecond(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = picosecondToMinute(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = minuteToHour(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = hourToDay(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = dayToWeek(valueToConvert, true);
                        break;
                    case 10:
                        conversionResult = weekToMonth(valueToConvert, false);
                        break;
                    case 11:
                        conversionResult = weekToYear(valueToConvert, false);
                        break;
                }
                break;
            //Month
            case 10:
                switch (into) {
                    case 1:
                        conversionResult = secondToNanosecond(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = millisecondToNanosecond(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = microsecondToNanosecond(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = nanosecondToPicosecond(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = picosecondToMinute(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = minuteToHour(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = hourToDay(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = dayToWeek(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = weekToMonth(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = monthToYear(valueToConvert, false);
                        break;
                }
                break;
            //Year
            case 11:
                switch (into) {
                    case 1:
                        conversionResult = secondToNanosecond(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = millisecondToNanosecond(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = microsecondToNanosecond(valueToConvert, true);
                        break;
                    case 4:
                        conversionResult = nanosecondToPicosecond(valueToConvert, true);
                        break;
                    case 5:
                        conversionResult = picosecondToMinute(valueToConvert, true);
                        break;
                    case 6:
                        conversionResult = minuteToHour(valueToConvert, true);
                        break;
                    case 7:
                        conversionResult = hourToDay(valueToConvert, true);
                        break;
                    case 8:
                        conversionResult = dayToWeek(valueToConvert, true);
                        break;
                    case 9:
                        conversionResult = weekToMonth(valueToConvert, true);
                        break;
                    case 11:
                        conversionResult = monthToYear(valueToConvert, true);
                        break;
                }
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

    //Millisecond To ... Test
    private double millisecondToMicrosecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double millisecondToNanosecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double millisecondToPicosecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000000;
        }
        else{
            convertedValue = valueToConvert / 1000000000;
        }
        return convertedValue;
    }

    private double millisecondToMinute(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000166667;
        }
        else{
            convertedValue = valueToConvert / 0.0000166667;
        }
        return convertedValue;
    }

    private double millisecondToHour(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.777777777E-7;
        }
        else{
            convertedValue = valueToConvert / 2.777777777E-7;
        }
        return convertedValue;
    }

    private double millisecondToDay(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.157407407E-8;
        }
        else{
            convertedValue = valueToConvert / 1.157407407E-8;
        }
        return convertedValue;
    }

    private double millisecondToWeek(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.653439153E-9;
        }
        else{
            convertedValue = valueToConvert / 1.653439153E-9;
        }
        return convertedValue;
    }

    private double millisecondToMonth(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.802570537E-10;
        }
        else{
            convertedValue = valueToConvert / 3.802570537E-10;
        }
        return convertedValue;
    }

    private double millisecondToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.168808781E-11;
        }
        else{
            convertedValue = valueToConvert / 3.168808781E-11;
        }
        return convertedValue;
    }

    //Microsecond To ... Test
    private double microsecondToNanosecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double microsecondToPicosecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000000;
        }
        else{
            convertedValue = valueToConvert / 1000000;
        }
        return convertedValue;
    }

    private double microsecondToMinute(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.666666666E-8;
        }
        else{
            convertedValue = valueToConvert / 1.666666666E-8;
        }
        return convertedValue;
    }

    private double microsecondToHour(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.777777777E-10;
        }
        else{
            convertedValue = valueToConvert / 2.777777777E-10;
        }
        return convertedValue;
    }

    private double microsecondToDay(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.157407407E-11;
        }
        else{
            convertedValue = valueToConvert / 1.157407407E-11;
        }
        return convertedValue;
    }

    private double microsecondToWeek(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.653439153E-12;
        }
        else{
            convertedValue = valueToConvert / 1.653439153E-12;
        }
        return convertedValue;
    }

    private double microsecondToMonth(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.802570537E-13;
        }
        else{
            convertedValue = valueToConvert / 3.802570537E-13;
        }
        return convertedValue;
    }

    private double microsecondToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.168808781E-14;
        }
        else{
            convertedValue = valueToConvert / 3.168808781E-14;
        }
        return convertedValue;
    }

    //Nanosecond To ... Test
    private double nanosecondToPicosecond(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1000;
        }
        else{
            convertedValue = valueToConvert / 1000;
        }
        return convertedValue;
    }

    private double nanosecondToMinute(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.666666666E-11;
        }
        else{
            convertedValue = valueToConvert / 1.666666666E-11;
        }
        return convertedValue;
    }

    private double nanosecondToHour(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.777777777E-13;
        }
        else{
            convertedValue = valueToConvert / 2.777777777E-13;
        }
        return convertedValue;
    }

    private double nanosecondToDay(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.157407407E-14;
        }
        else{
            convertedValue = valueToConvert / 1.157407407E-14;
        }
        return convertedValue;
    }

    private double nanosecondToWeek(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.653439153E-15;
        }
        else{
            convertedValue = valueToConvert / 1.653439153E-15;
        }
        return convertedValue;
    }

    private double nanosecondToMonth(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.802570537E-16;
        }
        else{
            convertedValue = valueToConvert / 3.802570537E-16;
        }
        return convertedValue;
    }

    private double nanosecondToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.168808781E-17;
        }
        else{
            convertedValue = valueToConvert / 3.168808781E-17;
        }
        return convertedValue;
    }

    //Picosecond To ... Test
    private double picosecondToMinute(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.666666666E-14;
        }
        else{
            convertedValue = valueToConvert / 1.666666666E-14;
        }
        return convertedValue;
    }

    private double picosecondToHour(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 2.777777777E-16;
        }
        else{
            convertedValue = valueToConvert / 2.777777777E-16;
        }
        return convertedValue;
    }

    private double picosecondToDay(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.157407407E-17;
        }
        else{
            convertedValue = valueToConvert / 1.157407407E-17;
        }
        return convertedValue;
    }

    private double picosecondToWeek(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 1.653439153E-18;
        }
        else{
            convertedValue = valueToConvert / 1.653439153E-18;
        }
        return convertedValue;
    }

    private double picosecondToMonth(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.802570537E-19;
        }
        else{
            convertedValue = valueToConvert / 3.802570537E-19;
        }
        return convertedValue;
    }

    private double picosecondToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 3.168808781E-20;
        }
        else{
            convertedValue = valueToConvert / 3.168808781E-20;
        }
        return convertedValue;
    }

    //Minute To ... Test
    private double minuteToHour(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0166666667;
        }
        else{
            convertedValue = valueToConvert / 0.0166666667;
        }
        return convertedValue;
    }

    private double minuteToDay(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0006944444;
        }
        else{
            convertedValue = valueToConvert / 0.0006944444;
        }
        return convertedValue;
    }

    private double minuteToWeek(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000992063;
        }
        else{
            convertedValue = valueToConvert / 0.0000992063;
        }
        return convertedValue;
    }

    private double minuteToMonth(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000228154;
        }
        else{
            convertedValue = valueToConvert / 0.0000228154;
        }
        return convertedValue;
    }

    private double minuteToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0000019013;
        }
        else{
            convertedValue = valueToConvert / 0.0000019013;
        }
        return convertedValue;
    }

    //Hour To ... Test
    private double hourToDay(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0416666667;
        }
        else{
            convertedValue = valueToConvert / 0.0416666667;
        }
        return convertedValue;
    }

    private double hourToWeek(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.005952381;
        }
        else{
            convertedValue = valueToConvert / 0.005952381;
        }
        return convertedValue;
    }

    private double hourToMonth(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0013689254;
        }
        else{
            convertedValue = valueToConvert / 0.0013689254;
        }
        return convertedValue;
    }

    private double hourToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0001140771;
        }
        else{
            convertedValue = valueToConvert / 0.0001140771;
        }
        return convertedValue;
    }

    //Day To ... Test
    private double dayToWeek(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.1428571429;
        }
        else{
            convertedValue = valueToConvert / 0.1428571429;
        }
        return convertedValue;
    }

    private double dayToMonth(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0328542094;
        }
        else{
            convertedValue = valueToConvert / 0.0328542094;
        }
        return convertedValue;
    }

    private double dayToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0027378508;
        }
        else{
            convertedValue = valueToConvert / 0.0027378508;
        }
        return convertedValue;
    }

    //Week To ... Test
    private double weekToMonth(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.2299794661;
        }
        else{
            convertedValue = valueToConvert / 0.2299794661;
        }
        return convertedValue;
    }

    private double weekToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0191649555;
        }
        else{
            convertedValue = valueToConvert / 0.0191649555;
        }
        return convertedValue;
    }

    //Month To ... Test
    private double monthToYear(double valueToConvert, boolean reverse){

        double convertedValue;
        if(!reverse){
            convertedValue = valueToConvert * 0.0833333333;
        }
        else{
            convertedValue = valueToConvert / 0.0833333333;
        }
        return convertedValue;
    }
}
