import java.util.Scanner;

public class Jagged2DArrayEx1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [][]arr=new int[3][];
        arr[0]=new int [4];
        arr[1]=new int[6];
        arr[2]=new int[3];

        for(int i=0; i<arr.length;i++){
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
