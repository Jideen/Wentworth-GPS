package edu.wit.myapplication;

public class Building {
    double Long, Lat;
    Point2D coords;
    String name;
    int id;

    Building() {
        this(0., 0., "default", 0);
    }

    Building(double c1, double c2, String building, int i) {
        Long = c1;
        Lat = c2;
        name = building;
        coords = new Point2D(c1, c2);
        id = i;
    }

    public double buildingDist(Point2D p) {
        return coords.distanceTo(p);
    }
}
