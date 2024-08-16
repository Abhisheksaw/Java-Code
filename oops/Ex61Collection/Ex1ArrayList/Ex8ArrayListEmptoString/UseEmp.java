package Ex61Collection.Ex1ArrayList.Ex8ArrayListEmptoString;

import java.util.ArrayList;
import java.util.Scanner;

public class UseEmp {
    public static void main(String[] args) {
        ArrayList<Emp> empList=new ArrayList<>();

        Emp e1=new Emp(21,"Shubham",20000.0);
        Emp e2=new Emp(19,"Sohan",40000.0);
        Emp e3=new Emp(18,"Rohan",50000.0);
        Emp e4=new Emp(25,"Rohit",30000.0);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        for (Emp e: empList){
            System.out.println(e);
        }

        Scanner kb=new Scanner(System.in);
        System.out.println("Enter age,name,sal");
        int age=kb.nextInt();
        String name=kb.next();
        double sal=kb.nextDouble();

        Emp f=new Emp(age,name,sal);
        System.out.println("Emp removed: "+empList.remove(f));

        System.out.println("Modified List:");
        for (Emp e: empList){
            System.out.println(e);
        }
    }
}
