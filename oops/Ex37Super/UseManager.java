package Ex37Super;

public class UseManager {
    public static void main(String[] args) {
        Manager obj=new Manager("Amit",50000.0,25000);
        System.out.println("Manager Name: "+obj.getName());
        System.out.println("Manager total income: "+obj.getIncome());
    }
}
