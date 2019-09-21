package com.spookyNullPointer;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        switch(menu.getConvertDomain()){
            case 1:
                //Length
                Length length = new Length(menu.getConvertFrom(), menu.getConvertTo(), menu.getValueToConvert());
                break;
            case 2:
                //Temperature
                Temperature temp = new Temperature(menu.getConvertFrom(), menu.getConvertTo(), menu.getValueToConvert());
                break;
            case 3:
                //Area
                Area area = new Area(menu.getConvertFrom(), menu.getConvertTo(), menu.getValueToConvert());
                break;
            case 4:
                //Volume
                Volume vol = new Volume(menu.getConvertFrom(), menu.getConvertTo(), menu.getValueToConvert());
                break;
            case 5:
                //Weight
                Weight weight = new Weight(menu.getConvertFrom(), menu.getConvertTo(), menu.getValueToConvert());
                break;
            case 6:
                //Time
                Time time = new Time(menu.getConvertFrom(), menu.getConvertTo(), menu.getValueToConvert());
                break;
        }
    }
}
