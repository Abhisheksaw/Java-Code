package Ex2;

public class Student {
    private int roll;
    private char grade;
    private double per;

    public void setData(){
        roll=10;
        grade='A';
        per=80.4;
    }

    public void getData() {
        System.out.println("Roll:"+roll+", Grade:"+grade+", per:"+per);
    }
}
