package Ex61Collection.Ex4TreeSet.Ex3;

import java.util.TreeSet;

public class UseBook {
    public static void main(String[] args) {
        TreeSet<Book> myBook=new TreeSet<>();
        Book b1=new Book("Let us C","Kanetka",230.0);
        Book b2=new Book("Mastering C++","Sharma",200.0);
        Book b3=new Book("Projects","Larson",450.0);
        Book b4=new Book("Demystifying python","Schildt",340.0);

        myBook.add(b1);
        myBook.add(b2);
        myBook.add(b3);
        myBook.add(b4);

        for (Book b:myBook){
            System.out.println(b);
        }
    }
}
