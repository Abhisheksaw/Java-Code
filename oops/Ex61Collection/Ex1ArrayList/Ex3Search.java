package Ex61Collection.Ex1ArrayList;

import java.util.ArrayList;

public class Ex3Search {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");

        System.out.println(months.contains("March"));
        System.out.println(months.contains("march"));
        System.out.println(months.contains("May"));

        //second way for searching
        System.out.println(months.indexOf("March"));
        System.out.println(months.indexOf("march"));
        System.out.println(months.indexOf("May"));
    }
}
