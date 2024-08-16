package Ex40SuperWithInheritance;

public class Derived extends Base{
    public void show(double b){
        System.out.println("In show of Derived class with double arg: "+b);
    }

    public void show(int a){
        System.out.println("In show of Derived class with int arg: "+a);
    }
}
