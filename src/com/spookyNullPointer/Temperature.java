package com.spookyNullPointer;

class Temperature {

    private double conversionResult;

    double getConversionResult(){
        return conversionResult;
    }

    Temperature(int from, int into, double valueToConvert){

        switch(from) {
            //Celsius
            case 1:
                switch(into) {
                    case 2:
                        conversionResult = celsiusToKelvin(valueToConvert, false);
                        break;
                    case 3:
                        conversionResult = celsiusToFahrenheit(valueToConvert, false);
                        break;
                }
                break;
            //Kelvin
            case 2:
                switch(into) {
                    case 1:
                        conversionResult = celsiusToKelvin(valueToConvert, true);
                        break;
                    case 3:
                        conversionResult = kelvinToFahrenheit(valueToConvert, false);
                        break;
                }
                break;
            //Fahrenheit
            case 3:
                switch(into) {
                    case 1:
                        conversionResult = celsiusToFahrenheit(valueToConvert, true);
                        break;
                    case 2:
                        conversionResult = kelvinToFahrenheit(valueToConvert, true);
                        break;
                }
                break;
            default:
                System.out.println("Unknown Error: Temperature Class");
                break;
        }
    }

    private double celsiusToKelvin(double valueToConvert, boolean reverse){

        double convertedValue = -273.15D; // 1x Celsius = 273.15K
        double newConvertedValue;
        if(!reverse){
            newConvertedValue = valueToConvert - convertedValue;
        }
        else{
            newConvertedValue = valueToConvert + convertedValue;
        }
        return newConvertedValue;
    }

    private double celsiusToFahrenheit(double valueToConvert, boolean reverse){

        double convertedValue = 33.8D; // 1x Celsius = 33.8
        if(!reverse){
            convertedValue = valueToConvert * 1.8D + 32;
        }
        else{
            convertedValue = (valueToConvert - 32) * 0.556D;
        }
        return convertedValue;
    }

    private double kelvinToFahrenheit(double valueToConvert, boolean reverse){

        double convertedValue = -459.67D; // 1x Kelvin = -459.67
        if(!reverse){
            convertedValue = valueToConvert * 1.8D + convertedValue;
        }
        else{
            convertedValue = (valueToConvert - convertedValue) * 0.556D;
        }
        return convertedValue;
    }


}
