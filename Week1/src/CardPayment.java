public class CardPayment extends Payment{

    public String cardNumber;
    public String cardHolderName;
    public String expiryDate;

    public CardPayment(double amount,String currency,String cardNumber,String cardHolderName, String expiryDate){
        super(amount,currency);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("Authorizing card payment for " + cardHolderName);
    }

    public void validCard(){

        System.out.println("Validating card number format..");
    }



}
