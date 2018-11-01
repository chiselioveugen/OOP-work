package lab8;

public class Parallelepiped extends GeometricBody {
    private double height;
    private double width;
    private double depth;

    public Parallelepiped() {
        this(1D);
    }

    public Parallelepiped(double width) {
        this(width, width, width);
    }

    public Parallelepiped(double width, double height, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public String getName() {
        return "Parallelepiped";
    }

    public double getVolume() {
        return width * height * depth;
    }

    public double getSurface() {
        return width * height * 2 + width * depth * 2 + height * depth * 2;
    }

    public void printInfo() {
        System.out.println(String.format("Name: %s", getName()));
        System.out.println(String.format("Surface: %.2f", getSurface()));
        System.out.println(String.format("Volume: %.2f", getVolume()));
    }
}
