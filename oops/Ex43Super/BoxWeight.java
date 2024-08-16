package Ex43Super;

public class BoxWeight extends Box{
    private int wt;

    public BoxWeight(){
        super();
        wt=0;
    }

    public BoxWeight(int s,int w){
        super(s);
        wt=w;
    }

    public BoxWeight(int i,int j,int k,int w){
        super(i,j,k);
        wt=w;
    }

    public BoxWeight(BoxWeight Q){
        super(Q);
        wt=Q.wt;
    }

    public void show(){
        super.show();
        System.out.println("Weight="+wt);
    }
}
