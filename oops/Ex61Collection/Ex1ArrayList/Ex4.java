package Ex61Collection.Ex1ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<String> covidCountries=new ArrayList<>();
        covidCountries.add("America");
        covidCountries.add("India");
        covidCountries.add("Brazil");
        covidCountries.add("Russia");
        covidCountries.add("Columbia");

        Scanner kb=new Scanner(System.in);
        System.out.println("Enter country name:");
        String name=kb.nextLine();

        int pos=covidCountries.indexOf(name);

        if (pos != -1){
            System.out.println("Rank: "+(pos+1));
        }
        else {
            System.out.println("Country not in the list");
        }

    }
}
