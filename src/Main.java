public class Main {
    public static void main(String[] args)
    {
        double cardBalance = 5000.00;
        double INTEREST_RATE = 0.17;

        System.out.println("your credit card balance is " + cardBalance);

        cardBalance = cardBalance + (cardBalance*INTEREST_RATE);

        System.out.println("your credit card balance after one month is " + cardBalance);

        cardBalance = cardBalance + (cardBalance*INTEREST_RATE);

        System.out.println("your credit card balance after two months is " + cardBalance);


    }
}