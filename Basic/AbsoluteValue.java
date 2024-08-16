import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        int x;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a no. :");
        x=kb.nextInt();
        int result=(x>=0)?x:-x;
        System.out.println("Absoulte value is :"+result);
    }
}
