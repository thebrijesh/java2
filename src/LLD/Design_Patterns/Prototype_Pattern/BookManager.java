package LLD.Design_Patterns.Prototype_Pattern;

public class BookManager {
    BookClone bookClone;

    public BookManager(BookClone bookClone) {
        this.bookClone = bookClone;
    }

    public BookClone createClone(){
        return bookClone.clone();
    }
}
