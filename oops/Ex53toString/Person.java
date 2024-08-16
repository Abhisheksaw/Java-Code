package Ex53toString;


import java.util.Date;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "age="+age+", name="+name;
    }
}

class UsePerson{
    public static void main(String[] args) {
        Person p1=new Person(25,"Amit");
        System.out.println(p1);

        String city=new String("Bhopal");
        System.out.println(city);

        Date d=new Date();
        System.out.println(d);
    }
}
