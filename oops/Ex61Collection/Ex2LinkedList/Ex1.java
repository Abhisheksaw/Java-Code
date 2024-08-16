package Ex61Collection.Ex2LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<String> months = new LinkedList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");

        System.out.println("Before Sorting:");
        for (String s : months) {
            System.out.println(s);
        }

        Collections.sort(months);
        System.out.println("After Sorting:");
        for (String s : months) {
            System.out.println(s);
        }
    }
}
