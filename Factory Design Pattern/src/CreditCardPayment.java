public class CreditCardPayment implements Payment{

  // implementing the interface method for credit card
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of ₹"+amount);
    }
}
