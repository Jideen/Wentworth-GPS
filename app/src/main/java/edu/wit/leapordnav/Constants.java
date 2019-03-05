package edu.wit.leapordnav;

public class Constants {

    public class Mapper{
    public static final double X_THRESH = 1;
    public static final double Y_THRESH = 1;
    }

    public static class Buildings {
        public static final Building Tudbury = new Building(71.097840, 42.337356, "Tudbury");
        public static final Building EvansWay = new Building(-71.097403, 42.337800, "Tudbury");
        public static final Building Main = new Building(-71.095359, 42.336592, "Main");
        public static final Building Beatty = new Building(-71.095534, 42.335615, "Beatty");
        public static final Building Annex = new Building(-71.094217, 42.335399, "Annex");
        public static final Building Irall = new Building(-71.093813, 42.336102, "Irall");
        public static final Building[] BUILDINGS = new Building[]{Tudbury, EvansWay, Main, Beatty, Annex, Irall};
    }
}
