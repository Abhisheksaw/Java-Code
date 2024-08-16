package Ex47InterfaceShape;

public class Rectangle implements Shape{
    private int l,b;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }

    public double area() {
        return l*b;
    }

    public String getName() {
        return "Rectangle";
    }
}
