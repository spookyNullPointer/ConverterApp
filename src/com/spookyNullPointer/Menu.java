package com.spookyNullPointer;

import java.io.IOException;
import java.util.Scanner;

//TODO:
// Incorrect Error max attempt Loop
// Incorrect Error Exception for InputMismatch
// Check if clear screen works with 0


class Menu {

    Menu(){
        runMenu();
    }

    private void runMenu(){
        headerGraphic();
        createMenuArray();
        firstMenu();
        secondMenu(firstMenuChoice);
        thirdMenu(firstMenuChoice, secondMenuChoice);
        convertFromTo();
        getInputValueToConvert();
    }

    Scanner input;
    int firstMenuChoice = -1; //Default unchanged error
    int secondMenuChoice = -1; //Default unchanged error
    int thirdMenuChoice = -1; //Default unchanged error
    String convertDomain = "Nothing";
    String convertFrom = "Nothing";
    String convertTo = "Nothing";

    double valueToConvert;

    String[] lengthMenu;
    String[] temperatureMenu;
    String[] areaMenu;
    String[] volumeMenu;
    String[] weightMenu;
    String[] timeMenu;

    private void createMenuArray(){
        lengthMenu = new String[] {
                "1. Meter", "2. Kilometer", "3. Centimeter", "4. Millimeter", "5. Micrometer",
                "6. Nanometer", "7. Mile", "8. Yard", "9. Foot", "10. Inch", "11. Light Year"};
        temperatureMenu = new String[] {"1. Celsius", "2. Kelvin", "3. Fahrenheit"};
        areaMenu = new String[]{"1. Square Meter", "2. Square Kilometer", "3. Square Centimeter","4. Square Millimeter",
                "5. Square Micrometer", "6. Hectare", "7. Square Mile", "8. Square Yard", "9. Square Foot",
                "10. Square Inch", "11. Acre"};
        volumeMenu = new String[]{"1. Cubic Meter", "2. Cubic Kilometer", "3. Cubic Centimeter", "4. Cubic Millimeter",
                "5. Liter", "6. Milliliter", "7. US Gallon", "8. US Quart", "9. US Pint", "10. US Cup",
                "11. US Fluid Ounce", "12. US Table Spoon", "13. US Tea Spoon", "14. Imperial Gallon", "15. Imperial Quart",
                "16. Imperial Pint", "17. Imperial Fluid Ounce", "18. Imperial Table Spoon", "19. Imperial Tea Spoon",
                "20. Cubic Mile", "21. Cubic Yard","22. Cubic Foot", "23. Cubic Inch"};
        weightMenu = new String[]{"1. Kilogram", "2. Gram", "3. Milligram", "4. Metric Ton", "5. Long Ton",
                "6. Short Ton", "7. Pound", "8. Ounce", "9. Carrat", "10. Atomic Mass Unit"};
        timeMenu = new String[]{"1. Second", "2. Millisecond", "3. Microsecond", "4. Nanosecond", "5. Picosecond",
                "6. Minute", "7. Hour", "8. Day", "9. Week", "10. Month", "11. Year"};
    }

    private String choiceToString(int menuOne, int menuTwo){
        String[][] menuChoices = new String[][]{lengthMenu, temperatureMenu,
                areaMenu, volumeMenu, weightMenu, timeMenu};

        String text = menuChoices[menuOne-1][menuTwo-1];
        int textLength = text.length();

        return text.substring(3, textLength);
    }

    private void convertFromTo(){
        convertFrom = choiceToString(firstMenuChoice, secondMenuChoice);
        convertTo = choiceToString(firstMenuChoice, thirdMenuChoice);
    }

    private void printStringArray(String[] stringArray, int ignoreIndex){
        if(ignoreIndex == -1) {
            System.out.println();
            System.out.println("What would you like to convert: ");
            for (int x = 0; x < stringArray.length; x++) {
                System.out.println(stringArray[x]);
            }
        }
        else{
            System.out.println("Convert into: ");
            for (int x = 0; x < stringArray.length; x++) {
                if(x != ignoreIndex) {
                    System.out.println(stringArray[x]);
                }
            }
        }
    }

    private void getSetMenuChoice(int menuChoice, int maxValue){

        System.out.print("Input Choice: ");
        input = new Scanner(System.in);
        int userInput = input.nextInt();
        if((userInput > maxValue) || (userInput < 1)) {
            System.out.println("Input Error :: Enter Value Between 1 & " + maxValue);
            getSetMenuChoice(1, maxValue);
        }
        else {
            switch (menuChoice) {
                case 1:
                    firstMenuChoice = userInput;
                    break;
                case 2:
                    secondMenuChoice = userInput;
                    break;
                case 3:
                    thirdMenuChoice = userInput;
                    break;
            }
        }
    }

