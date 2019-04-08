package edu.wit.myapplication;

public class Constants {

    public class Mapper {
        public static final double X_THRESH = 1;
        public static final double Y_THRESH = 1;
    }

    public static class Buildings {
        public static Building EvansWay = new Building(-71.097403, 42.337800, "EvansWay", 1, false);
        public static Building Watson = new Building(-71.094804, 42.336274, "Watson", 2, false);
        public static Building Beatty = new Building(-71.095534, 42.335615, "Beatty", 3, false);
        public static Building Rubenstein = new Building(-71.095795, 42.336600, "Rubenstein", 4, false);
        public static Building Kingman = new Building(-71.095915, 42.336389, "Kingman", 5, false);
        public static Building Dobbs = new Building(-71.094458, 42.336568, "Dobbs", 6, false);
        public static Building Williston = new Building(-71.095212, 42.336896, "Williston", 7, false);
        public static Building Willson = new Building(-71.095816, 42.336104, "Willson", 8, false);
        public static Building Wentworth = new Building(-71.094927, 42.336629, "Wentworth", 9, false);
        public static Building Tudbury = new Building(-71.097840, 42.337356, "Tudbury", 11, false);
        public static final Building[] EvansWayN = {Tudbury};
        public static final int[] EvansWayWeights = {61};

        public static final Building[] WatsonN = {Dobbs, Beatty, Kingman};
        public static final int[] WatsonWeights = {47, 99, 107};

        public static final Building[] BeattyN = {Tudbury, Willson, Watson};
        public static final int[] BeattyWeights = {284, 57, 99};

        public static final Building[] RubensteinN = {Kingman, Williston, Wentworth};
        public static final int[] RubensteinWeights = {21, 78, 95};

        public static final Building[] KingmanN = {Willson, Wentworth, Rubenstein, Watson};
        public static final int[] KingmanWeights = {28, 90, 21, 107};

        public static final Building[] DobbsN = {Wentworth, Watson};
        public static final int[] DobbsWeights = {52, 47};

        public static final Building[] WillistonN = {Wentworth, Rubenstein};
        public static final int[] WillistonWeights = {41, 78};

        public static final Building[] WillsonN = {Beatty, Kingman, Tudbury};
        public static final int[] WillsonWeights = {57, 28, 232};

        public static final Building[] WentworthN = {Rubenstein, Williston, Dobbs, Kingman};
        public static final int[] WentworthWeights = {95, 41, 52, 90};

        public static final Building[] TudburyN = {EvansWay, Beatty, Willson};
        public static final int[] TudburyWeights = {61, 284, 232};


        public static final Building[] BUILDINGS = new Building[]{EvansWay, Watson, Beatty, Rubenstein, Kingman, Dobbs, Williston, Willson, Wentworth, Tudbury};
        public static final Building[][] neighborArrays = { EvansWayN, WatsonN, BeattyN, RubensteinN, KingmanN, DobbsN,
                WillistonN, WillsonN, WentworthN, TudburyN};
        public static final int[][] weightArrays = {EvansWayWeights, WatsonWeights, BeattyWeights,
                RubensteinWeights, KingmanWeights, DobbsWeights, WillistonWeights, WillistonWeights, WentworthWeights,
                TudburyWeights};


    }
}