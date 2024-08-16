package Ex5Circle;

import Ex3.Student;

import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
        Circle obj=new Circle();
        Scanner kb=new Scanner(System.in);

        System.out.print("Enter Radius: ");
        int rad=kb.nextInt();
        obj.setRadius(rad);

        obj.calculateArea();
        obj.calculateCircumference();
    }
}
