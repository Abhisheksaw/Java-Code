import java.util.Scanner;

public class EmpInsurance {
    public static void main(String[] args) {
        int age;
        String gender,status;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your age:");
        age=kb.nextInt();
        System.out.println("Enter your gender");
        gender=kb.next();
        System.out.println("Enter your status");
        status=kb.next();
        if(status.equalsIgnoreCase("married")){
            System.out.println("Insurance give");
        } else if (gender.equalsIgnoreCase("male") && age>30) {
            System.out.println("Insurance give");
        } else if (gender.equalsIgnoreCase("female") && age>25) {
            System.out.println("Insurance give");
        }
        else {
            System.out.println("Insurance not give");
        }
    }
}
