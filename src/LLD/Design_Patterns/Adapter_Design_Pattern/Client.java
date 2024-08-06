package LLD.Design_Patterns.Adapter_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        Iphone15 iphone15 = new Iphone15();
        Charger charger = new Adapter(iphone15);
        charger.charge();

    }
}