    private void headerGraphic(){
        System.out.println(" _____                           _            __   _____  ");
        System.out.println("/  __ \\                         | |          /  | |  _  | ");
        System.out.println("| /  \\/ ___  _ ____   _____ _ __| |_ ___ _ __`| | | |/' | ");
        System.out.println("| |    / _ \\| '_ \\ \\ / / _ \\ '__| __/ _ \\ '__|| | |  /| | ");
        System.out.println("| \\__/\\ (_) | | | \\ V /  __/ |  | ||  __/ |  _| |_\\ |_/ / ");
        System.out.println(" \\____/\\___/|_| |_|\\_/ \\___|_|   \\__\\___|_|  \\___(_)___/  ");
        System.out.println("By spookyNullPointer");
        System.out.println();
    }

    private void firstMenu(){
        System.out.println("Select your conversion category: ");
        System.out.println("1. Length ::: (e.g. Meter, Kilometer, Mile, Yard, Foot, Inch...)");
        System.out.println("2. Temperature ::: (e.g. Celsius, Kelvin, Fahrenheit)");
        System.out.println("3. Area ::: (e.g. Square Meter, Hectare, Acre, Square Yard...) ");
        System.out.println("4. Volume ::: (e.g. Cubic Meter, Liter, US Gallon, Cubic Mile...)");
        System.out.println("5. Weight ::: (e.g. Gram, Metric Ton, Pound, Ounce, Carrot...)");
        System.out.println("6. Time ::: (e.g. Second, Minute, Hour, Day, Week...)");
        getSetMenuChoice(1, 6);
    }

    private void secondMenu(int firstMenuChoice){
        switch(firstMenuChoice) {
            case 1:
                //Length
                convertDomain = "Length";
                printStringArray(lengthMenu, -1);
                getSetMenuChoice(2, 11);
                break;
            case 2:
                //Temperature
                convertDomain = "Temperature";
                printStringArray(temperatureMenu, -1);
                getSetMenuChoice(2, 3);
                break;
            case 3:
                //Area
                convertDomain = "Area";
                printStringArray(areaMenu, -1);
                getSetMenuChoice(2, 11);
                break;
            case 4:
                //Volume
                convertDomain = "Volume";
                printStringArray(volumeMenu, -1);
                getSetMenuChoice(2, 23);
                break;
            case 5:
                //Weight
                convertDomain = "Weight";
                printStringArray(weightMenu, -1);
                getSetMenuChoice(2, 10);
                break;
            case 6:
                //Time
                convertDomain = "Time";
                printStringArray(timeMenu, -1);
                getSetMenuChoice(2, 11);
                break;
        }
    }

    private void thirdMenu(int firstMenuChoice, int secondMenuChoice){

        switch(firstMenuChoice) {
            case 1:
                //Length
                printStringArray(lengthMenu, secondMenuChoice-1);
                getSetMenuChoice(3, 11);
                break;
            case 2:
                printStringArray(temperatureMenu, secondMenuChoice-1);
                getSetMenuChoice(3, 3);
                break;
            case 3:
                printStringArray(areaMenu,secondMenuChoice-1);
                getSetMenuChoice(3, 11);
                break;
            case 4:
                printStringArray(volumeMenu, secondMenuChoice-1);
                getSetMenuChoice(3, 23);
                break;
            case 5:
                printStringArray(weightMenu,secondMenuChoice-1);
                getSetMenuChoice(3, 10);
                break;
            case 6:
                printStringArray(timeMenu, secondMenuChoice-1);
                getSetMenuChoice(3, 11);
                break;
        }
    }

    private void getInputValueToConvert(){
        System.out.println();
        System.out.println("What to convert " + convertFrom.toUpperCase() + " into " + convertTo.toUpperCase() + "?");
        System.out.println("If Correct - Enter Value To Convert...");
        System.out.println("Else - Enter 0 To Start Again");
        System.out.print("Enter Value: ");
        double userInput = input.nextInt();
        if(userInput != 0){
            valueToConvert = userInput;
        }
        else {
            new CLS();
            runMenu();
        }
    }

    public int getConvertDomain(){
        return firstMenuChoice;
    }

    public int getConvertFrom(){
        return secondMenuChoice;
    }

    public int getConvertTo(){
        return thirdMenuChoice;
    }

    public double getValueToConvert(){
        return valueToConvert;
    }
}

class CLS {
    public static void main(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}

