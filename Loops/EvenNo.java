import java.util.Scanner;

public class EvenNo {
    public static void main(String[] args) {
        int i=2,n;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a no. ");
        n=kb.nextInt();
        while (i<=n){
            System.out.println(i);
            i=i+2;
        }
    }
}
