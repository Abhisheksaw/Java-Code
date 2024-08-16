package Ex61Collection.Ex1ArrayList;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<>();
        obj.add("Bhopal");
        obj.add("Indore");
        obj.add("Delhi");

        String s1=obj.get(0);
        String s2=obj.get(1);
        String s3=obj.get(2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("No of element : "+obj.size());
    }
}
