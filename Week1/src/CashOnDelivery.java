public class CashOnDelivery extends Payment{

    public String deliveryAddress;

    public CashOnDelivery(double amount,String currency, String deliveryAddress){
        super(amount,currency);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processPayment() {

        if (!validate()) {
            System.out.println("Cash on Delivery validation failed");
            status = "FAILED";
            return;
        }

        System.out.println("Cash will be collected at delivery address:  " + deliveryAddress);
        status = "Completed";
        markAsCompleted();
    }


    @Override
    public boolean validate() {
        return amount > 0 && deliveryAddress != null && !deliveryAddress.isEmpty();
    }
}
