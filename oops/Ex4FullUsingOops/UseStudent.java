package Ex4FullUsingOops;

import java.util.Scanner;

public class UseStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter roll,name and per");
        int r=kb.nextInt();
        String n=kb.next();
        double p=kb.nextDouble();
        s1.setData(r,n,p);

        System.out.println("Enter roll,name and per");
        r=kb.nextInt();
        n=kb.next();
        p=kb.nextDouble();
        s2.setData(r,n,p);

        s1.getData();
        s2.getData();
    }
}
