package ConversionTemperatura;


public class ConversorTemperatura {
    public static double celsiusAFahrenheit(double celsius) throws ExceptionTemperatura {
        if (celsius < -273.15) {
            throw new ExceptionTemperatura("No se puede convertir a Fahrenheit una temperatura menor a -273.15°C" +
                    "\nLa temperatura esta por debajo del cero absoluto\n");
        }
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) throws ExceptionTemperatura{
        if (fahrenheit < -459.67) {
            throw new ExceptionTemperatura("No se puede convertir a Celsius una temperatura menor a -459.67°F" +    "\nLa temperatura esta por debajo del cero absoluto\n");
        }
        return (fahrenheit - 32) * 5 / 9;
    }

}