import java.util.Scanner;

public class SumTwoNo {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter no. :");
        int a=kb.nextInt();
        int []arr=new int[]{a};
        if (arr.length<2){
            System.out.println("Please enter at least two no.");
        }
        else {
            int sum=0;
            for (int i=0;i< arr.length;i++){
                sum=sum+arr[i];
                System.out.println("Sum is: "+sum);
            }
        }

    }
}
