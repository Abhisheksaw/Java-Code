package Ex61Collection.Ex3HashSet.Ex7;

class Student{
    String name;
    public Student(String name){
        this.name=name;
    }
}

public class HashSetDemo {
    public static void main(String[] args) {
        String s1=new String("Amit");
        String s2=new String("Amit");
        System.out.println(s1==s2);
        System.out.println("s1 hashcode "+s1.hashCode());
        System.out.println("s2 hashcode "+s2.hashCode());

        Student st1=new Student("Amit");
        Student st2=new Student("Amit");
        System.out.println(st1==st2);
        System.out.println("s1 hashcode "+st1.hashCode());
        System.out.println("s2 hashcode "+st2.hashCode());
    }
}
