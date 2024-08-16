import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        String choice;
        Scanner kb=new Scanner(System.in);
        do{
            System.out.println("Enter two no. :");
            int a=kb.nextInt();
            int b=kb.nextInt();
            System.out.println("Sum is :"+(a+b));
            System.out.println("Do you want to continue (yes/no)?");
            choice=kb.next();
        }while (choice.equalsIgnoreCase("yes"));
    }
}
