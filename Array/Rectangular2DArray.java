import java.util.Scanner;

public class Rectangular2DArray {
    public static void main(String[] args) {
        int row,col;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter array size: ");
        row=kb.nextInt();
        col=kb.nextInt();
        int [][]arr=new int[row][col];

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print("Enter no.: ");
                arr[i][j]=kb.nextInt();
            }
        }
        int sum=0;
        for (int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
                sum=sum+arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Avg is: "+(float)(row*col));
    }
}
