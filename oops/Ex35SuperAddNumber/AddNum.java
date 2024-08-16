package Ex35SuperAddNumber;

public class AddNum extends Num{
    private int z;
    public AddNum(){
        super(10,20);
    }
    public void add(){
        z=getX()+getY();
        System.out.println("Number are: "+getX()+","+getY());
        System.out.println("Sum is: "+z);
    }
}
