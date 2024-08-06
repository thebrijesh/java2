package LLD.Design_Patterns.Observer_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        WindowDisplay windowDisplay = new WindowDisplay(weatherStation);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}
