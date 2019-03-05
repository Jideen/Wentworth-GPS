package edu.wit.leapordnav;

public class Building {
    double Long, Lat;
    Point2D coords;
    String name;

    Building() {
        this(0., 0., "default");
    }

    Building(double c1, double c2, String building) {
        Long = c1;
        Lat = c2;
        name = building;
        coords = new Point2D(c1, c2);
    }

    public double buildingDist(Point2D p) {
        return coords.distanceTo(p);
    }
}
