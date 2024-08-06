package LLD.Design_Patterns.Strategy_Design_Pattern;

public class BitcoinStrategy implements PaymentStrategy {
    private String bitcoinAddress;

    public BitcoinStrategy(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin.");
    }
}
