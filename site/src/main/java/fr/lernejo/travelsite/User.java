package fr.lernejo.travelsite;

public record User (String UserEmail, String UserName, String UserCountry, Meteo weatherExpectation, int minimumTemperatureDistance) {
}
