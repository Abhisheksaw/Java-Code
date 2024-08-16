package Ex21PassingSwap;

public class Num {
    private int i,j;
    public void setNum(int a,int b){
        i=a;
        j=b;
    }

    public void Swap(Num P, Num Q){
        int x;
        x=P.i;
        P.i=Q.i;
        Q.i=x;

        x=P.j;
        P.j=Q.j;
        Q.j=x;
    }
    public void show(){
        System.out.println("i="+i+",j="+j);
    }
}
