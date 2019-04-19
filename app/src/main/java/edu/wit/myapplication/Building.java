package edu.wit.myapplication;

public class Building {
    double Long, Lat;
    Point2D coords;
    String name;
    int id;
    boolean isIndexed;

    Building(double c1, double c2, String building, int i, boolean b) {
        Long = c1;
        Lat = c2;
        name = building;
        coords = new Point2D(c1, c2);
        id = i;
        isIndexed = b;
    }

}