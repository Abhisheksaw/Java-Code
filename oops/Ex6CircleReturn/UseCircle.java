package Ex6CircleReturn;

import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
        Circle obj=new Circle();
        Scanner kb=new Scanner(System.in);

        System.out.print("Enter Radius: ");
        int rad=kb.nextInt();
        double a,c;
        obj.setRadius(rad);

        a=obj.calculateArea();
        c=obj.calculateCircumference();

        System.out.println("Area of Circle: "+a);
        System.out.println("Circumference of Circle: "+c);
    }
}
