package edu.wit.myapplication;

public class Constants {

    public class Mapper {
        public static final double X_THRESH = 1;
        public static final double Y_THRESH = 1;
    }

    public static class Graphs {
        //***********************************************Tudbury**************************************************
        Point2D Tud1 = new Point2D(0,0,"Tud stairs");

        Point2D[] Tudbury_1_Items = new Point2D[]{};

        //***********************************************Wentworth Hall**********************************************
        //Wentworth Hall floor 0
        Point2D Went0_1 = new Point2D(0, 174, "Dobb Entrance");
        Point2D Went0_2 = new Point2D(123, 174, "Lab 007");
        Point2D Went0_3 = new Point2D(210, 174, "Classroom 010");
        Point2D Went0_4 = new Point2D(259, 174, "Elevator");
        Point2D Went0_5 = new Point2D(467, 174, "Lab 003");
        Point2D Went0_6 = new Point2D(530, 174, "Lab 004");
        Point2D Went0_7 = new Point2D(650, 174, "Williston Entrance");

        Point2D[] Wentworth_0_Items = new Point2D[]{Went0_1, Went0_2, Went0_3, Went0_4, Went0_5, Went0_6, Went0_7};

        //Wentworth Hall floor 1
        Point2D Went1_1 = new Point2D(0, 95, "Dobb Entrance");
        Point2D Went1_2 = new Point2D(73, 95, "Receptions Office 101");
        Point2D Went1_3 = new Point2D(117, 95, "Stairs");
        Point2D Went1_4 = new Point2D(193, 95, "Exit");
        Point2D Went1_5 = new Point2D(193, 95, "Admissions Office 106");
        Point2D Went1_6 = new Point2D(250, 95, "Copy/Mail Room 118");
        Point2D Went1_7 = new Point2D(273, 95, "Stairs");
        Point2D Went1_8 = new Point2D(380, 95, "Williston Entrance");
        Point2D[] Wentworth_1_Items = new Point2D[]{Went1_1, Went1_2, Went1_3, Went1_4, Went1_5, Went1_6, Went1_7, Went1_8};

        //Wentworth Hall floor 2
        Point2D Went2_1 = new Point2D(0, 95, "Dobb Entrance");
        Point2D Went2_2 = new Point2D(28, 95, "Classroom 214");
        Point2D Went2_3 = new Point2D(28, 95, "Stair/Bathroom(W)");
        Point2D Went2_4 = new Point2D(107, 95, "Classroom 212");
        Point2D Went2_5 = new Point2D(125, 95, "Classroom 209");
        Point2D Went2_6 = new Point2D(153, 95, "Elevator");
        Point2D Went2_7 = new Point2D(237, 95, "Classroom 210");
        Point2D Went2_8 = new Point2D(237, 95, "Classroom 207");
        Point2D Went2_9 = new Point2D(265, 95, "Classroom 208");
        Point2D Went2_10 = new Point2D(265, 95, "Classroom 205");
        Point2D Went2_11 = new Point2D(323, 95, "Classroom 206");
        Point2D Went2_12 = new Point2D(362, 95, "Stair/Bathroom(M)");
        Point2D Went2_13 = new Point2D(380, 95, "Williston Entrance");
        Point2D[] Wentworth_2_Items = new Point2D[]{Went2_1, Went2_2, Went2_3, Went2_4, Went2_5, Went2_6, Went2_7, Went2_8, Went2_9, Went2_10, Went2_11, Went2_12, Went2_13};

        //Wentworth Hall floor 3
        Point2D Went3_1 = new Point2D(0, 95, "Dobb Entrance");
        Point2D Went3_2 = new Point2D(28, 95, "Stairs/Bathroom(W)");
        Point2D Went3_3 = new Point2D(28, 95, "Classroom 314");
        Point2D Went3_4 = new Point2D(107, 95, "Classroom 312");
        Point2D Went3_5 = new Point2D(125, 95, "Classroom 309");
        Point2D Went3_6 = new Point2D(153, 95, "Elevator");
        Point2D Went3_7 = new Point2D(237, 95, "Classroom 310");
        Point2D Went3_8 = new Point2D(237, 95, "Classroom 307");
        Point2D Went3_9 = new Point2D(265, 95, "Classroom 308");
        Point2D Went3_10 = new Point2D(265, 95, "Classroom 305");
        Point2D Went3_11 = new Point2D(323, 95, "Classroom 306");
        Point2D Went3_12 = new Point2D(362, 95, "Stair/Bathroom(M)");
        Point2D Went3_13 = new Point2D(380, 95, "Williston Entrance");
        Point2D[] Wentworth_3_Items = new Point2D[]{Went3_1, Went3_2, Went3_3, Went3_4, Went3_5, Went3_6, Went3_7, Went3_8, Went3_9, Went3_10, Went3_11, Went3_12, Went3_13};

        //***********************************************Evans Way**************************************************


        //***********************************************Rubenstein Hall**************************************************

        //***********************************************Kingman Hall**************************************************

        //***********************************************Dobbs Hall**************************************************

        //***********************************************Williston Hall**************************************************
        //Williston Hall floor 0


        //Williston Hall floor 1


        //Williston Hall floor 2


        //Williston Hall floor 3


        //***********************************************Watson Hall**************************************************

        //***********************************************Beatty Hall**************************************************

        //***********************************************Willson Hall**************************************************


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

        public static final Building[] AnnexN = {Beatty, Willson, Tudbury};
        public static final int[] AnnexWeights = {136, 171, 525};

        public static final Building[] EvansWayN = {Tudbury};
        public static final int[] EvansWayWeights = {61};

        public static final Building[] WatsonN = {Dobbs, Beatty,Kingman};
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
