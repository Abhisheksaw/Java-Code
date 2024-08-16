package Ex48MultipalInterfaceShape;

public class UseCircle {
    public static void main(String[] args) {
        MyInterface obj;
        obj=new Circle(5);
        System.out.println("Shape is "+obj.getName());
        System.out.println("It's Area is "+obj.area());

        obj=new Rectangle(4,6);
        System.out.println("Shape is "+obj.getName());
        System.out.println("It's Area is "+obj.area());
    }
}
