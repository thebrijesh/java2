package LLD.Design_Patterns.Observer_Design_Pattern;

public class WindowDisplay implements Observer {
    private final WeatherStation weatherStation;

    public WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Window display: Temperature is now " + weatherStation.getTemperature() + " degrees.");
    }
}