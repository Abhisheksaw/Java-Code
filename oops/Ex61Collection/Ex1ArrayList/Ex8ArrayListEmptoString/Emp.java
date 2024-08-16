package Ex61Collection.Ex1ArrayList.Ex8ArrayListEmptoString;

import java.util.Objects;

public class Emp{

    private int age;
    private String name;
    private double sal;


    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp emp)) return false;
        return age == emp.age && Double.compare(emp.sal, sal) == 0 && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
