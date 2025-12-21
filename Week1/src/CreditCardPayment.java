public class CreditCardPayment extends CardPayment {

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

    public void applyInterest(){
        System.out.println("Applying interest if payment is not settled by due date");
    }

}
