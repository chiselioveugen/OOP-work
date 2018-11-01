package lab8;

import java.util.List;

public class GeometricBodyController {
    public static GeometricBody findByMaxVolume(List<GeometricBody> list) {
        GeometricBody result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            GeometricBody temp = list.get(i);
            if (temp.getVolume() > result.getVolume()) {
                result = temp;
            }
        }
        return result;
    }

    public static GeometricBody findByMaxSurface(List<GeometricBody> list) {
        GeometricBody result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            GeometricBody temp = list.get(i);
            if (temp.getSurface() > result.getSurface()) {
                result = temp;
            }
        }
        return result;
    }
}
