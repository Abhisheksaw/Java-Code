package Ex59String.Ex1StringConstructors;

public class Ex3Different {

    public static void main(String[] args) {

        String b1=new String("Bhopal");
        String b2=new String("Bhopal");
        System.out.println(b1==b2);


        // This is best because it use less memory compare than above code
        String p1="Bhopal";
        String p2="Bhopal";
        System.out.println(p1==p2);
    }
}
