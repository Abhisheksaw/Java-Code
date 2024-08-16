package Ex21PassingSwap;

public class UseNum {
    public static void main(String[] args) {
        Num N1=new Num();
        Num N2=new Num();
        N1.setNum(10,20);
        N2.setNum(2,4);
        System.out.println("Before Change:");
        N1.show();
        N2.show();

        Num Temp=new Num();
        Temp.Swap(N1,N2);
        System.out.println("After Swap");
        N1.show();
        N2.show();
    }
}