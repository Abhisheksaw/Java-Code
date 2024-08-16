package Ex36SuperAddMultipalNo;

public class AddNum extends Num{
    private int z;

    public AddNum(int p,int q) {
        super(p,q);
    }
    public void add(){
        z=getX()+getY();
        System.out.println("Number are: "+getX()+","+getY());
        System.out.println("Sum is: "+z);
    }
}
