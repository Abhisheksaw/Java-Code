package Ex47InterfaceShape;

public class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
