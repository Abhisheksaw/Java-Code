package Ex20PassingRef2;

public class UseData {
    public static void main(String[] args) {
        Data D=new Data();
        D.setData(10,20);
        System.out.println("Before Incrementing:");
        D.show();

        Data Temp=new Data();
        Temp.increment(D);
        System.out.println("After Incrementing");
        D.show();
    }
}
