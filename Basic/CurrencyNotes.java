public class CurrencyNotes {
    public static void main(String[] args) {
        int amount=6675;
        System.out.println("Amount: "+amount);

        int note2000,note1000,note500,note200,note100,note50,note20,note10,note5;

        note2000=amount / 2000;
        amount%=2000;

        note1000=amount / 1000;
        amount %= 1000;

        note500=amount / 500;
        amount %= 500;

        note200=amount / 200;
        amount %= 200;

        note100=amount / 100;
        amount %= 100;

        note50=amount / 50;
        amount %= 50;

        note20=amount / 20;
        amount %= 20;

        note10=amount / 10;
        amount %= 10;

        note5=amount / 5;
        amount %= 5;

        System.out.println("Number of 2000 notes: "+note2000);
        System.out.println("Number of 1000 notes: "+note1000);
        System.out.println("Number of 500 notes: "+note500);
        System.out.println("Number of 200 notes: "+note200);
        System.out.println("Number of 100 notes: "+note100);
        System.out.println("Number of 50 notes: "+note50);
        System.out.println("Number of 20 notes: "+note20);
        System.out.println("Number of 10 notes: "+note10);
        System.out.println("Number of 5 notes: "+note5);
    }
}
