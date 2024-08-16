package Ex27StaticUseFinalize;

public class UseEmp {
    public static void main(String[] args) {
        Emp e=new Emp(25,"Amit");
        Emp f=new Emp(30,"Rajesh");
        Emp g=new Emp(20,"Rohan");

        e.show();
        f.show();
        g.show();

        e.setNextId();
        {
            Emp x=new Emp(18,"Deepak");
            Emp y=new Emp(19,"Jyoti");
            x.show();
            y.show();
            e.setNextId();

            x=y=null;
            System.gc();
            System.runFinalization();
        }
        e.setNextId();
    }
}
