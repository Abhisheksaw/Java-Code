package Ex50ArithmeticException;

import java.util.Scanner;

public class DivideAndSum {
    public static void main(String[] args) {
        int a,b,div,sum;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 2 integer:");
        a=kb.nextInt();
        b= kb.nextInt();

        try{
            div=a/b;
            System.out.println("Divide is "+div);
        }catch (ArithmeticException ex){
            System.out.println("Please input non-zero denominator");
        }

        sum=a+b;
        System.out.println("Sum is "+sum);
    }
}
