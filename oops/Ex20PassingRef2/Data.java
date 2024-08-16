package Ex20PassingRef2;

public class Data {
    private int x,y;
    public void setData(int i,int j){
        x=i;
        y=j;
    }

    public void increment(Data P){
        P=new Data();
        P.x=P.x+5;
        P.y=P.y+5;
    }

    public void show(){
        System.out.println("x="+x+", y="+y);
    }
}
