package LLD.Design_Patterns.Strategy_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item book = new Item("Book",100);
        Item pen = new Item("Pen" , 22);

        cart.addItem(book);
        cart.addItem(pen);

        cart.pay(new CreditCardStrategy("1234567890123456", "John Doe", "123", "12/25"));
    }
}
