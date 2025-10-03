public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       String choice;
       double amnt;
       System.out.println("Enter payment method (CREDIT / PAYPAL / UPI)");
       choice = input.next();
       System.out.println("Enter payment amount");
       amnt = input.nextDouble();

      
       //creating the object using the PaymentFactory of the factory class 
       Payment payment = PaymentFactory.getPaymentMethod(choice);
      

       payment.processPayment(amnt);

    }
}
