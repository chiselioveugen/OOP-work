package lab8;

public class Sphere extends GeometricBody {
    private double radix;

    public Sphere() {
        this(1);
    }

    public Sphere(double radix) {
        this.radix = radix;
    }

    public double getVolume() {
        return 4.0 / 3 * Math.PI * radix * radix * radix;
    }

    public double getSurface() {
        return 4 * Math.PI * radix * radix;
    }

    public String getName() {
        return "Sphere";
    }

    public void printInfo() {
        System.out.println(String.format("Name: %s", getName()));
        System.out.println(String.format("Surface: %.2f", getSurface()));
        System.out.println(String.format("Volume: %.2f", getVolume()));
    }
}
