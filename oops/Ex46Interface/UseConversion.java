package Ex46Interface;

import java.util.Scanner;

public class UseConversion {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your wight in Kg: ");
        double wt=kb.nextInt();
        System.out.println("Enter also height in inches: ");
        double ht=kb.nextInt();

        Conversion c=new Conversion();
        System.out.println("Your weight in grams is "+c.kgToGram(wt));
        System.out.println("Your height in mm is "+c.inchesTOMm(ht));
    }
}
