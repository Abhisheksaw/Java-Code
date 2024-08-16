import java.util.Scanner;

public class MonthFalls {
    public static void main(String[] args) {
        int x;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter month no. :");
        x=kb.nextInt();
        switch (x){
            case 11: case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5: case 6:
                System.out.println("Summer");
                break;
            case 7: case 8: case 9: case 10:
                System.out.println("Raining");
            default:
                System.out.println("Wrong month no.");
        }
    }
}
