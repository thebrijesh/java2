package LLD.Design_Patterns.Adapter_Design_Pattern;

public class Adapter implements Charger {
    private  Iphone15 iphone15;

    public Adapter(Iphone15 iphone15) {
        this.iphone15 = iphone15;
    }

    @Override
    public void charge() {
        iphone15.chargingIphone15();
    }
}
