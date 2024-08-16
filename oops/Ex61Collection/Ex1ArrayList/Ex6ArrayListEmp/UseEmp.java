package Ex61Collection.Ex1ArrayList.Ex6ArrayListEmp;

import java.util.ArrayList;

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
            System.out.println(e.getAge()+", "+e.getName()+", "+e.getSal());
        }
    }
}
