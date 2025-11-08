package Adapter;

public class SquareAdapter implements Payment {
    private final Square square;
    private final String locationId;

    public SquareAdapter(String locationId) {
        this.square = new Square();
        this.locationId = locationId;
    }

    @Override
    public void process(double amount) {
        square.SquarePayment(amount, locationId);
    }
}
