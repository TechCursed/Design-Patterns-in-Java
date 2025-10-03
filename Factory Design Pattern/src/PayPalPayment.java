public class PayPalPayment implements Payment{

  //implementing the interface method for Paypal
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of ₹"+amount);
    }
}
