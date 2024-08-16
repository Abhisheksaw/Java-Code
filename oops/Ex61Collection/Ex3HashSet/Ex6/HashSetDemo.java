package Ex61Collection.Ex3HashSet.Ex6;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hs;
        hs=new HashSet<Student>();
        Student s1=new Student("Amit");
        Student s2=new Student("Sumit");
        Student s3=new Student("Amit");
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
