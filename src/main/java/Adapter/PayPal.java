package Adapter;

public class PayPal {
    public void paypalPayment(double paymentAmount, String userEmail) {
        System.out.println("PayPal Payment: $" +  paymentAmount + " for the email: " + userEmail);
    }
}
