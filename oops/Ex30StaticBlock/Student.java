package Ex30StaticBlock;

public class Student {
    public Student(){
        System.out.println("Constructor called...");
    }

    static{
        System.out.println("Static block called");
    }
}
