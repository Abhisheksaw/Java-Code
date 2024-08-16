package Ex61Collection.Ex4TreeSet.Ex4Iterator;

public class Book implements Comparable<Book>{
    private String bookName;
    private String authorName;
    private Double price;


    public Book(String bookName, String authorName, Double price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return o.price.compareTo(this.price);
    }
}
