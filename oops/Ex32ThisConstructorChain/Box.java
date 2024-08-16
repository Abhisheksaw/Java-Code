package Ex32ThisConstructorChain;

public class Box {
    private int l,b,h;

    public Box(){
    this(0);
    }

    public Box(int s){
        this(s,s,s);
    }

    public Box(int i,int j,int k){
        l=i;
        b=j;
        h=k;
    }

    public Box(Box p){
        this(p.l,p.b,p.h);
    }

    public void show(){
        System.out.println("l="+l+", b="+b+", h="+h);
    }
}
