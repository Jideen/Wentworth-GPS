package edu.wit.myapplication;

public class Mapper {
    public boolean isSame(Hall h1, Hall h2) {
        return (h1 == h2);
    }

    public boolean isConnected(Hall h1, Hall h2) {
        return (h1.end == h2.end || h1.end == h2.start || h1.start == h2.end || h1.start == h2.start && !isSame(h1, h2));
    }

    public boolean isInHall(Point2D p, Hall h) {
        if (h.isVertical()) {
            if (p.getY() <= h.end.getY() && p.getY() >= h.start.getY() && p.getX() == h.start.getX()) {
                return true;
            }
        } else {
            if (p.getX() <= h.end.getX() && p.getX() >= h.start.getX() && p.getY() == h.start.getY()) {
                return true;
            }
        }
        return false;
    }

    public void pointNav(Point2D p, Hall h, Point2D dest) {
        if (isInHall(p, h)) {
            if (p.getX() < dest.getX() && !h.isVertical()) {
                p.setX(h.end.getX());
            }
            if (p.getX() > dest.getX() && !h.isVertical()) {
                p.setX(h.start.getX());
            }
            if (p.getY() < dest.getY() && h.isVertical()) {
                p.setY(h.end.getY());
            }
            if (p.getY() > dest.getY() && h.isVertical()) {
                p.setY(h.start.getY());
            }
        }
    }

    public double hallNav(Point2D p, Hall h1, Hall h2, Point2D dest) {
        if (p.getX() < dest.getX() && isInHall(p, h1)) {
            if (h1.isVertical() && isConnected(h1, h2) && h2.end.getX() > p.getX()) {
                pointNav(p, h2, dest);
                return h2.length;
            }
        }
        if (p.getY() < dest.getY() && isInHall(p, h1)) {
            if (!h1.isVertical() && isConnected(h1, h2) && h2.end.getY() > p.getY()) {
                pointNav(p, h2, dest);
                return h2.length;
            }
        }
        if (Math.abs(p.getX() - dest.getX()) <= Constants.Mapper.X_THRESH) {
            System.out.printf("Map successfully generated!%n");
            return 0.12345;
        }
        return 0;
    }

    public void mapper(Hall[] h, Point2D p, Point2D dest) {
        double lenTracker = 0;
        Hall initHall = h[0];
        for (int i = 0; i < h.length; i++) {
            if (isInHall(p, h[i])) {
                initHall = h[i];
                System.out.printf("Starting point and hallway found.%n");
                break;
            }
            System.out.print("Starting point not found.");
            System.exit(0);
        }
        if (p.getX() < dest.getX()) {
            for (int j = 0; j < h.length; j++) {
                lenTracker += hallNav(p, initHall, h[j], dest);
                if (hallNav(p, initHall, h[j], dest) == 0.12345) {
                    lenTracker -= 0.12345;
                    break;
                }
                initHall = h[j];
            }
        } else {
            for (int j = h.length; j > 0; j--) {
                lenTracker += hallNav(p, initHall, h[j], dest);
                if (hallNav(p, initHall, h[j], dest) == 0.12345) {
                    lenTracker -= 0.12345;
                    break;
                }
                initHall = h[j];
            }
        }
        System.out.printf("Your path has a length of %.2f feet.", lenTracker);
    }
}
