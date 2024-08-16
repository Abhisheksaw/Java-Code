package Ex57CustomException;

import java.util.Scanner;

class InvalidNumeratorException extends Exception{
    public InvalidNumeratorException(String str){
        super(str);
    }
}

public class MyDivision {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 2 input:");
        try {
            int a = kb.nextInt();
            int b = kb.nextInt();
            if(a<=0){
                InvalidNumeratorException obj=new InvalidNumeratorException("Numerator should be positive!");
                throw obj;
            }
            int c=a/b;
            System.out.println("Div is "+c);
        }catch (InvalidNumeratorException ex){
            System.out.println(ex);
        }
        catch (ArithmeticException ex){
            System.out.println(ex);
        }
    }
}