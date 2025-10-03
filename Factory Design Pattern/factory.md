# Assignment: Factory Pattern – Payment Gateway Factory

## Problem Statement  
You are tasked with building a **Payment Processing System** that supports multiple payment gateways like **Credit Card, PayPal, and UPI**.  

The system should be designed in a way that **adding new payment methods in the future** (e.g., Crypto, Bank Transfer) should be easy **without changing the core logic**.  

To achieve this, you must use the **Factory Design Pattern**.

---

## Requirements  

1. **Create an interface `Payment`**  
   - Method:  
     ```java
     void processPayment(double amount);
     ```

2. **Create concrete classes** that implement `Payment`:  
   - `CreditCardPayment`  
   - `PayPalPayment`  
   - `UPIPayment`  

3. **Create a Factory Class `PaymentFactory`**  
   - Method:  
     ```java
     public static Payment getPaymentMethod(String type)
     ```  

   - Logic:  
     - If `type = "CREDIT"`, return `CreditCardPayment`  
     - If `type = "PAYPAL"`, return `PayPalPayment`  
     - If `type = "UPI"`, return `UPIPayment`  

4. **In the Main Class**:  
   - Ask the user which payment method they want.  
   - Use the `PaymentFactory` to get the correct object.  
   - Call the `processPayment(amount)` method.  

---

## Example Runs  

### Example 1  
Enter payment method (CREDIT / PAYPAL / UPI): CREDIT
Enter amount: 2500
Processing Credit Card Payment of ₹2500.0

### Example 2
Enter payment method (CREDIT / PAYPAL / UPI): PAYPAL
Enter amount: 2500
Processing Credit Card Payment of ₹5400.0

