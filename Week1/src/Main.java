public class Main {

    public static void main(String[] args) {

        Payable[] payments = {
                new CashOnDelivery(100000, "LKR", "Colombo 07"),
                new BankTransfer(15000, "LKR", "HNB", "123456789", "BANK-REF-01"),
                new CreditCardPayment(25000, "LKR", "41111111", "Nidula", "12/26", 100000),
                new DebitCardPayment(18000, "LKR", "52222222", "Nidula", "11/25", 50000)
        };

        for (Payable p : payments) {

            Payment payment = (Payment) p;

            System.out.println("\nProcessing: " + payment.getClass().getSimpleName());

            payment.processPayment();

            System.out.println(payment.generateReceipt());

            if (payment instanceof Discount) {
                Discount d = (Discount) payment;
                d.applyDiscount(10);
                System.out.println("Final Amount : " + d.finalAmount());
            }
        }
    }
}
