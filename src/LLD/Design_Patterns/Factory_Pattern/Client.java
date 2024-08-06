package LLD.Design_Patterns.Factory_Pattern;

public class Client {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle Bike = bikeFactory.createVehicle();
        Bike.drive();
    }
}
