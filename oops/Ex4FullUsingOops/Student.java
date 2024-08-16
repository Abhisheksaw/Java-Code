package Ex4FullUsingOops;

public class Student {
    private int roll;
    private String name;
    private double per;

    public void setData(int r,String n,double p){
        roll=r;
        name=n;
        per=p;
    }

    public void getData(){
        System.out.println("Roll:"+roll+", Name:"+name+", Per:"+per);
    }
}
