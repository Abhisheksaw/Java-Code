package Ex23PassingArraySum;

import java.util.Scanner;

public class UseArraySum {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter "+arr.length+" number");
        for (int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();
        }
        ArraySum obj=new ArraySum();
        int result= obj.sum(arr);
        System.out.println("Sum is: "+result);
    }
}
