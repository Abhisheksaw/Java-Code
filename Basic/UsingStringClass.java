public class UsingStringClass {
    public static void main(String[] args) {
        String s1;
        s1=new String("Bhopal");
        String s2;
        s2=new String("Bhopal");
        System.out.println("s1 is "+s1);
        System.out.println("s2 is "+s2);
        System.out.println(s1==s2);   // false because is match address
    }
}
