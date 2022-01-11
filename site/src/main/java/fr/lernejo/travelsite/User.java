package fr.lernejo.travelsite;

public record User (String userEmail, String userName, String userCountry, Meteo weatherExpectation, int minimumTemperatureDistance) {
}
