import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;

        System.out.println("Enter array size:");
        n=kb.nextInt();
        int []arr=new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter no.");
            arr[i]=kb.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Avg is: "+(double)sum/n);
    }
}
