package edu.wit.myapplication;

/**
 * @author buttsj
 */
public class Point2D {
    double xval, yval;
    String name;

    public Point2D(double x, double y, String nm) {
        xval = x;
        yval = y;
    }

    public Point2D() {
        this(0., 0., "");
    }

    public double getX() {
        return xval;
    }
    public double getY() {
        return yval;
    }
    public String getName() {
        return name;
    }

    public void setX(double x) {
        this.xval = x;
    }
    public void setY(double y) {
        this.yval = y;
    }
    public void setName(String nam) {
        this.name = nam;
    }

    public static double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }


    public double distanceTo(Point2D p) {
        return distance(p, this);
    }

}
