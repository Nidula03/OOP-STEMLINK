import java.util.List;

public class Main {

    public static void main(String[] args) {

        Payment cash = new CashOnDelivery(5000,"LKR","Pending");
        Payment bank = new BankTransfer(20000,"LKR","HNB","10101010","Nidula");
        Payment credit = new CreditCardPayment(50000,"USD","343434232","ekanayake","11/26",50000);
        Payment debit = new DebitCardPayment(9000,"LKR","23232323","john","12/30",100000);

        cash.processPayment();
        bank.processPayment();
        credit.processPayment();
        debit.processPayment();

        System.out.println(cash.generateReceipt());
        System.out.println(bank.generateReceipt());
        System.out.println(credit.generateReceipt());
        System.out.println(debit.generateReceipt());

        List<Payment> payment = List.of(cash,bank,credit,debit);
        for(Payment p : payment){
            p.processPayment();;
            System.out.println(p.generateReceipt());
        }
    }
}
