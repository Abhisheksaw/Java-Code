package Ex14ConsReturnCircle;

import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r=kb.nextInt();
        Circle obj=new Circle(r);

        double result;
        result=obj.calculateArea();
        System.out.println("Area of Circle: "+result);
        result=obj.calculateCircumference();
        System.out.println("Area of Circumference: "+result);
    }
}
