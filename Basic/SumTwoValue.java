import java.util.Scanner;

public class SumTwoValue {
    public static void main(String[] args) {
        int a,b,c;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter first no. :");
        a=kb.nextInt();
        System.out.println("Enter second no. :");
        b=kb.nextInt();
        c=a+b;
        System.out.println("Sum is "+c);
    }
}
