package atestare;

public class Check extends Buy {
    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Quantity: " + this.getQuantity());
        System.out.println("Total price: " + this.getPrice());
        System.out.println("Total weight: " + this.getWeight());
    }
}
