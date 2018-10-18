package main;

import java.awt.*;

public class Monitor {
    private String model;
    private Color color;
    private Dimension dimension;
    private Dimension resolution;
    Monitor(String model, Color color, Dimension dimension, Dimension resolution) {
        this.setModel(model);
        this.setColor(color);
        this.setDimension(dimension);
        this.setResolution(resolution);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Dimension getResolution() {
        return resolution;
    }

    public void setResolution(Dimension resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object monitor) {
        return this.equalsByModel((Monitor)monitor) &&
                this.equalsByDimension((Monitor)monitor) &&
                this.equalsByColor((Monitor) monitor) &&
                this.equalsByResolution((Monitor) monitor);
    }

    public boolean equalsByModel(Monitor monitor) {
        return monitor.getModel().equals(this.model);
    }

    public boolean equalsByDimension(Monitor monitor) {
        return monitor.getDimension().equals(this.dimension);
    }

    public boolean equalsByColor(Monitor monitor) {
        return monitor.getColor().equals(this.color);
    }
    public boolean equalsByResolution(Monitor monitor) {
        return monitor.getResolution().equals(this.resolution);
    }
}
