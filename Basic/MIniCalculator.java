import java.util.Scanner;

public class MIniCalculator {
    public static void main(String[] args) {
        int a,c;
        String b;
        Scanner kb=new Scanner(System.in);
        System.out.println("Calculate the value... :");
        a=kb.nextInt();
        b=kb.next();
        c=kb.nextInt();
        switch (b){
            case "+":
                System.out.println("Sum is :"+(a+c));
                break;
            case "-":
                System.out.println("Sub is :"+(a-c));
                break;
            case "*":
                System.out.println("Mul is :"+(a*c));
                break;
            case "/":
                System.out.println("Div is :"+(a/c));
                break;
            case "%":
                System.out.println("Mod is :"+(a%c));
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}
