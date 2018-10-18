package lab2.task1;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(1, 2, 3);

        showVolAndSurface(box1);
        showVolAndSurface(box2);
        showVolAndSurface(box3);
    }

    public static void showVolAndSurface(Box box) {
        System.out.println(String.format("Surface: %.2f", box.getSurface()));
        System.out.println(String.format("Volume: %.2f", box.getVolume()));
    }
}
