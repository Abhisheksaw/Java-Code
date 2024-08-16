import java.util.Scanner;

public class UsingIfEvenOdd {
    public static void main(String[] args) {
        int x;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a no. :");
        x=kb.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
