package Ex29StaticMethod;

public class MyMath {
    public static void add(int a, int b){
        int sum=a+b;
        System.out.println("Sum is: "+sum);
    }

    public static void max(int a,int b){
        if(a>b){
            System.out.println("Grater number is "+a);
        }
        else{
            System.out.println("Grater number is "+b);
        }
    }
}
