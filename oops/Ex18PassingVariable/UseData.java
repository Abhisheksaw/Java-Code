package Ex18PassingVariable;

public class UseData {
    public static void main(String[] args) {
        int i=10,j=20;
        System.out.println("Before Incrementing:");
        System.out.println("i="+i+", j="+j);
        Data obj=new Data();
        obj.increment(i,j);
        System.out.println("After Incrementing:");
        System.out.println("i="+i+", j="+j);
    }
}
