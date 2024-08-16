package Ex51TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideAndSum {
    public static void main(String[] args) {
        int a=0,b=0,sum,div;
        Scanner kb = new Scanner(System.in);
        try {
            System.out.println("Enetr 2 int: ");
            a = kb.nextInt();
            b = kb.nextInt();
            div=a/b;
            System.out.println("Div is "+div);
        }catch (ArithmeticException ex1){
            System.out.println("Please inter non-zero denominator");
        }catch (InputMismatchException ex2){
            System.out.println("Please input digit only");
            System.exit(0);
        }
        sum=a+b;
        System.out.println("Sum is "+sum);

    }
}
