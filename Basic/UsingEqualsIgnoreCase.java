public class UsingEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1=new String("BHOPAL");
        String s2=new String("bhopal");
        String s3=new String("bhojpal");

        System.out.println("s1 is "+s1);
        System.out.println("s2 is "+s2);
        System.out.println("s3 is "+s3);

        boolean ans;
        ans=s1.equalsIgnoreCase(s2);

        System.out.println(ans);

        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
