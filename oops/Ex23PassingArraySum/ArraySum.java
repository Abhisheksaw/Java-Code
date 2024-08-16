package Ex23PassingArraySum;

public class ArraySum {
    public int sum(int[] arr){
        int sum=0;
        double avg;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            avg=sum/5;
        }
        return sum;
    }
}
