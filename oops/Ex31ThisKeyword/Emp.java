package Ex31ThisKeyword;

public class Emp {
    private int age;
    private String name;
    private double sal;

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }


    public void show(){
        System.out.println("Age="+age+", Name="+name+", Sal="+sal);
    }
}
