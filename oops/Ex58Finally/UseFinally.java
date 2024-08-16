package Ex58Finally;

import Ex44Polymorphism.A;

import java.util.Scanner;

public class UseFinally {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        try{
            System.out.println("Enter 2 input");
            int a=kb.nextInt();
            int b=kb.nextInt();
            System.out.println("Div is "+(a/b));
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Have a Good Day!");
        }
    }
}
