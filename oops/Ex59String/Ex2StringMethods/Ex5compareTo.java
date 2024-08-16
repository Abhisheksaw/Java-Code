package Ex59String.Ex2StringMethods;

public class Ex5compareTo {
    public static void main(String[] args) {

        String str1=new String("Bhopal");
        String str2=new String("Bhopal");
        String str3=new String("BHOPAL");
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));

    }
}

// public int compareTo(String);
