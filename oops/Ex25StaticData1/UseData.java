package Ex25StaticData1;

public class UseData {
    public static void main(String[] args) {
        Data obj1=new Data();
        Data obj2=new Data();
        Data obj3=new Data();

        obj1.a=10;
        obj2.a=20;
        obj3.a=30;
        System.out.println(obj1.a+","+obj2.a+","+ obj3.a);

        obj1.b=10;
        obj2.b=20;
        obj3.b=30;
        System.out.println(obj1.b+","+obj2.b+","+obj3.b);
    }
}
