public class PatternEx2 {
    public static void main(String[] args) {
        for (int i=68;i>=65;i--){
            for (int j=i;j>=65;j--){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
