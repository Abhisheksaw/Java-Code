package Ex56throws;

import java.io.IOException;
import java.util.Scanner;

public class UserInput {
    public static void acceptInt(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter an int: ");
        int a=kb.nextInt();
        System.out.println("You inputted: "+a);
    }

    public static void acceptChar() throws IOException {
        System.out.println("Enter char");
        char ch=(char)System.in.read();
        System.out.println("You inputted: "+ch);
    }
}
