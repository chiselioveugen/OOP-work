package lab8;

public class Cub extends GeometricBody {
    private double side;

    public Cub() {
        this(1);
    }

    public Cub(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public String getName() {
        return "Cub";
    }

    public double getSurface() {
        return (side * side) * 6;
    }

    public void printInfo() {
        System.out.println(String.format("Name: %s", getName()));
        System.out.println(String.format("Surface: %.2f", getSurface()));
        System.out.println(String.format("Volume: %.2f", getVolume()));
    }
}
