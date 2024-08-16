public class UsingEquals {
    public static void main(String[] args) {
        String s1=new String("Bhopal");
        String s2=new String("Bhopal");
        String s3=new String("bhopal");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}
