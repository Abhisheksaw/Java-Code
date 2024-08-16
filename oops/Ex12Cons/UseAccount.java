package Ex12Cons;

import java.util.Scanner;

public class UseAccount {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Account Id: ");
        int i=kb.nextInt();
        System.out.print("Enter Name: ");
        String n=kb.next();
        System.out.print("Enter Balance: ");
        double b= kb.nextDouble();

        Account obj=new Account(i,n,b);
        obj.show();
    }
}
