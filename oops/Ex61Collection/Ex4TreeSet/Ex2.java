package Ex61Collection.Ex4TreeSet;

import java.util.TreeSet;

public class Ex2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(7);
        ts.add(4);
        ts.add(8);
        System.out.println("TreeSet after adding 3 ele. :"+ts);
        ts.add(2);
        ts.add(18);
        ts.add(0);
        ts.add(11);
        System.out.println(ts);
    }
}
