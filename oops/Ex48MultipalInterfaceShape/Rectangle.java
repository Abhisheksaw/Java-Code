package Ex48MultipalInterfaceShape;

public class Rectangle implements MyInterface {
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
