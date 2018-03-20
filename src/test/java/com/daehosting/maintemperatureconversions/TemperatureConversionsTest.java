package com.daehosting.maintemperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    public void testCelsiusToFahrenheit() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals(celsiusToFahrenheitResult, BigDecimal.valueOf(32));
    }

    @Test
    public void testFahrenheitToCelsius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));
        assertEquals(fahrenheitToCelsiusResult, BigDecimal.valueOf(0));
    }

    @Test
    public void testWindChillInCelsius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInCelsiusResult = service.windChillInCelsius(BigDecimal.valueOf(6),
                BigDecimal.valueOf(40));
        assertEquals(windChillInCelsiusResult, BigDecimal.valueOf(-14.91));
    }

    @Test
    public void testWindChillInFahrenheit() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInFahrenheitResult = service.windChillInFahrenheit(BigDecimal.valueOf(45),
                BigDecimal.valueOf(20));
        assertEquals(windChillInFahrenheitResult, BigDecimal.valueOf(19.184));
    }
}