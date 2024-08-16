package Ex43Super;

public class Box {
    private int l,b,h;

    public Box(){
        l=b=h=0;
    }

    public Box(int s){
        l=b=h=s;
    }

    public Box(int i,int j,int k){
        l=i;
        b=j;
        h=k;
    }

    public Box(Box P){
        l=P.l;
        b=P.b;
        h=P.h;
    }

    public void show(){
        System.out.println("Length="+l+", Breadth="+b+", Height="+h);
    }
}
