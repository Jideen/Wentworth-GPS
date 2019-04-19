package edu.wit.myapplication;

public class Point2D {
    int xval, yval;
    double xvald, yvald;
    String name;
    public Point2D(int x, int y, String s) {
        xval = x;
        yval = y;
        name = s;
    }
    public Point2D(double x, double y) {
        xvald = x;
        yvald = y;
    }
    public Point2D() {
        this(0, 0, "");
    }

    public int getX() {
        return xval;
    }

    public int getY() {
        return yval;
    }
    public String getName() {
        return name;
    }

    public void setName(String nam) {
        this.name = nam;
    }

}
