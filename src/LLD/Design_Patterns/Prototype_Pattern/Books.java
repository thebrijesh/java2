package LLD.Design_Patterns.Prototype_Pattern;

public class Books implements BookClone{

    private  int bookId;
    private  String bookName;
    private  int bookPrice;

    public Books(int bookId, String bookName, int bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }

    public Books(Books books){
        this.bookId = books.bookId;
        this.bookName = books.bookName;
        this.bookPrice = books.bookPrice;
    }
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public BookClone clone() {
        return new Books(this);
    }
}
