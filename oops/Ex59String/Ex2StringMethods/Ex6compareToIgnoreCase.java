package Ex59String.Ex2StringMethods;

public class Ex6compareToIgnoreCase {
    public static void main(String[] args) {

        String str1=new String("Bhopal");
        String str2=new String("Bhopal");
        String str3=new String("BHOPAL");
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));

    }
}

// public int compareToIgnoreCase(String);
