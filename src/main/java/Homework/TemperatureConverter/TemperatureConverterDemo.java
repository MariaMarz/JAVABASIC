package Homework.TemperatureConverter;

import Homework.TemperatureConverter.TemperatureConverter;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        double tempCelsium = 15;
        TemperatureConverter temperatureConverter = new TemperatureConverter();
       double tempInFahr = temperatureConverter.converterFromCelsiusToFahrenheit(tempCelsium);
        System.out.println("Temp in Fahrenheit is  "+ tempInFahr);
        System.out.println();

        double tempInKelvin = temperatureConverter.converterFromCelsiumToKelvin(tempCelsium);
        System.out.println("Temp in Kelvin is " + tempInKelvin);
    }

}
