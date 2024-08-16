package Ex39SuperEx38Modify;

public class Derived extends Base{
    public Derived(){
        this(10);
        System.out.println("Non Parametrized const of derived called...");
    }
    public Derived(int i){
        this(i,50);
        System.out.println("Single Parametrized const of derived called...");
    }
    public Derived(int i,int j){
        super();
        System.out.println("Double Parametrized const of derived called...");
    }
}
