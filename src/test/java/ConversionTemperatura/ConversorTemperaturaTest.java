package ConversionTemperatura;

import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    @org.junit.jupiter.api.Test
    void celsiusAFahrenheit() {
        try {
            assertEquals(33.8, ConversorTemperatura.celsiusAFahrenheit(1));
            assertEquals(32, ConversorTemperatura.celsiusAFahrenheit(0));
            assertEquals(212, ConversorTemperatura.celsiusAFahrenheit(100));
            assertEquals(98.6, ConversorTemperatura.celsiusAFahrenheit(37));
            assertEquals(212, ConversorTemperatura.celsiusAFahrenheit(100));
            assertEquals(32, ConversorTemperatura.celsiusAFahrenheit(0));
            assertEquals(33.8, ConversorTemperatura.celsiusAFahrenheit(1));
        } catch (ExceptionTemperatura e) {
            e.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    void fahrenheitACelsius() {
    try {
        assertEquals(1, ConversorTemperatura.fahrenheitACelsius(33.8), 0.0001 );
        assertEquals(0, ConversorTemperatura.fahrenheitACelsius(32));
        assertEquals(100, ConversorTemperatura.fahrenheitACelsius(212));
        assertEquals(37, ConversorTemperatura.fahrenheitACelsius(98.6));
        assertEquals(100, ConversorTemperatura.fahrenheitACelsius(212));
        assertEquals(0, ConversorTemperatura.fahrenheitACelsius(32));
        assertEquals(1, ConversorTemperatura.fahrenheitACelsius(33.8), 0.0001);
    } catch (ExceptionTemperatura e) {
        e.printStackTrace();
    }

}}


