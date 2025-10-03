public class PaymentFactory {

    //static method, method is called without creating an instance
    // return type is Payment object ( works as factory which generates objects )
    // object is created based upon the type of the object passed as the string in the method.
    public static Payment getPaymentMethod(String type){

        if(Objects.equals(type, "CREDIT")){
            return new CreditCardPayment();
        } else if (Objects.equals(type, "PAYPAL")) {
            return new PayPalPayment();
        } else if (Objects.equals(type, "UPI")) {
            return new UPIPayment();
        }
        else
            return null;
    }
}
