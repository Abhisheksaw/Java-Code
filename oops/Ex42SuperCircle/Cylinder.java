package Ex42SuperCircle;

public class Cylinder extends Circle{
    private int height;

    public Cylinder(int radius,int height){
        super(radius);
        this.height=height;
    }

    public double getArea(){
        return 2*super.getArea()+2*Math.PI*super.getRadius()*height;
    }

    public double volume(){
        return super.getArea()*height;
    }
}
