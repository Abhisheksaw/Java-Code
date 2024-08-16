package Ex13ConsMultipleInput;

import java.util.Scanner;

public class UseAccount {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        Account [] obj=new Account[2];

        for(int i=0;i< obj.length;i++){
            System.out.println("Enter Account Id, Name and Balance: ");
            int id=kb.nextInt();
            String name=kb.next();
            double bal= kb.nextDouble();
            obj[i]=new Account(id,name,bal);
        }
        for(Account x:obj){
            x.display();
        }
    }

}
