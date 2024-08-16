package Ex6CircleReturn;

public class Circle {
    private int radius;

    public void setRadius(int r){
        radius=r;
    }

    public double calculateArea(){
        double area=Math.PI* Math.pow(radius,2);
        return area;
    }

    public double calculateCircumference(){
        double circumference=2*Math.PI*radius;
        return circumference;
    }
}
