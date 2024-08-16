package Ex14ConsReturnCircle;

public class Circle {
    private int radius;

    public Circle(int r){
        radius=r;
    }

    public double calculateArea(){
        double area=Math.PI*Math.pow(radius,2);
        return area;
    }
    public double calculateCircumference(){
        double circ=2*Math.PI*radius;
        return circ;
    }
}
