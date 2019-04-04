package edu.wit.myapplication;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class WeightedGraph {
    static class Edge {
        Building source, dest;
        int weight;
        int buildings = Constants.Buildings.BUILDINGS.length + 1;
        String identifier;

        public Edge() {
            this.weight = 1;
            this.source = Constants.Buildings.Watson;
            this.dest = Constants.Buildings.Irall;

        }

        public Edge(Building s, Building d, int w) {
            this.weight = w;
            this.source = s;
            this.dest = d;
            this.identifier = String.format("%s %s", s.name, d.name);
        }
    }

    static class Graph {
        int buildings, pathLength = 0;
        Edge neighbor;
        Edge[] adjacency;
        List<String> Path = new ArrayList<>(); 

        Graph(int buildings) {
            this.buildings = buildings;
            this.adjacency = new Edge[buildings];
            for (int i = 0; i < buildings; i++) {
                this.adjacency[i] = new Edge();
            }
        }

        public boolean isConnected(Building s, Building d) {
            for (int i = 0; i < 13; i++) {
                try {
                    if (this.adjacency[i].identifier.contains(String.format("%s", s.name)) && this.adjacency[i].identifier.contains(String.format("%s", d.name))) {
                        this.neighbor = adjacency[i];
                        return true;
                    }
                } catch (NullPointerException e) {
                    return false;
                }
            }
            return false;
        }

        public int getDist(Building s, Building d) {
            if (isConnected(s, d)) {
                return neighbor.weight;
            }
            return Integer.MAX_VALUE;
        }

        public void spider(Building s, Building d) {
            Path.add("S");
            int closest = 10;
            Building closestN;
            switch (s.id) {
                case 0:
                    if (!Constants.Buildings.Annex.isIndexed) {
                        Constants.Buildings.Annex.isIndexed = true;
                        closestN = Constants.Buildings.AnnexN[0];
                        for (int j = 0; j < Constants.Buildings.AnnexN.length; j++) {
                            if (getDist(Constants.Buildings.Annex, Constants.Buildings.AnnexN[j]) < closest && !Constants.Buildings.AnnexN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Annex, Constants.Buildings.AnnexN[j]);
                                Path.add(Constants.Buildings.AnnexN[j].name);
                                closestN = Constants.Buildings.AnnexN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 1:
                    if (!Constants.Buildings.EvansWay.isIndexed) {
                        Constants.Buildings.EvansWay.isIndexed = true;
                        closestN = Constants.Buildings.EvansWayN[0];
                        for (int j = 0; j < Constants.Buildings.EvansWayN.length; j++) {
                            if (getDist(Constants.Buildings.EvansWay, Constants.Buildings.EvansWayN[j]) < closest && !Constants.Buildings.EvansWayN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.EvansWay, Constants.Buildings.EvansWayN[j]);
                                Path.add(Constants.Buildings.EvansWayN[j].name);
                                closestN = Constants.Buildings.EvansWayN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 2:
                    if (!Constants.Buildings.Watson.isIndexed) {
                        Constants.Buildings.Watson.isIndexed = true;
                        closestN = Constants.Buildings.WatsonN[0];
                        for (int j = 0; j < Constants.Buildings.WatsonN.length; j++) {
                            if (getDist(Constants.Buildings.Watson, Constants.Buildings.WatsonN[j]) < closest && !Constants.Buildings.WatsonN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Watson, Constants.Buildings.WatsonN[j]);
                                Path.add(Constants.Buildings.WatsonN[j].name);
                                closestN = Constants.Buildings.WatsonN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 3:
                    if (!Constants.Buildings.Beatty.isIndexed) {
                        Constants.Buildings.Beatty.isIndexed = true;
                        closestN = Constants.Buildings.BeattyN[0];
                        for (int j = 0; j < Constants.Buildings.BeattyN.length; j++) {
                            if (getDist(Constants.Buildings.Beatty, Constants.Buildings.BeattyN[j]) < closest && !Constants.Buildings.BeattyN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Beatty, Constants.Buildings.BeattyN[j]);
                                Path.add(Constants.Buildings.BeattyN[j].name);
                                closestN = Constants.Buildings.BeattyN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 4:
                    if (!Constants.Buildings.Rubenstein.isIndexed) {
                        Constants.Buildings.Rubenstein.isIndexed = true;
                        closestN = Constants.Buildings.RubensteinN[0];
                        for (int j = 0; j < Constants.Buildings.RubensteinN.length; j++) {
                            if (getDist(Constants.Buildings.Rubenstein, Constants.Buildings.RubensteinN[j]) < closest && !Constants.Buildings.RubensteinN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Rubenstein, Constants.Buildings.RubensteinN[j]);
                                Path.add(Constants.Buildings.RubensteinN[j].name);
                                closestN = Constants.Buildings.RubensteinN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 5:
                    if (!Constants.Buildings.Kingman.isIndexed) {
                        Constants.Buildings.Kingman.isIndexed = true;
                        closestN = Constants.Buildings.KingmanN[0];
                        for (int j = 0; j < Constants.Buildings.KingmanN.length; j++) {
                            if (getDist(Constants.Buildings.Kingman, Constants.Buildings.KingmanN[j]) < closest && !Constants.Buildings.KingmanN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Kingman, Constants.Buildings.KingmanN[j]);
                                Path.add(Constants.Buildings.KingmanN[j].name);
                                closestN = Constants.Buildings.KingmanN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 6:
                    if (!Constants.Buildings.Dobbs.isIndexed) {
                        Constants.Buildings.Dobbs.isIndexed = true;
                        closestN = Constants.Buildings.DobbsN[0];
                        for (int j = 0; j < Constants.Buildings.DobbsN.length; j++) {
                            if (getDist(Constants.Buildings.Dobbs, Constants.Buildings.DobbsN[j]) < closest && !Constants.Buildings.DobbsN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Dobbs, Constants.Buildings.DobbsN[j]);
                                Path.add(Constants.Buildings.DobbsN[j].name);
                                closestN = Constants.Buildings.DobbsN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 7:
                    if (!Constants.Buildings.Williston.isIndexed) {
                        Constants.Buildings.Williston.isIndexed = true;
                        closestN = Constants.Buildings.WillistonN[0];
                        for (int j = 0; j < Constants.Buildings.WillistonN.length; j++) {
                            if (getDist(Constants.Buildings.Williston, Constants.Buildings.WillistonN[j]) < closest && !Constants.Buildings.WillistonN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Williston, Constants.Buildings.WillistonN[j]);
                                Path.add(Constants.Buildings.WillistonN[j].name);
                                closestN = Constants.Buildings.WillistonN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 8:
                    if (!Constants.Buildings.Willson.isIndexed) {
                        Constants.Buildings.Willson.isIndexed = true;
                        closestN = Constants.Buildings.WillsonN[0];
                        for (int j = 0; j < Constants.Buildings.WillsonN.length; j++) {
                            if (getDist(Constants.Buildings.Willson, Constants.Buildings.WillsonN[j]) < closest && !Constants.Buildings.WillsonN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Willson, Constants.Buildings.WillsonN[j]);
                                Path.add(Constants.Buildings.WillsonN[j].name);
                                closestN = Constants.Buildings.WillsonN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 9:
                    if (!Constants.Buildings.Wentworth.isIndexed) {
                        Constants.Buildings.Wentworth.isIndexed = true;
                        closestN = Constants.Buildings.WentworthN[0];
                        for (int j = 0; j < Constants.Buildings.WentworthN.length; j++) {
                            if (getDist(Constants.Buildings.Wentworth, Constants.Buildings.WentworthN[j]) < closest && !Constants.Buildings.WentworthN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Wentworth, Constants.Buildings.WentworthN[j]);
                                Path.add(Constants.Buildings.WentworthN[j].name);
                                closestN = Constants.Buildings.WentworthN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 10:
                    if (!Constants.Buildings.Irall.isIndexed) {
                        Constants.Buildings.Irall.isIndexed = true;
                        closestN = Constants.Buildings.IrallN[0];
                        for (int j = 0; j < Constants.Buildings.IrallN.length; j++) {
                            if (getDist(Constants.Buildings.Irall, Constants.Buildings.IrallN[j]) < closest && !Constants.Buildings.IrallN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Irall, Constants.Buildings.IrallN[j]);
                                Path.add(Constants.Buildings.IrallN[j].name);
                                closestN = Constants.Buildings.IrallN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
                case 11:
                    if (!Constants.Buildings.Tudbury.isIndexed) {
                        Constants.Buildings.Tudbury.isIndexed = true;
                        closestN = Constants.Buildings.TudburyN[0];
                        for (int j = 0; j < Constants.Buildings.TudburyN.length; j++) {
                            if (getDist(Constants.Buildings.Tudbury, Constants.Buildings.TudburyN[j]) < closest && !Constants.Buildings.TudburyN[j].isIndexed) {
                                closest = getDist(Constants.Buildings.Tudbury, Constants.Buildings.TudburyN[j]);
                                Path.add(Constants.Buildings.TudburyN[j].name);
                                closestN = Constants.Buildings.TudburyN[j];
                            }
                        }
                        pathLength += closest;
                        spider(closestN, d);
                    }
                    break;
            }

        }

        public void getSpider(Building s, Building d) {
            spider(s, d);
            while (Path.remove("S")) {
            }
            ;
            Log.i("Path", Path.toString());
        }

        public void addEdge(Building s, Building d, int w) {
            Edge edge = new Edge(s, d, w);
            Edge edgeReverse = new Edge(d, s, w);
            adjacency[s.id] = edge;
            adjacency[d.id] = edgeReverse;
        }
    }


    public static void main() {
        int buildings = Constants.Buildings.BUILDINGS.length + 1;
        Graph graph = new Graph(buildings);
        graph.addEdge(Constants.Buildings.Annex, Constants.Buildings.Watson, 4);
        graph.addEdge(Constants.Buildings.Annex, Constants.Buildings.Beatty, 6);
        graph.addEdge(Constants.Buildings.Annex, Constants.Buildings.Willson, 7);
        graph.addEdge(Constants.Buildings.Annex, Constants.Buildings.Tudbury, 12);
        graph.addEdge(Constants.Buildings.Annex, Constants.Buildings.Irall, 2);
        graph.addEdge(Constants.Buildings.EvansWay, Constants.Buildings.Tudbury, 2);
        graph.addEdge(Constants.Buildings.Watson, Constants.Buildings.Beatty, 5);
        graph.addEdge(Constants.Buildings.Watson, Constants.Buildings.Dobbs, 1);
        graph.addEdge(Constants.Buildings.Watson, Constants.Buildings.Wentworth, 1);
        graph.addEdge(Constants.Buildings.Watson, Constants.Buildings.Tudbury, 10);
        graph.addEdge(Constants.Buildings.Watson, Constants.Buildings.Kingman, 3);
        graph.addEdge(Constants.Buildings.Watson, Constants.Buildings.Irall, 4);
        graph.addEdge(Constants.Buildings.Beatty, Constants.Buildings.Tudbury, 8);
        graph.addEdge(Constants.Buildings.Beatty, Constants.Buildings.Willson, 2);
        graph.addEdge(Constants.Buildings.Rubenstein, Constants.Buildings.Kingman, 1);
        graph.addEdge(Constants.Buildings.Rubenstein, Constants.Buildings.Williston, 1);
        graph.addEdge(Constants.Buildings.Rubenstein, Constants.Buildings.Wentworth, 1);
        graph.addEdge(Constants.Buildings.Kingman, Constants.Buildings.Willson, 1);
        graph.addEdge(Constants.Buildings.Kingman, Constants.Buildings.Wentworth, 2);
        graph.addEdge(Constants.Buildings.Dobbs, Constants.Buildings.Wentworth, 1);
        graph.addEdge(Constants.Buildings.Williston, Constants.Buildings.Wentworth, 1);
        graph.addEdge(Constants.Buildings.Tudbury, Constants.Buildings.Willson, 7);
        System.out.println(graph.isConnected(Constants.Buildings.Tudbury, Constants.Buildings.EvansWay));
        System.out.println(graph.isConnected(Constants.Buildings.Tudbury, Constants.Buildings.Irall));
        Log.i("yeet", String.format("%d%n", graph.getDist(Constants.Buildings.Tudbury, Constants.Buildings.EvansWay)));
        Log.i("yote", String.format("%d%n", graph.getDist(Constants.Buildings.Tudbury, Constants.Buildings.Irall)));
        graph.getSpider(Constants.Buildings.Tudbury, Constants.Buildings.Irall);
    }
}