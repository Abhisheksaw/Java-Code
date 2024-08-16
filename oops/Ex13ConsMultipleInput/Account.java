package Ex13ConsMultipleInput;

public class Account {
    private int accId;
    private String name;
    private double bal;

    public Account(int id,String n,double b){
        accId=id;
        name=n;
        bal=b;
    }

    public void display() {
        System.out.println("Account Id:"+accId+", Name:"+name+", Balance:"+bal);
    }
}
