package Ex47InterfaceShape;

public class UseCircle {
    public static void main(String[] args) {
        Shape obj;
        obj=new Circle(5);
        System.out.println("Shape is "+obj.getName());
        System.out.println("It's Area is "+obj.area());

        obj=new Rectangle(4,6);
        System.out.println("Shape is "+obj.getName());
        System.out.println("It's Area is "+obj.area());
    }
}
