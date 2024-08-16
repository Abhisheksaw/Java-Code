package Ex22PassingArray;

public class UseDemo {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50};
        Demo obj=new Demo();
        System.out.println("Before Doubling:");
        for (int x:arr){
            System.out.print(x+" ");
        }

        obj.doubler(arr);
        System.out.println();
        System.out.println("After Doubling:");
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
