public class BankTransfer extends Payment {

    public String bankName;
    public String accountNumber;
    public String referenceCode;


    public BankTransfer(double amount,String currency,String bankName, String accountNumber, String referenceCode){
        super(amount,currency);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.referenceCode = referenceCode;

    }

    @Override
    public void processPayment() {

        if (!validate()) {
            System.out.println("Bank transfer failed");
            status = "Failed";
            return;
        }

        System.out.println("Initiating bank transfer to: " + bankName + " using account: " + accountNumber + " with reference: " + referenceCode);
        markAsCompleted();
    }


    @Override
    public boolean validate() {
        return amount > 0 && bankName != null && accountNumber != null;
    }
}
