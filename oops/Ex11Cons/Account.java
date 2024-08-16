package Ex11Cons;

public class Account {
    private int accId;
    private String name;
    private double bal;

    public Account(int i,String n,double b){
        accId=i;
        name=n;
        bal=b;
    }

    public void show(){

        System.out.println("Account Id:"+accId+", Name:"+name+", Balance:"+bal);
    }
}
