package Ex49DefaultMethodInInterfaceCall;

interface I1 {
    default void show(){
        System.out.println("Good Morning");
    }
}

interface I2 {
    default void show(){
        System.out.println("Good Afternoon");
    }
}