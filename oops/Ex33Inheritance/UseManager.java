package Ex33Inheritance;

public class UseManager {
    public static void main(String[] args) {
        Manager obj=new Manager();
        obj.setEmp("Rohan",50000.0);
        obj.setBonus(25000.0);

        System.out.println("Manager Name: "+obj.getName());
        System.out.println("Manager's total income: "+obj.getIncome());
    }
}
