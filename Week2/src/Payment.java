public abstract class Payment implements Payable{

    public double amount;
    public String currency;
    public String status;
    public String referenceID = "Ref001";

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.status = "pending";
    }

    public abstract void processPayment();

    public String generateReceipt() {
        return "Reference ID: " + referenceID +"Receipt for amount " + amount + " " + currency + "Status" + status;
    }

    public void markAsCompleted() {
        this.status = "COMPLETED";
    }

    // Getters and Setters

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getStatus() {
        return status;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getReferenceID() {
        return referenceID;
    }
}
