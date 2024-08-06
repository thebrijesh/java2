package LLD.Design_Patterns.Observer_Design_Pattern;

public class PhoneDisplay implements Observer {
    private final WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Phone display: Temperature is now " + weatherStation.getTemperature() + " degrees.");
    }
}
