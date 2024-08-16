package Ex61Collection.Ex3HashSet;

import java.util.HashSet;

public class Ex2 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("January");
        hs.add("February");
        hs.add("March");
        hs.add("April");

        for (String s: hs){
            System.out.println(s);
        }
    }
}
