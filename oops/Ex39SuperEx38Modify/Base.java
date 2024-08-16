package Ex39SuperEx38Modify;

public class Base {
    public Base(){
        this(10);
        System.out.println("Non Parametrized const of base called...");
    }
    public Base(int i){
        this(i,50);
        System.out.println("Single Parametrized const of base called...");
    }
    public Base(int i,int j){
        super();
        System.out.println("Double Parametrized const of base called...");
    }
}
