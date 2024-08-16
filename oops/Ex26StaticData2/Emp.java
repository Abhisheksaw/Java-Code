package Ex26StaticData2;

public class Emp {
    private int age;
    private String name;
    private int id;
    private static int nextId=1;

    public Emp(int a,String n){
        age=a;
        name=n;
        id=nextId++;
    }

    public void show(){
        System.out.println("Age="+age+", Name="+name+", Id="+id);
    }

    public void setNextId(){
        System.out.println("Next Emp will get the Id: "+nextId);
    }
}
