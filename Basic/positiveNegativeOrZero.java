import java.util.Scanner;

public class positiveNegativeOrZero {
    public static void main(String[] args) {
        int a;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        a=kb.nextInt();
        if(a>0){
            System.out.println("Positive");
        } else if (a<0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
