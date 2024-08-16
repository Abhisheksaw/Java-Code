package Ex61Collection.Ex1ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex7Sort {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println("Before Sorting: ");
        System.out.println(fruits);

        System.out.println("After Sorting: ");
        Collections.sort(fruits);
        System.out.println(fruits);

        ArrayList<Integer> value=new ArrayList<>();
        value.add(45);
        value.add(75);
        value.add(30);
        value.add(55);
        System.out.println("Before Sorting: ");
        System.out.println(value);

        System.out.println("After Sorting: ");
        Collections.sort(value);
        System.out.println(value);
    }
}
