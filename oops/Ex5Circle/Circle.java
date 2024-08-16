package Ex5Circle;

import javax.swing.plaf.metal.MetalTheme;

public class Circle {
    private int radius;

    public void setRadius(int r){
        radius=r;
    }

    public void calculateArea(){
        double area=Math.PI* Math.pow(radius,2);
        System.out.println("Area of Circle: "+area);
    }

    public void calculateCircumference(){
        double circumference=2*Math.PI*radius;
        System.out.println("Circumference of Circle: "+circumference);
    }
}
