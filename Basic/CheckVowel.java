import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        String x;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a lower letter :");
        x=kb.next();
        switch (x){
            case "a": case "e": case "i": case "o": case "u":
                System.out.println(x+" is Vowel");
                break;
            default:
                System.out.println(x+" is not Vowel");
        }
    }
}
