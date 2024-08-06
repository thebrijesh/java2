package LLD.Design_Patterns.Factory_Pattern;

public class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
