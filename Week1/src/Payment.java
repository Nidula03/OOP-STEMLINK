public class Payment {

    public double amount;
    public String currency;
    public String status;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.status = "pending";
    }

    public void processPayment() {
        System.out.println("Processing generic payment...");
    }

    public String generateReceipt() {
        return "Receipt for amount " + amount + " " + currency;
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
}
