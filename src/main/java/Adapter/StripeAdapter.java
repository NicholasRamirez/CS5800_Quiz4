package Adapter;

public class StripeAdapter implements Payment {
    private final Stripe stripe;
    private final String cardholderName;
    private final String cardNumber;
    private final String expirationDate;

    public StripeAdapter(String cardholderName, String cardNumber, String expirationDate) {
        this.stripe = new Stripe();
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void process(double amount) {
        stripe.stripePayment(amount, cardholderName, cardNumber, expirationDate);
    }
}
