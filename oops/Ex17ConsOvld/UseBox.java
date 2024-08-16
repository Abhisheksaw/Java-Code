package Ex17ConsOvld;

public class UseBox {
    public static void main(String[] args) {
        Box obj1=new Box();
        Box obj2=new Box(10);
        Box obj3=new Box(5,7,9);
        Box obj4=new Box(obj3);    // (it create 2 ref. or 2 obj)
       // Box obj4=(obj3);         // (Same But it create 2 ref. and 1 obj)

        obj1.show();
        obj2.show();
        obj3.show();
        obj4.show();
    }
}
