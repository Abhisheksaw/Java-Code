package Ex61Collection.Ex3HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex5 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Amit");
        hs.add("Sumit");
        hs.add("Amit");
        System.out.println(hs);
    }
}