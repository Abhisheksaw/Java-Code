import java.util.Scanner;

public class EvenOddEx2 {
    public static void main(String[] args) {
        int x;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a no. :");
        x=kb.nextInt();
        String result=(x%2==0)?"Even" : "Odd";
        System.out.println(result);
    }
}
