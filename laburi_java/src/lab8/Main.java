package lab8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GeometricBody> shapes = new ArrayList<>();
        shapes.add(new Cub());
        shapes.add(new Sphere());
        shapes.add(new Parallelepiped(1, 2, 3));

        for (GeometricBody shape : shapes) {
            shape.printInfo();
        }

        GeometricBody maxVolumeShape = GeometricBodyController.findByMaxVolume(shapes);
        GeometricBody maxSurfaceShape = GeometricBodyController.findByMaxVolume(shapes);
        System.out.println(String.format("Max Volume: %.2f", maxVolumeShape.getVolume()));
        System.out.println(String.format("Max Surface: %.2f", maxSurfaceShape.getSurface()));
    }
}
