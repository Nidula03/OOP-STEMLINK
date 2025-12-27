public class CreditCardPayment extends CardPayment implements Discount {

    public double creditLimit;


    public CreditCardPayment(double amount,String currency,String cardNumber,String cardHolderName, String expiryDate,double creditLimit){
        super(amount,currency,cardNumber,cardHolderName,expiryDate);
        this.creditLimit = creditLimit;
    }

    @Override
    public void processPayment() {
        System.out.println("Charging credit card with limit: " + creditLimit + " for amount: " + amount);
        markAsCompleted();
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
