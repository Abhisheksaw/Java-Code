import java.util.Scanner;

public class Jagged2DArrayEX2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [][]arr=new int[3][];
        int col;

        for(int i=0; i<arr.length;i++){
            System.out.print("Enter col size for row "+i+": ");
            col=kb.nextInt();
            arr[i]=new int[col];
            for (int j=0;j<arr[i].length;j++){
                System.out.print("Enter value for arr ["+i+"] ["+j+"] : ");
                arr[i][j]=kb.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
