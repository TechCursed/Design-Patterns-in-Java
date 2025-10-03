public class UPIPayment implements Payment{

//implementing the interface method for UPI
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of ₹"+amount);
    }
}
