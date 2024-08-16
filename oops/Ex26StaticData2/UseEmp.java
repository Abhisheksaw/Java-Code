package Ex26StaticData2;

public class UseEmp {
    public static void main(String[] args) {
        Emp e=new Emp(25,"Amit");
        Emp f=new Emp(30,"Rajesh");
        Emp g=new Emp(20,"Rohan");

        e.show();
        f.show();
        g.show();

        e.setNextId();
        f.setNextId();
        g.setNextId();
    }
}
