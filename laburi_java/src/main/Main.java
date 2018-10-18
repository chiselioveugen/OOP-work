package main;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("apple", Color.BLACK,
                new Dimension(50, 30),
                new Dimension(1920, 1080));
        Monitor monitor2 = new Monitor("apple", Color.BLACK,
                new Dimension(50, 30),
                new Dimension(1920, 1080));
        System.out.println(monitor1.equals(monitor2));
        Monitor monitor3 = new Monitor("Samsung", Color.BLACK,
                new Dimension(60, 30),
                new Dimension(1920, 1080));

    }
}
