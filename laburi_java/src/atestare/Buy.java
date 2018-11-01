package atestare;

public class Buy extends Product {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * this.getQuantity();
    }

    @Override
    public double getWeight() {
        return super.getWeight() * this.getQuantity();
    }
}
