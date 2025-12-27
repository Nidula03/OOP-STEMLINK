public class DebitCardPayment extends CardPayment implements Discount{

    public double availableBalance;

    public DebitCardPayment(double amount,String currency,String cardNumber,String cardHolderName,String expiryDate, double availableBalance){
        super(amount,currency,cardNumber,cardHolderName,expiryDate);
        this.availableBalance = availableBalance;
    }

    @Override
    public void processPayment(){
        if (!validate()) {
            System.out.println("Debit card validation failed");
            status = "FAILED";
            return;
        }

        System.out.println("Debiting from account balance: " + availableBalance + "for amount:  " + amount);
        markAsCompleted();
    }

    public void checkSufficientBalance(){
        System.out.println("Checking if balance covers amount");
    }



    @Override
    public double applyDiscount(double percent) {
        amount = amount * (1 - percent / 100);
        return amount;
    }

    @Override
    public double finalAmount() {
        return amount;
    }

}
