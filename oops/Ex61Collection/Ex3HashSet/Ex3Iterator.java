package Ex61Collection.Ex3HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3Iterator {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("January");
        hs.add("February");
        hs.add("March");
        hs.add("April");

        Iterator<String> it=hs.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
    }
}
