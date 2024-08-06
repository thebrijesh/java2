package LLD.Design_Patterns.Strategy_Design_Pattern;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cardName;
    private String cvv;
    private String expiryDate;

    public CreditCardStrategy(String cardNumber, String cardName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}