package Ex10Cons;

public class Account {
    private int accId;
    private String name;
    private double bal;

    public Account(){
        System.out.println("Object Create!");
        accId=10;
        name= "Abhishek";
        bal=50000.00;
    }
    public void show(){
        System.out.println("Account Id:"+accId+", Name:"+name+", Balance: "+bal);
    }
}
