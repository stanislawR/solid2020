package pl.zzpj2020.solid.dip.weathertracker.solution;


import java.util.ArrayList;

public class WeatherTracker {
    String currentConditions;
    ArrayList<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;

        notifyDevices();
    }

    private void notifyDevices() {
        devices.forEach( device -> device.generateWeatherAlert(this.currentConditions));
    }
}
