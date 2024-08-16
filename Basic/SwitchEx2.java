import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        int a;
        Scanner kb=new Scanner(System.in);
        System.out.println("Month :");
        a=kb.nextInt();
        switch (a){
            case 11: case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5: case 6:
                System.out.println("Summer");
                break;
            case 7: case 8: case 9: case 10:
                System.out.println("raing");
                break;
            default:
                System.out.println("wrong month no.");
        }
    }
}
