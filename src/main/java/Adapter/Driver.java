package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();
        double amount = 25.99;

        // Part 1
        payments.add(new PayPalAdapter("Kyle@gmail.com"));
        payments.add(new StripeAdapter("Kyle", "1234-56789", "11/7"));

        // Part 2
        payments.add(new SquareAdapter("Los-Angeles-CA"));

        for (int i = 0; i < payments.size(); i++) {
            payments.get(i).process(amount);
        }
    }
}
