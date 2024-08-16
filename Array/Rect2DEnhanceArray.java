import java.util.Scanner;

public class Rect2DEnhanceArray {
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
        for (int []x:arr){
            for (int y:x){
                System.out.print(y+" ");
                sum=sum+y;
            }
            System.out.println();
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Avg is: "+(float)(row*col));
    }
}
