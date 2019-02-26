package edu.wit.myapplication;

public class Hall {
    Point2D start, end;
    double length;

    public Hall(Point2D p1, Point2D p2){
        this.start = p1;
        this.end = p2;
        this.length = p1.distanceTo(p2);
    }
    public boolean isVertical() {
        return (start.getX() == end.getX());
    }
}
