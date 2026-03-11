public class Book {

    private final String name;
    private final Author author;

    private double price;
    private int qty = 0;


    public Book(String name, Author author, double price) {

        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {

        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // getters.
    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    // setters.
    public void setPrice( double price) {
        this.price = price;
    }

    public void setQty( int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book information: "+ "\n" +
                "Name Book: " + this.name + "\n" +
                "Author: " + this.author + "\n" +
                "Price: " + this.price + "\n" +
                "Qty: " + this.qty;
    }
}
