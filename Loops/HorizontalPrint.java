import java.util.Scanner;

public class HorizontalPrint {
    public static void main(String[] args) {
        String x;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Your Name :");
        x=kb.nextLine();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            System.out.println(ch);
        }
    }
}
