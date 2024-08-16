package Ex19PassingRef1;

public class Data {
    private int a,b;
    public void setData(int i,int j){
        a=i;
        b=j;
    }
    public void increment(Data P){
        P.a=P.a+5;
        P.b=P.b+5;
    }

    public void show(){
        System.out.println("a="+a+", b="+b);
    }
}
