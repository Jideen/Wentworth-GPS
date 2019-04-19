package edu.wit.myapplication;

/**
 * Point2D class defining the point2D object
 */
public class Point2D {
    int xval, yval;
    double xvald, yvald;
    String name;

    /**
     * Initialize with x, y coords and name
     *
     * @param x x coords
     * @param y y coords
     * @param s name s
     */
    public Point2D(int x, int y, String s) {
        xval = x;
        yval = y;
        name = s;
    }

    /**
     * Initialize with x, y coords
     *
     * @param x x coords
     * @param y y coords
     */
    public Point2D(double x, double y) {
        xvald = x;
        yvald = y;
    }

    /**
     * Initialize with variables with 0
     */
    public Point2D() {
        this(0, 0, "");
    }

    /**
     * gets x
     *
     * @return x
     */
    public int getX() {
        return xval;
    }

    /**
     * gets y
     *
     * @return y
     */
    public int getY() {
        return yval;
    }

    /**
     * gets name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * sets int x
     *
     * @param x x coords
     */
    public void setX(int x) {
        this.xval = x;
    }

    /**
     * sets int y
     *
     * @param y y coords
     */
    public void setY(int y) {
        this.yval = y;
    }

    /**
     * sets x
     *
     * @param x x coords
     */
    public void setX(double x) {
        this.xvald = x;
    }

    /**
     * sets y
     *
     * @param y y coords
     */
    public void setY(double y) {
        this.yvald = y;
    }

    /**
     * sets name
     *
     * @param nam name
     */
    public void setName(String nam) {
        this.name = nam;
    }

    /**
     * calculates distance
     *
     * @param p1 Point2D object p1
     * @param p2 Point2D object p2
     * @return distance between two points
     */
    public static double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    /**
     * gets distance between two points
     *
     * @param p object Point2D p
     * @return distance to current point
     */
    public double distanceTo(Point2D p) {
        return distance(p, this);
    }

}
