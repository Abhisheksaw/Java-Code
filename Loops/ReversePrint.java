import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) {
        String x;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        x=kb.nextLine();
        for(int i=x.length()-1;i>=0;i--){
            char ch=x.charAt(i);
            System.out.print(ch);
        }
    }
}
