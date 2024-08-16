package Ex49DefaultMethodInInterfaceCall;

public class Demo implements I1,I2{
    public void show(){
        I1.super.show();
        I2.super.show();
        System.out.println("Good Evening");
    }
}
