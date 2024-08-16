package Ex44Polymorphism;

public class TestPoly {
    public static void main(String[] args) {
        A ref=new A();
        ref.show();
        ref.display();

        ref=new B();
        ref.show();
        ref.display();
    }
}
