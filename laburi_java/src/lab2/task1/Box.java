package lab2.task1;

public class Box {
    private double height, width, depth;

    public Box() {
        this(1);
    }

    public Box(double size) {
        height = width = depth = size;
    }

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getVolume() {
        return height * width * depth;
    }

    public double getSurface() {
        return height * width * 2 + (height + width) * 2 * depth;
    }
}
