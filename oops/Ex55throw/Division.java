package Ex55throw;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        try{
            System.out.println("Enter 2 value:");
            int a=kb.nextInt();
            int b=kb.nextInt();
            if(a<=0 || b<0){
                ArithmeticException obj=new ArithmeticException("value should be positive");
                throw obj;
            }
            int c=a/b;
            System.out.println("Div is "+c);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
