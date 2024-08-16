package Ex37Super;

public class Manager extends Emp{
    private double bonus;
    public Manager(String name,double sal,double bonus){
        super(name,sal);
        this.bonus=bonus;
    }

    public double getIncome(){
        double total=getSal()+bonus;
        return total;
    }
}
