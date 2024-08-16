import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int f=1,a;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a intger");
        a=kb.nextInt();
        while (a>1){
            f=f*a;
            a--;
        }
        System.out.println("Factorial is :"+f);
    }
}
