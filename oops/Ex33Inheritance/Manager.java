package Ex33Inheritance;

public class Manager extends Emp{
    private double bonus;
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getIncome(){
        double total;
        total=getSal()+bonus;
        return total;
    }
}
