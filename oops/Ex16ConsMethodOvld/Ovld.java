package Ex16ConsMethodOvld;

public class Ovld {
    public void show(int a){
        System.out.println("In show with int arg: "+a);
    }

    public void show(String a){
        System.out.println("In show with String arg: "+a);
    }

    public void show(double a){
        System.out.println("In show with double arg: "+a);
    }
}
