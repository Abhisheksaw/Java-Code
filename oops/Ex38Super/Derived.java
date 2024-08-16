package Ex38Super;

public class Derived extends Base {
    public Derived(){
        super();
        System.out.println("Non Parametrized const of derived called...");
    }
    public Derived(int i){
        super(i);
        System.out.println("Single Parametrized const of derived called...");
    }
    public Derived(int i,int j){
        super(i,j);
        System.out.println("Double Parametrized const of derived called...");
    }
}
