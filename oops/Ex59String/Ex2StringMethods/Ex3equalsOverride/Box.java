package Ex59String.Ex2StringMethods.Ex3equalsOverride;

public class Box {
    private int l,b,h;
    public Box(int l, int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void show(){
        System.out.println(l+", "+b+", "+h);
    }
    public boolean equals(Object obj){
        Box temp=(Box)obj;
        if (this.l==temp.l && this.b==temp.b && this.h==temp.h){
            return true;
        }
        else {
            return false;
        }
    }
}

class UseBox{
    public static void main(String[] args) {
        Box b1=new Box(10,20,30);
        Box b2=new Box(10,20,30);
        b1.show();
        b2.show();
        System.out.println(b1.equals(b2));
    }
}
