package Ex43Super;

public class UseBoxWeight {
    public static void main(String[] args) {
        BoxWeight b1=new BoxWeight();
        BoxWeight b2=new BoxWeight(10,20);
        BoxWeight b3=new BoxWeight(5,7,9,3);
        BoxWeight b4=new BoxWeight(b3);

        b1.show();
        b2.show();
        b3.show();
        b4.show();
    }
}
