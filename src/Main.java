public class Main {
    public static void main(String[] args) {
        double balance = 5000.00;
        final double APR = 0.17;
        final double MONTHLY_RATE = APR / 12.0;

        double interestMonth1 = balance * MONTHLY_RATE;
        double balanceAfter1 = balance + interestMonth1;

        double interestMonth2 = balanceAfter1 * MONTHLY_RATE;
        double balanceAfter2 = balanceAfter1 + interestMonth2;

        System.out.println("Starting balance: $" + balance);
        System.out.println("Monthly rate: " + (MONTHLY_RATE * 100) + "%");
        System.out.println("Interest after 1 month: $" + interestMonth1);
        System.out.println("Balance after 1 month: $" + balanceAfter1);
        System.out.println("Interest after 2 months: $" + interestMonth2);
        System.out.println("Balance after 2 months: $" + balanceAfter2);
    }
}