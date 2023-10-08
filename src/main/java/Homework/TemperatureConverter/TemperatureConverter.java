package Homework.TemperatureConverter;

public class TemperatureConverter {
    public double converterFromCelsiusToFahrenheit(double tempCelsium) {
      //  tempFahr = tempCelsium *1.8 * 32
        double tempInFahr =tempCelsium * 1.8 + 32;
        return tempInFahr;
    }
    public double converterFromCelsiumToKelvin(double tempCelsium) {
        //tempKelvin = tempCelsia + 273.15
        double tempInKelvin = tempCelsium + 273.15;
        return tempInKelvin;
    }
}
