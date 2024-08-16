package Ex16ConsMethodOvld;

public class UseOvld {
    public static void main(String[] args) {
        Ovld obj=new Ovld();
        obj.show(10);
        obj.show('A');
        obj.show("A");
        obj.show("Hello");
        obj.show(3.4);
        obj.show(100L);
    }
}
