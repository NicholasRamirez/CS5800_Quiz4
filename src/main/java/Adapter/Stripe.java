package Adapter;

public class Stripe {
    public void stripePayment(double paymentAmount, String cardholderName, String cardNumber, String expirationDate) {
        System.out.println("Stripe Payment: $" + paymentAmount + " for " + cardholderName
                + " on card number: " + cardNumber + ", expiration date: " + expirationDate);
    }
}
