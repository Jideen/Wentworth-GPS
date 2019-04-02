package edu.wit.myapplication;

public class Constants {

    public class Mapper {
        public static final double X_THRESH = 1;
        public static final double Y_THRESH = 1;
    }

    public static class Buildings {
        public static final Building Annex = new Building(-71.094217, 42.335399, "Annex", 10);
        public static final Building EvansWay = new Building(-71.097403, 42.337800, "EvansWay", 1);
        public static final Building Watson = new Building(-71.094804, 42.336274, "Watson", 7);
        public static final Building Beatty = new Building(-71.095534, 42.335615, "Beatty", 9);
        public static final Building Rubenstein = new Building(-71.095795, 42.336600, "Rubenstein", 4);
        public static final Building Kingman = new Building(-71.095915, 42.336389, "Kingman", 5);
        public static final Building Dobbs = new Building(-71.094458, 42.336568, "Dobbs", 8);
        public static final Building Williston = new Building(-71.095212, 42.336896, "Williston", 3);
        public static final Building Willson = new Building(-71.095816, 42.336104, "Willson", 6);
        public static final Building Wentworth = new Building(-71.094927, 42.336629, "Wentworth", 2);
        public static final Building Irall = new Building(-71.093813, 42.336102, "Irall", 11);
        public static final Building Tudbury = new Building(71.097840, 42.337356, "Tudbury", 0);
        public static final Building[] BUILDINGS = new Building[]{Annex, EvansWay, Watson, Beatty, Rubenstein, Kingman, Dobbs, Williston, Willson, Wentworth, Irall, Tudbury};
        public static final Building[] AnnexN = {Irall, Watson, Beatty, Willson, Tudbury};
        public static final Building[] EvansWayN = {Tudbury};
        public static final Building[] WatsonN = {Dobbs, Wentworth, Beatty, Irall, Tudbury, Kingman};
        public static final Building[] BeattyN = {Annex, Tudbury, Willson, Watson};
        public static final Building[] RubensteinN = {Kingman, Williston, Wentworth};
        public static final Building[] KingmanN = {Willson, Wentworth, Rubenstein};
        public static final Building[] DobbsN = {Annex, Tudbury, Willson, Watson};
        public static final Building[] TudburyN = {Annex, EvansWay, Beatty, Willson, Watson};


    }
}
