package Adapter;

public class PayPalAdapter implements Payment {
    private final PayPal paypal;
    private final String userEmail;

    public PayPalAdapter(String userEmail) {
        this.paypal = new PayPal();
        this.userEmail = userEmail;
    }

    @Override
    public void process(double amount) {
        paypal.paypalPayment(amount, userEmail);
    }
}
