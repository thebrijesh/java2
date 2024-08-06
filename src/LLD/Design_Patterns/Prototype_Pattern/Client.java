package LLD.Design_Patterns.Prototype_Pattern;

public class Client {
    public static void main(String[] args) {
        Books books = new Books(1,"Hello world",120);

        BookManager bookManager = new BookManager(books);

        Books phonebook = (Books) bookManager.createClone();

        phonebook.setBookName("Happy world");



        System.out.println("Original : " + books);
        System.out.println("Clone : " + phonebook);


    }
}
