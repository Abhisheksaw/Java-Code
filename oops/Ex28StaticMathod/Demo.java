package Ex28StaticMathod;

public class Demo {
    private int a=10;
    private static int b=20;

    public static void main(String[] args) {
        Demo obj=new Demo();
        System.out.println(obj.a);

        System.out.println(b);
    }
}
