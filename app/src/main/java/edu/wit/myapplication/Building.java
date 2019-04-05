package edu.wit.myapplication;

public class Building {
    double Long, Lat;
    Point2D coords;
    String name;
    int id;
    boolean isIndexed;
    Building[] neighbors;

    Building() {
        this(0., 0., "default", 0, true);
    }

    Building(double c1, double c2, String building, int i, boolean b) {
        Long = c1;
        Lat = c2;
        name = building;
        coords = new Point2D(c1, c2);
        id = i;
        isIndexed = b;
        switch (building) {
            case "Annex":
                neighbors = Constants.Buildings.AnnexN;
                break;
            case "EvansWay":
                neighbors = Constants.Buildings.EvansWayN;
                break;
            case "Watson":
                neighbors = Constants.Buildings.WatsonN;
                break;
            case "Beatty":
                neighbors = Constants.Buildings.BeattyN;
                break;
            case "Rubenstein":
                neighbors = Constants.Buildings.RubensteinN;
                break;
            case "Kingman":
                neighbors = Constants.Buildings.KingmanN;
                break;
            case "Dobbs":
                neighbors = Constants.Buildings.DobbsN;
                break;
            case "Williston":
                neighbors = Constants.Buildings.WillistonN;
                break;
            case "Willson":
                neighbors = Constants.Buildings.WillsonN;
                break;
            case "Wentworth":
                neighbors = Constants.Buildings.WentworthN;
                break;
            case "Irall":
                neighbors = Constants.Buildings.IrallN;
                break;
            case "Tudbury":
                neighbors = Constants.Buildings.TudburyN;
                break;
        }
    }

    public double buildingDist(Point2D p) {
        return coords.distanceTo(p);
    }
}
