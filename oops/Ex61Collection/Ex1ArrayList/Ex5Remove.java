package Ex61Collection.Ex1ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5Remove {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        Scanner kb=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter fruit name: ");
            String f=kb.nextLine();
            fruits.add(f);
        }
        System.out.println("Fruits are: "+fruits);
        System.out.println("Enter fruit name: ");
        String name=kb.nextLine();
        boolean result=fruits.remove(name);
        if(result==true) {
            System.out.println(name + " removed");
        }
        else{
            System.out.println(name+" not found");
        }
        System.out.println(fruits);
    }
}
