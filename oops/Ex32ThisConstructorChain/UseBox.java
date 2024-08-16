package Ex32ThisConstructorChain;

public class UseBox {
    public static void main(String[] args) {
        Box obj1=new Box();
        Box obj2=new Box(10);
        Box obj3=new Box(2,5,7);
        Box obj4=new Box(obj3);

        obj1.show();
        obj2.show();
        obj3.show();
        obj4.show();
    }
}
