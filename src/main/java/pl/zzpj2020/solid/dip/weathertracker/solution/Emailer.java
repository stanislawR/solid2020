package pl.zzpj2020.solid.dip.weathertracker.solution;


public class Emailer implements Device {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
