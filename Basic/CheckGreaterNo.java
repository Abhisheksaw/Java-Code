import java.util.Scanner;

public class CheckGreaterNo {
    public static void main(String[] args) {
        int x,y;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter first no. :");
        x=kb.nextInt();
        System.out.println("Enter second no. :");
        y=kb.nextInt();
        if(x>y){
            System.out.println(x+" is greater");
        } else if (x<y){
            System.out.println(y+" is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
