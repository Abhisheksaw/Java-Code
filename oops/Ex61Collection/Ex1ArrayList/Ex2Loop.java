package Ex61Collection.Ex1ArrayList;

import java.util.ArrayList;

public class Ex2Loop {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");

        for (int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i));
        }
    }
}
