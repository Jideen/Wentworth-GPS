package edu.wit.myapplication;

import android.util.Log;

public class WeightedGraph {
    static class Edge {
        Building source, dest;
        int weight;
        int buildings = Constants.Buildings.BUILDINGS.length + 1;
        String identifier;

        public Edge() {
            this.weight = 1;
            this.source = Constants.Buildings.Annex;
            this.dest = Constants.Buildings.Annex;

        }

        public Edge(Building s, Building d, int w) {
            this.weight = w;
            this.source = s;
            this.dest = d;
            this.identifier = String.format("%s %s", s.name, d.name);
        }
    }

    static class Graph {
        int buildings;
        Edge neighbor;
        Edge[] adjacency;

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
            for (int i = 0; i < buildings; i++) {

            }
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
    }
}
